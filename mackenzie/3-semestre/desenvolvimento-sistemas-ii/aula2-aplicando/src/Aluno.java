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
            resp += "\nBolsista com desconto de: " + this.desconto + "%" + "\n";
        }
        resp += "Mensalidade final: R$ " + curso.calcMensalidade(this.desconto) + "\n";

        return resp;
    }
}











