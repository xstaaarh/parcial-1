
/**
 * Write a description of class ComiteEvaluacionDocente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

    
     
import java.util.ArrayList;
import java.util.List;

public class ComiteEvaluacionDocente {
     private List<String> trabajosEscritos;
    DocenteCatedraa nTrabajos;

    
    public ComiteEvaluacionDocente() {
        this.trabajosEscritos = new ArrayList<>();
    }

    public List<String> getTrabajosEscritos() {
        return trabajosEscritos;
    }

    public DocenteCatedraa getnTrabajos() {
        return nTrabajos;
    }

    public void setTrabajosEscritos(List<String> trabajosEscritos) {
        this.trabajosEscritos = trabajosEscritos;
    }

    public void setnTrabajos(DocenteCatedraa nTrabajos) {
        this.nTrabajos = nTrabajos;
    }
    

    // Método para evaluar los trabajos escritos
    public void evaluarTrabajosEscritos(List<String> trabajos) {
        this.trabajosEscritos.addAll(trabajos);
    }

    // Método para obtener la cantidad de trabajos escritos evaluados
    public int cantidadTrabajosEvaluados() {
        return trabajosEscritos.size();
    }

    // Método para obtener los trabajos escritos evaluados
    public List<String> obtenerTrabajosEvaluados() {
        return trabajosEscritos;
    }
}

