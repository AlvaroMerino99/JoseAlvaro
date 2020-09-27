/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasecriminal;

/**
 *
 * @author Afana
 */
public class SucioCriminal {
    
    private String nombre;
    private String ojos;
    private String pelo;
    private String estatura;
    private String edad;
    private String delito;
 
    public SucioCriminal(String nombre, String ojos, String pelo, String estatura, String edad, String delito) {
        this.nombre = nombre;
        this.ojos = ojos;
        this.pelo = pelo;
        this.estatura = estatura;
        this.edad = edad;
        this.delito = delito;
    }
    
    

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+"\n"
                + "Ojos: "+this.ojos+"\n"
                + "Pelo: "+this.pelo+"\n"
                +"Estatura: "+this.estatura+"\n"
                +"Edad: "+this.edad+"\n"
                +"Delito: "+this.delito+"\n";
    }
    
    
    
}
