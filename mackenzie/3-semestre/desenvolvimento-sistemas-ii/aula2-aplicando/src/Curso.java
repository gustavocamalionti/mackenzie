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
        resp += "Mensalidade: R$ " + this.mensalidade_curso + "\n";

        return resp;
    }
    public double calcMensalidade(double desconto){
        return this.mensalidade_curso*(1- desconto/100);
    }
}