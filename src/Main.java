public class Main {
    public static void main(String[] args){

        Carro carro1 = new Carro();

       carro1.setCor("cinza");
       carro1.setModelo("renault");
       carro1.setCapacidadeDoTanque(59);

        System.out.println("cor do carro ---> " + carro1.getCor());
        System.out.println("modelo do carro ---> " + carro1.getModelo());
        System.out.println("capacidade do tanque ---> " + carro1.getCapacidadeDoTanque());
        System.out.println("Valor total para encher o tanque ---> " + carro1.calcularValorTotal(5.77));

        Carro carro2 = new Carro("vermelho", "Toyota", 59);


        System.out.println("\ncor do carro ---> "+ carro2.getCor());
        System.out.println("modelo do carro ---> " + carro2.getModelo());
        System.out.println("capacidade do tanque ---> " + carro2.getCapacidadeDoTanque());
        System.out.println("Valor total para encher o tanque ---> " + carro2.calcularValorTotal(5.77));;
    }
}