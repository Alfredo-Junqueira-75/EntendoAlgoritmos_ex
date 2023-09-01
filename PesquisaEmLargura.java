import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class PesquisaEmLargura {
    public static void main(String[] args) {
        
        Deque<String> filaVendedores = new ArrayDeque<>();
        Hashtable<String, String[]> grafo = new Hashtable<String, String[]>();
        List<String> verificados = new ArrayList<>();
        String[] vizinhos = {"alice", "bob", "claire e mangas"};        
        grafo.put("alfredo", vizinhos);

        /* grafo["voce"] = ["alice", "bob", "claire"]
        grafo["bob"] = ["anuj", "peggy"]
        grafo["alice"] = ["peggy"]
        grafo["claire"] = ["thom", "jonny"]
        grafo["anuj"] = []
        grafo["peggy"] = []
        grafo["thom"] = []
        grafo["jonny"] = []
        */

        for(int i = 0; i< vizinhos.length; i++) filaVendedores.add(vizinhos[i]);
        System.out.println(filaVendedores);
        while(!filaVendedores.isEmpty()){
            String pessoa = filaVendedores.poll();
            if(!verificados.contains(pessoa)){
            if(pessoaEVendedor(pessoa)){
                System.out.println(pessoa);
                System.out.println( pessoa + " é um vendedor de manga");
                break;
            }
            else{
                /*String[] Adjacentes = grafo.get(pessoa);
                for(int i = 0; i< vizinhos.length; i++) filaVendedores.add(Adjacentes[i]);*/
            }
        }
        }    
            
        }
        

    
    public static Boolean pessoaEVendedor(String nome){
        return nome.contains("mangas");
    }
}
