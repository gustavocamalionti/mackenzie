public class Praticando {

  public static void main(String[] args) {
    int[] numeros = new int[100];
    int Z = 0;

    for (int i : numeros) {
      numeros[Z] = ++Z;
    }

    Calcular thread_0 = new Calcular(numeros, 100);
    thread_0.start();

    Calcular thread_1 = new Calcular(numeros, 35);
    thread_1.start();
  }

}
