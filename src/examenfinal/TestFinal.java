/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examenfinal;

/**
 *
 * @author Unitec
 */
public class TestFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Starbucks caf01 = new Starbucks("estrella oro", "lomas", 96);
        Starbucks caf02 = new Starbucks("platina", "chapultepc", 250);
        
        System.out.println("cafeteria 1   "+caf01.getNombre()+" "+caf01.getDireccion()+" #"+caf01.getCapacidad());
        System.out.println("Cafeteria 2   "+caf02.getNombre()+" "+caf02.getDireccion()+" #"+caf02.getCapacidad());
        
    }
    
}
