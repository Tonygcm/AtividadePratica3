package funcionarios;

public abstract class Funcionario {

    /*Crie uma classe abstrata Funcionario que atue como a superclasse para todos
    os tipos de funcionários. Esta classe deve conter atributos e métodos comuns
    a todos os funcionários, como nome e matricula, e método abstrato para
    calcular salário. */

    private String nome;
    private int matricula;
    private double salario;

    
    




    public abstract double calcularSalario();

}