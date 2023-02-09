/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author Thaly
 */
public abstract class Cuenta {

    private String numero;
    private Titular propietario;
    private float saldoInicial;

    public Cuenta() {
    }

    public Cuenta(String numero, Titular propietario, float saldoInicial) {
        this.numero = numero;
        this.propietario = propietario;
        this.saldoInicial = saldoInicial;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPropietario(Titular propietario) {
        this.propietario = propietario;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public Titular getPropietario() {
        return propietario;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void leer() {
        String aux;  // lee el numero
        float vsal; // lee el saldo inicial
        Titular auxtit= new Titular();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingreso de datos de la cuenta bancaria");
        System.out.println("Numero de cuenta :");
        aux = leer.nextLine();
        setNumero(aux);           // se guarda lo ingresado por el usuariio/ actualiza el estado del atributo del numero de cuenta
       
        auxtit.leer();                        // lee el nombre del titular de la cuenta q esta en la clase titular
        setPropietario(auxtit);         //actualzia datos del propietario de la cuena 
        System.out.println("Saldo Inicial de la cuenta: ");
        vsal = leer.nextFloat();
        setSaldoInicial(vsal);

    }

    public abstract void calcularValoresFinMes();
        
    
    @Override
    public String toString() {
        return "Cuenta{" + "numero = " + numero + ", propietario = " + propietario.toString() + ", saldoInicial = " + saldoInicial + '}';
    }

}
