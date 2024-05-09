package funcionarios;


public class Estagiario extends Funcionario {

    private String supervisor;
    private double horasTrabalhadas;

    

    public Estagiario(){

    }

    public Estagiario(String nome, int matricula, double salario, String supervisor, double horasTrabalhadas) {
        super(nome, matricula, salario);
        this.supervisor = supervisor;
        this.horasTrabalhadas = horasTrabalhadas;
    }

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

    @Override
    public String toString() {

        return super.toString() + "\nSupervisor: " + supervisor + 
        "\nHoras Trabalhadas: " + horasTrabalhadas;

    }

    @Override
    public String trabalhar(){
        return "O estagiário " + getNome() + ", está trabalhando.";
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