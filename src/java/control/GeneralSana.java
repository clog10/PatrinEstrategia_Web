package control;

/**
 *
 * @author Carlos Loaeza
 */
public class GeneralSana extends IndicadoresSalud {

    public GeneralSana(double peso, double estatura, int edad, CaloriasRequeridas kcr, int cintura, int cadera, Persona person) {
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.kcr = kcr;
        this.cintura = cintura;
        this.cadera = cadera;
        this.person = person;
    }

    @Override
    public double imc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double icc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double req_kc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double grasaCorporal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
