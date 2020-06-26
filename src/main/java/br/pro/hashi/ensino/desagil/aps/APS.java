package br.pro.hashi.ensino.desagil.aps;

import br.pro.hashi.ensino.desagil.aps.model.*;
import br.pro.hashi.ensino.desagil.aps.view.View;

import javax.swing.*;
import java.util.LinkedList;

public class APS {
    public static void main(String[] args) {

        LinkedList<Gate> model = new LinkedList<>();
        model.add(new AndGate());
        model.add(new NandGate());
        model.add(new NotGate());
        model.add(new OrGate());
        model.add(new XorGate());
        model.add(new XnorGate());

        View view = new View(model); //conferir se o erro permanece após conclusão de View

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setContentPane(view); //conferir se o erro permanece após conclusão de View
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
