// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class cDialogoTransparencia extends JDialog
{
    private static final long serialVersionUID = 1L;
    JLabel et1;
    JTextField ct1;
    JButton aceptar;
    JButton cancelar;
    int cantTrans;
    
    public cDialogoTransparencia(final JFrame v, final boolean modal) {
        super(v, modal);
        this.setTitle("Transparencia");
        this.setSize(560, 60);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(this);
        this.et1 = new JLabel("Cantidad de Transparencia: ");
        this.ct1 = new JTextField(10);
        this.aceptar = new JButton("Aceptar");
        this.cancelar = new JButton("Cancelar");
        this.add(this.et1);
        this.add(this.ct1);
        this.add(this.aceptar);
        this.add(this.cancelar);
        this.aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                final String res = cDialogoTransparencia.this.ct1.getText();
                try {
                    cDialogoTransparencia.this.cantTrans = Integer.parseInt(res);
                }
                catch (NumberFormatException a) {
                    cDialogoTransparencia.this.cantTrans = 1;
                }
                cDialogoTransparencia.this.setVisible(false);
                cDialogoTransparencia.this.dispose();
            }
        });
        this.cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                cDialogoTransparencia.this.cantTrans = 1;
                cDialogoTransparencia.this.setVisible(false);
                cDialogoTransparencia.this.dispose();
            }
        });
        this.setDefaultCloseOperation(0);
    }
    
    public int mostrar() {
        this.setVisible(true);
        return this.cantTrans;
    }
}
