public class PrimeiraQuestao {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 12;

        int resultado = min3(a,b,c);
        System.out.println(resultado);
    }

    public static int min3(int a, int b, int c) {
        if(a<b && a<c) return a;
        else if(b<a && b<c) return b;
        else return c;
    }
}


