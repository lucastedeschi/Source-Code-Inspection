/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class PapelMoedaTest {
    
    @Test
    public void testGetValor() {
       PapelMoeda pm = new PapelMoeda(100, 10);
       Assert.assertEquals(100, pm.getValor());
    }

    @Test
    public void testGetQuantidade() {
       PapelMoeda pm = new PapelMoeda(100, 10);
       Assert.assertEquals(10, pm.getQuantidade());
    }
    
}
