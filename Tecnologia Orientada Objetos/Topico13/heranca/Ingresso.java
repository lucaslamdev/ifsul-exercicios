/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author lucas
 */
public class Ingresso {
    
    float valor;
    
    public Ingresso()
    {
        this.valor = 0.0F;
    }
    
    public void imprimeValor() {
         System.out.println("O valor do ingresso é " + this.valor);
    }
    
}
