/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico3;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        informacion Info = new informacion(); 
        Info.setNombreIglesia(JOptionPane.showInputDialog(null, "Cual es el nombre de la iglesia:"));
        Info.setNombrePastor(JOptionPane.showInputDialog(null, "Cual es el nombre del pastor:"));
        Info.setCantfeligreses(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos feligreses hay:")));
        
        System.out.println(Info.getNombreIglesia());
         System.out.println(Info.getNombrePastor());
         System.out.println(Info.getCantfeligreses());
         
         int suma=0;
         
        
        feligreses feli = new feligreses();
        feligreses arrfeligreses[] = new feligreses [Info.getCantfeligreses()];
        for(int x=0; x<arrfeligreses.length; x++) {
            JOptionPane.showMessageDialog(null, "Se solicitara los datos de los ferigreses");
            feli.setNombrefeli(JOptionPane.showInputDialog(null, "Cual es el nombre del feligres:")); 
            feli.setCedulafeli(Integer.parseInt(JOptionPane.showInputDialog(null, " Cual es la cedula del feligres")));
            feli.setDiezmo(Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto dara:")));
            
           
            System.out.println(feli.getNombrefeli());
            System.out.println(feli.getCedulafeli());
            System.out.println(feli.getDiezmo());
           
            suma+= feli.getDiezmo();
        }    
            double montototal;
            montototal= suma;
            double montomuni;
            montomuni= suma * 0.09;
            double montocome;
            montocome = suma * 0.21;
            double montopastor;
            montopastor= suma * 0.7;
            
            
            System.out.println("monto total ganancias iglesia:"+montototal);
            System.out.println("monto infraestructura:"+montomuni);
            System.out.println("monto comedor:"+montocome);
            System.out.println("ganancia pastor:"+montopastor);
        }
    }

