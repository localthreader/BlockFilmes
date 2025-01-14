package com.mycompany.blocksfilmesprojeto;


import java.util.Scanner;

public class BlocksFilmesProjeto {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ControleCliente.getListaCliente().add(new Cliente("Antonio", 45, "56483567281", "antoninho@hotmail.com", "19945683956"));
        ControleCliente.getListaCliente().add(new Cliente("Samara", 32, "658356913502", "samsam@hotmail.com", "19583957295"));

        ControleProduto.getListaProduto().add(new Produto("Shrek 2","Animacao","22/06/2001",(float) 25.50,"1234"));
        ControleProduto.getListaProduto().add(new Produto("Morbius","Acao","31/03/2022",(float) 20.75,"0000"));
        ControleProduto.getListaProduto().add(new Produto("Velozes e Furiosos","Acao","28/09/2001",(float) 20.75,"5555"));


        ControleFuncionario.getListaFuncionario().add(new Funcionario("Everton",52,"45738593848","everTown@yahoo.com.br","atendente",1500));
        ControleFuncionario.getListaFuncionario().add(new Funcionario("Rosangela",29,"84935867495","rosan@gmail.com","faxineira",1100));

        boolean algolegal = true;
        int opcao;
        do { // fazer um pressione tecla para continuar
            System.out.println("\nBEM-VINDO AO BLOCKSFILMES!\n");
            System.out.println("Verifique as opções de cadastro abaixo:");
            System.out.println("Opção 1 -  Cadastro de Cliente");
            System.out.println("Opção 2 -  Cadastro de Funcionário");
            System.out.println("Opção 3 -  Cadastro de Produto");
            System.out.println("Opção 4 -  Busca de Cliente");
            System.out.println("Opção 5 -  Busca de Funcionário");
            System.out.println("Opção 6 -  Busca de Produto");
            System.out.println("Opção 7 -  Exclusão de Cliente");
            System.out.println("Opção 8 -  Exclusão de Funcionário");
            System.out.println("Opção 9 -  Exclusão de Produto");
            System.out.println("Opção 10 - Métodos");
            System.out.println("Opção 0 -  Encerrar programa"); //funcionando
            System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");


            opcao = (teclado.nextInt());
            teclado.nextLine();

            switch (opcao) {
                case 0:
                    //System.out.println("Encerrando programa...");
                    algolegal = false;
                    break;
                case 1:
                    ControleCliente.cadastrarCliente().exibir();
                    //por para exibir o que foi cadastrado
                    break;
                case 2:
                    ControleFuncionario.cadastrarFuncionario().exibir();
                    //por pra exibir o que foi cadastrado
                    break;
                case 3:
                    ControleProduto.cadastrarProduto().exibirProduto();
                    //por paa exibir oq foi cadastrado
                    break;
                case 4:
                    System.out.print("\nDigite o nome do cliente: ");
                    ControleCliente.procurarCliente(teclado.nextLine()).exibir();
                    break;
                case 5:
                    System.out.print("\nDigite o nome do funcionario: ");
                    ControleFuncionario.procurarFuncionario(teclado.nextLine()).exibir();
                    break;
                case 6:
                    System.out.println("\nDigite a opcão a ser procurada: \ng - genero \nc - codigo\np - preço\n");
                    String escolha = teclado.nextLine();

                    switch (escolha.toLowerCase()) {

                            case "g":
                                System.out.println("Digite o gênero a ser procurado: ");
                                //ControleProduto.procurarPorGenero(teclado.nextLine());
                                //ControleProduto.procurarProduto(ControleProduto.procurarPorGenero(teclado.nextLine())).exibirProduto();
                                //Fazer exibir, n sei como, fodase

                                /*
                                * Explicação: Já que a sua função "buscarPorGenero"  agoraretorna uma lista de produtos, o seu
                                * metodo exibirProduto não vai funcionar, pq ele só funciona para uma instância de Produto
                                * e não para uma lista de produtos. O que você pode fazer é percorrer a lista de produtos
                                * que o procurarPorGenero() retorna e fazer .exibirProduto() em cada produto dessa lista.
                                * Mais ou menos assim:
                                * for(Produto produto : procurarPorGenero(teclado.nextLine()) {
                                *   produto.exibirProduto();
                                * }
                                * */

                                break;
                            case "c":
                                System.out.println("Digite o código a ser procurado: ");
                                ControleProduto.procurarPorCodigo(teclado.nextLine());
                                // Aqui o .exibirProduto() funciona, pois o procurarPorCodigo retorna um produto
                                // e não uma lista deles.
                                break;

                            case "p" :
                                System.out.println("Digite o preço a ser procurado: ");
                                ControleProduto.procurarPorPreco(teclado.nextDouble());
                                // Mesma lógica do procurarPorGenero(). Isso aqui vai retornar uma lista de produtos.
                                // Só percorrer ela e ir exibindo cada produto.

                            break;
                    }
                     // como exibir?
                    break;
                case 7:
                    System.out.println("Digite o nome do cliente a ser excluido: ");
                    ControleCliente.excluirCliente(teclado.nextLine());
                    break;
                case 8:
                    System.out.println("Digite o nome do funcionario a ser excluido:");
                    ControleFuncionario.excluirFuncionario(teclado.nextLine());
                    break;
                case 9:
                    System.out.println("Digite o produto a ser excluido: ");
                    ControleProduto.excluirProduto(teclado.nextLine());
                    break;
                case 10:
                    menuMetodos();
                    break;
            }
            if (algolegal)
                esperador();
        } while (algolegal);
    }

    public static void menuMetodos() {
        int opcaomenu;
        System.out.println("\nSUBMENU - INFORMAÇÕES DE SISTEMA\n");
        System.out.println("Verifique as opções abaixo:");
        System.out.println("Opção 1 - Cliente com maior idade");
        System.out.println("Opção 2 - Cliente com maior idade");
        System.out.println("Opção 3 - Cliente com maior idade");
        System.out.println("Opção 4 - Cliente com maior idade");
        System.out.println("Opção 5 - Cliente com maior idade");
        System.out.println("Opção 6 - Cliente com maior idade");
        System.out.print("\nDigite o número correspondente à ação que deseja realizar: ");
        opcaomenu = (teclado.nextInt());
        teclado.nextLine();

        switch (opcaomenu) {
            case 1:
                //chama metodo
                break;

            case 2:
                //chama metodo
                break;

            case 3:
                //chama metodo
            case 4:
                //chama metodo
                break;

            case 5:
                //chama metodo
                break;

            case 6:
                //chama metodo
        }
    }

    public static void esperador() {

        try {
            System.out.print("\t\nPressione enter para continuar ");
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static boolean opcaoSN() {
        char opcao = 's';
        boolean opcaoValida;

        do {
            opcaoValida = true;
            System.out.print("\tOpção [s/n]:  ");
            try {
                opcao = teclado.next().charAt(0);
                if (opcao != 's' && opcao != 'n')
                    throw new IllegalArgumentException("Opção inválida. Insira apenas 's' ou 'n'.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "\n");
                opcaoValida = false;
            }
        } while (!opcaoValida);

        return opcao == 's';
    }


}



