
public class Ordenacao{
    public static void main(String[] args) {
        
        int arr[] = {5,1,3,2,9,8};
        System.out.println(ordenarArray(arr));
    }

    private static int buscarMenor(int arr[]){
        int menor = arr[0];
        int indice_menor = 0;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]<menor){
                menor = arr[i];
                indice_menor = i;
            }
        }
        return indice_menor;
    }

    private static int[] ordenarArray( int arr[]){
        int new_arr[] = new int[arr.length];

        for(int i = 0 ; i < arr.length; i++){
            int menor = arr[buscarMenor(arr)];
            new_arr[i] = menor;
        }

        return new_arr;
    }
}