/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrollbar_package;
import abstract_factory_pattern.ScrollBar;
/**
 *
 * @author Bhavik
 */
public class MAC_Scrollbar extends ScrollBar
{

    public MAC_Scrollbar(String args) 
    {
        System.out.println("A MAC "+args+"Scrollbar object is used");
    }
    
    @Override
    public void operation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
