class Teste
{
    public static void main (String args[])
    {
        Dados dados1 = new Dados("meu trabalho de conclusao","Darth Vader",9.5f,new BancaNull());
        Aluno aluno1 = new Aluno("Gustavo Camalionti Gomes",
                56725134,
                20.5,
                new CursoFinalizado("ADS","Graduação",1530,false,2022,dados1));

        Banca banca2 = new Banca(new String[] { "Roberto","Christian"});
        Dados dados2 = new Dados("Impacto da Refatoração","Matheus ",0f,banca2);
        Aluno aluno2 = new Aluno("Gustavo Gomes",
                22334455,
                0.0,
                new CursoFinalizado("Física Quântica","Doutorado",1352.45,
                        true,2022,dados2));


        System.out.println(aluno1.getDados());
        System.out.println(aluno2.getDados());
    }
}
