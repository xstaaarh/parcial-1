
/**
 * Write a description of class ProfesorOcasional here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProfesorOcasional
{
    String nombre;
    String nivelEstudios;
    public ProfesorOcasional(){
        
    }
    public ProfesorOcasional(String Nombre, String nivelEstudios){
        this.nombre = Nombre;
        this.nivelEstudios = nivelEstudios;
    }
    
    public String getNivelEstudios(ProfesorOcasional docente){
        return docente.nivelEstudios;
    }
}
