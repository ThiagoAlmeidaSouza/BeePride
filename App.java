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
    public static void main(String[] args) throws Exception {
        double PesoBase = 72;
        double PcGordura = 20;
        double Rmv = 100;
        double PesoSemGordura = Rmv - PcGordura;
        double KcalBase = PesoSemGordura * PesoBase;
        double BaseCalcKcal = KcalBase / 100;
        double Basal = PesoSemGordura * 22 + 500;

        // Atividade Fisica

        // Abaixo, deve variar entre treina 1 vez por semana, treina 2, ou não treina.

        int AtividadeFisica = 1;     
        String VezesQueTreino = (AtividadeFisica == 1) ? "Treino uma vez por dia" : "Não treino";
        System.out.println(VezesQueTreino);

        double KcalGastaPaciva;
        
        if (AtividadeFisica == 1) {
            KcalGastaPaciva = Basal * 1.2;
        } else if (AtividadeFisica == 2)
            {
            KcalGastaPaciva = Basal * 1.4;
        } else {
            KcalGastaPaciva = Basal * 1;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu OBJETIVO: (ganhar/perder)");
        String Objetivo = scanner.nextLine(); //salva o que o usuario digitou

        double ConsDiario = 0;

        if (Objetivo.equalsIgnoreCase("perder")) {
            ConsDiario = KcalGastaPaciva * 0.75;
        } else if (Objetivo.equalsIgnoreCase("ganhar"))
            ConsDiario = KcalGastaPaciva * 1.25;

        System.out.println("Você deve consumir " + ConsDiario + "Kcal");
    }
}


