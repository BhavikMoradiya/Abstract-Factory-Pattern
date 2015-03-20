/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

import Window_package.Windows_Window;

/**
 *
 * @author Bhavik
 */
public class Windows extends WidgetFactory
{

    @Override
    Window createWindow() 
    {
        return new Windows_Window("A Windows Window object is used");
    }

    @Override
    Button createButton()
    {
        return new Button_package.Windows_Button("A Windows Button object is used");
    }

    @Override
    TextBox creatTextBox()
    {
       return new Textbox_package.Windows_Textbox("A Windows TextBox object is used");
    }

    @Override
    ScrollBar createScrollBar(String args) 
    {
        return new Scrollbar_package.Window_Scrollbar(args);
    }

    @Override
    Menu createMenu() 
    {
        return new Menu_package.Window_Menu("A Windows Menu object is used");
    }
    
}
