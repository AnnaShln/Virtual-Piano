package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javax.sound.midi.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button A2;

    @FXML
    private Button E1;

    @FXML
    private Button H2;

    @FXML
    private Button C1;

    @FXML
    private Button D1;

    @FXML
    private Button F1;

    @FXML
    private Button E;

    @FXML
    private Button D;

    @FXML
    private Button C;

    @FXML
    private Button H1;

    @FXML
    private Button A1;

    @FXML
    private Button G1;

    @FXML
    private Button G;

    @FXML
    private Button F;

    @FXML
    private Button h;

    @FXML
    private Button a;

    @FXML
    private Button g;

    @FXML
    private Button f;

    @FXML
    private Button e;

    @FXML
    private Button d;

    @FXML
    private Button c;

    @FXML
    private Button H;

    @FXML
    private Button A;

    @FXML
    private Button H2b;

    @FXML
    private Button gb;

    @FXML
    private Button eb;

    @FXML
    private Button db;

    @FXML
    private Button Hb;

    @FXML
    private Button Ab;

    @FXML
    private Button Gb;

    @FXML
    private Button Eb;

    @FXML
    private Button Db;

    @FXML
    private Button H1b;

    @FXML
    private Button A1b;

    @FXML
    private Button G1b;

    @FXML
    private Button E1b;

    @FXML
    private Button D1b;

    @FXML
    private Button hb;

    @FXML
    private Button ab;

    @FXML
    private Button e1;

    @FXML
    private Button d1;

    @FXML
    private Button c1;

    @FXML
    private Button f1;

    @FXML
    private Button g1;

    @FXML
    private Button a1;

    @FXML
    private Button h1;

    @FXML
    private Button c2;

    @FXML
    private Button g2;

    @FXML
    private Button f2;

    @FXML
    private Button e2;

    @FXML
    private Button d2;

    @FXML
    private Button d1b;

    @FXML
    private Button e1b;

    @FXML
    private Button g1b;

    @FXML
    private Button a1b;

    @FXML
    private Button h1b;

    @FXML
    private Button d2b;

    @FXML
    private Button e2b;

    @FXML
    private Button g2b;

    @FXML
    private Button h3;

    @FXML
    private Button a3;

    @FXML
    private Button g3;

    @FXML
    private Button f3;

    @FXML
    private Button e3;

    @FXML
    private Button d3;

    @FXML
    private Button c3;

    @FXML
    private Button h2;

    @FXML
    private Button a2;

    @FXML
    private Button h4;

    @FXML
    private Button a4;

    @FXML
    private Button g4;

    @FXML
    private Button f4;

    @FXML
    private Button e4;

    @FXML
    private Button d4;

    @FXML
    private Button c4;

    @FXML
    private Button g3b;

    @FXML
    private Button e3b;

    @FXML
    private Button d3b;

    @FXML
    private Button h2b;

    @FXML
    private Button a2b;

    @FXML
    private Button a3b;

    @FXML
    private Button h3b;

    @FXML
    private Button d4b;

    @FXML
    private Button e4b;

    @FXML
    private Button g4b;

    @FXML
    private Button a4b;

    @FXML
    private Button h4b;

    @FXML
    private Button c5;

    @FXML
    void initialize() {
        A2.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 21,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 21,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        H2b.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 22,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 22,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        H2.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 23,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 23,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        C1.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 24,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 24,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        D1b.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 25,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 25,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        D1.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 26,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 26,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        E1b.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 27,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 27,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        E1.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 28,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 28,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        F1.setOnAction(event -> {
            try {
                Sequencer player = MidiSystem.getSequencer();
                player.open();

                Sequence seq = new Sequence(Sequence.PPQ, 4);

                Track track = seq.createTrack();

                ShortMessage a = new ShortMessage();
                a.setMessage(144, 1, 29,100);
                MidiEvent noteOn = new MidiEvent(a,1);
                track.add(noteOn);

                ShortMessage b = new ShortMessage();
                b.setMessage(128, 1, 29,100);
                MidiEvent noteOff = new MidiEvent(b,16);
                track.add(noteOff);

                player.setSequence(seq);

                player.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
