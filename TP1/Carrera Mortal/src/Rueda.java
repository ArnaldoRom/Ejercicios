/*B- Hacer la clase Rueda, con atributo marca y presión, Luego el auto debe tener 4 ruedas, y desde el main el auto 
 *debe crear las instancias, e inflar sus ruedas.
 *   * Inflar: la presión regresa a 28.0 PSI.
 *   * Pinchar: se debe reducir la presión al mínimo.
 *   * Desinflar: reduce la presión de la rueda. -0.5 PSI.
*/

public class Rueda {
    private String marca;
    private double presion;

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    @Override
    public String toString() {
        return "Rueda "+ marca ;
    }
    
    public void Inflar(){
        presion=28.0; 
    }
    
    public void Pinchar(){
        presion=0.0;
    }
    
    public void Desinflar(){
        presion -=0.5;    
    } 
    
}
