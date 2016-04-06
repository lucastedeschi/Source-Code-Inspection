/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class TrocoTest {

    @Test
    public void testGetIterator() {
        Troco troco = new Troco(10);
        TrocoIterator ti = new TrocoIterator(troco);
        Assert.assertEquals(ti, troco.getIterator());
    }
    
}
