/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype.model;

import prototype.inter.ICelula;

/**
 *
 * @author alumno
 */
public class CelulaImpl implements ICelula{
    private double size;
    private String type;

    public CelulaImpl(){
        
    }
    
    public CelulaImpl clonar(){
        CelulaImpl celula = null;
    
        try{
            celula = (CelulaImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return celula;
    }
    
    public void show(){
        System.out.println("Celula[Type:" + type + ", Size:" + size + "]");
    }
    
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
