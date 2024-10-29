import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class KatasTest {

    Katas katas;

    @BeforeEach
    void setup() {
        katas = new Katas();
    }

    @Test
    @DisplayName("sumMiddleNumbers: Should return 0 if given incorrect input")
    public void testSumMiddleNumbersReturnsZeroWithInvalidInput(){
        int[] input1 = {1,2};
        int[] input3 = {1};
        int[] input4 = { 1, 1, 1, 2, 2, 2 ,2 };

        var result1 = katas.sumMiddleNumbers(input1);
        var result2 = katas.sumMiddleNumbers(null);
        var result3 = katas.sumMiddleNumbers(input3);
        var result4 = katas.sumMiddleNumbers(input4);

        int expectedOutput = 0;

        assertAll("Grouped Assertions for sumMiddleNumbers with invalid inputs",
                ()-> assertEquals(expectedOutput, result1),
                ()-> assertEquals(expectedOutput, result2),
                ()-> assertEquals(expectedOutput, result3),
                ()-> assertEquals(expectedOutput, result4)
                );


    }

    @Test
    @DisplayName("sumMiddleNumbers: Should return sum of middle numbers excluding highest and lowest numbers")
    public void testSumMiddleNumbersReturnsSumOfMiddleNumbers(){
        int[] input1 = { 5, 2, 6, 10, 22 };
        int[] input2 = { 1, 2, 3, 4, 5 };
        int[] input3 = { 1, 2, 3 };
        int[] input4 = { 10001, 2220, 31, 100, 2, 999 };


        var result1 = katas.sumMiddleNumbers(input1);
        var result2 = katas.sumMiddleNumbers(input2);
        var result3 = katas.sumMiddleNumbers(input3);
        var result4 = katas.sumMiddleNumbers(input4);


        int expectedOutput1 = 21;
        int expectedOutput2 = 9;
        int expectedOutput3 = 2;
        int expectedOutput4 = 3350;

        assertAll("Grouped Assertions for sumMiddleNumbers with invalid inputs",
                ()-> assertEquals(expectedOutput1, result1),
                ()-> assertEquals(expectedOutput2, result2),
                ()-> assertEquals(expectedOutput3, result3),
                ()-> assertEquals(expectedOutput4, result4)

        );

    }


    @Test
    @DisplayName("calculateMean: should return 0.0 if given invalid input")
    public void testCalculateMeanReturnsZeroWithInvalidInput() {
        int[] input = {};

        var result1 = katas.calculateMean(input);
        var result2 = katas.calculateMean(null);

        double expectedOutput = 0.0;

        assertAll("Grouped Assertions for calculateMean with invalid inputs",
                () -> assertEquals(expectedOutput, result1),
                () -> assertEquals(expectedOutput, result2)
        );
    }

    @Test
    @DisplayName("calculateMean: should return mean with valid input")
    public void testCalculateMeanReturnsMeanWithValidInput() {
        int[] input1 = {1, 2, 3};
        int[] input2 = {40, 16, 5, 8};
        int[] input3 = {0, 0, 0, 0, 0, 0, 0};
        int[] input4 = {0, 1, 0, 0, 0};

        var result1 = katas.calculateMean(input1);
        var result2 = katas.calculateMean(input2);
        var result3 = katas.calculateMean(input3);
        var result4 = katas.calculateMean(input4);

        double expectedOutput1 = 2;
        double expectedOutput2 = 17.25;
        double expectedOutput3 = 0;
        double expectedOutput4 = 0.2;

        assertAll("Grouped Assertions for calculateMean with valid inputs",
                () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2),
                () -> assertEquals(expectedOutput3, result3),
                () -> assertEquals(expectedOutput4, result4)
                );
    }
}