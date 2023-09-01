public class Recursividade {
    public static void main(String[] args){
        regresiva(3);
    }
    private static void regresiva(int i){
        System.out.println(i);
        if(i <=1) return;
        else regresiva(i-1);
    }
}
