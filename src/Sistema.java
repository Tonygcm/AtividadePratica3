import interfaces.Trabalhavel;
import cadastrosObjetos.CadastroFuncionario;
import objetos.Funcionario;
import objetos.Desenvolvedor;
import objetos.Estagiario;
import objetos.Gerente;

public class Sistema {

    //-----------------------------MENUS-----------------------------

    public static void menuInicial(){
        System.out.println("\nSISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS");
        System.out.println("1) CADASTRAR FUNCIONARIO");
        System.out.println("2) BUSCAR FUNCIONARIO");
        System.out.println("3) EXCLUIR FUNCIONARIO");
        System.out.println("0) SAIR");
        System.out.println("------------------------------------------");
    }

    public static void menuCadastro(){
        System.out.println("INFORME O TIPO DE FUNCIONARIO:");
        System.out.println("1) DESENVOLVEDOR");
        System.out.println("2) ESTAGIARIO");
        System.out.println("3) GERENTE");
        System.out.println("0) SAIR");
        System.out.println("------------------------------------------");
    }

    public static void menuBuscar(){
        System.out.println("\nINFORME A OPÇÃO:");
        System.out.println("1) POR NOME");
        System.out.println("2) POR MATRICULA");
        System.out.println("3) LISTAR TODOS OS FUNCIONARIOS");
        System.out.println("0) SAIR");
        System.out.println("------------------------------------------");
    }

    public static void menuExcluir(){
        System.out.println("\nINFORME A OPÇÃO:");
        System.out.println("1) EXCLUIR POR MATRÍCULA");
        System.out.println("2) EXCLUIR TODOS OS FUNCIONÁRIOS");
        System.out.println("0) SAIR");
        System.out.println("------------------------------------------");

    }

    //--------------------CADASTROS-FUNCIONARIOS-----------------------------

    public static void cadastrarDesenvolvedor(){
        System.out.println("INFORME O NOME: ");
        String nome = Console.lerString();
        System.out.println("INFORME A MATRÍCULA: ");
        int matricula = Console.lerInt();
        System.out.println("INFORME SALARIO BRUTO: ");
        float salarioBruto = Console.lerFloat();
        System.out.println("TECNOLOGIAS COM DOMÍNIO: ");
        String tecnologia = Console.lerString();
        Desenvolvedor d = new Desenvolvedor(nome, matricula, salarioBruto, tecnologia);
        CadastroFuncionario.cadastrarFuncionario(d);
        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
    }

    public static void cadastrarEstagiario(){
        System.out.println("INFORME O NOME: ");
        String nome = Console.lerString();
        System.out.println("INFORME A MATRÍCULA: ");
        int matricula = Console.lerInt();
        System.out.println("INFORME O VALOR POR HORA: ");
        float salarioBruto = Console.lerFloat();
        System.out.println("INFORME AS HORAS TRABALHADAS: ");
        Float horasTrabalhadas = Console.lerFloat();
        System.out.println("INFORME O SUPERVISOR RESPONSÁVEL: ");
        String supervisor = Console.lerString();
        Estagiario e = new Estagiario(nome, matricula, salarioBruto, supervisor, horasTrabalhadas);
        CadastroFuncionario.cadastrarFuncionario(e);
        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
    }

    public static void cadastrarGerente(){
        System.out.println("INFORME O NOME: ");
        String nome = Console.lerString();
        System.out.println("INFORME A MATRÍCULA: ");
        int matricula = Console.lerInt();
        System.out.println("INFORME SALARIO BRUTO: ");
        float salarioBruto = Console.lerFloat();
        System.out.println("TECNOLOGIAS COM DOMÍNIO: ");
        float bonusAnual = Console.lerFloat();
        System.out.println("NOME DA EQUIPE A SER GERIDA: ");
        String equipe = Console.lerString();
        Gerente g = new Gerente(nome, matricula, salarioBruto, bonusAnual, equipe);
        CadastroFuncionario.cadastrarFuncionario(g);
        System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
    }


    public static void verificarOp(int op){
        int op2;
        int op3;
        int op4;

        switch (op) {

            case 1:

                menuCadastro();
                op2 = Console.lerInt();
                switch (op2) {
                    case 1:
                        cadastrarDesenvolvedor();
                        break;

                    case 2:
                        cadastrarEstagiario();
                        break;

                    case 3:
                        cadastrarGerente();
                        break;

                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

            case 2:
                menuBuscar();
                op3 = Console.lerInt();
                switch (op3) {
                    case 1:
                        System.out.println("INFORME O NOME: ");
                        String nome = Console.lerString();
                        if (CadastroFuncionario.getListaFuncionarios().size() == 0){
                            System.out.println("\nNÃO HÁ FUNCIONÁRIOS");
                            return;
                        }
                        for (Funcionario temp : CadastroFuncionario.getListaFuncionarios())
                            if (temp.getNome().equals(nome))
                            System.out.println(temp.toString());
                        break;
                        
                    case 2:
                        System.out.println("INFORME A MATRÍCULA: ");
                        int matricula = Console.lerInt();
                        if (CadastroFuncionario.getListaFuncionarios().size() == 0){
                            System.out.println("\nNÃO HÁ FUNCIONÁRIOS");
                            return;
                        }
                        for (Funcionario temp : CadastroFuncionario.getListaFuncionarios())
                            if (temp.getMatricula() == matricula)
                            System.out.println(temp.toString());
                        break;

                    case 3:
                        if (CadastroFuncionario.getListaFuncionarios().size() == 0){
                            System.out.println("\nNÃO HÁ FUNCIONÁRIOS");
                            return;
                        }
                        for (Funcionario temp : CadastroFuncionario.getListaFuncionarios())
                            System.out.println(temp.toString());
                        break;

                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

            case 3:
                menuExcluir();
                op4 = Console.lerInt();
                switch (op4) {
                    case 1:
                        System.out.println("INFORME A MATRÍCULA: ");
                        int matricula = Console.lerInt();
                        if (CadastroFuncionario.getListaFuncionarios().size() == 0){
                            System.out.println("\nNÃO HÁ FUNCIONÁRIOS");
                            return;
                        }
                        for (Funcionario temp : CadastroFuncionario.getListaFuncionarios())
                            if (temp.getMatricula() == matricula)
                            CadastroFuncionario.excluirFuncionario(temp);
                        break;

                    case 2:
                        CadastroFuncionario.excluirTodosFuncionarios();
                        System.out.println("TODOS OS FUNCIONARIOS EXCLUIDOS COM SUCESSO.");
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                
                    default:
                        System.out.println("Opção inválida! Tente novamente...");
                        break;
                }
                break;

            case 0:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente...");
                break;
        }

    }

    public static void executar(){
        int op;
        do {
            menuInicial();
            op=Console.lerInt();
            verificarOp(op);
        } while (op != 0);

    }

}
