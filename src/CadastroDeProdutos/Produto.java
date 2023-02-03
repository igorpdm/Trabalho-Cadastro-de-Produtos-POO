
package CadastroDeProdutos;

    public class Produto {
        private int codigo;
        private String nome;
        private double preco;
        static private int quantNoEstoque;
        
    public Produto(int codigo, String nome,double preco,int quantNoEstoque){
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
            this.quantNoEstoque = quantNoEstoque;
        
    }    
    
    public static Produto getInstance(int codigo, String nome, double preco, int quantNoEstoque) {
		if(codigo > 0 && nome != "" && preco >= 0){
			return new Produto(codigo, nome, preco, quantNoEstoque);
		} else
			return null;
	}
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantNoEstoque() {
        return quantNoEstoque;
    }

    public void setQuantNoEstoque(int quantNoEstoque) {
        this.quantNoEstoque = quantNoEstoque;
    }

    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
        
}
