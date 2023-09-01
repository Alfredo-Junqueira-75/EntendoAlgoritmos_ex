import java.util.Arrays;

public class QuickSortv3 {
    public static void main(String[] args) throws Exception {
        int arr[] = {2,3,5,1,5,12};
        System.out.println(biggest(arr));
        
    }
    private static int biggest(int arr[]){
        if(arr.length == 2){
            if(arr[0]>arr[1]) return arr[0];
            else return arr[1];
        }
        int subarr[] = Arrays.copyOfRange(arr, 1, arr.length);
        int sub_max= biggest(subarr);
        if(arr[0] > sub_max)return arr[0];
        else return sub_max;
    }
}
