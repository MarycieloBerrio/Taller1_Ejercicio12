/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1.ejercicio12;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        int horas = 48, razon = 5000, salariobruto;
        double porcentajeretencion = 0.125, retencion, salarioneto;
        
        salariobruto = horas * razon;
        retencion = salariobruto * porcentajeretencion;
        salarioneto = salariobruto - retencion;
        
        System.out.println("El salario bruto es de: " + salariobruto);
        System.out.println("La retencion en la fuente es de : " + retencion);
        System.out.println("El salario neto es de: " + salarioneto);
        
    }
}
