/**
 * SplitArray
 */
public class SplitArray {

    public static void main(String[] args) {
        int[] array = {5, 2, 3};
        System.out.println(splitArray(array, 0, 0, 0));
    }

    public static boolean splitArray(int[] nums, int sumLeft, int sumRight, int position) {
        
        System.out.printf("posicion %d; suma izquierda %d, suma derecha %d%n", position, sumLeft, sumRight);
        
        if (position == nums.length) {
            if (sumLeft == sumRight) {
                return true;
            } else {
                return false;
            }

        }

        boolean sumarIzquierda = splitArray(nums, sumLeft+nums[position], sumRight, position+1);
        if (sumarIzquierda) return true;

        boolean sumarDerecha = splitArray(nums, sumLeft, sumRight+nums[position], position+1);
        if (sumarDerecha) return true;

        return false;   
    }
}