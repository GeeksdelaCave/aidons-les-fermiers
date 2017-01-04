package marche.affichage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 * Created by Thibaud on 04/01/2017.
 */
public class FenetreQuitterApplication extends JFrame {

   private JOptionPane messageConseil = new JOptionPane();

    public FenetreQuitterApplication(){
        super();
        this.setSize(300,200);
        messageConseil.showConfirmDialog(this,"Voulez-vous vraiment quitter ?","Quitter",YES_NO_OPTION);
    }

    /*public static void main(String[] args){
        new FenetreQuitterApplication();
    }*/
}
