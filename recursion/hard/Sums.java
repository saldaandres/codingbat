public class Sums {
    public static void main(String[] args) {
        //Testing the program from main method
        int[] array = {5, 2, 4, 6};
        System.out.println(groupSum6(0, array, 9));
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

    public static boolean groupSum6(int start, int[] nums, int target) {
        
        //this one must traverse entire array since all 6's must be included.
        if (start == nums.length) {
            if (target == 0) {
                return true;
            } else {
                return false;
            }
        }

        if (start < nums.length) {
            
            if (nums[start] == 6) {
                boolean include = groupSum6(start+1, nums, target-nums[start]);
                if (include) return true;

            } else {
                boolean include = groupSum6(start+1, nums, target-nums[start]);
                if (include) return true;

                boolean notInclude = groupSum6(start+1, nums, target);
                if (notInclude) return true;
            }
        } 
        return false;
    }
}
