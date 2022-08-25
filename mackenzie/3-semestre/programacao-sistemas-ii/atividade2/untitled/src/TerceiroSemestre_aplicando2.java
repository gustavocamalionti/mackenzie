import java.io.*;
import java.util.ArrayList;

public class TerceiroSemestre_aplicando2 {
    public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {
                ArrayList<String> list = new ArrayList<>();
                ArrayList<Float> array = new ArrayList();
                float media = 0f;

                while (reader.ready()) {
                    list.add(reader.readLine());
                }

                for (int i = 0; i < list.size(); i++) {
                    String record = list.get(i);
                    String[] parts = record.split(";");
                    String nota = parts[2]; // gets the grade
                    float fnota = Float.parseFloat(nota);
                    array.add(fnota);
                }


                // Soma nota - array
                for (int i = 0; i < array.size(); i++) {
                    media += array.get(i);
                }
                // média
                media /= array.size();
                System.out.println("média das notas = " + media);

                // verificação
                for (int i = 0; i < array.size(); i++) {
                    if (array.get(i) >= media) {
                        System.out.println("nota maior ou igual a média => " + array.get(i));
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("arquivo não encontrado!" + e);
            } catch (IOException e) {
                System.out.println("erro lendo a linha " + e);
        }
        System.out.println("fim do programa");
    }
};
