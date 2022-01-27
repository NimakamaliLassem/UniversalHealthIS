package GUI;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import system.UniverseHealth;
import system.UniverseHealthSys;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nima's Stuff
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
       // UniverseHealthSys.readFromBin();
       UniverseHealthSys.readFromFile();
        PostRFrame pf = new PostRFrame();
        pf.setLocationRelativeTo(null);
        pf.setSize(512, 387);
        pf.setVisible(true);
        
//        FileInputStream ofile = new FileInputStream("output.bin");
//        ObjectInputStream obj = new ObjectInputStream(ofile);
//        obj.readObject();
        


        // TODO code application logic here
    }
    
}
