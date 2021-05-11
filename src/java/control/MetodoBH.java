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
public class MetodoBH implements CaloriasRequeridas {
    private int factorActividad;

    public void setFactorActividad(int factor) {
        this.factorActividad = factor;
    }

    @Override
    public double calculo_kc(IndicadoresSalud is) {
        double bmr = is.getPeso() * 24;
        double calorias = 0;

        if (is.getPerson().getSexo() == 'H' && is.grasaCorporal() >= 10) {
            bmr = bmr * 0.9;
        }
        
        if (is.getPerson().getSexo() == 'H' && factorActividad == 0) {
            calorias = bmr * 1;
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 1) {
            calorias = bmr * (1.15);
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 2) {
            calorias = bmr * (1.35);
        } else if (is.getPerson().getSexo() == 'H' && factorActividad == 3) {
            calorias = bmr * (1.45);
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 0) {
            calorias = bmr * 1;
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 1) {
            calorias = bmr * (1.15);
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 2) {
            calorias = bmr * (1.35);
        } else if (is.getPerson().getSexo() == 'M' && factorActividad == 3) {
            calorias = bmr * (1.45);
        }
        
        return calorias;
    }

}
