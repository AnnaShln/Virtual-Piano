package sample;

import org.junit.jupiter.api.Test;
import sample.Controller.Player;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.io.File.separatorChar;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ControllerTest {

    @Test
    void listOfTracks() {
        Player player = new Controller().new Player();
        File dir = new File("tests"+separatorChar+"resources");
        List<String> list = new ArrayList<>(
                Arrays.asList("1Do.txt", "2Re.txt", "3Mi.txt")
        );
        assertEquals(list,player.getTracks(dir));
    }
}