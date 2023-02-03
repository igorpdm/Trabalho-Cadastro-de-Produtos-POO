
package CadastroDeProdutos;

import static CadastroDeProdutos.Sistema.getVetprodutos;

public class Carrinho {
    private static Item[] itens;
    private static Carrinho instance;
    
    public Carrinho(){
        Item[] carrinho = new Item[10];
    }
    public static Carrinho getInstance() {
		if(true){
			return new Carrinho();
	}return null;
    }
    
    public boolean addItem(Produto a, Produto[] produtos,Item item, String nomeI, Item[] carrinho, int x){
        Item i1 = new Item();
        i1.setProduto(a);
        a.setNome(nomeI);
        if(i1.getProduto() != null){
            for (int i = 0; i < getItens().length; i++) {
                if (a.getNome().equals(produtos[i].getNome())){
                    if(x <= getVetprodutos()[i].getQuantNoEstoque()){
                        getItens()[i].setQuantidade(x);
                    }
                    if(getItens()[i] != null){
                        getItens()[i] = i1;
                        return true;
                    }
                }
            }
            return false;
        }else{
            return false;
        }
        
    }
     public void listarTodosI(Item[] c) {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("/tCarrinho: ");
        System.out.print("/t/t");
        System.out.print("\t\tNome");
        System.out.print("\t\tPreço");
        System.out.println("\t\tQuantidade: ");
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                System.out.print(i+1+"/t");
                System.out.print("\t\t" + getItens()[i].getProduto().getNome());
                System.out.print("\t\t" + getItens()[i].getPreco());
                System.out.println("\t\t" + getItens()[i].getQuantidade());
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    public boolean excluiItem(int posicao){
        if(posicao >= 0){
            for (int i = 0; i < getItens().length; i++) {
                if(i == posicao){
                    getItens()[i] = null;
                    for (int j = 0; j < getItens().length-1; j++) {
                        if(getItens()[i] == null && getItens()[i+1] != null){
                            getItens()[i] = getItens()[i+1];
                            getItens()[i+1] = null;
                        }
                    }
                    return true;
                }
            }
            return false;
        }else{
            return false;
        }
        
    }
    
    public boolean FinalizaCompra(Produto[] produtos){
        for (int i = 0; i < getItens().length; i++) {
            if(getItens()[i] != null){
                for (int j = 0; j < getVetprodutos().length; j++) {
                    if(getItens()[i] != null && getItens()[j].getProduto().getNome().equals(getVetprodutos()[j].getNome())){
                        getVetprodutos()[j].setQuantNoEstoque((getVetprodutos()[j].getQuantNoEstoque())-getItens()[i].getQuantidade());
                    }return true;
                }

            }
        }
        return false;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    
    
}
