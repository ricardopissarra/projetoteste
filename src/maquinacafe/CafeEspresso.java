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
public class CafeEspresso extends Cafe{
    String nome;
    static int numCafe = 0;    
    public CafeEspresso(){
        super();
        nome = "Cafe Espresso Livanto.";
    }
    
    @Override
    public String tooString() {
        return new String("> O seu café Espresso Livanto. Espresso by George ... still alive.");
    }
    
    public void informacao() {
        super.informacao();
    }
    
    public void lCapsulas(){
        System.out.println("> " + numero + " " + nome);
    }
}
