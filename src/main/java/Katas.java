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



}
