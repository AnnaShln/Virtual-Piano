package sample;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javax.sound.midi.*;
import static javafx.scene.paint.Color.GREEN;
import static javafx.scene.paint.Color.RED;

public class Controller {

    public Circle light;
    public Button stopRecording;

    @FXML
    private ComboBox<String> trackList;

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
        playButton(btn.getId());
        if (player.go) player.saveKey(btn);
    }

    public void start() {
        player.startRecording(stopRecording);
        light.setFill(GREEN);
        light.setStroke(GREEN);
    }

    public void stop() throws IOException {
        player.stopRecording(stopRecording);
        light.setFill(RED);
        light.setStroke(RED);
    }

    public void tracks() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        player.melodyList(trackList);
    }

    class Player {
        private List<String> melody = new ArrayList<>();
        private boolean go;

        void saveKey(Button button) {
            melody.add(button.getId());
        }

        void startRecording(Button button){
            go = true;
            button.setDisable(false);
        }

        void stopRecording(Button button) throws IOException {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showSaveDialog(null);
            FileWriter filewriter = new FileWriter(selectedFile);
            for (String pianoKey: melody){
                filewriter.write(pianoKey+" ");
            }
            filewriter.close();
            melody.clear();
            button.setDisable(true);
        }

        void melodyList(ComboBox comboBox) throws InvalidMidiDataException, MidiUnavailableException, IOException {
            File dir = new File("tracks");
            for (File f: Objects.requireNonNull(dir.listFiles())) {
                comboBox.getItems().add(f.getName());
            }
            String trackName = comboBox.getValue().toString();
            String content = Files.lines(Paths.get(trackName)).reduce("", String::concat);
            for (String parts : content.split(" ")) playButton(parts);
        }
    }
}
