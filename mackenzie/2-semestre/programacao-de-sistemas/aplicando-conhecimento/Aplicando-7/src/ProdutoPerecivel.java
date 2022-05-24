public class ProdutoPerecivel extends Produto {
    private int validade; // meses
    public ProdutoPerecivel(String nome,int quantidade,double preco,int validade)
    {
        super(nome,quantidade,preco);
        this.validade = validade;
    }
    @Override
    public void retiraEstoque(int qtd)
    {
        if(validade < 2) {
            quantidade = 0;
        }
        else
            super.retiraEstoque(qtd);
    }
    @Override
    public void entraEstoque(int qtd)
    {
        if(quantidade == 0)
            super.entraEstoque(qtd);
    }
    @Override
    public String toString()
    {
        String res;

        res = "\r\n" + this.nome + "\n";
        res += this.quantidade + "\r\n";
        res += this.preco + "\r\n";
        res += this.validade + "\r\n";

        return res;
    }
}