package objetos;


public class Gerente extends Funcionario {

    private double bonusAnual;
    private String equipeSobGerencia;

    // Construtores

    public Gerente() {
        
    }

    public Gerente(String nome, int matricula, double salario, double bonusAnual, String equipeSobGerencia) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    // Getters and Setters

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

    // toString

    @Override
    public String toString() {
        return super.toString() + "\nBônus Anual: " + bonusAnual + 
        "\nEquipe que está gerenciando: " + equipeSobGerencia;
    }

    // Métodos da interface

    @Override
    public String trabalhar(){
        return "\nO Gerente " + getNome() + ", está trabalhando.";
    }

    @Override
    public String relatarProgresso(){
        return " ";
    }

    // método abstrato da superclasse

    @Override
    public double calcularSalario() {
        return getSalarioBruto() * getBonusAnual();
    }
}