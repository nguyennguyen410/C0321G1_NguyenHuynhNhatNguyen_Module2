package thuat_toan_sap_xep.bai_tap.cai_dat_sap_xep_chen;

public class InsertSort {
    public static void insertionSort(int[] array){
        int pos, temp;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            temp = array[i];
            pos = i;
            while(pos > 0 && temp < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = temp;
        }
    }

    static int[] list = {10, 9, 5, 8, 6, 17, 14};

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
