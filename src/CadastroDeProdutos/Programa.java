package CadastroDeProdutos;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Produto[] vetprodutos = new Produto[10];
        Produto[] vettemp = new Produto[10];
        Item[] carrinho = new Item[10];
        Produto a = new Produto(1,"x",1,1);
        Item x = new Item();
        Produto b[] = new Produto[1];
        int opcao;
        int opcao1;
        int opcao2;
        Scanner scn = new Scanner(System.in);
        OUTER:
        do{ 
            inicializacao();
            Sistema s1 = Sistema.getInstance(scn.next());
            Carrinho c1 = Carrinho.getInstance();
                telainicial();
                opcao = scn.nextInt();
                    switch(opcao) {
                        case 1: 
                            do{
                                modoAtendentep1();
                                opcao1 = scn.nextInt();
                                switch(opcao1){
                                    case 1:
                                        int quant;
                                        String nome;
                                        s1.listarTodosP(vettemp);
                                        System.out.println("Informe o nome do produto: ");
                                        nome = scn.next();
                                        System.out.println("Informe a quantidade do produto que deseja comprar: ");
                                        quant = scn.nextInt();
                                        c1.addItem(a,vettemp,x,nome,carrinho,quant);
                                        c1.listarTodosI(carrinho);
                                        break;
                                    case 2:
                                        System.out.println("Informe o nome do produto: ");
                                        c1.excluiItem(scn.nextInt());
                                        c1.listarTodosI(carrinho);
                                    case 3:
                                        c1.listarTodosI(carrinho);
                                        System.out.println("Finalizando a compra...");
                                        c1.FinalizaCompra(vetprodutos);
                                    case 0:
                                }
                            }while (true);
                    
                    case 2:
                        modoAdmin();
                        opcao2 = scn.nextInt();
                        do{
                            switch(opcao2){
                                case 1:
                                    String nome;
                                    int codigo;
                                    double preco;
                                    int quantidadeestoque;
                                    System.out.println("Informe o codigo do produto: ");
                                    codigo = scn.nextInt();
                                    System.out.println("Informe o nome do produto: ");
                                    nome = scn.next();
                                    System.out.println("Informe o preco do produto: ");
                                    preco = scn.nextDouble();
                                    System.out.println("Informe a quantidade em estoque do produto: ");
                                    quantidadeestoque = scn.nextInt();
                                    Produto p = Produto.getInstance(codigo, nome, preco, quantidadeestoque);
                                    s1.insereProduto(p);
                                    System.out.println("Retornando...");
                                    break;
                                case 2:
                                    int c;
                                    System.out.println("Informe o codigo do produto: ");
                                    c = scn.nextInt();
                                    s1.AlterarProduto(c);
                                    break;
                                case 3:
                                    System.out.println("Informe o codigo do produto: ");
                                    s1.excluir(scn.nextInt());
                                    break;
                                case 4:
                                    listagens();
                                    opcao2 = scn.nextInt();
                                    do{
                                        switch(opcao2){
                                            case 1:
                                                s1.listarTodosP(vettemp);
                                            case 2:
                                                s1.listarPorNome(vettemp);
                                            case 3:
                                                s1.buscar(scn.nextInt());
                                                s1.listarUnico(a);
                                        }break;
                                    }while (true);
                                case 0:           
                                    break;     
                            }
                        }while(true);
                    case 0:
                        break OUTER;
                    default:
                        break;
                }
            }while (true);
    }
    static void inicializacao() {
        System.out.println("\tSeja Bem Vindo");
        System.out.println("Digite o nome do Empreendimento: ");

    }
    static void telainicial() {
        System.out.println("\tEscolha de perfil");
        System.out.println("Digite (1) para entrar como Atendente");
        System.out.println("Digite (2) para entrar como Administrador");
        System.out.println("Digite (0) para encerrar o programa");
        System.out.print("Opcao: ");
    }

    static void modoAdmin() {
        System.out.println("\tCadastro de produtos");
        System.out.println("Digite (1) se deseja INSERIR produtos");
        System.out.println("Digite (2) se deseja ALTERAR produtos");
        System.out.println("Digite (3) se deseja EXCLUIR produtos");
        System.out.println("Digite (4) se deseja GERAR a listagem dos produtos");
        System.out.println("Digite (0) para retornar a escolha de perfil");
        System.out.print("Opcao: ");
    }
    static void inserirProduto() {
        
    }
    static void listagens() {
        System.out.println("\tListagem de produtos");
        System.out.println("Digite (1) se deseja LISTAR todos os produtos");
        System.out.println("Digite (2) se deseja LISTAR os produtos em ordem alfabética");
        System.out.println("Digite (3) se deseja BUSCAR produtos");
        System.out.print("Opção: ");
    }
    static void modoAtendentep1() {
        System.out.println("\tModulo Atendente");
        System.out.println("Digite (1) para adicionar produtos ao carrinho");
        System.out.println("Digite (2) para excluir produtos ao carrinho");
        System.out.println("Digite (3) para finalizar venda");
        System.out.println("Digite (0) para retornar a escolha de perfil");
        System.out.print("Opcao: ");
    }
    
}
    

