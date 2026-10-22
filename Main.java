void main(){


    IO.println("-------------- The Sims 4 --------------");
    IO.println("--- Crie seu sim ---");

    String nome = IO.readln("Digite o nome do seu Sim: ");
    int idade = Integer.parseInt(IO.readln("Digite a idade do seu Sim: "));
    String genero = IO.readln("Seu sim é Homem ou Mulher? ");
    String humor = IO.readln("Como " + nome + " esta se sentindo? ");
    IO.println("--- Trabalho ---");
    IO.println("1- Cientista 2- Detetive 3- Sem emprego 4- Estágio Junior");
    int emprego = Integer.parseInt(IO.readln("Escolha seu trabalho: "));

    Cientista cientista1 = null;
    Detetive detetive1 = null;
    Estagiario estagiario1 = null;

    Sims sim1 = new Sims(nome, idade, genero, humor,50,50,7);


    switch (emprego) {
        case 1:
            if(idade > 17){
         cientista1 = new Cientista(5000, 5);
         cientista1.pagamento();
         IO.println("--- Status de " + nome + " ---");
         
     
         IO.println("saldo: " + cientista1.salario);
         IO.println("humor: " + humor);
         IO.println("fome: " + sim1.fome );
         IO.println("sede: " + sim1.sede);
            }
            else{
            IO.println(nome + " não tem idade suficiente.");
            }
        break;

        case 2:
            if(idade > 17){
             detetive1 = new Detetive(5000,5);
                detetive1.pagamento();
                IO.println("--- Status de " + nome + " ---");
                
            
                IO.println("saldo: " + detetive1.salario);
                IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
             }
            else{
            IO.println(nome + " não tem idade suficiente.");
            }
        break;
    
        case 3:
            if (genero.equals("Mulher") && genero.equals("mulher")) {
                IO.println(nome + " está desempregada.");
                IO.println("--- Status de " + nome + " ---");
                
        
              IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
            }
            else if (genero.equals("Homem") && genero.equals("homem")) {
                IO.println(nome + " está desempregado.");
                IO.println("--- Status de " + nome + " ---");
                
        
                IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
            }

        break;

        case 4:
            if (idade >=13 && idade < 17 ) {
               estagiario1= new Estagiario(5000,5);
                estagiario1.pagamento();
                IO.println("--- Status de " + nome + " ---");
                
            
                IO.println("saldo: " + estagiario1.salario);
                IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);

            }
            else{
                IO.println(nome + " não tem idade pra estágio.");
            }
        break;
        default:
         IO.println("Emprego inválido");
        break;
    }
    


    Alimento sanduiche = new Alimento();
    Bebida leite = new Bebida();

    IO.println("--- Açôes ---");

    IO.println("1- Comer");
    IO.println("2- Beber");
    IO.println("3- Brincar");
    IO.println("4- Cozinhar");
    IO.println("5- Trabalhar na delegacia");
    IO.println("6- Trabalhar no laboratório");
    IO.println("7- Estagiar");
    


    int acao = Integer.parseInt(IO.readln("Escolha oq " + nome + " irá fazer: "));


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
    
        case 4:
         sim1.cozinhar();
        break;
        
        case 5:
            if(idade > 17 ){
                detetive1.pagamento();
             IO.println("--- Status de " + nome + " ---");
                
            
             IO.println("saldo: " + detetive1.salario);
             IO.println("humor: " + humor);
             IO.println("fome: " + sim1.fome );
             IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;

        case 6:
            if(idade > 17 ){
                cientista1.pagamento();
              IO.println("--- Status de " + nome + " ---");
                
            
              IO.println("saldo: " + cientista1.salario);
              IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;
            
        case 7:
            estagiario1.pagamento();
        break;
        default:
         IO.println("Opção inválida");
            break;


        }  

    IO.println("--- Açôes ---");

    IO.println("1- Comer");
    IO.println("2- Beber");
    IO.println("3- Brincar");
    IO.println("4- Cozinhar");
    IO.println("5- Trabalhar na delegacia");
    IO.println("6- Trabalhar no laboratório");
    IO.println("7- Estagiar");
    


    int acao1 = Integer.parseInt(IO.readln("Escolha oq " + nome + " irá fazer: "));


    switch (acao1) {
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
    
        case 4:
         sim1.cozinhar();
        break;
        
        case 5:
            if(idade > 17 ){
                detetive1.pagamento();
             IO.println("--- Status de " + nome + " ---");
                
            
             IO.println("saldo: " + detetive1.salario);
             IO.println("humor: " + humor);
             IO.println("fome: " + sim1.fome );
             IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;

        case 6:
            if(idade > 17 ){
                cientista1.pagamento();
              IO.println("--- Status de " + nome + " ---");
                
            
              IO.println("saldo: " + cientista1.salario);
              IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;
            
        case 7:
            estagiario1.pagamento();
        break;
        default:
         IO.println("Opção inválida");
            break;


        }  

    IO.println("--- Açôes ---");

    IO.println("1- Comer");
    IO.println("2- Beber");
    IO.println("3- Brincar");
    IO.println("4- Cozinhar");
    IO.println("5- Trabalhar na delegacia");
    IO.println("6- Trabalhar no laboratório");
    IO.println("7- Estagiar");
    


    int acao2 = Integer.parseInt(IO.readln("Escolha oq " + nome + " irá fazer: "));


    switch (acao2) {
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
    
        case 4:
         sim1.cozinhar();
        break;
        
        case 5:
            if(idade > 17 ){
                detetive1.pagamento();
             IO.println("--- Status de " + nome + " ---");
                
            
             IO.println("saldo: " + detetive1.salario);
             IO.println("humor: " + humor);
             IO.println("fome: " + sim1.fome );
             IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;

        case 6:
            if(idade > 17 ){
                cientista1.pagamento();
              IO.println("--- Status de " + nome + " ---");
                
            
              IO.println("saldo: " + cientista1.salario);
              IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;
            
        case 7:
            estagiario1.pagamento();
        break;
        default:
         IO.println("Opção inválida");
            break;


        }  

    IO.println("--- Açôes ---");

    IO.println("1- Comer");
    IO.println("2- Beber");
    IO.println("3- Brincar");
    IO.println("4- Cozinhar");
    IO.println("5- Trabalhar na delegacia");
    IO.println("6- Trabalhar no laboratório");
    IO.println("7- Estagiar");
    


    int acao3 = Integer.parseInt(IO.readln("Escolha oq " + nome + " irá fazer: "));


    switch (acao3) {
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
    
        case 4:
         sim1.cozinhar();
        break;
        
        case 5:
            if(idade > 17 ){
                detetive1.pagamento();
             IO.println("--- Status de " + nome + " ---");
                
            
             IO.println("saldo: " + detetive1.salario);
             IO.println("humor: " + humor);
             IO.println("fome: " + sim1.fome );
             IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;

        case 6:
            if(idade > 17 ){
                cientista1.pagamento();
              IO.println("--- Status de " + nome + " ---");
                
            
              IO.println("saldo: " + cientista1.salario);
              IO.println("humor: " + humor);
                IO.println("fome: " + sim1.fome );
                IO.println("sede: " + sim1.sede);
             }
            
            else{
                IO.println("Você não tem idade.");
            }
        break;
            
        case 7:
            estagiario1.pagamento();
        break;
        default:
         IO.println("Opção inválida");
            break;


        }  

    }