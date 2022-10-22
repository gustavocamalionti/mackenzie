class CursoFinalizado extends Curso
{
    private boolean tem_trabalho;
    private int ano_finalizacao;
    private Dados dados;
    public CursoFinalizado(String nome,String nivel,double mensalidade,
                           boolean tem_trabalho,int ano_finalizacao,Dados dados)
    {
        super(nome,nivel,mensalidade);
        this.tem_trabalho = tem_trabalho;
        this.ano_finalizacao = ano_finalizacao;
        this.dados = dados;
    }
    public String getDados()
    {
        String resp = super.getDados();
        resp += "Curso finalizado em " + ano_finalizacao + "\n";
        if (this.tem_trabalho)
        {
            resp += "Título ";
            switch (nivel_curso)
            {
                case "Graduação": resp += "do TCC: "; break;
                case "Lato sensu": resp += "da monografia: "; break;
                case "Mestrado": resp += "da dissertação: "; break;
                case "Doutorado": resp += "da tese: "; break;
            }
        }
        resp += dados.toString() + "\n";
        return resp;
    }
}