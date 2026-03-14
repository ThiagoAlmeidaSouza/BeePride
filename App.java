import java.util.Scanner;


public class App {


    //Banco de Dados:

    public class Usuario {

        private double Id;
        private String nome;
        private double peso;
        private double TxGordura;
    }

    //Lógica:
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quanto você pesa atualmente?");
        Double PesoBase = scanner.nextDouble();

        System.out.println("Qual sua porcentagem de gordura corporal?");
        Double PcGordura = scanner.nextDouble();

        
        double Rmv = 100;
        double PesoSemGordura = Rmv - PcGordura;
        double KcalBase = PesoSemGordura * PesoBase;
        double BaseCalcKcal = KcalBase / 100;
        double Basal = PesoSemGordura * 22 + 500;

        // Atividade Fisica

        // Abaixo, deve variar entre treina 1 vez por semana, treina 2, ou não treina.
        System.out.println
        ("Quantas vezes você treina por dia?\nUma vez (Digite 1),\nDuas vezes (Digite 2),\nOu não treina? (Digite 0).");
        int AtividadeFisica = scanner.nextInt();
        
        double KcalGastaPaciva;

        System.out.println("Digite seu OBJETIVO:\nGANHAR PESO (1)\nPERDER PESO (2)");
        double Objetivo = scanner.nextDouble();
        
        if (AtividadeFisica == 1) {
            KcalGastaPaciva = Basal * 1.2;
        } else if (AtividadeFisica == 2)
            {
            KcalGastaPaciva = Basal * 1.4;
        } else {
            KcalGastaPaciva = Basal * 1;
        }

        if (Objetivo == 2) {
            double ConsDiarioPerder = KcalGastaPaciva * 0.75;
            System.out.printf("Você deve consumir: %.2f ", ConsDiarioPerder , "Kcal");

        } else if (Objetivo == 1) {
            double ConsDiarioGanhar = KcalGastaPaciva * 1.25;
            System.out.printf("Você deve consumir: %.2f ", ConsDiarioGanhar , "Kcal");
        }

    }
}


