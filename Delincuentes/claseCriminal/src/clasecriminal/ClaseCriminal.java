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
public class ClaseCriminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String[] nombre = {"Jorge","Andrés","JM","Chema","Bea","Salva","Jorge","Angel","Antonio","Ivan",
        "Alberto","Diego","Alberto2","Álvaro","Ricardo"
        ,"Flor","Almudena","MelonHarapiento","Guille","~-","Sheila"};
        String[] ojos = {"Azul cielo","Verde tronco","Marrón hoja","Amarillo radioactivo","Rojo comunista","Verde Abascalito","Negro, debido a la gran concentración de masa en un volumen muy pequeño, generando una fuerza de atracción tal, que ni la luz puede escapar"};
        String[] pelo = {"CALVO","Pelirrojo sin alma","Rubia de bote....."};
        String[] estatura = {"Tapón de alberca","Caballete","Normal aburrido",
        "Como el chino ese alto que juega al baloncesto","El pito de Jordi"};
        String[] edad = {"ESTA VIEJO","If her age is on the clock......."};
        String[] delito = {"Apuñalar gatitos con pajitas","Hacer la rima de mierda con la play cinco",
        "No le gusta el kebab","No querer arrojar piedras a los infieles en la plaza del pueblo"};
        
        generador(nombre,ojos,pelo,estatura,edad,delito);
    }
    
    public static void generador (String[] nombre,String[] ojos,String[] pelo,String[] estatura,String[] edad,String[] delito){
    
        int ram_nombre = (int)(Math.random() * nombre.length) + 0; 
        
        int ram_ojos = (int)(Math.random() * ojos.length) + 0; 
        
        int ram_pelo = (int)(Math.random() * pelo.length) + 0; 
        
        int ram_estatura = (int)(Math.random() * estatura.length) + 0; 
        
        int ram_edad = (int)(Math.random() * edad.length) + 0; 
        
        int ram_delito = (int)(Math.random() * delito.length) + 0; 
        
        SucioCriminal s1 = new SucioCriminal(nombre[ram_nombre],ojos[ram_ojos],pelo[ram_pelo],estatura[ram_estatura],edad[ram_edad],delito[ram_delito]);
        
        System.out.println(s1.toString());
        
    }
    
}
