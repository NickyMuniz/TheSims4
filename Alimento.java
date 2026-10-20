public class Alimento implements Consumivel {
    Sims sims;
    
 @Override 
 public void consumir(Sims sim){
    if (sim.fome >= 30) {
        sim.fome = 0;
        IO.println(sim.getNome() + " está comendo");
    }

    else{
        IO.println(sim.getNome() +"Não está com fome agora.");
    }
 };
}