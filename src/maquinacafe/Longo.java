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
public class Longo extends Cafe{
    String nome;
    
    public Longo(){
        super();
        nome = "> Cafe Lungo Vivalto.";
    }
    
    @Override
    public String tooString() {
        return new String("> O seu café Lungo Vivalto. Lungo by Elisabetta ... who else.");
    }
    
    public void informacao() {
        super.informacao();
    }
    
    public void lCapsulas(){
        System.out.println("> " + numero + " " + nome);
    }
}
