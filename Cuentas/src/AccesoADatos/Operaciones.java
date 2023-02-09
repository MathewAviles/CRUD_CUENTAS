/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.Cuenta;
import modelos.cAhorro;
import modelos.cCorriente;

/**
 *
 * @author Thaly
 */


public class Operaciones {
    
    public Cuenta insercion(Cuenta c) {      //Función recibe el ArrayList de la clase cuenta para llenado y utilizar en el main para impresión         
            c.leer();
            return c;
    }
    
    
    public int consulta(ArrayList<Cuenta> l, String numeroCuenta) {  //recibe el array List en donde va a buscar y lo que se va a buscar en este caso numero cuenta
        Cuenta cuenta;
        for (int i = 0; i < l.size(); i++) {  //ciclo que rrecorre el vector
            cuenta = l.get(i);               // Extraer un elemento del vector
            if (cuenta.getNumero().equals(numeroCuenta)) { // para compara si es igual
                return i;                         //retorna la posición si encuentra la posision
            }            
        }
        
        return -1;                              // si no retorna -1
    }
    
    public void listado(ArrayList<Cuenta> l) {
        System.out.println("Listado de cuentas bancarias registradas");
        for (Cuenta cuen2 : l) {                       // ciclo para mostrar los elementos de la lista
            System.out.println(cuen2.toString());
        }
    }
    
    public void eliminar(ArrayList<Cuenta> l) {
        String num;   //númeo de cuanta
        int pos;      //posoción que ocupa la cuenta en el arreglo
        Scanner rs = new Scanner(System.in);        
        System.out.println("Eliminacion de cuentas bancarias");
        System.out.println("Ingrese el numero de cuenta:");
        num = rs.nextLine();
        pos = consulta(l, num);
        if (pos >= 0) //cuenta enconrada
        {
            System.out.println("Eliminando cuenta ...");
            System.out.println(l.get(pos).toString());
            l.remove(pos);    //proceso de eliminación
            listado(l);
        } else {
            System.out.println("Cuenta no existente y no eliminada...");
        }
    }
    
    public void visualizar(ArrayList<Cuenta> l) {
        String num;   //númeo de cuanta
        int pos;      //posoción que ocupa la cuenta en el arreglo
        Scanner rs = new Scanner(System.in);        
        System.out.println("Visualización de cuentas bancarias");
        System.out.println("Ingrese el numero de cuenta:");
        num = rs.nextLine();
        pos = consulta(l, num);
        if (pos >= 0) //cuenta enconrada
        {
            System.out.println("Cuenta encontrada ...");
            System.out.println(l.get(pos).toString());
        } else {
            System.out.println("Cuenta no existente...");
        }
    }
    
    public void modificar(ArrayList<Cuenta> l) {
        String num;   //númeo de cuanta
        int pos;      //posoción que ocupa la cuenta en el arreglo
        Scanner rs = new Scanner(System.in);        
        System.out.println("Modificacion de cuentas bancarias");
        System.out.println("Ingrese el numero de cuenta:");
        num = rs.nextLine();
        pos = consulta(l, num);
        if (pos >= 0) //cuenta enconrada
        {
            System.out.println("Cuenta encontrada ...");
            System.out.println(l.get(pos).toString());
            if(l.get(pos).toString().contains("cAhorro")){
                cAhorro vcuenta = new cAhorro();
                vcuenta.leer();       //reingresar valores a la cuenta
                l.set(pos, vcuenta);

            }else{
                cCorriente vcuenta = new cCorriente();
                vcuenta.leer();       //reingresar valores a la cuenta
                l.set(pos, vcuenta);
            }
            listado(l);
        } else {
            System.out.println("Cuenta no existente...");
        }
    }
    
}
