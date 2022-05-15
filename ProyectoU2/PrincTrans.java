// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.Action;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Component;
import javax.swing.KeyStroke;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.geom.Point2D;
import java.awt.Image;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class PrincTrans extends JPanel implements ActionListener, MouseWheelListener, KeyListener
{
    private static final long serialVersionUID = 1L;
    JFrame v;
    Figura2D F;
    JButton bEsc;
    JButton bDef;
    JButton bRes;
    JButton bRot;
    JButton bTras;
    JButton bRefx;
    JButton bRefy;
    JButton bRefxy;
    JMenuBar barraM;
    JMenu Menu1;
    JMenu Menu2;
    JMenu Menu3;
    JMenu subMenu3;
    JMenu subMenu23;
    JMenu Menu4;
    JMenuItem opcRest;
    JMenuItem opcEsc;
    JMenuItem opcRot;
    JMenuItem opcDef;
    JMenuItem opcRef;
    JMenuItem opcTras;
    JMenuItem opcSalir;
    JMenuItem opcDes;
    JMenuItem opcAyu;
    JMenuItem aniEsc;
    JMenuItem aniRotD;
    JMenuItem aniRotI;
    JMenuItem aniRef;
    JMenuItem aniRefx;
    JMenuItem aniRefy;
    JMenuItem aniRefxy;
    JMenuItem aniTras;
    JMenuItem aniChair;
    JMenuItem figuraUno;
    JMenuItem figuraDos;
    JMenuItem popRes;
    JToolBar barraH;
    JToolBar barraH2;
    JPopupMenu popup;
    int FiguraActual;
    Image imFondo;
    boolean bandera;
    static boolean mover;
    ayuda1 ayuda1;
    autores autores;
    teclas teclas;
    Point2D mouse;
    int ModoDePintado;
    int Grosor;
    int EstiloContorno;
    int EstiloPuntas;
    int preX;
    int preY;
    
    static {
        PrincTrans.mover = false;
    }
    
    public void crearMenu() {
        this.barraM = new JMenuBar();
        this.v.setJMenuBar(this.barraM);
        this.Menu1 = new JMenu("Transforamciones");
        this.Menu2 = new JMenu("Acerca de...");
        this.subMenu3 = new JMenu("Reflexiones");
        this.subMenu23 = new JMenu("Rotaciones");
        this.barraM.add(this.Menu1);
        this.barraM.add(this.Menu2);
        (this.opcRest = new JMenuItem("Restaurar")).setMnemonic('R');
        this.opcRest.setToolTipText("Restaura la figura a la original");
        URL rutaIm = this.getClass().getResource("/Unidad2/rec/rest.png");
        this.opcRest.setIcon(new ImageIcon(rutaIm));
        this.opcRest.setAccelerator(KeyStroke.getKeyStroke(82, 8));
        (this.opcEsc = new JMenuItem("Escalar")).setMnemonic('E');
        this.opcEsc.setToolTipText("Escala la figura al tama\ufffdo deseado");
        rutaIm = this.getClass().getResource("/Unidad2/rec/escala.png");
        this.opcEsc.setIcon(new ImageIcon(rutaIm));
        this.opcEsc.setAccelerator(KeyStroke.getKeyStroke(69, 8));
        (this.opcDef = new JMenuItem("Deformar")).setMnemonic('D');
        this.opcDef.setToolTipText("Deforma la figura al tama\ufffdo deseado");
        rutaIm = this.getClass().getResource("/Unidad2/rec/defo.gif");
        this.opcDef.setIcon(new ImageIcon(rutaIm));
        this.opcDef.setAccelerator(KeyStroke.getKeyStroke(68, 8));
        (this.opcRef = new JMenuItem("Refleccion")).setMnemonic('F');
        this.opcRef.setToolTipText("Reflecciona la imagen");
        rutaIm = this.getClass().getResource("/Unidad2/rec/refle1.png");
        this.opcRef.setIcon(new ImageIcon(rutaIm));
        this.opcRef.setAccelerator(KeyStroke.getKeyStroke(70, 8));
        (this.opcTras = new JMenuItem("Trasladar")).setMnemonic('T');
        this.opcTras.setToolTipText("Traslada la imagen a un punto");
        rutaIm = this.getClass().getResource("/Unidad2/rec/mov.png");
        this.opcTras.setIcon(new ImageIcon(rutaIm));
        this.opcTras.setAccelerator(KeyStroke.getKeyStroke(84, 8));
        this.Menu1.add(this.opcRest);
        this.Menu1.add(this.opcEsc);
        (this.opcRot = new JMenuItem("Rotacion")).setMnemonic('I');
        this.opcRot.setToolTipText("Rota la figuara en el sentido deseado");
        rutaIm = this.getClass().getResource("/Unidad2/rec/rotar.png");
        this.opcRot.setIcon(new ImageIcon(rutaIm));
        this.opcRot.setAccelerator(KeyStroke.getKeyStroke(73, 8));
        this.Menu1.add(this.opcRot);
        this.Menu1.add(this.opcDef);
        this.Menu1.add(this.opcRef);
        this.Menu1.add(this.opcTras);
        this.Menu1.addSeparator();
        (this.opcSalir = new JMenuItem("Salir")).setMnemonic('X');
        this.opcSalir.setToolTipText("Adioooooos");
        rutaIm = this.getClass().getResource("/Unidad2/rec/cerrar.jpeg");
        this.opcSalir.setIcon(new ImageIcon(rutaIm));
        this.Menu1.add(this.opcSalir);
        this.opcSalir.setAccelerator(KeyStroke.getKeyStroke(88, 8));
        (this.opcDes = new JMenuItem("Autores")).setMnemonic('A');
        this.opcDes.setToolTipText("Acerca de los creadores");
        rutaIm = this.getClass().getResource("/Unidad2/rec/trifuerza.png");
        this.opcDes.setIcon(new ImageIcon(rutaIm));
        this.opcDes.setAccelerator(KeyStroke.getKeyStroke(65, 8));
        (this.opcAyu = new JMenuItem("Ayuda")).setMnemonic('1');
        this.opcAyu.setToolTipText("Traslada la imagen a un punto");
        rutaIm = this.getClass().getResource("/Unidad2/rec/ayuda.png");
        this.opcAyu.setIcon(new ImageIcon(rutaIm));
        this.Menu2.add(this.opcDes);
        this.Menu2.add(this.opcAyu);
        this.opcAyu.setAccelerator(KeyStroke.getKeyStroke(49, 8));
        this.popup = new JPopupMenu();
        this.popRes = new JMenuItem("Restaurar");
        addPopup(this, this.popup);
        this.popup.add(this.popRes);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(final MouseEvent e) {
                final int cx = e.getX();
                final int cy = e.getY();
                final int X = (int)PrincTrans.this.F.list.get(0)[0];
                final int Y = (int)PrincTrans.this.F.list.get(0)[1];
                if (cx <= X && cy <= Y) {
                    PrincTrans.this.F.rotacion(-5);
                }
                else {
                    PrincTrans.this.F.rotacion(5);
                }
                PrincTrans.this.repaint();
            }
        });
        this.popRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                PrincTrans.this.F.restaurar();
                PrincTrans.this.F.DEFINIR_FIGURA();
                PrincTrans.this.repaint();
            }
        });
        rutaIm = this.getClass().getResource("/Unidad2/rec/fondoa.jpeg");
        this.imFondo = new ImageIcon(rutaIm).getImage();
        this.opcSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.exit(0);
            }
        });
        this.opcEsc.addActionListener(this);
        this.opcRest.addActionListener(this);
        this.opcRot.addActionListener(this);
        this.opcDef.addActionListener(this);
        this.opcRef.addActionListener(this);
        this.opcTras.addActionListener(this);
        this.opcAyu.addActionListener(this);
        this.opcDes.addActionListener(this);
        this.v.setFocusable(true);
        this.v.addKeyListener(this);
    }
    
    public void crearBarraH2() {
        this.barraH2 = new JToolBar("Editar Figura", 1);
        URL ruta = this.getClass().getResource("/Unidad2/rec/solido.jpeg");
        final Action A3 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 1;
                PrincTrans.this.F.CambioColor();
                PrincTrans.this.repaint();
            }
        };
        A3.putValue("ShortDescription", "Color Solido");
        final JButton CambiarColor = new JButton(A3);
        this.barraH2.add(CambiarColor);
        ruta = this.getClass().getResource("/Unidad2/rec/gradiante.jpeg");
        final Action A4 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 2;
                PrincTrans.this.F.Gradiente();
                PrincTrans.this.repaint();
            }
        };
        A4.putValue("ShortDescription", "Seleccionar colores para gradiante");
        final JButton CambiarGradiente = new JButton(A4);
        this.barraH2.add(CambiarGradiente);
        ruta = this.getClass().getResource("/Unidad2/rec/imagen.png");
        final Action A5 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 3;
                PrincTrans.this.F.FondoImagen();
                PrincTrans.this.repaint();
            }
        };
        A5.putValue("ShortDescription", "Elije una imagen de fondo");
        final JButton CambiarImagen = new JButton(A5);
        this.barraH2.add(CambiarImagen);
        ruta = this.getClass().getResource("/Unidad2/rec/transparencia.jpeg");
        final Action A6 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 4;
                final cDialogoTransparencia obj = new cDialogoTransparencia(PrincTrans.this.v, true);
                obj.mostrar();
                PrincTrans.this.F.CambiarTransparencia((float)obj.cantTrans);
                PrincTrans.this.repaint();
            }
        };
        A6.putValue("ShortDescription", "Elije los valores de transparencia");
        final JButton bA6 = new JButton(A6);
        this.barraH2.add(bA6);
        ruta = this.getClass().getResource("/Unidad2/rec/relleno.png");
        final Action A7 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 5;
                PrincTrans.this.repaint();
            }
        };
        A7.putValue("ShortDescription", "Regresar a la figura con relleno");
        final JButton bA7 = new JButton(A7);
        this.barraH2.add(bA7);
        ruta = this.getClass().getResource("/Unidad2/rec/scontorno.png");
        final Action A8 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 6;
                PrincTrans.this.repaint();
            }
        };
        A8.putValue("ShortDescription", "Quita relleno y pone relleno");
        final JButton bA8 = new JButton(A8);
        this.barraH2.add(bA8);
        ruta = this.getClass().getResource("/Unidad2/rec/rellenocon.png");
        final Action A9 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 7;
                PrincTrans.this.repaint();
            }
        };
        A9.putValue("ShortDescription", "Rellenar la figura con contorno");
        final JButton bA9 = new JButton(A9);
        this.barraH2.add(bA9);
        this.v.add(this.barraH2, "West");
        final JLabel Hueson = new JLabel("1", 0);
        ruta = this.getClass().getResource("/Unidad2/rec/flechab.jpeg");
        final Action A10 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                final PrincTrans this$0 = PrincTrans.this;
                --this$0.Grosor;
                if (PrincTrans.this.Grosor <= 0) {
                    PrincTrans.this.Grosor = 1;
                }
                Hueson.setText(new StringBuilder(String.valueOf(PrincTrans.this.Grosor)).toString());
                System.out.println(PrincTrans.this.Grosor);
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        A10.putValue("ShortDescription", "Mas contorno");
        final JPanel p = new JPanel(new GridLayout(1, 1));
        final JButton bA10 = new JButton(A10);
        ruta = this.getClass().getResource("/Unidad2/rec/flechaa.jpeg");
        final Action A11 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                final PrincTrans this$0 = PrincTrans.this;
                ++this$0.Grosor;
                if (PrincTrans.this.Grosor >= 15) {
                    PrincTrans.this.Grosor = 15;
                }
                Hueson.setText(new StringBuilder(String.valueOf(PrincTrans.this.Grosor)).toString());
                System.out.println(PrincTrans.this.Grosor);
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        final JButton b3 = new JButton(A11);
        b3.setIcon(new ImageIcon(ruta));
        final JPanel p2 = new JPanel(new GridLayout(2, 1));
        p2.add(b3);
        p2.add(bA10);
        p.add(Hueson);
        p.add(p2);
        this.barraH2.add(p);
        this.barraH2.setFloatable(false);
        this.v.add(this.barraH2, "West");
        A10.putValue("ShortDescription", "Menos contorno");
        ruta = this.getClass().getResource("/Unidad2/rec/l1.jpeg");
        final Action BotonStroke1 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                PrincTrans.this.EstiloContorno = 0;
                PrincTrans.this.EstiloPuntas = 2;
                PrincTrans.this.F.TipoContorno = 1;
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        final JButton opcion1 = new JButton(BotonStroke1);
        BotonStroke1.putValue("ShortDescription", "Quita esquinas");
        ruta = this.getClass().getResource("/Unidad2/rec/l2.jpeg");
        final Action BotonStroke2 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                PrincTrans.this.EstiloContorno = 2;
                PrincTrans.this.EstiloPuntas = 0;
                PrincTrans.this.F.TipoContorno = 1;
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        BotonStroke2.putValue("ShortDescription", "Puntea esquinas");
        final JButton opcion2 = new JButton(BotonStroke2);
        ruta = this.getClass().getResource("/Unidad2/rec/l3.jpeg");
        final Action BotonStroke3 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                PrincTrans.this.EstiloContorno = 1;
                PrincTrans.this.EstiloPuntas = 1;
                PrincTrans.this.F.TipoContorno = 1;
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        BotonStroke3.putValue("ShortDescription", "Redondea esquinas");
        final JButton opcion3 = new JButton(BotonStroke3);
        ruta = this.getClass().getResource("/Unidad2/rec/punteada.png");
        final Action BotonStroke4 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                PrincTrans.this.EstiloContorno = 1;
                PrincTrans.this.EstiloPuntas = 1;
                PrincTrans.this.F.TipoContorno = 2;
                PrincTrans.this.F.Contorno(PrincTrans.this.Grosor, PrincTrans.this.EstiloContorno, PrincTrans.this.EstiloPuntas);
                PrincTrans.this.repaint();
            }
        };
        final JButton opcion4 = new JButton(BotonStroke4);
        BotonStroke4.putValue("ShortDescription", "Puntea la imagen");
        ruta = this.getClass().getResource("/Unidad2/rec/contornocolor.jpeg");
        final Action CambioColorContorno = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.ModoDePintado = 8;
                PrincTrans.this.F.CambioColorContorno();
                PrincTrans.this.repaint();
            }
        };
        final JButton b4 = new JButton(CambioColorContorno);
        final JPanel p3 = new JPanel(new GridLayout(2, 2));
        p3.add(opcion1);
        p3.add(opcion2);
        p3.add(opcion3);
        p3.add(opcion4);
        this.barraH2.add(p3);
        this.barraH2.add(b4);
        this.barraH2.setFloatable(false);
        this.v.add(this.barraH2, "West");
        CambioColorContorno.putValue("ShortDescription", "Colorea el contorno");
    }
    
    public void crearBarraH() {
        this.barraH = new JToolBar("Operaciones", 1);
        URL ruta = this.getClass().getResource("/Unidad2/rec/rest.png");
        final Action A3 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.restaurar();
                PrincTrans.this.F.DEFINIR_FIGURA();
                PrincTrans.this.repaint();
            }
        };
        A3.putValue("ShortDescription", "Restaura a la figura original");
        final JButton bA3 = new JButton(A3);
        this.barraH.add(bA3);
        ruta = this.getClass().getResource("/Unidad2/rec/refx.png");
        final Action A4 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.reflexion(1.0, -1.0);
                PrincTrans.this.repaint();
            }
        };
        A4.putValue("ShortDescription", "Reflexion sobre el eje de las x");
        final JButton bA4 = new JButton(A4);
        this.barraH.add(bA4);
        ruta = this.getClass().getResource("/Unidad2/rec/refy.png");
        final Action A5 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.reflexion(-1.0, 1.0);
                PrincTrans.this.repaint();
            }
        };
        A5.putValue("ShortDescription", "Reflexion sobre el eje de las y");
        final JButton bA5 = new JButton(A5);
        this.barraH.add(bA5);
        ruta = this.getClass().getResource("/Unidad2/rec/refxy.png");
        final Action A6 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.reflexion(-1.0, -1.0);
                PrincTrans.this.repaint();
            }
        };
        A6.putValue("ShortDescription", "Reflexion sobre el eje de las xy");
        final JButton bA6 = new JButton(A6);
        this.barraH.add(bA6);
        ruta = this.getClass().getResource("/Unidad2/rec/zoomin.png");
        final Action A7 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.Escalar(1.1, 1.1);
                PrincTrans.this.repaint();
            }
        };
        A7.putValue("ShortDescription", "Incrementa el tama\ufffdo de la figura una cantidad definida");
        final JButton bA7 = new JButton(A7);
        this.barraH.add(bA7);
        ruta = this.getClass().getResource("/Unidad2/rec/zoomout.png");
        final Action A8 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.Escalar(0.9, 0.9);
                PrincTrans.this.repaint();
            }
        };
        A8.putValue("ShortDescription", "Disminuye el tama\ufffdo de la figura una cantidad definida");
        final JButton bA8 = new JButton(A8);
        this.barraH.add(bA8);
        ruta = this.getClass().getResource("/Unidad2/rec/rotari.png");
        final Action A9 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.rotacion(5);
                PrincTrans.this.repaint();
            }
        };
        A9.putValue("ShortDescription", "Rota 5 grados a la izquierda");
        final JButton bA9 = new JButton(A9);
        this.barraH.add(bA9);
        this.v.add(this.barraH, "East");
        ruta = this.getClass().getResource("/Unidad2/rec/rotard.png");
        final Action A10 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                PrincTrans.this.F.rotacion(-5);
                PrincTrans.this.repaint();
            }
        };
        A10.putValue("ShortDescription", "Rota 5 grados a la derecha");
        final JButton bA10 = new JButton(A10);
        this.barraH.add(bA10);
        this.barraH.setFloatable(false);
        this.v.add(this.barraH, "East");
        ruta = this.getClass().getResource("/Unidad2/rec/cerrar.jpeg");
        final Action A11 = new AbstractAction("", new ImageIcon(ruta)) {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                System.exit(0);
            }
        };
        A11.putValue("ShortDescription", "Adioooooooooos y gracias");
        final JButton bA11 = new JButton(A11);
        this.barraH.add(bA11);
    }
    
    public PrincTrans() {
        this.bandera = false;
        this.EstiloContorno = 1;
        this.EstiloPuntas = 1;
        this.preX = 0;
        this.preY = 0;
        (this.v = new JFrame("Transmormaciones en 2D")).setSize(1000, 600);
        this.setSize(1000, 600);
        this.v.setLocationRelativeTo(this);
        this.v.setResizable(false);
        this.crearMenu();
        this.crearBarraH();
        this.crearBarraH2();
        this.v.add(this);
        this.F = new Figura2D();
        this.addMouseWheelListener(this);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(final MouseEvent e) {
                PrincTrans.this.mouse = new Point2D.Double(e.getX(), e.getY());
                PrincTrans.this.F.trasladarRaton();
                PrincTrans.this.preX = (int)PrincTrans.this.F.list.get(0)[0];
                PrincTrans.this.preY = (int)PrincTrans.this.F.list.get(0)[1];
                System.out.println("Coordenadas previas " + PrincTrans.this.preX + " " + PrincTrans.this.preY);
                if (PrincTrans.this.F.s.contains(PrincTrans.this.mouse)) {
                    PrincTrans.this.F.trasladar(-PrincTrans.this.preX + e.getX(), -PrincTrans.this.preY + e.getY());
                    PrincTrans.mover = true;
                }
                else {
                    PrincTrans.mover = false;
                }
                PrincTrans.this.repaint();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(final MouseEvent e) {
                PrincTrans.this.F.trasladarRaton();
                PrincTrans.this.preX = (int)PrincTrans.this.F.list.get(0)[0];
                PrincTrans.this.preY = (int)PrincTrans.this.F.list.get(0)[1];
                if (PrincTrans.mover) {
                    System.out.println("Trasladar en x a: " + PrincTrans.this.preX);
                    System.out.println("Trasladar en y a: " + PrincTrans.this.preY);
                    PrincTrans.this.F.trasladar(-PrincTrans.this.preX + e.getX(), -PrincTrans.this.preY + e.getY());
                    PrincTrans.this.repaint();
                }
            }
        });
        this.v.setVisible(true);
        this.v.setDefaultCloseOperation(3);
    }
    
    @Override
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final int maxx = this.getWidth();
        final int maxy = this.getHeight();
        g.drawImage(this.imFondo, 0, 0, maxx, maxy, this);
        this.F.dibujar(g, this.ModoDePintado);
    }
    
    public static void main(final String[] args) {
        new PrincTrans();
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.opcEsc) {
            final cDialogEscalar L = new cDialogEscalar(this.v, true);
            final datosEsc res = L.mostrar();
            if (res != null) {
                this.F.Escalar(res.fx, res.fy);
            }
            this.repaint();
        }
        else if (e.getSource() == this.opcRest) {
            this.F.restaurar();
            this.F.DEFINIR_FIGURA();
            this.repaint();
        }
        else if (e.getSource() == this.opcRot) {
            final double[] res2 = new cDialogoRotacion(this.v, true).mostrar();
            if (res2 != null) {
                if (res2[0] == 0.0) {
                    this.F.rotacion((int)res2[1]);
                }
                else {
                    this.F.rotacion((int)res2[1]);
                }
            }
            this.repaint();
        }
        else if (e.getSource() == this.opcAyu) {
            this.ayuda1 = new ayuda1();
            this.ayuda1.v.setVisible(true);
            this.v.setVisible(false);
        }
        else if (e.getSource() == this.opcDes) {
            this.autores = new autores();
            this.autores.v.setVisible(true);
        }
        else if (e.getSource() == this.opcDef) {
            final cDialogoDeformar L2 = new cDialogoDeformar(this.v, true);
            final datosdef res3 = L2.mostrar();
            if (res3 != null) {
                this.F.deformar(res3.fx, res3.fy);
            }
            this.repaint();
        }
        else if (e.getSource() == this.opcRef) {
            final double[] res2 = new cDialogoReflexion(this.v, true).mostrar();
            if (res2 != null) {
                if (res2[0] == 0.0) {
                    this.F.reflexion((int)res2[1], (int)res2[2]);
                }
                else if (res2[0] == 1.0) {
                    this.F.reflexion((int)res2[0], (int)res2[1]);
                }
                else if (res2[0] == 2.0) {
                    this.F.reflexion((int)res2[1], (int)res2[2]);
                }
                else {
                    System.out.println("Algo salio bien mal we");
                }
                this.repaint();
            }
        }
        else if (e.getSource() == this.opcTras) {
            final cDialogoTrasladar res4 = new cDialogoTrasladar(this.v, true);
            res4.mostrar();
            this.F.trasladar((int)res4.cantTras1, (int)res4.cantTras2);
        }
        this.repaint();
    }
    
    @Override
    public void mouseWheelMoved(final MouseWheelEvent e) {
        final int rotacion = e.getWheelRotation();
        if (rotacion > 0) {
            this.F.Escalar(1.05, 1.05);
        }
        else {
            this.F.Escalar(0.95, 0.95);
        }
        this.repaint();
    }
    
    private static void addPopup(final Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(final MouseEvent e) {
                if (e.isPopupTrigger() && PrincTrans.mover) {
                    this.showMenu(e);
                }
            }
            
            @Override
            public void mouseReleased(final MouseEvent e) {
                if (e.isPopupTrigger() && PrincTrans.mover) {
                    this.showMenu(e);
                }
            }
            
            private void showMenu(final MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
    
    @Override
    public void keyTyped(final KeyEvent e) {
    }
    
    @Override
    public void keyPressed(final KeyEvent e) {
        this.teclas = new teclas();
        if (e.getKeyCode() == 112) {
            this.teclas.v.setVisible(true);
        }
    }
    
    @Override
    public void keyReleased(final KeyEvent e) {
    }
}
