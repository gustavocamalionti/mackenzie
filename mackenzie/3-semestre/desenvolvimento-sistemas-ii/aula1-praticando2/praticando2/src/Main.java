class Aluno{
    private String nome;
    private int cod_matricula;
    private double desconto;
    private Curso curso;

    public Aluno(String nome,
                 int cod_matricula,
                 double desconto,
                 Curso curso)
    {
        this.nome = nome;
        this.cod_matricula = cod_matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    public String getDados()
    {
        String resp = "Aluno: "+ this.nome +"\n";
        resp += curso.getDados();
        if (this.desconto != 0)
        {
            resp += "\nBolsista com desconto de: " + this.desconto + "%";
        }
        resp += "\nMensalidade final: R$ " + curso.calcMensalidade(this.desconto) + "\n";

        return resp;
    }
}

class Curso
{
    protected String nome_curso, nivel_curso;
    protected double mensalidade_curso;

    public Curso(String nome_curso,
                 String nivel_curso,
                 double mensalidade_curso)
    {
        this.nome_curso = nome_curso;
        this.nivel_curso = nivel_curso;
        this.mensalidade_curso = mensalidade_curso;
    }

    public String getDados(){
        String resp =  "Curso: " + this.nivel_curso + " em " + this.nome_curso +"\n";
        resp += "Mensalidade: R$ " + this.mensalidade_curso;

        return resp;
    }
    public double calcMensalidade(double desconto){
        return this.mensalidade_curso*(1- desconto/100);
    }
}

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
        String resp = "Curso finalizado em " + ano_finalizacao + "\n";
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
            resp += dados.toString() + "\n";
        }
        return resp;
    }
}

class Dados
{
    private String titulo,orientador;
    private float nota;
    Dados(String titulo,String orientador,float nota){
        this.titulo = titulo;
        this.orientador = orientador;
        this.nota = nota;
    }
    @Override
    public String toString(){
        String resp = orientador + "\n";
        resp += "Orientador(a): Prof. " + titulo + "\n";
        resp += "Nota: " + nota;
        return resp;
    }
}
class DadosNull extends Dados
{
    DadosNull(){
        super("","",0);
    }
    @Override
    public String toString(){
        return "";
    }
}

class Teste
{
    public static void main (String args[])
    {
        Aluno aluno1 = new Aluno("Martin Fowler",
                11223344,
                20.5,
                new Curso("ADS","Graduação",920.50));

        Dados dados2 = new Dados("Peter Coad","Impacto da Refatoração",9.5f);
        Aluno aluno2 = new Aluno("Kent Beck",
                22334455,
                0.0,
                new CursoFinalizado("Computação 									Aplicada","Mestrado",2150.45,
                        true,2019,dados2));


        System.out.println(aluno1.getDados());
        System.out.println(aluno2.getDados());
    }
}