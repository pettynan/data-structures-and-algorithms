package leftjoin;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {
    LeftJoin init = new LeftJoin();

    HashMap<String, String> synonymMap = new HashMap<>();
    HashMap<String, String> antonymMap = new HashMap<>();
    String[][] output;

    @Before
    public void initializeMaps() {
        synonymMap.put("fond", "enamored");
        synonymMap.put("wrath", "anger");
        synonymMap.put("diligent", "employed");
        synonymMap.put("outfit", "garb");
        synonymMap.put("guide", "usher");

        antonymMap.put("fond", "averse");
        antonymMap.put("wrath", "delight");
        antonymMap.put("diligent", "idle");
        antonymMap.put("guide", "follow");
        antonymMap.put("flow", "jam");

        output = init.leftJoin(synonymMap, antonymMap);
    }

    @Test
    public void testLeftJoin() {
        assertArrayEquals("The first row of the returned String array array should equal ",
                new String[] {"diligent", "employed", "idle"},
                output[0]);
    }

    @Test
    public void testLeftJoin_Null() {
        assertEquals("The word 'outfit' does not have a listed antonym, and so its antonym column should be null.",
                "NULL",
                output[1][2]);
    }
}