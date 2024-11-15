/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package groupk;

import Roko.CalculatorEditor;
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
        // common menu
        MainMenu ourGUI = new MainMenu();
        // Roko's menu initialisation statements
        CalculatorMenu rokosMenu = new CalculatorMenu();
        CalculatorEditor rokosEditor = new CalculatorEditor();
        ourGUI.setCalculatorMenu(rokosMenu);
        rokosMenu.setMainMenu(ourGUI);
        rokosMenu.setCalcEditorMenu(rokosEditor);
        rokosEditor.setCalculatorMenu(rokosMenu);
        // render the GUI
        ourGUI.setVisible(true);
    }
    
}
