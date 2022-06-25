public class Sums {
    public static void main(String[] args) {
        //Testing the program from main method
        int[] array = {2, 4, 8};
        System.out.println(groupSum(0, array, 15));
    }

    public static boolean groupSum(int start, int[] nums, int target){
        
        if (target == 0) {
            return true;
        }

        if (start < nums.length) {
            boolean Yes = groupSum(start+1, nums, target-nums[start]);
            if (Yes) return true;

            boolean No = groupSum(start+1, nums, target);
            if (No) return true;
        } else {
            return false;
        }
        return false;
    }
}
