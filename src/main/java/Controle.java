public class Controle {
    public static void main(String[] args) {
        for (int cor = 0; cor < 10; cor++) {
            Semafaro.mudaProximaCor();
            System.out.printf("Cor do semáforo: %s%n", Semafaro.mostraCor());
        }

        Semafaro.mudaCorFixa(Semafaro.AMARELO);
        System.out.printf("Cor do semáforo: %s%n", Semafaro.mostraCor());
    }
}
