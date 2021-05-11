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
        estatura = estatura/100;
        return peso / (estatura * estatura);
    }

    @Override
    public double icc() {
        return cintura/cadera;
    }

    @Override
    public double req_kc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double grasaCorporal() {
        double porcentaje=0;
        if(person.getSexo()=='M'){
            porcentaje = 1.39 * imc() + 0.16 * edad - 10.34 * 0 -9;
        }else if(person.getSexo()=='H'){
            porcentaje = 1.39 * imc() + 0.16 * edad - 10.34 * 1 -9;
        }
        return porcentaje;
    }

}
