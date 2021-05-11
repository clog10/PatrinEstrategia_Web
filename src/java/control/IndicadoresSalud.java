
package control;

/**
 * @author Carlos Loaeza
 */
public abstract class IndicadoresSalud {
    
    protected double peso;
    protected double estatura;
    protected int edad;
    protected CaloriasRequeridas kcr;
    protected int cintura;
    protected int cadera;
    protected Persona person;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public CaloriasRequeridas getKcr() {
        return kcr;
    }

    public void setKcr(CaloriasRequeridas kcr) {
        this.kcr = kcr;
    }

    public int getCintura() {
        return cintura;
    }

    public void setCintura(int cintura) {
        this.cintura = cintura;
    }

    public int getCadera() {
        return cadera;
    }

    public void setCadera(int cadera) {
        this.cadera = cadera;
    }

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public abstract double imc();
    
    public abstract double icc();
    
    public abstract double req_kc();
    
    public abstract double grasaCorporal();
}
