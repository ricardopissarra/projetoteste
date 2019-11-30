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
    private String nome;
    
    public Longo(){
        super();
    }
    
    @Override
    public String tooString() {
        return new String("> O seu " + nome +". Lungo by Elisabetta ... who else.");
    }
    
    public void informacao() {
        super.informacao();
    }
    
    public void lCapsulas(){
        System.out.println("> " + numero + " " + nome);
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
