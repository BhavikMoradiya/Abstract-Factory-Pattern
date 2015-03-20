/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_package;
import abstract_factory_pattern.Menu;
/**
 *
 * @author Bhavik
 */
public class Metal_Menu extends Menu
{

    public Metal_Menu(String args) 
    {
        System.out.println(args);
    }
    
    @Override
    public void operation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
