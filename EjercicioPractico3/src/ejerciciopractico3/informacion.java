package ejerciciopractico3;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LABORATORIO 04
 */
public class informacion {
    public String nombreIglesia;
    public String nombrePastor;
    public int cantfeligreses;
    

    public String getNombreIglesia() {
        return nombreIglesia;
    }

    public void setNombreIglesia(String nombreIglesia) {
        this.nombreIglesia = nombreIglesia;
    }

    public String getNombrePastor() {
        return nombrePastor;
    }

    public void setNombrePastor(String nombrePastor) {
        this.nombrePastor = nombrePastor;
    }

    public int getCantfeligreses() {
        return cantfeligreses;
    }

    public void setCantfeligreses(int cantfeligreses) {
        this.cantfeligreses = cantfeligreses;
    }
    
}
