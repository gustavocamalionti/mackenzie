public class Calcular extends Thread {

    private final int tempo;
    private final int[] numeros;
    private int contagemTotal = 0;
    private int soma;

    public Calcular(int[] numeros, int tempo) {
        this.numeros = numeros;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numeros.length; i++) {

                soma = contagemTotal + numeros[i];
                System.out.printf("%s somar %d + %d = %d \n", getName(), contagemTotal, numeros[i], soma);
                contagemTotal = soma;
                Thread.sleep(tempo);
            }

            System.out.printf("TOTAL %s = %d \n", getName(), contagemTotal);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}