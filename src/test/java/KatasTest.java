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
    @DisplayName("Should return 0 if given incorrect input")
    public void testSumMiddleNumbersReturnsZeroWithInvalidInput(){
        int[] input1 = {1,2};
        int[] input2 = null;
        int[] input3 = {1};

        var result = katas.sumMiddleNumbers(input1);


    }

}