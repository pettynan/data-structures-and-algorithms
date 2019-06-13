package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    private String inputString;
    
    @Test
    public void testMultiBracketValidation_true() {
        inputString = "t[his test{ should{ pass}}!]";

        assertTrue("The above string, although it is ugly, has valid bracket syntax, and thus should return true.",
                MultiBracketValidation.multiBracketValidation(inputString));
    }

    @Test
    public void testMultiBracketValidation_false() {
        inputString = "{this string is [much] prettier than the one above," +
                " but I think I included too many closing brackets," +
                " so it returns false.}}";

        assertFalse("The above string does not have valid bracket syntax, and should return false.",
                MultiBracketValidation.multiBracketValidation(inputString));
    }

    @Test
    public void testMultiBracketValidation_falseUnorderedBrackets() {
        inputString = "[{So close.]}";

        assertFalse("The above string does not have valid bracket syntax, and should return false.",
                MultiBracketValidation.multiBracketValidation(inputString));
    }
}