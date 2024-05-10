package objetos;



public class Desenvolvedor extends Funcionario {

    private String tecnologias;

    // Construtores

    public Desenvolvedor() {
        
    }

    public Desenvolvedor(String nome, int matricula, float salario, String tecnologias) {
        super(nome, matricula, salario);
        this.tecnologias = tecnologias;
    }

    // Getters and Setters

    public String getTecnologias() {
        return tecnologias;
    }
    
    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() + "\nTecnologias: " + tecnologias;
    }

    // Métodos da interface

    @Override
    public String trabalhar(){
        return "\nO Desenvolvedor: " + getNome() + ", está trabalhando.";
    }

    @Override
    public String relatarProgresso(){
        return "\nO Desenvolvedor " + getNome() + ", está pronto para reportar os commits relaizados.";
    }

    // método abstrato da superclasse  

    @Override
    public float calcularSalario() {
        return getSalarioBruto();
    }
}