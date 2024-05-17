
/**
 * Write a description of class DepartamentoAcademico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DepartamentoAcademico
{
    String director;
    DocenteCatedraa catedra;
    ProfesorOcasional docente;

    public DepartamentoAcademico() {
    }

    public DepartamentoAcademico(String director, DocenteCatedraa catedra, ProfesorOcasional docente) {
        this.director = director;
        this.catedra = catedra;
        this.docente = docente;
    }

    public String getDirector() {
        return director;
    }

    public DocenteCatedraa getCatedra() {
        return catedra;
    }

    public ProfesorOcasional getDocente() {
        return docente;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCatedra(DocenteCatedraa catedra) {
        this.catedra = catedra;
    }

    public void setDocente(ProfesorOcasional docente) {
        this.docente = docente;
    }
}
