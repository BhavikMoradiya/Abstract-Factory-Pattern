/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Button_package;
import abstract_factory_pattern.Button;
/**
 *
 * @author Bhavik
 */
public class MAC_Button extends Button
{

    public MAC_Button(String args)
    {
        System.out.println(args);
    }
    

    @Override
    public void operation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
