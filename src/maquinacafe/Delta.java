/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricardopissarra
 */
public class Delta {
    
    private double agua;
    private int CURTO = 25;
    private int NORMAL = 40;
    ArrayList listaCafe = new ArrayList();
    
    
    public void Start() {
        Scanner input = new Scanner(System.in);
        String opcao = " ";
        do{
            
        System.out.println("Inserir comando: ");
        opcao = input.nextLine();
        if (opcao.contains("CAFE ESPRESSO")){
            cEspresso(opcao);
        } else if (opcao.contains("CAFE DECAFEINATO")){
            cDescafeinado(opcao);
        } else if(opcao.contains("CAFE LUNGO")){
            cLongo(opcao);
        }
        switch (opcao){
            case "ADD":
                System.out.println("Quantidade a adicionar?");
                double a = input.nextDouble();
                adicionarAgua(a);
                break;
            case "AGUA":
                nivelAgua();
                break;
            case "LISTAR":
                listarCafe();
                break;
            case "CURTO":
                cCurto();
                break;
            case "NORMAL":
                cNormal();
                break;
                
        }
        } while(!"sair".equals(opcao));
      
    }
    
    public void adicionarAgua (double valor){
        setAgua(valor);
    }
    
    public void cEspresso(String s) {

        CafeEspresso ce = new CafeEspresso();
        if (agua >= 25){
        agua = agua - 25;
        ce.setNome(s);
        ce.informacao();
        listaCafe.add(ce);} 
        else {

            System.out.println("> Não há água suficiente");
        }   
    }
    
    public void cDescafeinado(String s) {

        
        if (agua >= 25) {
        Descafeinado cd = new Descafeinado();
        agua = agua - 25;
        cd.setNome(s);
        cd.informacao();
        listaCafe.add(cd);
        } else {
            System.out.println("> Não há água suficiente");
        }
    }
    
    public void cLongo(String s) {
        Longo cl = new Longo();
        
        
        if (agua >= 40) {
            agua = agua -40;
            cl.setNome(s);
            cl.informacao();
            listaCafe.add(cl);
        } else {
            System.out.println("> Não há água suficiente");
        }

    }
    
    public void nivelAgua(){
       System.out.println("> o reservatorio tem " + getAgua() + " ml");
    }
    
    public void listarCafe(){
        for (int i = 0; i < listaCafe.size(); i++){
            Cafe c = (Cafe) listaCafe.get(i);
            c.lCapsulas();
        }
    }
            
    public void cCurto() {
        System.out.println("> " + CURTO + " ml");
    }
    
    public void cNormal() {
        System.out.println("> " + NORMAL + " ml");
    }
    
    /**
     * @return the agua
     */
    public double getAgua() {
        return agua;
    }

    /**
     * @param agua the agua to set
     */
    public void setAgua(double agua) {
        this.agua = agua;
    }
    
}
