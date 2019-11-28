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
    int CURTO = 25;
    int NORMAL = 40;
    ArrayList listaCafe = new ArrayList();
    CafeEspresso ce = new CafeEspresso();
    
    public void Start() {
        Scanner input = new Scanner(System.in);
        String opcao = " ";
        do{
            
        System.out.println("Inserir comando: ");
        opcao = input.next();
        switch (opcao){
            case "CAFE":
                System.out.println("Curto ou Normal?");
                String s = input.next();
                cEspresso(s);
                break;
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
                
        }
        } while(!"sair".equals(opcao));
    }
    
    public void adicionarAgua (double valor){
        setAgua(valor);
    }
    
    public void cEspresso(String s) {

        if(s.equalsIgnoreCase("curto")){
            if (agua >= 25){
            agua = agua - 25;
            ce.informacao();
            listaCafe.add(ce);} 
            else {
                System.out.println("> Não há água suficiente");
            }
        }else if(s.equalsIgnoreCase("normal")){
            if (agua >= 40){
            agua = agua -40;
            ce.informacao();
            listaCafe.add(ce);} 
            else {
                System.out.println("> Não há água suficiente");
            }
        } else {
                System.out.println("> Não é possivel satisfazer o seu pedido.");
        }
    }
    
    public void cDescafeinado(String s) {

        if(s.equalsIgnoreCase("curto")){
            if (agua >= 25) {
            Descafeinado cd = new Descafeinado();
            agua = agua - 25;
            cd.informacao();
            listaCafe.add(cd);
            } else {
                System.out.println("> Não há água suficiente");
            }
        }else if(s.equalsIgnoreCase("normal")){
            if (agua >= 40) {
            Descafeinado cd = new Descafeinado();
            agua = agua -40;
            cd.informacao();
            listaCafe.add(cd);
            } else {
                System.out.println("> Não há água suficiente");
            }
                
        } else {
                System.out.println("> Não é possivel satisfazer o seu pedido.");
        }
    }
    
    public void cLongo(String s) {
        Longo cl = new Longo();
        
        if(s.equalsIgnoreCase("curto")){
            if (agua >= 25) {
                agua = agua - 25;
                cl.informacao();
                listaCafe.add(cl);
            } else {
                System.out.println("> Não há água suficiente");
            }
        }else if(s.equalsIgnoreCase("normal")){
            if (agua >= 40) {
                agua = agua -40;
                cl.informacao();
                listaCafe.add(cl);
            } else {
                System.out.println("> Não há água suficiente");
            }
        } else {
                System.out.println("> Não é possivel satisfazer o seu pedido.");
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
            
    public int cCurto() {
        return CURTO;
    }
    
    public int cNormal() {
        return NORMAL;
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
