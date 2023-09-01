public class PesquisaBinaira {
    static int list[] = {1,3,5,7,9};
        
    public static void main(String[] args) throws Exception {
        System.out.println(pesquisaBinaria(list, 5));
    }

    public static int pesquisaBinaria(int lista[], int item){
        int baixo = 0;
        int alto = lista.length - 1;

        while(baixo <=alto){
            int meio = (baixo+alto) / 2;
            if(lista[meio] == item) return meio;
            else if(lista[meio] < item) baixo = meio + 1;
            else if(lista[meio] > item) alto = meio - 1;
            
        }
        return -1;
    }
}      
