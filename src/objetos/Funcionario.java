package objetos;
import interfaces.Trabalhavel;


public abstract class Funcionario implements Trabalhavel{

    /*Crie uma classe abstrata Funcionario que atue como a superclasse para todos
    os tipos de funcionários. Esta classe deve conter atributos e métodos comuns
    a todos os funcionários, como nome e matricula, e método abstrato para
    calcular salário. */

    private String nome;
    private int matricula;
    private double salario;

    // Construtores

    public Funcionario(){

    }
    
    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString

    @Override
    public String toString() {

        return "\nNome: " + nome + "\nMatrícula: " + matricula + 
        "\nSalário: " + salario;

    }

    // Método abstrato para os objetos

    public abstract double calcularSalario();

}