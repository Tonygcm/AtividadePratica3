package objetos;


public class Estagiario extends Funcionario {

    private String supervisor;
    private float horasTrabalhadas;

    // Construtores

    public Estagiario(){

    }

    public Estagiario(String nome, int matricula, float salario, String supervisor, float horasTrabalhadas) {
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

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
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
        return "\nO Estagiário " + getNome() + ", está pronto para reportar ao Supervisor.";
    }

    // método abstrato da superclasse

    @Override
    public float calcularSalario() {
        return getSalarioBruto() * horasTrabalhadas;
    }

    

}