package ejecutarprofesor;

import profesor.Profesor;

public class EjecutarProfesor {

    public static void main(String[] args) {

        //OBJETO 1
        Profesor prof1 = new Profesor("Bryan", "Alao", "1150457875", 800.15);
        prof1.calcularSt();
        System.out.println("----------OBJETO 1----------");
        System.out.println(prof1.toString());

        //OBJETO 2
        Profesor prof2 = new Profesor("Marco", "Herrera", 900.30);
        prof2.calcularSt();
        System.out.println("----------OBJETO 2----------");
        System.out.println(prof2.toString());
        
    }
    
}
