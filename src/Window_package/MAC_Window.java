package Window_package;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import abstract_factory_pattern.Window;

/**
 *
 * @author Bhavik
 */
public class MAC_Window extends Window
{

    public MAC_Window(String args) 
    {
        System.out.println(args);
    }

    @Override
    public void operation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
