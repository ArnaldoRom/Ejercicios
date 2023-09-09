
/** "Carrera Mortal"
 * Nos piden modelar un Auto con las siguientes características y comportamientos para poder ser anexado al proyecto.
 * A- El auto debe tener: color,patente y combustible con una carga inicial de 50lts. El auto sólo tendrá como 
 * comportamiento:
 *   * Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener en cuenta que por
 * cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible suficiente.
 *   * Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos tener en cuenta que
 * por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible suficiente.
 *   * Llenar Tanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
 * B- Hacer la clase Rueda, con atributo marca y presión, Luego el auto debe tener 4 ruedas, y desde el main el auto 
 * debe crear las instancias, e inflar sus ruedas.
 *   * Inflar: la presión regresa a 28.0 PSI.
 *   * Pinchar: se debe reducir la presión al mínimo.
 *   * Desinflar: reduce la presión de la rueda. -0.5 PSI.
 * C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas, avanzar/retroceder,
 * y llenarTanque.
 * 
 * Nota:La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen llevar una presión
 * recomendada comprendida entre los 28 a 30 PSI.
 */

public class CarreraMortal {

    public static void main(String[] args) {
        Auto autito=new Auto("Gris","AC 258 FT");
        System.out.println("-- Tenemos un Auto: -- ");
        System.out.println(autito.toString());
        System.out.println("");
        System.out.println("-- Vamos a agregarle ruedas --");
        autito.AgregarRueda();
        System.out.println("");
        System.out.println("-- Ahora Vamos a Inflarlas --");
        
         for (Rueda rueda : autito.getRuedas()) {
             rueda.Inflar();
             System.out.println("La Precion de la "+rueda+ " es de: "+rueda.getPresion());
        }
         
        System.out.println("");
        System.out.println("-- Vamos a desinflar un poco las ruedas --");
        for (Rueda rueda : autito.getRuedas()) {
             rueda.Desinflar();
             System.out.println("La Precion de la "+rueda+ " es de: "+rueda.getPresion());
        }
        
        System.out.println(""); 
        System.out.println("-- Vamos a Avanzar-- ");
        autito.Avanzar(80);
        
        System.out.println("");
        System.out.println("-- Ahora vamos a Retroceder -- ");
        autito.Retroceder(50);
        
        System.out.println("");
        System.out.println("-- Vamos a Controlar el Nivel del Combustible --");
        System.out.println("El Nivel del combustible es de: "+autito.getCombustible()+" Lts");
        
        System.out.println("");
        System.out.println("Tenemos que Llenar el Tanque");
        autito.LlenarTanque();
        System.out.println(""); 
        System.out.println("FINALIZACION DE PROGRAMA");
        System.out.println("GRACIAS");
       
    }
}
