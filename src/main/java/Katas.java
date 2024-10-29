public class Katas {

    public int sumMiddleNumbers(int[] nums){
        int result = 0;

        if (nums == null || nums.length < 3){
            return result;
        }

        int lowestNumber = nums[0];
        int highestNumber = 0;

        for ( int num : nums){
            if (num < lowestNumber){
                lowestNumber = num;
            }

            if (num > highestNumber){
                highestNumber = num;
            }
        }

        for (int num: nums){
            if ( num > lowestNumber && num < highestNumber){
                result += num;
            }
        }

        return result;
    }

    public double calculateMean(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0.0;
        }

        int numsLength = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return (double) sum / numsLength;
    }
}
