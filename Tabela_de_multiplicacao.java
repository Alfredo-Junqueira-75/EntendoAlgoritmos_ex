import java.util.ArrayList;
import java.util.List;

public class Tabela_de_multiplicacao {
    static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(2,3,7,8,10));
        System.out.print(multiplier(numbers));
    }
    
    public static List<Integer> multiplier(List<Integer> arr){
        return multiplierCycle(arr, arr);
    }
    public static List<Integer> multiplierCycle(List<Integer> arr, List<Integer> subarr){
        if(subarr.size() == 0) return result; 
        for(int i = 0; i < arr.size(); i++){
            result.add(arr.get(i) * subarr.get(0));
        }
        return multiplierCycle(arr, subarr.subList(1, subarr.size()));
    }
}