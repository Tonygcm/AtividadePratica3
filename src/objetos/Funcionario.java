package objetos;
import interfaces.Trabalhavel;


public abstract class Funcionario implements Trabalhavel{

    /*Crie uma classe abstrata Funcionario que atue como a superclasse para todos
    os tipos de funcionários. Esta classe deve conter atributos e métodos comuns
    a todos os funcionários, como nome e matricula, e método abstrato para
    calcular salário. */

    private String nome;
    private int matricula;
    private double salarioBruto;

    // Construtores

    public Funcionario(){

    }
    
    public Funcionario(String nome, int matricula, double salarioBruto) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBruto = salarioBruto;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    // toString

    @Override
    public String toString() {

        return "\nNome: " + nome + "\nMatrícula: " + matricula + 
        "\nSalário Bruto: " + salarioBruto;

    }

    // Método abstrato para os objetos

    public abstract double calcularSalario();

}