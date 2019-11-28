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
public class Descafeinado extends Cafe {
    String nome;
    static int numCafe = 0;
    int numero;
    
    public Descafeinado(){
        super();
        nome = "> Cafe Decaffeinato Intenso.";
    }
    
    @Override
    public String tooString() {
        return new String("> O seu café Decaffeinato Intenso. Decaffeinato by Bruno ... the B side.");
    }
    
    public void informacao() {
        super.informacao();
    }
    
    public void lCapsulas(){
        System.out.println("> " + numero + " " + nome);
    }
    
}
