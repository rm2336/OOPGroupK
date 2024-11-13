/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupk;

import Roko.CalculatorMenu;

/**
 *
 * @author rokom, tiernanm, alexm
 */
public class GroupK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu ourGUI = new MainMenu();
        CalculatorMenu rokosMenu = new CalculatorMenu();
        ourGUI.setCalculatorMenu(rokosMenu);
        rokosMenu.setMainMenu(ourGUI);
        ourGUI.setVisible(true);
    }
    
}
