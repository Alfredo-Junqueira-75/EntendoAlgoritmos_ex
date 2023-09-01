    public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,5};
        System.out.println(soma(arr));
    }

    public static int soma(int[] arr) {
        return somaRecursiva(arr, 0);
    }

    private static int somaRecursiva(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        
        return arr[index] + somaRecursiva(arr, index + 1);
    }
}

