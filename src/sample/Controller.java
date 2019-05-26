package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    private Button Start;

    @FXML
    void initialize() {

        A2.setOnAction(event -> playButton("A2"));
        H2b.setOnAction(event -> playButton("H2b"));
        H2.setOnAction(event -> playButton("H2"));
        C1.setOnAction(event -> playButton("C1"));
        D1b.setOnAction(event -> playButton("D1b"));
        D1.setOnAction(event -> playButton("D1"));
        E1b.setOnAction(event -> playButton("E1b"));
        E1.setOnAction(event -> playButton("E1"));
        F1.setOnAction(event -> playButton("F1"));
        G1b.setOnAction(event -> playButton("G1b"));
        G1.setOnAction(event -> playButton("G1"));
        A1b.setOnAction(event -> playButton("A1b"));
        A1.setOnAction(event -> playButton("A1"));
        H1b.setOnAction(event -> playButton("H1b"));
        H1.setOnAction(event -> playButton("H1"));
        C.setOnAction(event -> playButton("C"));
        Db.setOnAction(event -> playButton("Db"));
        D.setOnAction(event -> playButton("D"));
        Eb.setOnAction(event -> playButton("Eb"));
        E.setOnAction(event -> playButton("E"));
        F.setOnAction(event -> playButton("F"));
        Gb.setOnAction(event -> playButton("Gb"));
        G.setOnAction(event -> playButton("G"));
        Ab.setOnAction(event -> playButton("Ab"));
        A.setOnAction(event -> playButton("A"));
        Hb.setOnAction(event -> playButton("Hb"));
        H.setOnAction(event -> playButton("H"));
        c.setOnAction(event -> playButton("c"));
        db.setOnAction(event -> playButton("db"));
        d.setOnAction(event -> playButton("d"));
        eb.setOnAction(event -> playButton("eb"));
        e.setOnAction(event -> playButton("e"));
        f.setOnAction(event -> playButton("f"));
        gb.setOnAction(event -> playButton("gb"));
        g.setOnAction(event -> playButton("g"));
        ab.setOnAction(event -> playButton("ab"));
        a.setOnAction(event -> playButton("a"));
        hb.setOnAction(event -> playButton("hb"));
        h.setOnAction(event -> playButton("h"));
        c1.setOnAction(event -> playButton("c1"));
        d1b.setOnAction(event -> playButton("d1b"));
        d1.setOnAction(event -> playButton("d1"));
        e1b.setOnAction(event -> playButton("e1b"));
        e1.setOnAction(event -> playButton("e1"));
        f1.setOnAction(event -> playButton("f1"));
        g1b.setOnAction(event -> playButton("g1b"));
        g1.setOnAction(event -> playButton("g1"));
        a1b.setOnAction(event -> playButton("a1b"));
        a1.setOnAction(event -> playButton("a1"));
        h1b.setOnAction(event -> playButton("h1b"));
        h1.setOnAction(event -> playButton("h1"));
        c2.setOnAction(event -> playButton("c2"));
        d2b.setOnAction(event -> playButton("d2b"));
        d2.setOnAction(event -> playButton("d2"));
        e2b.setOnAction(event -> playButton("e2b"));
        e2.setOnAction(event -> playButton("e2"));
        f2.setOnAction(event -> playButton("f2"));
        g2b.setOnAction(event -> playButton("g2b"));
        g2.setOnAction(event -> playButton("g2"));
        a2b.setOnAction(event -> playButton("a2b"));
        a2.setOnAction(event -> playButton("a2"));
        h2b.setOnAction(event -> playButton("h2b"));
        h2.setOnAction(event -> playButton("h2"));
        c3.setOnAction(event -> playButton("c3"));
        d3b.setOnAction(event -> playButton("d3b"));
        d3.setOnAction(event -> playButton("d3"));
        e3b.setOnAction(event -> playButton("e3b"));
        e3.setOnAction(event -> playButton("e3"));
        f3.setOnAction(event -> playButton("f3"));
        g3b.setOnAction(event -> playButton("g3b"));
        g3.setOnAction(event -> playButton("g3"));
        a3b.setOnAction(event -> playButton("a3b"));
        a3.setOnAction(event -> playButton("a3"));
        h3b.setOnAction(event -> playButton("h3b"));
        h3.setOnAction(event -> playButton("h3"));
        c4.setOnAction(event -> playButton("c4"));
        d4b.setOnAction(event -> playButton("d4b"));
        d4.setOnAction(event -> playButton("d4"));
        e4b.setOnAction(event -> playButton("e4b"));
        e4.setOnAction(event -> playButton("e4"));
        f4.setOnAction(event -> playButton("f4"));
        g4b.setOnAction(event -> playButton("g4b"));
        g4.setOnAction(event -> playButton("g4"));
        a4b.setOnAction(event -> playButton("a4b"));
        a4.setOnAction(event -> playButton("a4"));
        h4b.setOnAction(event -> playButton("h4b"));
        h4.setOnAction(event -> playButton("h4"));
        c5.setOnAction(event -> playButton("c5"));
        
    }

    private void play(int i) {
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
            ex.printStackTrace(); // outsource
        }
    }

    private void playButton(String name) {
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
