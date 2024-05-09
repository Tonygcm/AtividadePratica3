import java.util.ArrayList;
import interfaces.Trabalhavel;
import cadastrosObjetos.CadastroFuncionario;
import objetos.*;

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
        System.out.println("1) FUNCIONARIO COMUM");
        System.out.println("2) DESENVOLVEDOR");
        System.out.println("3) ESTAGIARIO");
        System.out.println("4) GERENTE");
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
        System.out.println("2) EXCLUIR TODOS OS FUNCIOÁRIOS");
        System.out.println("0) SAIR");
        System.out.println("------------------------------------------");

    }

    //------------------------------------------------------------------

    public static void verificarOp(int op){
        
        switch (op) {
            case 1:
                
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
