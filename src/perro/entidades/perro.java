/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perro.entidades;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class perro {
    public ArrayList<String> razas;

    public perro() {
    }

    public perro(ArrayList<String> razas) {
        this.razas = razas;
    }

    public ArrayList<String> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
    
    
}
