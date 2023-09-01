import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class AlgoritmoDijkstra {
    
    static List<String> Processados = new ArrayList<String>();
    
    public static void main(String[] args) {
        /* HASHTABLE GRAFO */
        Hashtable<String, Hashtable<String, Integer>> grafo = new Hashtable<>();
        Hashtable<String, Double> custos = new Hashtable<>();
        Hashtable<String, String> pais = new Hashtable<>();

        /* CONSTRUÇÃO DO GRAFO */
        grafo.put("inicio", new Hashtable<>());
        String[] keys = {"A","B"};
        int[] value = {2,2};
        Hashtable<String, Integer> grafoVizinho = hashGenerate(keys,value );
        grafo.replace("inicio", grafoVizinho);

        grafo.put("A", new Hashtable<>());
        String[] keysA = {"fim","C"};
        int[] valueA = {2,2};
        Hashtable<String, Integer> grafoVizinhoA = hashGenerate(keysA,valueA );
        grafo.replace("A", grafoVizinhoA);
        
        grafo.put("B", new Hashtable<>());
        String[] keysB = {"A"};
        int[] valueB = {2};
        Hashtable<String, Integer> grafoVizinhoB = hashGenerate(keysB,valueB );
        grafo.replace("B", grafoVizinhoB);

        grafo.put("C", new Hashtable<>());
        String[] keysC = {"B","fim"};
        int[] valueC = {-1,2};
        Hashtable<String, Integer> grafoVizinhoC = hashGenerate(keysC,valueC );
        grafo.replace("C", grafoVizinhoC);
        


        grafo.put("fim", new Hashtable<>());

        /*System.out.println(grafo.get("B").get("fim"));*/

        /* HASHTABLE CUSTO */
        custos.put("A", 2.0);
        custos.put("B", 2.0 );
        custos.put("C", Double.POSITIVE_INFINITY);
        custos.put("fim", Double.POSITIVE_INFINITY);
        /*System.out.println(custos.get("fim"));*/

        /* HASHTABLE PAIS */
        pais.put("A", "inicio");
        pais.put("B", "inicio");
        pais.put("C", "");
        pais.put("fim", "");

        String node = ache_no_node_mais_baixo(custos);
        while (node != null) {
            Double custo = custos.get(node);
            Hashtable<String, Integer> vizinhos = grafo.get(node);

            for (String x : vizinhos.keySet()) {
                Double novo_custo = custo + vizinhos.get(x);
                if (novo_custo < custos.get(x)) {
                    custos.replace(x, novo_custo);
                    pais.replace(x, node);
                }
            }
            Processados.add(node);
            node = ache_no_node_mais_baixo(custos);
        }
        
        System.out.println(custos.toString());

            

    }

    private static String ache_no_node_mais_baixo(Hashtable<String, Double> custos) {
        Double custo_mais_baixo = Double.POSITIVE_INFINITY;
        String node_custo_mais_baixo = null;

        for (String node : custos.keySet()) {
            Double custo = custos.get(node);
            if (custo < custo_mais_baixo && !Processados.contains(node)) {
                custo_mais_baixo = custos.get(node);
                node_custo_mais_baixo = node;
            }
        }
        return node_custo_mais_baixo;
    }
    
    private static Hashtable<String,Integer> hashGenerate(String[] key, int[]value){
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        for(int i = 0; i < key.length; i++) hashtable.put(key[i], value[i]);
        return hashtable;
    }
    
    

}