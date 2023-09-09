package robot;

public class EjercicioRobot {

    public static void main(String[] args) {
       
       Robot juancito=new Robot();
       Hombre p=new Hombre();
       
       p.JugarConRobot(juancito);
       juancito.despertar(true);
      
       Hombre d=new Hombre();
       
       d.JugarConRobot(juancito);
       
       
       
       
       
        
    }
    
}
