/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author otero.haritz
 */
public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        anadirActionListener(this);
    }

    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonTxertatu.addActionListener(listener);
        view.jButtonHiztegiOsoa.addActionListener(listener);
        view.jButtonIrten.addActionListener(listener);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                System.out.println("TXERTATU botoia sakatu duzu");
                Terminoa t = new Terminoa(0, view.jTextFieldEuskaraz.getText(), view.jTextFieldGazteleraz.getText());
                model.insert(t);
                view.jTextFieldEuskaraz.setText("");
                view.jTextFieldGazteleraz.setText("");

            case "HIZTEGI OSOA":
                model.selectAll();
                view.jDialogHiztegiaBistaratu.setVisible(true);
                view.jDialogHiztegiaBistaratu.setSize(600, 550);
                view.jTextAreaHiztegia.setText(model.imprimatuString());

            case "IRTEN":
                view.dispose();
                break;

        }
    }
}
