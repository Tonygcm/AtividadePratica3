package cadastrosObjetos;
import java.util.List;
import java.util.ArrayList;
import objetos.*;

public class CadastroFuncionario {
    
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrarFuncionario(Funcionario f){
        listaFuncionarios.add(f);
    }

    public static Funcionario buscarFuncionarioMat(int matricula){
        for(Funcionario temp : listaFuncionarios){
            if (temp.getMatricula()==matricula){
                return temp;
            }
        }
        return null;
    }

    public static Funcionario buscarFuncionarioNome(String nome){
        for(Funcionario temp : listaFuncionarios){
            if (temp.getNome().equals(nome)){
                return temp;
            }
        }
        return null;
    }
    
    public static void excluirFuncionario(Funcionario f){
        listaFuncionarios.remove(f);
    }
    
    public static List<Funcionario> getListaFuncionarios(){
        return listaFuncionarios;
    }

    public static void excluirTodosFuncionarios(){   
        listaFuncionarios.clear();
    }
}
