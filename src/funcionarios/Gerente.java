package funcionarios;


public class Gerente extends Funcionario {

    private double bonusAnual;
    private String equipeSobGerencia;

    public Gerente() {
        
    }

    public Gerente(String nome, int matricula, double salario, double bonusAnual, String equipeSobGerencia) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public String getEquipeSobGerencia() {
        return equipeSobGerencia;
    }

    public void setEquipeSobGerencia(String equipeSobGerencia) {
        this.equipeSobGerencia = equipeSobGerencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBônus Anual: " + bonusAnual + 
        "\nEquipe que está gerenciando: " + equipeSobGerencia;
    }

    @Override
    public String trabalhar(){
        return "\nO Gerente " + getNome() + ", está trabalhando.";
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