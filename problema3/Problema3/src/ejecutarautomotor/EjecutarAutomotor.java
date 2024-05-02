package ejecutarautomotor;

import automotor.Automotor;

public class EjecutarAutomotor {

    public static void main(String[] args) {
        
        // OBJETO 1
        Automotor auto1 = new Automotor("1196823475", "Honda", 1996, 19000);
        auto1.calcularValorMatricula();
        System.out.println("----------OBJETO 1----------");
        System.out.println(auto1.toString());

        // OBJETO 2
        Automotor auto2 = new Automotor("0984752374", "Honda", 2019);
        auto2.calcularValorMatricula();
        System.out.println("----------OBJETO 2----------");
        System.out.println(auto2.toString());
        
    }
    
}
