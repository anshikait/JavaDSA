import java.util.HashMap;

public class UpperBound {
    
    public int UpperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ub = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > target) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ub;
    }

    public static void main(String[] args) {
        UpperBound ub = new UpperBound();
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        System.out.println(ub.UpperBound(arr, target));
    }
}