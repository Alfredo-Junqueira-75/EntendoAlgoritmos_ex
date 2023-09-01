
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AlgoritmoGuloso {
    public static void main(String[] args) {
        Set<String> estados_abranger = new HashSet<>(List.of("mt", "wa", "or", "id", "nv", "ut","ca","az"));
        Set<String> estacoes_finais = new HashSet<>();

        Hashtable<String,Set<String>> estacoes= new Hashtable<>();
        estacoes.put("Kum", new HashSet<>(List.of("id", "nv", "ut")));
        estacoes.put("Kdois", new HashSet<>(List.of("wa", "id", "mt")));
        estacoes.put("Ktres", new HashSet<>(List.of("or", "nv", "ca")));
        estacoes.put("Kquatro", new HashSet<>(List.of("nv", "ut")));
        estacoes.put("Kcinco", new HashSet<>(List.of("ca", "az")));
        
        /*estacoes["kum"] = set(["id", "nv", "ut"])
        estacoes["kdois"] = set(["wa", "id", "mt"])
        estacoes["ktres"] = set(["or", "nv", "ca"])
        estacoes["kquatro"] = set(["nv", "ut"])
        estacoes["kcinco"] = set(["ca", "az"])
        */
        while(!estados_abranger.isEmpty()){
            String melhor_estacao= "";
            Set<String> estados_cobertos = new  HashSet<>();
            
            for(Map.Entry<String,Set<String>> entry : estacoes.entrySet()){
                String estacao = entry.getKey();
                Set<String> estado = entry.getValue();
                Set<String> cobertos = new HashSet<>(estados_abranger);
                cobertos.retainAll(estado);
                if(cobertos.size() > estados_cobertos.size()){
                    melhor_estacao = estacao;
                    estados_cobertos =cobertos;
                }
            }
            estados_abranger.removeAll(estados_cobertos);
            estacoes_finais.add(melhor_estacao);
            
        }        
        System.out.println(estacoes_finais);
    }
}
