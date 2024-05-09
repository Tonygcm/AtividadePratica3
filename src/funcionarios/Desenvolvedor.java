package funcionarios;



public class Desenvolvedor extends Funcionario {

    private String tecnologias;

    
    public Desenvolvedor() {
        
    }

    public Desenvolvedor(String nome, int matricula, double salario, String tecnologias) {
        super(nome, matricula, salario);
        this.tecnologias = tecnologias;
    }

    public String getTecnologias() {
        return tecnologias;
    }
    
    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias: " + tecnologias;
    }

    @Override
    public String trabalhar(){
        return "\nO Desenvolvedor: " + getNome() + ", está trabalhando.";
    }

    @Override
    public String relatarProgresso(){
        return "";
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}