public class Bebida implements Consumivel{
    Sims sims;
    
 public void consumir(Sims sim){
    if (sim.sede >= 30) {
        sim.sede = 0;
        IO.println(sim.getNome() + " está bebendo.");
    }

    else{
        IO.println(sim.getNome() +"Não esta com sede agora.");
    }
 }
}