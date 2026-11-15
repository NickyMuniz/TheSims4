public class Estagiario extends Emprego {

    public Estagiario(double salario, int nivel) {
        super(salario, nivel);
    }
    
 
    @Override 
  public void pagamento(){
    if (nivel >= 0 && nivel < 5) {
        salario = salario + 500;
        IO.println("Seu pagamento caiu.");
        IO.println(" +270");
    }
    
    else if (nivel >= 5 && nivel <7){
        salario = salario + 1500;
        IO.println("Seu pagamento caiu.");
        IO.println(" +1000");
    }
    
    else if (nivel >= 7 && nivel <10){
        salario = salario + 2500;
        IO.println("Seu pagamento caiu.");
        IO.println(" +1500");
    }
    
    else{
        IO.println("Nível Inválido");
    }

}
}
