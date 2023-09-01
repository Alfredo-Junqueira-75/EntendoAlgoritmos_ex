import java.util.ArrayList;
import java.util.List;

public class QuickSortv4 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(5, 4, 3, 1, 9, 7, 2, 3, 8));
        System.out.println(QuickSort(arr));
    }

    private static List<Integer> QuickSort(List<Integer> array){
        if(array.size() < 2) return array;
        else{
            List<Integer> smallest = new ArrayList<>();
            List<Integer> biggest = new ArrayList<>();
            int pivo = array.get(0);
            for(int i = 0; i < array.size();i++) if(array.get(i) < pivo) smallest.add(array.get(i));
            for(int i = 0; i < array.size();i++) if(array.get(i) > pivo) biggest.add(array.get(i));

            List<Integer> newsmallest = QuickSort(smallest);
            List<Integer> newbiggest = QuickSort(biggest);

            List<Integer> Merged = new ArrayList<>(newsmallest);
            Merged.add(pivo);
            Merged.addAll(newbiggest);
            
            return Merged;
        }
    }
}
