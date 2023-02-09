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
public class cCorriente extends Cuenta {
     private float costM;

    public cCorriente() {
        
    }

    public cCorriente(float costM) {
        this.costM = costM;
    }

    public float getCostM() {
        return costM;
    }

    public void setCostM(float costM) {
        this.costM = costM;
    }


    
    
    @Override
    public void leer() {
        float vcost; // lee el saldo inicial
        Scanner leer = new Scanner(System.in);
        
        super.leer();
        System.out.println("Costo de Mantenimiento: ");
        vcost = leer.nextFloat();
        setCostM(vcost);

    }

    @Override
    public String toString() {
        return super.toString() + "cCorriente{" + "costM = " + costM + '}';
    }
    
    @Override
    public void calcularValoresFinMes() {
       this.setSaldoInicial(this.getSaldoInicial() - ((this.getCostM())));
    }
}
