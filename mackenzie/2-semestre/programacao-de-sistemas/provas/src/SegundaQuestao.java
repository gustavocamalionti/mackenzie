public class SegundaQuestao {
    public static void main(String[] args) {
        int v[] = {-1,2,-3};

        int resultado = maxVet(v);
        System.out.println(resultado);
    }

    public static int maxVet(int v[]) {
        int maior = 0;
        for(int i=0; i<v.length; i++)
            if(v[i]> maior) maior = v[i];
        return maior;
    }
}
