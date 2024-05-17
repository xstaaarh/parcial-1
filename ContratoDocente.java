
/**
 * Write a description of class ContratoDocente here.
 * 
 * @author (your) 
 * @version (a version number or a date)
 */
public class ContratoDocente
{
    private ProfesorOcasional docente;
    private int duracionContrato; // en meses
    private String codigoRegistroPresupuestal;
    private float salarioMensual;
    String nivelEstudios;

    // Constructor
    public ContratoDocente(ProfesorOcasional docente, int duracionContrato, String codigoRegistroPresupuestal, String nivelEstudios) {
        this.docente = docente;
        this.duracionContrato = duracionContrato;
        this.codigoRegistroPresupuestal = codigoRegistroPresupuestal;
        this.salarioMensual = calcularSalarioMensual();
        this.nivelEstudios = nivelEstudios;
    }
    public int getDuracionContrato(){
        return duracionContrato;
    }
    public String getCodigoRegistroPresupuestal(){
        return codigoRegistroPresupuestal;
    }
    public float getSalarioMensual() {
        return salarioMensual;
    }


    // Método para calcular el salario mensual del docente contratado
    public String getNivelEstudios(){
        return nivelEstudios;
    }
   private float calcularSalarioMensual() {
        float salarioBase = 0;
        // Definir el salario base según el nivel de estudio del docente
        if (getNivelEstudios().equals("Especialización")) {
            salarioBase = 3;
        } else if (getNivelEstudios().equals("Maestría")) {
            salarioBase = 4;
        } else if (getNivelEstudios().equals("Doctorado")) {
            salarioBase = 5;
        }

        // Calcular el salario mensual multiplicando el salario base por el salario
        return salarioBase * salarioMensual;
    }

    // Constante para el salario mínimo mensual 
    public void imprimirSalarioMensual() {
        System.out.println("Salario mensual del docente: $" + salarioMensual);
    }
    
    

    
}
