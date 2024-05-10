package objetos;


public class Gerente extends Funcionario {

    private float bonusAnual;
    private String equipeSobGerencia;

    // Construtores

    public Gerente() {
        
    }

    public Gerente(String nome, int matricula, float salario, float bonusAnual, String equipeSobGerencia) {
        super(nome, matricula, salario);
        this.bonusAnual = bonusAnual;
        this.equipeSobGerencia = equipeSobGerencia;
    }

    // Getters and Setters

    public float getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(float bonusAnual) {
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
        return "\nO Gerente " + getNome() + ", está pronto para reportar o progresso da equipe.";
    }

    // método abstrato da superclasse

    @Override
    public float calcularSalario() {
        return getSalarioBruto() * getBonusAnual();
    }
}