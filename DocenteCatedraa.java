
/**
 * Write a description of class DocenteCatedraa here.
 * 
 * @author (Manuel 1152244) 
 * @version (a version number or a date)
 */
public class DocenteCatedraa {
    
    private String nombre;
    private boolean tituloProfesional;
    private int experienciaDocencia; //años
    private int cursosActualizacion;
    private int trabajosEscritos;
    private String categoria;

    public DocenteCatedraa(String nombre, boolean tituloProfesional, int experienciaDocencia, int cursosActualizacion, int trabajosEscritos, String categoria) {
        this.nombre = nombre;
        this.tituloProfesional = tituloProfesional;
        this.experienciaDocencia = experienciaDocencia;
        this.cursosActualizacion = cursosActualizacion;
        this.trabajosEscritos = trabajosEscritos;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean isTituloProfesional() {
        return tituloProfesional;
    }

    public int getExperienciaDocencia() {
        return experienciaDocencia;
    }

    public int getCursosActualizacion() {
        return cursosActualizacion;
    }

    public int getTrabajosEscritos() {
        return trabajosEscritos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTituloProfesional(boolean tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public void setExperienciaDocencia(int experienciaDocencia) {
        this.experienciaDocencia = experienciaDocencia;
    }

    public void setCursosActualizacion(int cursosActualizacion) {
        this.cursosActualizacion = cursosActualizacion;
    }

    public void setTrabajosEscritos(int trabajosEscritos) {
        this.trabajosEscritos = trabajosEscritos;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    // Método para calcular el salario mensual del docente
    public float calcularSalarioMensual() {
        float salarioHora = obtenerSalarioHora();
        //  carga horaria mensual fija de 40 horas
        int horasMensuales = 40;
        float salarioMensual = 40*salarioHora;
        return salarioHora * horasMensuales;
       
    }
    //public void MostrarSalarioMensual(){
      //  System.out.println("El salario Mensual es: " + salarioHora*horasMensuales);
    //}

    // Método para validar la categoría del docente
    public String validarCategoria() {
        if (categoria.equals("Auxiliar") && experienciaDocencia >= 2) {
            return "Auxiliar";
        } else if (categoria.equals("Asistente") && experienciaDocencia >= 4 && cursosActualizacion > 0 && trabajosEscritos > 0) {
            return "Asistente";
        } else if (categoria.equals("Asociado") && experienciaDocencia >= 6 && trabajosEscritos > 0) {
            return "Asociado";
        } else if (categoria.equals("Titular") && experienciaDocencia >= 8 && trabajosEscritos >= 2) {
            return "Titular";
        } else {
            return "No válida";
        }
    }

    // Método privado para obtener el salario por hora según la categoría
    private float obtenerSalarioHora() {
        if (categoria.equals("Auxiliar")) {
            return 40000;
        } else if (categoria.equals("Asistente")) {
            return 45000;
        } else if (categoria.equals("Asociado")) {
            return 50000;
        } else if (categoria.equals("Titular")) {
            return 55000;
        } else {
            return 0; // Categoría no válida
        }
    }
    public void imprimirSalarioMensual() {
        float salarioMensual = calcularSalarioMensual();
        System.out.println("El salario mensual del docente catedra " + nombre + " es: " + salarioMensual);
    }
     public void ImprimirCategoriaDocente() {
        String categoriaValidada = validarCategoria();
        if (!categoriaValidada.equals("No válida")) {
            System.out.println("El docente " + nombre + " tiene la categoría validada como: " + categoriaValidada);
        } else {
            System.out.println("El docente " + nombre + " no tiene una categoría válida.");
        }
    }
}
