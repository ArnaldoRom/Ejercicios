 /* A- El auto debe tener: color,patente y combustible con una carga inicial de 50lts. El auto sólo tendrá como 
 * comportamiento:
 *   * Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener en cuenta que por
 * cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible suficiente.
 *   * Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos tener en cuenta que
 * por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible suficiente.
 *   * Llenar Tanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
 */

public class Auto {
    private String color;
    private String patente;
    private int combustible;
    private Rueda[] ruedas;
    

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible=50;
        this.ruedas=new Rueda[4];
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    
    public void AgregarRueda(){
        for(int i=0;i<4;i++){
           ruedas[i]= new Rueda((i+1)+" Marca Michelin",28.0d) ;
            System.out.println("Se agrego "+ruedas[i]);
        }
    }
    
    public void Avanzar(int mts){
        int mtsavanzados=mts/10;
        
        if(mtsavanzados<=combustible){
            combustible-=mtsavanzados;
            System.out.println("........... se avanzo: "+mts+" Mts.");
            
        }else {
            System.out.println("NO hay demasiado combustible para avanzar");
        }    
    }
    
    public void Retroceder(int mts){
        int mtsretrocedidos=mts/10;
        
        if(mtsretrocedidos<=combustible){
            combustible-=mtsretrocedidos;
             System.out.println("....... se retrocedio: "+mts+" Mts.");
            
        }else {
            System.out.println("NO hay demasiado combustible para retroceder");
        }
    }
    
    public void LlenarTanque(){
        combustible=50;
        System.out.println(".......Tanque lleno: "+combustible+" Lts");
    }

    @Override
    public String toString() {
        return "Color " + color + "| Patente " + patente ;
    }
    
}
    
    
    
    



