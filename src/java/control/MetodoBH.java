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

        if (is.getPerson().getSexo() == 'H' && is.grasaCorporal() > 10) {
            bmr = bmr * 0.9;
        }
        
        
        
        return calorias;
    }

}
