package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.sound.midi.*;
import java.io.IOException;
import java.util.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Piano");
        primaryStage.setScene(new Scene(root, 1920, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

   public void play (int i) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, i,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, i,100);
            MidiEvent noteOff = new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void playButton(String name) {
        List<String> pianoKeys = new ArrayList<>();
        pianoKeys.add(0,"A2");
        pianoKeys.add(1,"H2b");
        pianoKeys.add(2,"H2");
        pianoKeys.add(3,"C1");
        pianoKeys.add(4,"D1b");
        pianoKeys.add(5,"D1");
        pianoKeys.add(6,"E1b");
        pianoKeys.add(7,"E1");
        pianoKeys.add(8,"F1");
        pianoKeys.add(9,"G1b");
        pianoKeys.add(10,"G1");
        pianoKeys.add(11,"A1b");
        pianoKeys.add(12,"A1");
        pianoKeys.add(13,"H1b");
        pianoKeys.add(14,"H1");
        pianoKeys.add(15,"C");
        pianoKeys.add(16,"Db");
        pianoKeys.add(17,"D");
        pianoKeys.add(18,"Eb");
        pianoKeys.add(19,"E");
        pianoKeys.add(20,"F");
        pianoKeys.add(21,"Gb");
        pianoKeys.add(22,"G");
        pianoKeys.add(23,"Ab");
        pianoKeys.add(24,"A");
        pianoKeys.add(25,"Hb");
        pianoKeys.add(26,"H");
        pianoKeys.add(27,"c");
        pianoKeys.add(28,"db");
        pianoKeys.add(29,"d");
        pianoKeys.add(30,"eb");
        pianoKeys.add(31,"e");
        pianoKeys.add(32,"f");
        pianoKeys.add(33,"gb");
        pianoKeys.add(34,"g");
        pianoKeys.add(35,"ab");
        pianoKeys.add(36,"a");
        pianoKeys.add(37,"hb");
        pianoKeys.add(38,"h");
        pianoKeys.add(39,"c1");
        pianoKeys.add(40,"d1b");
        pianoKeys.add(41,"d1");
        pianoKeys.add(42,"e1b");
        pianoKeys.add(43,"e1");
        pianoKeys.add(44,"f1");
        pianoKeys.add(45,"g1b");
        pianoKeys.add(46,"g1");
        pianoKeys.add(47,"a1b");
        pianoKeys.add(48,"a1");
        pianoKeys.add(49,"h1b");
        pianoKeys.add(50,"h1");
        pianoKeys.add(51,"c2");
        pianoKeys.add(52,"d2b");
        pianoKeys.add(53,"d2");
        pianoKeys.add(54,"e2b");
        pianoKeys.add(55,"e2");
        pianoKeys.add(56,"f2");
        pianoKeys.add(57,"g2b");
        pianoKeys.add(58,"g2");
        pianoKeys.add(59,"a2b");
        pianoKeys.add(60,"a2");
        pianoKeys.add(61,"h2b");
        pianoKeys.add(62,"h2");
        pianoKeys.add(63,"c3");
        pianoKeys.add(64,"d3b");
        pianoKeys.add(65,"d3");
        pianoKeys.add(66,"e3b");
        pianoKeys.add(67,"e3");
        pianoKeys.add(68,"f3");
        pianoKeys.add(69,"g3b");
        pianoKeys.add(70,"g3");
        pianoKeys.add(71,"a3b");
        pianoKeys.add(72,"a3");
        pianoKeys.add(73,"h3b");
        pianoKeys.add(74,"h3");
        pianoKeys.add(75,"c4");
        pianoKeys.add(76,"d4b");
        pianoKeys.add(77,"d4");
        pianoKeys.add(78,"e4b");
        pianoKeys.add(79,"e4");
        pianoKeys.add(80,"f4");
        pianoKeys.add(81,"g4b");
        pianoKeys.add(82,"g4");
        pianoKeys.add(83,"a4b");
        pianoKeys.add(84,"a4");
        pianoKeys.add(85,"h4b");
        pianoKeys.add(86,"h4");
        pianoKeys.add(87,"c5");
        play(pianoKeys.indexOf(name)+ 21);
    }

}
