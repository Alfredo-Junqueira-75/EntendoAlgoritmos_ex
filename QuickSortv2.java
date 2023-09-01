public class QuickSortv2 {
    
    public static void main(String[] args) {
        int counter = 0;
        int arr[] = {1,1,4,4,1};
        System.out.println(meter(arr, counter));
    }
    
    private static int meter(int arr[], int counter){
        int length = arr.length;
        
        return meterAssist(length, counter); 
    }

    private static int meterAssist(int length, int counter){
        counter++;
        if(length == counter){
            return counter;
        }
        
        return meterAssist(length, counter);
    }
}
