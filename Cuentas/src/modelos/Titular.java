package modelos;

import java.util.Scanner;

/**
 *
 * @author Thaly
 */
public class Titular {

    private String cedula;
    private String nombre;

    public Titular() {
    }

    public Titular(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public void leer(){
        String aux;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingreso de daros de titular de la cuenta");
        System.out.println("CI/RUC :");
        aux=leer.nextLine();
        setCedula(aux);
        System.out.println("RAZON SOCIAL: ");
        aux=leer.nextLine();
        setNombre(aux);
    

    }




    @Override// override hace sobreescritura de metodos
    public String toString() {
        return "Titular{" + "cedula = " + cedula + ", nombre = " + nombre + '}';
    }

}
        

