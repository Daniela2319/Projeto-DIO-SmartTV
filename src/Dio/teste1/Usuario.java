package Dio.teste1;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV(); // classe

        System.out.println("A TV ligada?  " + smartTV.ligada);



        // Ligar a TV
        smartTV.ligar();
        System.out.println("Novo status -> A TV ligada?  " + smartTV.ligada);

        // Desligar a TV
        smartTV.desligar();
        System.out.println("Novo status -> A TV ligada?  " + smartTV.ligada);

        // Aumentar o Volume da TV
        System.out.println("---Volume Atual: " + smartTV.volume + "---");
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("---Volume Atual: " + smartTV.volume + "---");

        // Mudar o Canal
        System.out.println("Canal Atual: " + smartTV.canal + " SBT");
        smartTV.mudarCanal(18);
        System.out.println("Canal Atual: " + smartTV.canal + " Rede Vida");


    }
}
