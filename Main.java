void main(){


    IO.println("-------------- The Sims 4 --------------");
    IO.println("--- Crie seu sim ---");

    String nome = IO.readln("Digite o nome do seu Sim: ");
    int idade = Integer.parseInt(IO.readln("Digite a idade do seu Sim: "));
    String genero = IO.readln("Digite o genero do seu Sim: ");
    String humor = IO.readln("Como " + nome + " esta se sentindo? ");
    IO.println("--- Trabalho ---");
    IO.println("1- Cientista 2- Detetive");
    int emprego = Integer.parseInt(IO.readln("Escolha seu trabalho: "));

    Cientista cientista1 = null;
    Detetive detetive1 = null;

    Sims sim1 = new Sims(nome, idade, genero, humor,50,50 );


    switch (emprego) {
        case 1:
         cientista1 = new Cientista(5000, 5);
         cientista1.pagamento();
         IO.println("--- Status de " + nome + " ---");
         
     
         IO.println("saldo: " + cientista1.salario);
         IO.println("humor: " + humor);
         IO.println("fome: " + sim1.fome );
         IO.println("sede: " + sim1.sede);
        break;

        case 2:
            detetive1 = new Detetive(5000,5);
                detetive1.pagamento();
                IO.println("--- Status de " + nome + " ---");
                
            
                IO.println("saldo: " + detetive1.salario);
                IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
         detetive1.pagamento();
        break;
    
        default:
         IO.println("Emprego inválido");
        break;
    }

    IO.println("--- Açôes ---");

    IO.println("1- Comer");
    IO.println("2- Beber");
    IO.println("3- Brincar");


    int acao = Integer.parseInt(IO.readln("Escolha oq " + nome + " irá fazer: "));

    Alimento sanduiche = new Alimento();
    Bebida leite = new Bebida();

    switch (acao) {
        case 1:
         sanduiche.consumir(sim1);
         IO.println("fome: " + sim1.fome);
        break;
    
        case 2:
         leite.consumir(sim1);
         IO.println("sede: " + sim1.sede); 
        break;

        case 3:
         sim1.brincar();
        break;
    


        default:
         IO.println("Opção inválida");
            break;
    }




    
}