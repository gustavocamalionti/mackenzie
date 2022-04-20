public class Carro {
    public static void main(String[] args) {
        Carro carro = new Carro("GM",1500);

        carro.mostrar();
        carro.atualizaKm(5);

        System.out.println(carro.getKmRodados());


    }

    private String marcaModelo;
    private int cargaMaxima;
    private int kmRodados;

    public Carro(String marcaModelo, int cargaMaxima) {
       setMarcaModelo(marcaModelo);
       setCargaMaxima(cargaMaxima);
       setKmRodados(0);
    }

    public void mostrar() {
        System.out.println(marcaModelo);
        System.out.println(cargaMaxima);
        System.out.println(kmRodados);
    }

    public void atualizaKm(int kmRodados) {
        this.kmRodados += kmRodados;
    }


    public int getCargaMaxima() {
        return this.cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getKmRodados() {
        return this.kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }

    public String getMarcaModelo() {
        return this.marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }


}
