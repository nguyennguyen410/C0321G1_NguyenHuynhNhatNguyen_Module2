package thuat_toan_tim_kiem.bai_tap.tim_kiem_nhi_phan_de_quy;

public class BinarySearchDeQuy {
    static int binarySearch(int arr[], int low, int high, int value)
    {
        if (high>=low) {
            int mid = (low + high)/2;
            if (arr[mid] == value){
                return mid;
            }
            else if (arr[mid] > value){
                return binarySearch(arr, low, mid-1, value);
            }
            else {
                return binarySearch(arr, mid+1, high, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,9,12};
        int index = binarySearch(arr,0,arr.length-1,9);
        System.out.println(arr[index]+" tai vi tri "+index);
    }
}
