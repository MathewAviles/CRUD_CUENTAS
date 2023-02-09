package cuentas;

import AccesoADatos.Operaciones;
import java.util.ArrayList;
import java.util.Scanner;
import modelos.Cuenta;
import modelos.cAhorro;
import modelos.cCorriente;
/**
 *
 * @author Thaly
 * 
 * En caso de no ejecutarse a la primera, 
 * Limpiar y Construir (Clean and Build) el Proyecto
 */

public class Cuentas {

    public static void main(String[] args) {
        Scanner leerMain = new Scanner(System.in);
        int opcion = -1;
        ArrayList<Cuenta> lista = new ArrayList<Cuenta>();  // DECLARAR UN VECTOR de la clase cuenta
        Operaciones op = new Operaciones();
        
        System.out.println("------------BIENVENIDO-------------");        
        do{
        System.out.println("------------MENU-------------");
        System.out.println("1. INSERTAR CUENTA");
        System.out.println("2. MODIFICAR CUENTA");
        System.out.println("3. VISUALIZAR CUENTA");
        System.out.println("4. ELIMINAR CUENTA");
        System.out.println("5. LISTAR CUENTAS");
        System.out.println("0. SALIR");
        
        opcion = leerMain.nextInt();
        int sel = -1;
        switch(opcion){
            case 1:
                do{
                    System.out.println("------------QUE TIPO DE CUENTA DESEA INGRESAR-------------");
                    System.out.println("1. AHORROS");
                    System.out.println("2. CORRIENTE");
                    System.out.println("0. VOLVER AL MENU INICIAL");
                    sel = leerMain.nextInt();
                    switch(sel){
                        case 1:
                            cAhorro ahorro = new cAhorro();
                            lista.add( op.insercion(ahorro) );
                            System.out.println("-----------------------------");
                            break;
                        case 2:
                            cCorriente corriente = new cCorriente();
                            lista.add( op.insercion(corriente) );
                            System.out.println("-----------------------------");
                            break;
                    }
                }while(sel != 0);
                break;
            case 2:
                op.modificar(lista);
                break;
            case 3:
                op.visualizar(lista);
                break;
            case 4:
                op.eliminar(lista);
                break;
            case 5:
                op.listado(lista);
                break;
            default:
                break;
        }
        }while(opcion != 0);
    }
}
