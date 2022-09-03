package Dio.teste1;

public class SmartTV {

    boolean ligada;
    int canal = 4;
    int volume = 25;

    // Criando método que manipula a SmartTV
    public void ligar(){
        ligada = true;
        System.out.println("---SmartTV Ligada---");
    }
    public void desligar(){
        ligada = false;
        System.out.println("---SmartTV Desligada---");
    }

    // Método para aumentar e diminuir o volume SmartTV
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar o Volume...");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir o Volume");
    }
    // Método para mudar o canal SmartTV
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }







}
