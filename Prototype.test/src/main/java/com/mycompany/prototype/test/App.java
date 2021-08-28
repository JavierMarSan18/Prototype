/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototype.test;

import prototype.model.CelulaImpl;

/**
 *
 * @author alumno
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prototipo
        CelulaImpl celula = new CelulaImpl();
        celula.setSize(10);
        celula.setType("Animal");
        
        //Clon
        CelulaImpl celulaClon = (CelulaImpl) celula.clonar();
        
        celula.show(); //Prototipo
        celulaClon.show(); //Clon
        
        System.out.println(celula == celulaClon);
    }
    
}
