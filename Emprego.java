public  abstract class Emprego{

public double salario;
public int nivel;


// Construtor
public Emprego(double salario, int nivel) {
    this.salario = salario;
    this.nivel = nivel;
}


// Abstracao e Polimorfismo --------------------------------------------------




public abstract void pagamento();

}