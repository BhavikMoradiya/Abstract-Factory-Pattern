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
public class FactoryMaker 
{
   WidgetFactory wf = null;
   static WidgetFactory getFactory(String args)
   {
       if(args.equalsIgnoreCase("IBM"))
       {
           return new IBM();
       }
       else if(args.equalsIgnoreCase("MAC"))
       {
           return new MAC();
       }
       else if(args.equalsIgnoreCase("Metal"))
       {
           return new Metal();
       }
       else if(args.equalsIgnoreCase("Windows"))
       {
           return new Windows();
       }
       else if(args.equalsIgnoreCase("Unix"))
       {
           return new Unix();
       }
       return null;
   }
}
