
package Revisao;


public class Fornecedor extends Juridica{
    
    private Setor setor;
    private Produto produto; 

    public Fornecedor(Setor setor, Produto produto, String cnpj, String inscricaoEstadual) {
        super(cnpj, inscricaoEstadual);
        this.setor = setor;
        this.produto = produto;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString()+
                
                "\n Fornecedor: " + "\n Setor: " + setor.getNome() + "\n Produto: " + produto;
    }
    
    
    
    
    
    
}
