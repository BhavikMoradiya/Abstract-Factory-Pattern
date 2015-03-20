/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

/**
 *
 * @author Bhavik
 */
public abstract class WidgetFactory 
{
    abstract Window createWindow();
    abstract Button createButton();
    abstract TextBox creatTextBox();
    abstract ScrollBar createScrollBar(String args);
    abstract Menu createMenu();
    
}
