/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author 41406133
 */
public class TicketMachineTest {
    
    public void testInserir() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(5);
        int aux = tm.getSaldo();
        tm.inserir(10);
        Assert.assertTrue(aux < tm.getSaldo());
    }

    public void testGetSaldo() {
        TicketMachine tm = new TicketMachine(10);
        Assert.assertEquals(0, tm.getSaldo());
                
    }

    public void testImprimir() {
        TicketMachine tm = new TicketMachine(10);
        Assert.assertEquals("Saldo insuficiente!", "Saldo insuficiente!");
    }

}
