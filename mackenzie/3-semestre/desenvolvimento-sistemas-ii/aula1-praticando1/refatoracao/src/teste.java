class Teste
{
    public static void main (String args[])
    {
        Curso curso1 = new Curso("ADS","Graduação",920.50);
        Curso curso2 = new Curso("Computação Aplicada","Mestrado",2150.45);
        Aluno aluno1 = new Aluno("Martin Fowler",11223344,20.5,curso1);
        Aluno aluno2 = new Aluno("Kent Beck",22334455,0,curso2);
        System.out.println(aluno1.getDados());
        System.out.println(aluno2.getDados());
    }
}
class Aluno {
    private String nome;
    private int cod_matricula;
    private double desconto;
    private Curso curso;

    public Aluno(String nome,
                 int cod_matricula,
                 double desconto,
                 Curso curso) {
        this.nome = nome;
        this.cod_matricula = cod_matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    public String getDados() {
        String resposta = "Aluno: " + this.nome + "\n";
        resposta += curso.getDados();
        if (this.desconto != 0) {
            resposta += "\nBolsista com desconto de: " + this.desconto +
                    "%";
        }
        resposta += "\nMensalidade final: R$ " +
                curso.calcMensalidade(this.desconto) + "\n";

        return resposta;
    }
}


class Curso {
    private String nome_curso, nivel_curso;
    private double mensalidade_curso;

    public Curso(String nome_curso,
                 String nivel_curso,
                 double mensalidade_curso
    ) {
        this.nome_curso = nome_curso;
        this.nivel_curso = nivel_curso;
        this.mensalidade_curso = mensalidade_curso;
    }


    public String getDados() {
        String resposta = "Curso: " + this.nivel_curso + " em " +
                this.nome_curso + "\n";
        resposta += "Mensalidade: R$ " + this.mensalidade_curso;

        return resposta;
    }

    public double calcMensalidade(double desconto) {
        return this.mensalidade_curso * (1 - desconto / 100);
    }
}




