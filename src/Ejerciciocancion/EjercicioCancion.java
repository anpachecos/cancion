/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejerciciocancion;


public class EjercicioCancion {

    
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("MAMI ","JORDAN 23 " ,3 , 34, true, true);
        System.out.println(cancion1.getTitulo() + cancion1.getArtista() + cancion1.getDuracion());
        cancion1.setTitulo("PAPI");
        
        Cancion cancion2 = new Cancion();
        cancion2.setArtista("Poto");
        cancion2.setDescargado(false);
        System.out.println(cancion1.toString());
        
        cancion1.reproducirCanciones();
        cancion1.largaCorta();
        cancion1.adelantarCancion(131);
        
    }
    
    
    
}
