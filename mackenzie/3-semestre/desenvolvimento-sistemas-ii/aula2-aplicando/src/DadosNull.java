class DadosNull extends Dados
{
    DadosNull(){
        super("","",0.0f, new Banca(new String[0]) );
    }
    @Override
    public String toString(){
        return "";
    }
}
