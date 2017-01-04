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
public class FenetreQuitterApplication extends FenetreGenerale {

   private JOptionPane messageConseil = new JOptionPane();

    public FenetreQuitterApplication(FenetreParticipant participant){
        super("Quitter");
        this.setSize(300,200);
        if(messageConseil.showConfirmDialog(this,"Voulez-vous vraiment quitter ?","",YES_NO_OPTION) != JOptionPane.YES_OPTION)
            participant.setVisible(true);

    }

    /*public static void main(String[] args){
        new FenetreQuitterApplication();
    }*/
}
