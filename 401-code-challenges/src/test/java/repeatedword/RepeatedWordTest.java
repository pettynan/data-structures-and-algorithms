package repeatedword;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    RepeatedWord init = new RepeatedWord();

    @Test
    public void testRepeatedWord() {

        System.out.println(init.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));

    }
}