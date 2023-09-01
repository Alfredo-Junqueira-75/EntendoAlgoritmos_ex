import java.util.Hashtable;

public class TabelaHash{
    static Hashtable<String,Integer> votaram = new Hashtable<String, Integer>();

    public static void main(String[] args) {

        votaram.put("Alfredo", 9821);
        votar("Alfredo");
    }

    private static void votar(String name){
        if(votaram.get(name) == null) System.out.println("Pode votar");
        else System.out.println("não pode votar");
    }
}