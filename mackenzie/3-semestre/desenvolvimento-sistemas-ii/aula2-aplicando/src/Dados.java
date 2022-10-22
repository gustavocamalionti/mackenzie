class Dados
{
    private String titulo,orientador;
    private float nota;
    private Banca banca;
    Dados(String titulo,String orientador,float nota,Banca banca){
        this.titulo = titulo;
        this.orientador = orientador;
        this.nota = nota;
        this.banca = banca;
    }
    @Override
    public String toString(){
        String resp = titulo + "\n";
        resp += "Orientador(a): Prof. " + orientador + "\n";
        if(nota != 0.f){
            resp += "Nota " + nota + "\n";
        }
        resp += banca + "\n";
        return resp;
    }
}