/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;
import Window_package.MAC_Window;

/**
 *
 * @author Bhavik
 */
public class MAC extends WidgetFactory
{

    @Override
    Window createWindow() 
    {
        return new MAC_Window("A MAC Window object is used");
    }

    @Override
    Button createButton()
    {
        return new Button_package.MAC_Button("A MAC Button object is used");
    }

    @Override
    TextBox creatTextBox() 
    {
        return new Textbox_package.MAC_Textbox("A MAC TextBox object is used");
    }

    @Override
    ScrollBar createScrollBar(String args) 
    {
       return new Scrollbar_package.MAC_Scrollbar(args);
    }

    @Override
    Menu createMenu() 
    {
        return new Menu_package.MAC_Menu("A MAC Menu object is used");
    }
    
}
