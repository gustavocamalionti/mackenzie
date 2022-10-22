import java.io.*;

import static java.lang.System.out;



public class App  {

    public static void main(String[] args) {

        try {

            OutputStream os = null;

            InputStream is = null;

            try {

                os = new FileOutputStream("arquivo1.txt");

                OutputStreamWriter osw = new OutputStreamWriter(os);

                BufferedWriter bw = new BufferedWriter(osw);



                is = new FileInputStream("arquivo2.txt");

                InputStreamReader isr = new InputStreamReader(is);

                BufferedReader br = new BufferedReader(isr);



                String linha;

                while ((linha = br.readLine()) != null) {

                    int i = linha.length();

                    String msg = String.format("(%d) %s\n", i, linha);

                    bw.write(msg);

                }

                bw.flush();

            } finally {

                if (os != null) os.close();

                if (is != null) is.close();

            }

        } catch(IOException ex) {

            out.println("Erro ao acessar arquivos!");

        }

    }

}