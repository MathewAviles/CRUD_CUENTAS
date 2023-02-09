/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author Thaly
 */
public class cAhorro extends Cuenta {
    private float interes;

    public cAhorro() {
        
    }

    public cAhorro(float interes) {
        this.interes = interes;
    }


    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getInteres() {
        return interes;
    }
    
    
    @Override
    public void leer() {
        float vint; // lee el saldo inicial
        Scanner leer = new Scanner(System.in);
        
        super.leer();
        System.out.println("Porcentaje de interes: ");
        vint = leer.nextFloat();
        setInteres(vint);

    }

    @Override
    public String toString() {
        return super.toString() + "cAhorro{" + "interes = " + interes + '}';
    }

    @Override
    public void calcularValoresFinMes() {
       this.setSaldoInicial(this.getSaldoInicial()*(1+(this.getInteres()/100)));
    }
}
