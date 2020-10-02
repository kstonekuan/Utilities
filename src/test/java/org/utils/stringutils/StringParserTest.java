package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringParserTest {
    // Three part name for a test: methodUnderTest_inputGiven_expectedOutput
    @Test
    void splitString_oneSeparator_returnsTwoStrings() throws InvalidStringInputException {
        StringParser sp = new StringParser();
        String inputString = "Hello|world";
        List<String> stringParts = sp.splitString(inputString, "\\|");
        assertEquals(stringParts.size(), 2);
    }

    @Test
    void splitString_nullInput_expectException() {
        StringParser sp = new StringParser();
        String inputString = null;
        assertThrows(InvalidStringInputException.class, () -> {
            sp.splitString(inputString, "\\|");
        });
    }
}