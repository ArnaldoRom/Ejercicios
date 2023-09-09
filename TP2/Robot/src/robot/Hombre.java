
package robot;

public class Hombre {
    
     public void JugarConRobot(Robot robot) {
         
        if (robot.bateriaVacia()) {
            System.out.println("El robot no puede jugar, su batería está vacía.");
            return;
        }
        
        if (robot.dormir(true)) {
            System.out.println("El robot está dormido, primero hay que despertarlo.");
            return;
        }
        
        System.out.println("Jugando con el robot...");
        
        robot.avanzar(500);
        
        robot.retrocer(20);
        
        robot.energiaActual();
        
        int energiaActual = robot.energiaActual();
        System.out.println("Energía actual del robot: " + energiaActual);
        
        if (robot.bateriaLlena()) {
            System.out.println("La batería del robot está llena.");
        } else {
            System.out.println("La batería del robot no está llena.");
        }
    }
    
}
