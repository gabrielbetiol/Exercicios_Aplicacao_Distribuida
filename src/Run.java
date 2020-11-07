import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
//        new ExercicioUm();
        System.out.println("\n");

//        new ExercicioDois();
        System.out.println("\n");

//        Conta contaUm = new Conta(1500, 0145, 2000);
//        contaUm.saque(1600);
//        System.out.println(contaUm.getSaldo());
//        contaUm.saque(500);
//        System.out.println(contaUm.getSaldo());
        Titular titularUm = new Titular();
        titularUm.setNome("Gabriel Betiol");
        titularUm.setCpf("12345678910");

        Conta contaDois = new Conta(1500, 0146, 2000, titularUm);
        System.out.println(contaDois);
    }
}
