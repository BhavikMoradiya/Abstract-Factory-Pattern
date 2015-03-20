/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bhavik
 */
public class Abstract_Factory_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        start();
    }

    public static void start() {
        try {
            System.out.println("Please Enter your Look & Feel ");
            System.out.println("Select MAC & Windows & IBM & Metal & Unix");
            System.out.println("......................................");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Your Look & Feel");
            System.out.println("......................................");
            String s = br.readLine();

            WidgetFactory wf = FactoryMaker.getFactory(s);

            Window w = wf.createWindow();
            Button b = wf.createButton();
            Menu m = wf.createMenu();
            TextBox t = wf.creatTextBox();

            System.out.println("Do you want to add Scroll Bar ? YES/NO");
            System.out.println("......................................");
            String s1 = br.readLine();

            if (s1.equalsIgnoreCase("YES")) {
                System.out.println("Select Horizontal or Vertical ");
                System.out.println("......................................");
                String s4 = br.readLine();
                ScrollBar sb = wf.createScrollBar(s4);
                System.out.println("Thank You for Select  Do you want to change look and Feel ?? YES/NO ");
                System.out.println("......................................");
                String s2 = br.readLine();
                if (s2.equalsIgnoreCase("YES")) {
                    start();
                } else if (s2.equalsIgnoreCase("NO")) {
                    System.out.println("Thank You for Select");
                    System.out.println("......................................");
                } else {
                    System.out.println("Wrong Select");
                    System.out.println("......................................");
                }

            } else {
                System.out.println("Thank You for Select  Do you want to change look and Feel ?? YES/NO ");
                System.out.println("......................................");
                String s2 = br.readLine();
                if (s2.equalsIgnoreCase("YES")) {

                    start();
                } else {
                    System.out.println("Thank You for Select");
                    System.out.println("......................................");

                }

            }
        } catch (Exception e) {
            System.out.println("......................................");
            System.out.println("Wrong Selection");
            System.out.println("......................................");
            start();
        }

    }

}
