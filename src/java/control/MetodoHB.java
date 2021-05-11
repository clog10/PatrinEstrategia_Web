/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Carlos Loaeza
 */
public class MetodoHB implements CaloriasRequeridas {

    private int factorActividad;

    public void setFactorActividad(int factor) {
        this.factorActividad = factor;
    }

    @Override
    public double calculo_kc(IndicadoresSalud is) {
        double calorias = 0;
        if (is.getPerson().getSexo() == 'H' && factorActividad == 0) {
            calorias = ((695 + (9.6 * is.getPeso())) + (1.8 * is.getEstatura()) - (4.7 * is.getEdad())) * 1.2;
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 1) {
            calorias = ((695 + (9.6 * is.getPeso())) + (1.8 * is.getEstatura()) - (4.7 * is.getEdad())) * 1.375;
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 2) {
            calorias = ((695 + (9.6 * is.getPeso())) + (1.8 * is.getEstatura()) - (4.7 * is.getEdad())) * 1.55;
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 3) {
            calorias = ((695 + (9.6 * is.getPeso())) + (1.8 * is.getEstatura()) - (4.7 * is.getEdad())) * 1.725;
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 0) {
            calorias = ((66 + (13.7 * is.getPeso())) + (5 * is.getEstatura()) - (6.8 * is.getEdad())) * 1.2;
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 1) {
            calorias = ((66 + (13.7 * is.getPeso())) + (5 * is.getEstatura()) - (6.8 * is.getEdad())) * 1.375;
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 2) {
            calorias = ((66 + (13.7 * is.getPeso())) + (5 * is.getEstatura()) - (6.8 * is.getEdad())) * 1.55;
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 3) {
            calorias = ((66 + (13.7 * is.getPeso())) + (5 * is.getEstatura()) - (6.8 * is.getEdad())) * 1.725;
        }
        return calorias;
    }

}
