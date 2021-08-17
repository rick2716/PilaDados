/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author betsy.moreno
 */
public class dados extends Base{
    
    private int valor_1;
    private int valor_2;

    public dados() {
    }

    public dados(int valor_1, int valor_2) {
        this.valor_1 = valor_1;
        this.valor_2 = valor_2;
    }
    
    
    

    /**
     * Get the value of valor_2
     *
     * @return the value of valor_2
     */
    public int getValor_2() {
        return valor_2;
    }

    /**
     * Set the value of valor_2
     *
     * @param valor_2 new value of valor_2
     */
    public void setValor_2(int valor_2) {
        this.valor_2 = valor_2;
    }

    

    /**
     * Get the value of valor_1
     *
     * @return the value of valor_1
     */
    public int getValor_1() {
        return valor_1;
    }

    /**
     * Set the value of valor_1
     *
     * @param valor_1 new value of valor_1
     */
    public void setValor_1(int valor_1) {
        this.valor_1 = valor_1;
    }

    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "dados{" + "valor_1=" + valor_1 + ", valor_2=" + valor_2 + '}';
    }

    
    

    
}
