
package CadastroDeProdutos;

import java.util.Scanner;

public class Sistema {
    private String nome;
    private Venda[] vendas;
    static private Produto[] vetprodutos = new Produto[10];
    private static Sistema instance;
    
    public Sistema(String nome){
        this.nome = nome;
    }
    
    public static Sistema getInstance(String nome) {
		if (instance == null)
			instance = new Sistema(nome);
		return instance;
	}
    
    public boolean insereProduto(Produto produto){
        if(produto != null){
            for (int i = 0; i < getVetprodutos().length; i++) {
                if(getVetprodutos()[i] == null){
                    getVetprodutos()[i] = produto;
                    return true;
                }   
            }
            return false;   
        }else{
            return false;
        }
    }
    public boolean excluir(int codigo) {
        for (int i = 0; i < getVetprodutos().length; i++) {
            if (getVetprodutos()[i].getCodigo() != 0) {
                if (getVetprodutos()[i].getCodigo() == codigo) {
                    getVetprodutos()[i]= null;
                    return true;
                }
            }

        }
        return false;
    }
    public Produto[] listarPorNome(Produto[] a) {
        Produto[] vettemp = new Produto[a.length];
        Produto p = new Produto(1,"x",1,1);
        for (int i = 0; i < a.length; i++) {
            if(a[i] != null){
                vettemp[i] = a[i];
            }
            
        }
        for (int j = 0; j < vettemp.length; j++) {
            for (int i = 0; i < vettemp.length-1; i++) {
                if(vettemp[i] != null && vettemp[i+1] != null){
                    if((getVetprodutos()[i].getNome().compareTo(getVetprodutos()[i+1].getNome()))> 0){
                        p = vettemp[i];
                        vettemp[i] = vettemp[i+1];
                        vettemp[i+1] = p;
                    
                } 
                    
                
            }
        }

        }
            
        return vettemp;
    }
    
    public boolean AlterarProduto(int c){
        String note;
        double preco;
        int quantidade;
        Scanner scn = new Scanner(System.in);
        if(c >= 0){
            for (int i = 0; i < getVetprodutos().length; i++) {
                if(getVetprodutos()[i] != null){
                    if(getVetprodutos()[i].getCodigo() == c){
                        System.out.println("Informe um novo nome para o produto: ");
                        nome = scn.next();
                        while(nome == ""){
                            System.out.println("Nome invalido, informe outro: ");
                            nome = scn.next();
                        }getVetprodutos()[i].setNome(nome);
                        System.out.println("Informe um novo preco para o produto: ");
                        preco = scn.nextDouble();
                        while(preco<=0){
                            System.out.println("Preco invalido, informe outro: ");
                            preco = scn.nextDouble();
                        }getVetprodutos()[i].setPreco(preco);
                        System.out.println("Informe a quantidade em estoque do produto: ");
                        quantidade = scn.nextInt();
                        while(quantidade <= 0){
                            System.out.println("Quantidade invalida, tente outra: ");
                            quantidade = scn.nextInt();
                        }getVetprodutos()[i].setQuantNoEstoque(quantidade);
                        
 
                    }
                }
            }
        }
        return true;
    }
    public void listarTodosP(Produto[] p) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Você está LISTANDO TODOS os produtos");
        System.out.print("Código");
        System.out.print("\t\tNome");
        System.out.print("\t\tPreço");
        System.out.println("\t\tQuantidade no Estoque");
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.print(getVetprodutos()[i].getCodigo());
                System.out.print("\t\t" + getVetprodutos()[i].getNome());
                System.out.print("\t\t" + getVetprodutos()[i].getPreco());
                System.out.println("\t\t" + getVetprodutos()[i].getQuantNoEstoque());
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }
   
    public Produto buscar(int codigo) {
        Produto a = null;
        for (int i = 0; i < getVetprodutos().length; i++) {
            if(getVetprodutos()[i] != null){
                if(getVetprodutos()[i].getCodigo() == codigo){
                a = getVetprodutos()[i];
            }
        }

        
        }return a;
    }
    public void listarUnico(Produto p) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Você está LISTANDO TODOS os produtos");
        System.out.print("Código");
        System.out.print("\t\tNome");
        System.out.print("\t\tPreço");
        System.out.println("\t\tQuantidade no Estoque");
        for (int i = 0; i < 1; i++) {
            if (p != null) {
                System.out.print(p.getCodigo());
                System.out.print("\t\t" + p.getNome());
                System.out.print("\t\t" + p.getPreco());
                System.out.println("\t\t" +p.getQuantNoEstoque());
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the vendas
     */
    public Venda[] getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(Venda[] vendas) {
        this.vendas = vendas;
    }

    /**
     * @return the vetprodutos
     */
    static public Produto[] getVetprodutos() {
        return vetprodutos;
    }

    /**
     * @param vetprodutos the vetprodutos to set
     */
    public void setVetprodutos(Produto[] vetprodutos) {
        this.vetprodutos = vetprodutos;
    }
    
}
