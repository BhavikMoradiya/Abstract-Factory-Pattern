/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

import Window_package.Unix_Window;

/**
 *
 * @author Bhavik
 */
public class Unix extends WidgetFactory
{

    @Override
    Window createWindow() 
    {
        return new Unix_Window("A Unix Window object is used");
    }

    @Override
    Button createButton()
    {
        return new Button_package.Unix_Button("A Unix Button object is used");
    }

    @Override
    TextBox creatTextBox() 
    {
       return new Textbox_package.Unix_Textbox("A Unix TextBox object is used");
    }

    @Override
    ScrollBar createScrollBar(String args) 
    {
        return new Scrollbar_package.Unix_Scrollbar(args);
    }

    @Override
    Menu createMenu() {
        return new Menu_package.Unix_Menu("A Unix Menu object is used");
    }
    
}
