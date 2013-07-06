/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unb.carro.control;

import br.com.unb.carro.model.Motor;

/**
 *
 * @author Guilherme
 */
public class FabricadeMotores{
    
    
    public Motor fabricarMotor(int cilindrada)
    {
    	
        switch (cilindrada) {
		case 1000:
			return new Motor(cilindrada);
		
		case 1400:
			return new Motor(cilindrada);
			
		case 1600:
			return new Motor(cilindrada);
			
		default:
			return null;
		}
       
    }
    
    
    
    
    
    
    
}
