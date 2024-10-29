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
    public void testSumMiddleNumbersReturnsZeroWithInvalidInput() {
        int[] input1 = {1, 2};
        int[] input3 = {1};
        int[] input4 = {1, 1, 1, 2, 2, 2, 2};

        var result1 = katas.sumMiddleNumbers(input1);
        var result2 = katas.sumMiddleNumbers(null);
        var result3 = katas.sumMiddleNumbers(input3);
        var result4 = katas.sumMiddleNumbers(input4);

        int expectedOutput = 0;

        assertAll("Grouped Assertions for sumMiddleNumbers with invalid inputs",
                () -> assertEquals(expectedOutput, result1),
                () -> assertEquals(expectedOutput, result2),
                () -> assertEquals(expectedOutput, result3),
                () -> assertEquals(expectedOutput, result4)
        );
    }

    @Test
    @DisplayName("sumMiddleNumbers: Should return sum of middle numbers excluding highest and lowest numbers")
    public void testSumMiddleNumbersReturnsSumOfMiddleNumbers() {
        int[] input1 = {5, 2, 6, 10, 22};
        int[] input2 = {1, 2, 3, 4, 5};
        int[] input3 = {1, 2, 3};
        int[] input4 = {10001, 2220, 31, 100, 2, 999};


        var result1 = katas.sumMiddleNumbers(input1);
        var result2 = katas.sumMiddleNumbers(input2);
        var result3 = katas.sumMiddleNumbers(input3);
        var result4 = katas.sumMiddleNumbers(input4);


        int expectedOutput1 = 21;
        int expectedOutput2 = 9;
        int expectedOutput3 = 2;
        int expectedOutput4 = 3350;

        assertAll("Grouped Assertions for sumMiddleNumbers with valid inputs",
                () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2),
                () -> assertEquals(expectedOutput3, result3),
                () -> assertEquals(expectedOutput4, result4)

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

    @Test
    @DisplayName("sumOfASCIIValuesInString: should return 0 with empty/null input")
    public void testSumOfASCIIValuesInStringReturnsZeroWithInvalidInputs() {
        String input1 = "";

        var result1 = katas.sumOfASCIIValuesInString(input1);
        var result2 = katas.sumOfASCIIValuesInString(null);

        assertAll("Grouped Assertions for sumOfASCIIValuesInString with invalid inputs",
                () -> assertEquals(0, result1),
                () -> assertEquals(0, result2)
        );
    }


    @Test
    @DisplayName("sumOfASCIIValuesInString: should return sum of all chars as ASCII values in a string excluding special characters")
    public void testSumOfASCIIValuesInStringReturnsSumExcludingSpecialCharacters() {
        String input1 = "Hell[o";
        String input2 = "33.asdfghjkl[[";

        var result1 = katas.sumOfASCIIValuesInString(input1);
        var result2 = katas.sumOfASCIIValuesInString(input2);

        int expectedOutput1 = 500;
        int expectedOutput2 = 1044;

        assertAll("Grouped Assertions for sumOfASCIIValuesInString with valid inputs containing special characters",
                () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2)
        );
    }

    @Test
    @DisplayName("sumOfASCIIValuesInString: should return sum of all chars as ASCII values in a string")
    public void testSumOfASCIIValuesInStringReturnsSumWithValidInputs() {
        String input1 = "hHello123";
        String input2 = "overwhelming";
        String input3 = "123asdjhasjd23h23h42342bn4234";

        var result1 = katas.sumOfASCIIValuesInString(input1);
        var result2 = katas.sumOfASCIIValuesInString(input2);
        var result3 = katas.sumOfASCIIValuesInString(input3);

        int expectedOutput1 = 754;
        int expectedOutput2 = 1303;
        int expectedOutput3 = 2168;

        assertAll("Grouped Assertions for sumOfASCIIValuesInString with valid inputs",
                () -> assertEquals(expectedOutput1, result1),
                () -> assertEquals(expectedOutput2, result2),
                () -> assertEquals(expectedOutput3, result3)
        );
    }

    @Test
    @DisplayName("studentLectureLikeOrDislike: should return null if input is null")
    public void testStudentLectureLikeOrDislikeReturnsNullWithNullInput() {
        var result = katas.studentLectureLikeOrDislike(null);

        assertNull(result);
    }

    @Test
    @DisplayName("studentLectureLikeOrDislike: should return NEUTRAL if LIKE & DISLIKE count are the same")
    public void testStudentLectureLikeOrDislikeReturnsNEUTRALWithValidInput() {
        Review[] input1 = {Review.LIKE, Review.DISLIKE};
        Review[] input2 = {Review.LIKE, Review.LIKE};
        Review[] input3 = {Review.DISLIKE, Review.DISLIKE};
        Review[] input4 = {Review.LIKE, Review.LIKE, Review.DISLIKE, Review.DISLIKE};
        Review[] input5 = {Review.LIKE, Review.DISLIKE, Review.DISLIKE, Review.LIKE};

        var result1 = katas.studentLectureLikeOrDislike(input1);
        var result2 = katas.studentLectureLikeOrDislike(input2);
        var result3 = katas.studentLectureLikeOrDislike(input3);
        var result4 = katas.studentLectureLikeOrDislike(input4);
        var result5 = katas.studentLectureLikeOrDislike(input5);

        Review expectedOutput = Review.NEUTRAL;

        assertAll("Grouped Assertions for studentLectureLikeOrDislike with same LIKE & DISLIKE count",
                () -> assertEquals(expectedOutput, result1),
                () -> assertEquals(expectedOutput, result2),
                () -> assertEquals(expectedOutput, result3),
                () -> assertEquals(expectedOutput, result4),
                () -> assertEquals(expectedOutput, result5)
        );
    }


    @Test
    @DisplayName("studentLectureLikeOrDislike: should return LIKE if LIKE count is greater than DISLIKE count")
    public void testStudentLectureLikeOrDislikeReturnsLIKEWithLIKEGreaterThanDISLIKE() {
        Review[] input1 = {Review.LIKE};
        Review[] input2 = {Review.LIKE, Review.LIKE, Review.LIKE};
        Review[] input3 = {Review.LIKE, Review.LIKE, Review.DISLIKE, Review.DISLIKE, Review.LIKE};
        Review[] input4 = {Review.DISLIKE, Review.DISLIKE, Review.DISLIKE, Review.DISLIKE, Review.LIKE};

        var result1 = katas.studentLectureLikeOrDislike(input1);
        var result2 = katas.studentLectureLikeOrDislike(input2);
        var result3 = katas.studentLectureLikeOrDislike(input3);
        var result4 = katas.studentLectureLikeOrDislike(input4);

        Review expectedOutput = Review.LIKE;

        assertAll("Grouped Assertions for studentLectureLikeOrDislike with greater LIKEs than DISLIKEs",
                () -> assertEquals(expectedOutput, result1),
                () -> assertEquals(expectedOutput, result2),
                () -> assertEquals(expectedOutput, result3),
                () -> assertEquals(expectedOutput, result4)
        );
    }

    @Test
    @DisplayName("studentLectureLikeOrDislike: should return DISLIKE if DISLIKE count is greater than LIKE count")
    public void testStudentLectureLikeOrDislikeReturnsDISLIKEWithDISLIKEGreaterThanLIKE() {
        Review[] input1 = {Review.DISLIKE};
        Review[] input2 = {Review.DISLIKE, Review.DISLIKE, Review.DISLIKE};
        Review[] input3 = {Review.DISLIKE, Review.LIKE, Review.DISLIKE, Review.DISLIKE, Review.LIKE};
        Review[] input4 = {Review.LIKE, Review.LIKE, Review.LIKE, Review.LIKE, Review.DISLIKE};

        var result1 = katas.studentLectureLikeOrDislike(input1);
        var result2 = katas.studentLectureLikeOrDislike(input2);
        var result3 = katas.studentLectureLikeOrDislike(input3);
        var result4 = katas.studentLectureLikeOrDislike(input4);

        Review expectedOutput = Review.DISLIKE;

        assertAll("Grouped Assertions for studentLectureLikeOrDislike with greater DISLIKEs than LIKEs",
                () -> assertEquals(expectedOutput, result1),
                () -> assertEquals(expectedOutput, result2),
                () -> assertEquals(expectedOutput, result3),
                () -> assertEquals(expectedOutput, result4)
        );
    }
}










