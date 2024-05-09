package objetos;


public class Estagiario extends Funcionario {

    private String supervisor;
    private double horasTrabalhadas;

    // Construtores

    public Estagiario(){

    }

    public Estagiario(String nome, int matricula, double salario, String supervisor, double horasTrabalhadas) {
        super(nome, matricula, salario);
        this.supervisor = supervisor;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Getters and Setters

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // toString

    @Override
    public String toString() {

        return super.toString() + "\nSupervisor: " + supervisor + 
        "\nHoras Trabalhadas: " + horasTrabalhadas;

    }

    // métodos da interface

    @Override
    public String trabalhar(){
        return "O estagiário " + getNome() + ", está trabalhando.";
    }

    @Override
    public String relatarProgresso(){
        return "";
    }

    // método abstrato da superclasse

    @Override
    public double calcularSalario() {
        return 0;
    }

    

}