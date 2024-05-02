package ejecutarcheque;

import cheque.Cheque;

public class EjecutarCheque {

    public static void main(String[] args) {

        // OBJETO 1
        Cheque cheq1 = new Cheque("Bryan Alao", "Banco del Pacifico", 500.20);
        cheq1.calcularcB();
        System.out.println("----------OBJETO 1----------");
        System.out.println(cheq1.toString());

        // OBJETO 2
        Cheque cheq2 = new Cheque("Marco Herrera", 1500.60);
        cheq2.calcularcB();
        System.out.println("----------OBJETO 2----------");
        System.out.println(cheq2.toString());
    }

}
