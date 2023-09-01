public class PilhaDeChamada {
    public static void main(String[] args) throws Exception {
        System.out.println(fatorial(12));
    }

    private static int fatorial(int x){
        if(x==1) return 1;
        return x * fatorial(x-1);
    }
}
