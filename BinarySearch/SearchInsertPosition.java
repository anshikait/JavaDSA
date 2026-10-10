import java.util.HashMap;

public class SearchInsertPosition {
    
    public int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int insert = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) {
                insert = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return insert;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        System.out.println(sip.searchInsert(arr, target));
    }
}