/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

import Button_package.Metal_Button;
import Window_package.Metal_window;

/**
 *
 * @author Bhavik
 */
public class Metal extends WidgetFactory
{

    @Override
    Window createWindow() 
    {
        return new Metal_window("A Metal Window object is used");
    }

    @Override
    Button createButton()
    {
        return new Metal_Button("A Metal Button object is used");
    }

    @Override
    TextBox creatTextBox()
    {
       return new Textbox_package.Metal_Textbox("A Metal TextBox object is used");
    }

    @Override
    ScrollBar createScrollBar(String args)
    {
        return new Scrollbar_package.Metal_Scrollbar(args);
    }

    @Override
    Menu createMenu() 
    {
        return new Menu_package.Metal_Menu("A Metal Menu object is used");
    }
    
}
