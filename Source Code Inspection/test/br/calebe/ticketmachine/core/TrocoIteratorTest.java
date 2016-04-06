/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class TrocoIteratorTest {

    @Test
    public void testHasNext() {
        Troco troco = new Troco(10);
        TrocoIterator ti = new TrocoIterator(troco);
        Assert.assertEquals(true, ti.hasNext());
    }
    
    @Test
    public void next(){
        Troco troco = new Troco(10);
        TrocoIterator ti = new TrocoIterator(troco);
        Assert.assertNotNull(ti.next());
    }
    
}
