package sample;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javax.sound.midi.*;

public class Controller {

    @FXML
    private ComboBox trackList;

    @FXML
    private TextField nameField;

    private Player player = new Player();

    private void play(int i) throws InvalidMidiDataException, MidiUnavailableException {
        Sequencer player = MidiSystem.getSequencer();
        player.open();

        Sequence seq = new Sequence(Sequence.PPQ, 4);

        Track track = seq.createTrack();

        ShortMessage a = new ShortMessage();
        a.setMessage(144, 1, i, 100);
        MidiEvent noteOn = new MidiEvent(a, 1);
        track.add(noteOn);

        ShortMessage b = new ShortMessage();
        b.setMessage(128, 1, i, 100);
        MidiEvent noteOff = new MidiEvent(b, 16);
        track.add(noteOff);

        player.setSequence(seq);

        player.start();

    }

    private void playButton(String name) throws InvalidMidiDataException, MidiUnavailableException {
        List<String> pianoKeys = new ArrayList<>(
                Arrays.asList("A2","H2b","H2","C1","D1b","D1","E1b","E1","F1","G1b","G1","A1b","A1","H1b","H1","C",
                        "Db","D","Eb","E","F","Gb","G","Ab","A","Hb","H","c","db","d","eb","e","f","gb","g","ab","a",
                        "hb","h","c1","d1b","d1","e1b","e1","f1","g1b","g1","a1b","a1","h1b","h1","c2","d2b","d2",
                        "e2b","e2","f2","g2b","g2","a2b","a2","h2b","h2","c3","d3b","d3","e3b","e3","f3","g3b","g3",
                        "a3b","a3","h3b","h3","c4","d4b","d4","e4b","e4","f4","g4b","g4","a4b","a4","h4b","h4","c5"));
        play(pianoKeys.indexOf(name)+ 21);
    }

    public void onClickMethod(ActionEvent actionEvent) throws InvalidMidiDataException, MidiUnavailableException {
        Button btn = (Button) actionEvent.getSource();
        if (player.melody.isEmpty()) playButton(btn.getId());
        else {
            playButton(btn.getId());
            player.saveKey(btn);
        }
    }

    public void start() {
        player.startRecording();
    }

    public void saveName() {
        player.saveMelodyName();
    }

    public void stop() throws IOException {
        player.stopRecording();
    }

    public void tracks() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        player.melodyList(trackList);
    }

    class Player {
        List<String> melody = new ArrayList<>();
        String melodyName;

        void saveKey(Button button) {
            melody.add(button.getId());
        }

        void startRecording(){
            melody.add("start");
        }

        void saveMelodyName() {
            melodyName = nameField.getText();
        }

        void stopRecording() throws IOException {
            FileWriter file = new FileWriter(melodyName);
            melody.remove(0);
            for (String pianoKey: melody){
                file.write(pianoKey+" ");
            }
            file.close();
            trackList.getItems().add(melodyName);
            melody.clear();
        }

        void melodyList(ComboBox comboBox) throws MidiUnavailableException, InvalidMidiDataException, IOException {
            String trackName = comboBox.getValue().toString();
            String content = Files.lines(Paths.get(trackName)).reduce("", String::concat);
            for (String parts : content.split(" ")) playButton(parts);
        }

    }
}
