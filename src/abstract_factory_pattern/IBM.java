/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

import Window_package.IBM_Window;


/**
 *
 * @author Bhavik
 */
public class IBM extends WidgetFactory
{

    @Override
    Window createWindow() 
    {
        return new Window_package.IBM_Window("A IBM Window object is used");
    }

    @Override
    Button createButton() 
    {
        return new Button_package.IBM_Button("A IBM Button object is used");
    }

    @Override
    TextBox creatTextBox() 
    {
        return new Textbox_package.IBM_Textbox("A IBM TextBox object is used");
    }

    @Override
    Menu createMenu() 
    {
        return new Menu_package.IBM_Menu("A IBM Menu object is used");
    }

    @Override
    ScrollBar createScrollBar(String args) 
    {
        return new Scrollbar_package.IBM_Scrollbar(args);
    }
    
}
