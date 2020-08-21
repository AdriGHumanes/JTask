import com.sun.tools.javac.jvm.Code;
import org.junit.Test;

import java.io.IOException;
import java.util.function.Function;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/*
 *   Please code the tests in the format of reverseArray_returnsExpectedResult. This is an example of how we write our tests at Cardano.
 *
 *   Test 1-4 tests are easy as the function returns a result that can be asserted. Tests 5-7 are more difficult to assert as they are
 *   void, use your knowledge to write a meaningful test.
 *
 *   Feel free to use the internet to help you with you answers but make sure you understand the answer as we will ask you questions.
 */

public class CodeTestSpec {
    @Test
    public void reverseArray_returnsExpectedResult() {
        // arrange
        final String[] EXPECTED = {"x", "y", "z"};

        // act
        final String[] actual = CodeTest.reverseArray(new String[] {"z", "y", "x"});

        // assert
        assertArrayEquals(EXPECTED, actual);
    }

    @Test
    public void uppercaseArray_returnsExpectedResult() {
        final String[] EXPECTED = {"A","B","C"};
        final String[] actual = CodeTest.uppercaseArray(new String[] {"a","B","c"});
        assertArrayEquals(EXPECTED,actual);
    }

    @Test
    public void findWordCount_returnsExpectedResult() {
        final int EXPECTED = 2;
        final int actual = CodeTest.findWordCount("the cat jumped over the mat","the");
        assertEquals(EXPECTED,actual);
    }

    @Test
    public void composeU_returnsExpectedResult() {
        final int EXPECTED = 13;
        Function<Integer,Integer> f1 = (value) -> value *2 ;
        Function<Integer,Integer> f2 = (value) -> value +3;
        Function<Integer,Integer> f3 = CodeTest.composeU(f1,f2);
        final int actual = f3.apply(5);
        assertEquals(EXPECTED, actual);
    }

    @Test
    public void writeContentsToConsole_returnsExpectedResult() {
        try {
            CodeTest.writeContentsToConsole();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void handleInvalidArgument_returnsExpectedResult() {
        CodeTest.handleInvalidArgument();
    }

    @Test
    public void puzzle_returnsExpectedResult() {
        CodeTest.puzzle();
    }
}
