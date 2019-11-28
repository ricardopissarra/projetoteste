/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

/**
 *
 * @author ricardopissarra
 */
public class Cafe {
    static int numCafe = 0;
    int numero;
    
    public Cafe(){
        ++numCafe;
        numero = numCafe;
    }
    
    public String tooString(){
        return new String("> O seu café");
    }
    
    public void informacao(){
        System.out.println(tooString());
    }
    
    public void lCapsulas(){
        
    }
}
