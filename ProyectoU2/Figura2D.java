// 
// Decompiled by Procyon v0.5.36
// 

package ProyectoU2;

import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import java.awt.Component;
import java.awt.geom.PathIterator;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import javax.swing.JColorChooser;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class Figura2D
{
    GeneralPath figura;
    Shape s;
    AffineTransform at;
    Graphics2D g2;
    Color color;
    Color color1;
    Color color2;
    Color color3;
    int Transparencia;
    int Grosor;
    int EstiloContorno;
    int EstiloPuntas;
    int RellenoVacio;
    int TipoContorno;
    int RellenoPrevio;
    ArrayList<float[]> list;
    JColorChooser elige;
    BufferedImage slate;
    TexturePaint slatetp;
    
    public Figura2D() {
        this.Transparencia = 255;
        this.TipoContorno = 1;
        this.figura = new GeneralPath();
        this.s = this.figura;
        this.at = new AffineTransform();
        this.DEFINIR_FIGURA();
        this.color = Color.black;
        System.out.println("Constructor de figura2D");
    }
    
    public void DEFINIR_FIGURA() {
        (this.figura = new GeneralPath()).moveTo(220.625, 338.0);
        this.figura.lineTo(230.57435607910156, 338.0);
        this.figura.lineTo(240.52371215820312, 338.0);
        this.figura.lineTo(250.47309112548828, 338.0);
        this.figura.lineTo(260.42244720458984, 338.0);
        this.figura.lineTo(270.3718032836914, 338.0);
        this.figura.lineTo(280.32118225097656, 338.0);
        this.figura.lineTo(290.2705383300781, 338.0);
        this.figura.lineTo(300.2198944091797, 338.0);
        this.figura.lineTo(310.16925048828125, 338.0);
        this.figura.lineTo(320.1186065673828, 338.0);
        this.figura.lineTo(330.06798553466797, 338.0);
        this.figura.lineTo(340.01734161376953, 338.0);
        this.figura.lineTo(349.9667205810547, 338.0);
        this.figura.lineTo(359.91607666015625, 338.0);
        this.figura.lineTo(369.8654327392578, 338.0);
        this.figura.lineTo(379.8147888183594, 338.0);
        this.figura.lineTo(389.76414489746094, 338.0);
        this.figura.lineTo(399.7135009765625, 338.0);
        this.figura.lineTo(409.66290283203125, 338.0);
        this.figura.lineTo(419.6122131347656, 338.0);
        this.figura.lineTo(429.5616149902344, 338.0);
        this.figura.lineTo(439.51097106933594, 338.0);
        this.figura.lineTo(449.4603271484375, 338.0);
        this.figura.lineTo(459.40968322753906, 338.0);
        this.figura.lineTo(469.3590393066406, 338.0);
        this.figura.lineTo(479.3084411621094, 338.0);
        this.figura.lineTo(474.43170166015625, 329.4423370361328);
        this.figura.lineTo(469.4551239013672, 320.82706451416016);
        this.figura.lineTo(464.47850036621094, 312.2117691040039);
        this.figura.lineTo(459.5019226074219, 303.59645080566406);
        this.figura.lineTo(454.5252990722656, 294.9811782836914);
        this.figura.lineTo(449.5486755371094, 286.36590576171875);
        this.figura.lineTo(444.5720977783203, 277.7506103515625);
        this.figura.lineTo(439.59547424316406, 269.13531494140625);
        this.figura.lineTo(434.618896484375, 260.52001953125);
        this.figura.lineTo(429.64227294921875, 251.90472412109375);
        this.figura.lineTo(424.6656951904297, 243.2894515991211);
        this.figura.lineTo(419.68907165527344, 234.67413330078125);
        this.figura.lineTo(414.7124938964844, 226.0588607788086);
        this.figura.lineTo(409.7358703613281, 217.44358825683594);
        this.figura.lineTo(404.75929260253906, 208.8282928466797);
        this.figura.lineTo(399.7826919555664, 200.21299743652344);
        this.figura.lineTo(394.80606842041016, 191.5976791381836);
        this.figura.lineTo(389.8294677734375, 182.98238372802734);
        this.figura.lineTo(384.85286712646484, 174.3671112060547);
        this.figura.lineTo(379.8762664794922, 165.75181579589844);
        this.figura.lineTo(374.89966583251953, 157.13653182983398);
        this.figura.lineTo(369.9230651855469, 148.52124786376953);
        this.figura.lineTo(364.9464645385742, 139.90596389770508);
        this.figura.lineTo(359.96986389160156, 131.29067993164062);
        this.figura.lineTo(354.9932403564453, 122.67535018920898);
        this.figura.lineTo(350.01663970947266, 114.06006622314453);
        this.figura.lineTo(345.0400390625, 122.61775207519531);
        this.figura.lineTo(340.06346130371094, 131.23302459716797);
        this.figura.lineTo(335.0868606567383, 139.84832000732422);
        this.figura.lineTo(330.1102600097656, 148.46360397338867);
        this.figura.lineTo(325.13365936279297, 157.07888793945312);
        this.figura.lineTo(320.1570587158203, 165.69417190551758);
        this.figura.lineTo(315.18043518066406, 174.30950164794922);
        this.figura.lineTo(310.2038345336914, 182.92478561401367);
        this.figura.lineTo(305.22723388671875, 191.54006958007812);
        this.figura.lineTo(300.2506332397461, 200.15535354614258);
        this.figura.lineTo(295.27403259277344, 208.77063751220703);
        this.figura.lineTo(290.2974319458008, 217.3859100341797);
        this.figura.lineTo(285.3208312988281, 226.00120544433594);
        this.figura.lineTo(280.34423065185547, 234.6165008544922);
        this.figura.lineTo(275.3676300048828, 243.23181915283203);
        this.figura.lineTo(270.39100646972656, 251.84711456298828);
        this.figura.lineTo(265.4144287109375, 260.46238708496094);
        this.figura.lineTo(260.43782806396484, 269.0776824951172);
        this.figura.lineTo(255.4612274169922, 277.69295501708984);
        this.figura.lineTo(250.48462677001953, 286.3082504272461);
        this.figura.lineTo(245.50802612304688, 294.92352294921875);
        this.figura.lineTo(240.53142547607422, 303.538818359375);
        this.figura.lineTo(235.55480194091797, 312.15413665771484);
        this.figura.lineTo(230.5782012939453, 320.7694320678711);
        this.figura.lineTo(225.60160064697266, 329.38470458984375);
        this.figura.lineTo(70.625, 597.78125);
        this.figura.lineTo(80.57435607910156, 597.78125);
        this.figura.lineTo(90.52371215820312, 597.78125);
        this.figura.lineTo(100.47309112548828, 597.78125);
        this.figura.lineTo(110.42244720458984, 597.78125);
        this.figura.lineTo(120.3718032836914, 597.78125);
        this.figura.lineTo(130.32118225097656, 597.78125);
        this.figura.lineTo(140.27053833007812, 597.78125);
        this.figura.lineTo(150.2198944091797, 597.78125);
        this.figura.lineTo(160.16925048828125, 597.78125);
        this.figura.lineTo(170.1186180114746, 597.78125);
        this.figura.lineTo(180.06798553466797, 597.78125);
        this.figura.lineTo(190.01734161376953, 597.78125);
        this.figura.lineTo(199.9667091369629, 597.78125);
        this.figura.lineTo(209.91606521606445, 597.78125);
        this.figura.lineTo(219.8654327392578, 597.78125);
        this.figura.lineTo(229.81478881835938, 597.78125);
        this.figura.lineTo(239.76414489746094, 597.78125);
        this.figura.lineTo(249.7135009765625, 597.78125);
        this.figura.lineTo(259.66287994384766, 597.78125);
        this.figura.lineTo(269.6122360229492, 597.78125);
        this.figura.lineTo(279.5615921020508, 597.78125);
        this.figura.lineTo(289.51097106933594, 597.78125);
        this.figura.lineTo(299.4603271484375, 597.78125);
        this.figura.lineTo(309.40968322753906, 597.78125);
        this.figura.lineTo(319.3590393066406, 597.78125);
        this.figura.lineTo(329.3084182739258, 597.78125);
        this.figura.lineTo(324.43170166015625, 589.2235870361328);
        this.figura.lineTo(319.4551239013672, 580.6083374023438);
        this.figura.lineTo(314.47850036621094, 571.9930419921875);
        this.figura.lineTo(309.5018997192383, 563.3777008056641);
        this.figura.lineTo(304.5252990722656, 554.762451171875);
        this.figura.lineTo(299.54869842529297, 546.1471557617188);
        this.figura.lineTo(294.5720977783203, 537.5318603515625);
        this.figura.lineTo(289.59549713134766, 528.9165649414062);
        this.figura.lineTo(284.618896484375, 520.30126953125);
        this.figura.lineTo(279.64229583740234, 511.68597412109375);
        this.figura.lineTo(274.6656951904297, 503.0706787109375);
        this.figura.lineTo(269.68907165527344, 494.45538330078125);
        this.figura.lineTo(264.7124938964844, 485.840087890625);
        this.figura.lineTo(259.7358932495117, 477.22483825683594);
        this.figura.lineTo(254.75929260253906, 468.6095428466797);
        this.figura.lineTo(249.7826919555664, 459.99424743652344);
        this.figura.lineTo(244.80606842041016, 451.37890625);
        this.figura.lineTo(239.8294677734375, 442.76365661621094);
        this.figura.lineTo(234.85286712646484, 434.1483612060547);
        this.figura.lineTo(229.8762664794922, 425.53306579589844);
        this.figura.lineTo(224.89966583251953, 416.9177703857422);
        this.figura.lineTo(219.92306518554688, 408.3025207519531);
        this.figura.lineTo(214.94646453857422, 399.6872253417969);
        this.figura.lineTo(209.96986389160156, 391.0719299316406);
        this.figura.lineTo(204.9932403564453, 382.4566116333008);
        this.figura.lineTo(200.01665115356445, 373.84131622314453);
        this.figura.lineTo(195.0400505065918, 382.3990020751953);
        this.figura.lineTo(190.06344985961914, 391.01427459716797);
        this.figura.lineTo(185.08686065673828, 399.6295700073242);
        this.figura.lineTo(180.11026000976562, 408.2448425292969);
        this.figura.lineTo(175.13365936279297, 416.8601379394531);
        this.figura.lineTo(170.1570587158203, 425.4754333496094);
        this.figura.lineTo(165.18043518066406, 434.0907287597656);
        this.figura.lineTo(160.2038345336914, 442.7060241699219);
        this.figura.lineTo(155.22723388671875, 451.3213195800781);
        this.figura.lineTo(150.2506332397461, 459.9366149902344);
        this.figura.lineTo(145.27403259277344, 468.5519104003906);
        this.figura.lineTo(140.29743194580078, 477.1671600341797);
        this.figura.lineTo(135.32083129882812, 485.78245544433594);
        this.figura.lineTo(130.34423065185547, 494.3977508544922);
        this.figura.lineTo(125.36761856079102, 503.0130920410156);
        this.figura.lineTo(120.39101791381836, 511.6283416748047);
        this.figura.lineTo(115.4144172668457, 520.2436370849609);
        this.figura.lineTo(110.43781661987305, 528.8589324951172);
        this.figura.lineTo(105.46121597290039, 537.4742279052734);
        this.figura.lineTo(100.48461532592773, 546.0894775390625);
        this.figura.lineTo(95.50802040100098, 554.7047729492188);
        this.figura.lineTo(90.53141975402832, 563.320068359375);
        this.figura.lineTo(85.55479621887207, 571.9354095458984);
        this.figura.lineTo(80.57820129394531, 580.5506591796875);
        this.figura.lineTo(75.60160064697266, 589.1659545898438);
        this.figura.lineTo(370.625, 597.78125);
        this.figura.lineTo(380.7035827636719, 597.78125);
        this.figura.lineTo(390.78214263916016, 597.78125);
        this.figura.lineTo(400.86072540283203, 597.78125);
        this.figura.lineTo(410.9392852783203, 597.78125);
        this.figura.lineTo(421.0178680419922, 597.78125);
        this.figura.lineTo(431.09645080566406, 597.78125);
        this.figura.lineTo(441.17503356933594, 597.78125);
        this.figura.lineTo(451.2535705566406, 597.78125);
        this.figura.lineTo(461.3321533203125, 597.78125);
        this.figura.lineTo(471.4107360839844, 597.78125);
        this.figura.lineTo(481.48931884765625, 597.78125);
        this.figura.lineTo(491.5679016113281, 597.78125);
        this.figura.lineTo(501.646484375, 597.78125);
        this.figura.lineTo(511.7250671386719, 597.78125);
        this.figura.lineTo(521.8036041259766, 597.78125);
        this.figura.lineTo(531.8821868896484, 597.78125);
        this.figura.lineTo(541.9607696533203, 597.78125);
        this.figura.lineTo(552.0393524169922, 597.78125);
        this.figura.lineTo(562.1178894042969, 597.78125);
        this.figura.lineTo(572.1964721679688, 597.78125);
        this.figura.lineTo(582.2750549316406, 597.78125);
        this.figura.lineTo(592.3536376953125, 597.78125);
        this.figura.lineTo(602.4322204589844, 597.78125);
        this.figura.lineTo(612.5108032226562, 597.78125);
        this.figura.lineTo(622.5893859863281, 597.78125);
        this.figura.lineTo(627.7278747558594, 594.9298400878906);
        this.figura.lineTo(622.6866607666016, 586.2026672363281);
        this.figura.lineTo(617.6454467773438, 577.4754943847656);
        this.figura.lineTo(612.6041870117188, 568.7483215332031);
        this.figura.lineTo(607.5629730224609, 560.0211029052734);
        this.figura.lineTo(602.5217590332031, 551.2939300537109);
        this.figura.lineTo(597.4804992675781, 542.5667572021484);
        this.figura.lineTo(592.4392852783203, 533.8395843505859);
        this.figura.lineTo(587.3980255126953, 525.1124114990234);
        this.figura.lineTo(582.3568115234375, 516.3852386474609);
        this.figura.lineTo(577.3155517578125, 507.65802001953125);
        this.figura.lineTo(572.2743377685547, 498.93084716796875);
        this.figura.lineTo(567.2331237792969, 490.20367431640625);
        this.figura.lineTo(562.1918640136719, 481.47650146484375);
        this.figura.lineTo(557.1506042480469, 472.74932861328125);
        this.figura.lineTo(552.1093902587891, 464.02215576171875);
        this.figura.lineTo(547.0681762695312, 455.29498291015625);
        this.figura.lineTo(542.0269165039062, 446.56781005859375);
        this.figura.lineTo(536.9857025146484, 437.84063720703125);
        this.figura.lineTo(531.9444427490234, 429.11346435546875);
        this.figura.lineTo(526.9032287597656, 420.38624572753906);
        this.figura.lineTo(521.8620147705078, 411.65911865234375);
        this.figura.lineTo(516.8207550048828, 402.93192291259766);
        this.figura.lineTo(511.779541015625, 394.20475006103516);
        this.figura.lineTo(506.73828125, 385.47755432128906);
        this.figura.lineTo(501.6970672607422, 376.75038146972656);
        this.figura.lineTo(496.6558532714844, 379.6018371582031);
        this.figura.lineTo(491.6145935058594, 388.32898712158203);
        this.figura.lineTo(486.57337951660156, 397.05615997314453);
        this.figura.lineTo(481.53216552734375, 405.7833557128906);
        this.figura.lineTo(476.49090576171875, 414.5105285644531);
        this.figura.lineTo(471.44964599609375, 423.2377014160156);
        this.figura.lineTo(466.40843200683594, 431.9648742675781);
        this.figura.lineTo(461.3672180175781, 440.6920471191406);
        this.figura.lineTo(456.3259582519531, 449.4192199707031);
        this.figura.lineTo(451.2847442626953, 458.1463928222656);
        this.figura.lineTo(446.2434844970703, 466.8736114501953);
        this.figura.lineTo(441.2022705078125, 475.6007843017578);
        this.figura.lineTo(436.1610565185547, 484.3279113769531);
        this.figura.lineTo(431.1197967529297, 493.0551300048828);
        this.figura.lineTo(426.0785827636719, 501.7823028564453);
        this.figura.lineTo(421.0373229980469, 510.5094757080078);
        this.figura.lineTo(415.99610900878906, 519.2366485595703);
        this.figura.lineTo(410.95489501953125, 527.9638214111328);
        this.figura.lineTo(405.91363525390625, 536.6909942626953);
        this.figura.lineTo(400.87239837646484, 545.4181671142578);
        this.figura.lineTo(395.83116149902344, 554.1453857421875);
        this.figura.lineTo(390.78992462158203, 562.87255859375);
        this.figura.lineTo(385.7486877441406, 571.5997314453125);
        this.figura.lineTo(380.7074737548828, 580.326904296875);
        this.figura.lineTo(375.6662368774414, 589.0540771484375);
        final Color black = Color.black;
        this.color3 = black;
        this.color2 = black;
        this.color1 = black;
        this.color = black;
        this.Transparencia = 255;
        this.s = this.figura;
    }
    
    public void dibujar(final Graphics g, final int ModoDePintado) {
        this.g2 = (Graphics2D)g;
        this.trasladarRaton();
        if (ModoDePintado == 1) {
            this.Transparencia = 255;
            this.g2.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), this.Transparencia));
            this.g2.fill(this.s);
            this.RellenoPrevio = 1;
            this.RellenoVacio = 0;
        }
        else if (ModoDePintado == 2) {
            this.Transparencia = 255;
            this.g2.setPaint(new GradientPaint(new Point((int)this.list.get(0)[0], (int)this.list.get(0)[1]), new Color(this.color1.getRed(), this.color1.getGreen(), this.color1.getBlue(), this.Transparencia), new Point((int)this.list.get(this.list.size() - 1)[0], (int)this.list.get(this.list.size() - 1)[1]), new Color(this.color2.getRed(), this.color2.getGreen(), this.color2.getBlue(), this.Transparencia)));
            this.g2.fill(this.s);
            this.RellenoPrevio = 2;
            this.RellenoVacio = 0;
        }
        else if (ModoDePintado == 3) {
            this.Transparencia = 255;
            this.g2.setPaint(this.slatetp);
            this.g2.fill(this.s);
            this.RellenoPrevio = 3;
            this.RellenoVacio = 0;
        }
        else if (ModoDePintado == 4) {
            this.Relleno(this.g2, ModoDePintado);
            this.RellenoVacio = 0;
            this.g2.fill(this.s);
        }
        else if (ModoDePintado == 5) {
            this.g2.setColor(this.color);
            this.RellenoVacio = 0;
            this.Relleno(this.g2, ModoDePintado);
        }
        else if (ModoDePintado == 6) {
            this.PonerContorno(this.g2);
            this.g2.setColor(this.color3);
            this.g2.draw(this.s);
            this.RellenoVacio = 1;
        }
        else if (ModoDePintado == 7) {
            this.g2.setColor(this.color3);
            this.PonerContorno(this.g2);
            this.g2.draw(this.s);
            this.Relleno(this.g2, ModoDePintado);
            this.RellenoVacio = 0;
        }
        else if (ModoDePintado == 8) {
            this.PonerContorno(this.g2);
            this.g2.setColor(this.color3);
            this.g2.draw(this.s);
            this.Relleno(this.g2, ModoDePintado);
        }
        else {
            this.g2.setColor(this.color);
            this.g2.fill(this.s);
            this.RellenoPrevio = 1;
        }
    }
    
    public void Relleno(final Graphics2D g2, final int ModoDePintado) {
        if (ModoDePintado == 8 && this.RellenoVacio == 1) {
            g2.setPaint(new GradientPaint(new Point((int)this.list.get(0)[0], (int)this.list.get(0)[1]), new Color(this.color1.getRed(), this.color1.getGreen(), this.color1.getBlue(), 0), new Point((int)this.list.get(this.list.size() - 1)[0], (int)this.list.get(this.list.size() - 1)[1]), new Color(this.color2.getRed(), this.color2.getGreen(), this.color2.getBlue(), 0)));
            g2.fill(this.s);
        }
        else if (this.RellenoPrevio == 1) {
            g2.setColor(new Color(this.color.getRed(), this.color.getGreen(), this.color.getBlue(), this.Transparencia));
            g2.fill(this.s);
        }
        else if (this.RellenoPrevio == 2) {
            g2.setPaint(new GradientPaint(new Point((int)this.list.get(0)[0], (int)this.list.get(0)[1]), new Color(this.color1.getRed(), this.color1.getGreen(), this.color1.getBlue(), this.Transparencia), new Point((int)this.list.get(this.list.size() - 1)[0], (int)this.list.get(this.list.size() - 1)[1]), new Color(this.color2.getRed(), this.color2.getGreen(), this.color2.getBlue(), this.Transparencia)));
            g2.fill(this.s);
        }
        else if (this.RellenoPrevio == 3) {
            g2.setPaint(this.slatetp);
            g2.fill(this.s);
        }
        else {
            g2.setColor(this.color);
            g2.fill(this.s);
        }
    }
    
    public void PonerContorno(final Graphics2D g2) {
        if (this.TipoContorno == 1) {
            g2.setStroke(new BasicStroke((float)this.Grosor, this.EstiloContorno, this.EstiloPuntas));
        }
        else if (this.TipoContorno == 2) {
            g2.setStroke(new BasicStroke((float)this.Grosor, this.EstiloContorno, this.EstiloPuntas, 0.0f, new float[] { 10.0f, 10.0f }, 5.0f));
        }
        else {
            System.out.println("Contorno invalido");
        }
    }
    
    public void Escalar(final double escx, final double escy) {
        this.at.translate(this.s.getBounds2D().getCenterX(), this.s.getBounds2D().getCenterY());
        this.at.scale(escx, escy);
        this.at.translate(-this.s.getBounds2D().getCenterX(), -this.s.getBounds2D().getCenterY());
        this.s = this.at.createTransformedShape(this.s);
    }
    
    public void reflexion(final double rx, final double ry) {
        this.at.translate(this.s.getBounds2D().getCenterX(), this.s.getBounds2D().getCenterY());
        this.at.scale(rx, ry);
        this.at.translate(-this.s.getBounds2D().getCenterX(), -this.s.getBounds2D().getCenterY());
        this.s = this.at.createTransformedShape(this.s);
    }
    
    public void deformar(final double defx, final double defy) {
        this.at.translate(this.s.getBounds2D().getCenterX(), this.s.getBounds2D().getCenterY());
        this.at.shear(defx, defy);
        this.at.translate(-this.s.getBounds2D().getCenterX(), -this.s.getBounds2D().getCenterY());
        this.s = this.at.createTransformedShape(this.s);
    }
    
    public void trasladarRaton() {
        this.list = new ArrayList<float[]>();
        final PathIterator i = this.s.getPathIterator(null);
        while (!i.isDone()) {
            final float[] coords = new float[2];
            final int segType = i.currentSegment(coords);
            if (segType != 4) {
                this.list.add(coords);
            }
            i.next();
        }
        System.out.println(String.valueOf(this.list.get(0)[0]) + " " + this.list.get(0)[1]);
    }
    
    public void trasladar(final int tx, final int ty) {
        this.at.setToTranslation(tx, ty);
        this.s = this.at.createTransformedShape(this.s);
    }
    
    public void rotacion(final int grados) {
        final double gradoss = Math.toRadians(grados);
        this.at.setToRotation(gradoss, this.s.getBounds2D().getCenterX(), this.s.getBounds2D().getCenterY());
        this.s = this.at.createTransformedShape(this.s);
    }
    
    public void restaurar() {
        final GeneralPath f1 = new GeneralPath();
        this.figura.moveTo(220.625, 338.0);
        this.figura.lineTo(230.57435607910156, 338.0);
        this.figura.lineTo(240.52371215820312, 338.0);
        this.figura.lineTo(250.47309112548828, 338.0);
        this.figura.lineTo(260.42244720458984, 338.0);
        this.figura.lineTo(270.3718032836914, 338.0);
        this.figura.lineTo(280.32118225097656, 338.0);
        this.figura.lineTo(290.2705383300781, 338.0);
        this.figura.lineTo(300.2198944091797, 338.0);
        this.figura.lineTo(310.16925048828125, 338.0);
        this.figura.lineTo(320.1186065673828, 338.0);
        this.figura.lineTo(330.06798553466797, 338.0);
        this.figura.lineTo(340.01734161376953, 338.0);
        this.figura.lineTo(349.9667205810547, 338.0);
        this.figura.lineTo(359.91607666015625, 338.0);
        this.figura.lineTo(369.8654327392578, 338.0);
        this.figura.lineTo(379.8147888183594, 338.0);
        this.figura.lineTo(389.76414489746094, 338.0);
        this.figura.lineTo(399.7135009765625, 338.0);
        this.figura.lineTo(409.66290283203125, 338.0);
        this.figura.lineTo(419.6122131347656, 338.0);
        this.figura.lineTo(429.5616149902344, 338.0);
        this.figura.lineTo(439.51097106933594, 338.0);
        this.figura.lineTo(449.4603271484375, 338.0);
        this.figura.lineTo(459.40968322753906, 338.0);
        this.figura.lineTo(469.3590393066406, 338.0);
        this.figura.lineTo(479.3084411621094, 338.0);
        this.figura.lineTo(474.43170166015625, 329.4423370361328);
        this.figura.lineTo(469.4551239013672, 320.82706451416016);
        this.figura.lineTo(464.47850036621094, 312.2117691040039);
        this.figura.lineTo(459.5019226074219, 303.59645080566406);
        this.figura.lineTo(454.5252990722656, 294.9811782836914);
        this.figura.lineTo(449.5486755371094, 286.36590576171875);
        this.figura.lineTo(444.5720977783203, 277.7506103515625);
        this.figura.lineTo(439.59547424316406, 269.13531494140625);
        this.figura.lineTo(434.618896484375, 260.52001953125);
        this.figura.lineTo(429.64227294921875, 251.90472412109375);
        this.figura.lineTo(424.6656951904297, 243.2894515991211);
        this.figura.lineTo(419.68907165527344, 234.67413330078125);
        this.figura.lineTo(414.7124938964844, 226.0588607788086);
        this.figura.lineTo(409.7358703613281, 217.44358825683594);
        this.figura.lineTo(404.75929260253906, 208.8282928466797);
        this.figura.lineTo(399.7826919555664, 200.21299743652344);
        this.figura.lineTo(394.80606842041016, 191.5976791381836);
        this.figura.lineTo(389.8294677734375, 182.98238372802734);
        this.figura.lineTo(384.85286712646484, 174.3671112060547);
        this.figura.lineTo(379.8762664794922, 165.75181579589844);
        this.figura.lineTo(374.89966583251953, 157.13653182983398);
        this.figura.lineTo(369.9230651855469, 148.52124786376953);
        this.figura.lineTo(364.9464645385742, 139.90596389770508);
        this.figura.lineTo(359.96986389160156, 131.29067993164062);
        this.figura.lineTo(354.9932403564453, 122.67535018920898);
        this.figura.lineTo(350.01663970947266, 114.06006622314453);
        this.figura.lineTo(345.0400390625, 122.61775207519531);
        this.figura.lineTo(340.06346130371094, 131.23302459716797);
        this.figura.lineTo(335.0868606567383, 139.84832000732422);
        this.figura.lineTo(330.1102600097656, 148.46360397338867);
        this.figura.lineTo(325.13365936279297, 157.07888793945312);
        this.figura.lineTo(320.1570587158203, 165.69417190551758);
        this.figura.lineTo(315.18043518066406, 174.30950164794922);
        this.figura.lineTo(310.2038345336914, 182.92478561401367);
        this.figura.lineTo(305.22723388671875, 191.54006958007812);
        this.figura.lineTo(300.2506332397461, 200.15535354614258);
        this.figura.lineTo(295.27403259277344, 208.77063751220703);
        this.figura.lineTo(290.2974319458008, 217.3859100341797);
        this.figura.lineTo(285.3208312988281, 226.00120544433594);
        this.figura.lineTo(280.34423065185547, 234.6165008544922);
        this.figura.lineTo(275.3676300048828, 243.23181915283203);
        this.figura.lineTo(270.39100646972656, 251.84711456298828);
        this.figura.lineTo(265.4144287109375, 260.46238708496094);
        this.figura.lineTo(260.43782806396484, 269.0776824951172);
        this.figura.lineTo(255.4612274169922, 277.69295501708984);
        this.figura.lineTo(250.48462677001953, 286.3082504272461);
        this.figura.lineTo(245.50802612304688, 294.92352294921875);
        this.figura.lineTo(240.53142547607422, 303.538818359375);
        this.figura.lineTo(235.55480194091797, 312.15413665771484);
        this.figura.lineTo(230.5782012939453, 320.7694320678711);
        this.figura.lineTo(225.60160064697266, 329.38470458984375);
        this.figura.lineTo(70.625, 597.78125);
        this.figura.lineTo(80.57435607910156, 597.78125);
        this.figura.lineTo(90.52371215820312, 597.78125);
        this.figura.lineTo(100.47309112548828, 597.78125);
        this.figura.lineTo(110.42244720458984, 597.78125);
        this.figura.lineTo(120.3718032836914, 597.78125);
        this.figura.lineTo(130.32118225097656, 597.78125);
        this.figura.lineTo(140.27053833007812, 597.78125);
        this.figura.lineTo(150.2198944091797, 597.78125);
        this.figura.lineTo(160.16925048828125, 597.78125);
        this.figura.lineTo(170.1186180114746, 597.78125);
        this.figura.lineTo(180.06798553466797, 597.78125);
        this.figura.lineTo(190.01734161376953, 597.78125);
        this.figura.lineTo(199.9667091369629, 597.78125);
        this.figura.lineTo(209.91606521606445, 597.78125);
        this.figura.lineTo(219.8654327392578, 597.78125);
        this.figura.lineTo(229.81478881835938, 597.78125);
        this.figura.lineTo(239.76414489746094, 597.78125);
        this.figura.lineTo(249.7135009765625, 597.78125);
        this.figura.lineTo(259.66287994384766, 597.78125);
        this.figura.lineTo(269.6122360229492, 597.78125);
        this.figura.lineTo(279.5615921020508, 597.78125);
        this.figura.lineTo(289.51097106933594, 597.78125);
        this.figura.lineTo(299.4603271484375, 597.78125);
        this.figura.lineTo(309.40968322753906, 597.78125);
        this.figura.lineTo(319.3590393066406, 597.78125);
        this.figura.lineTo(329.3084182739258, 597.78125);
        this.figura.lineTo(324.43170166015625, 589.2235870361328);
        this.figura.lineTo(319.4551239013672, 580.6083374023438);
        this.figura.lineTo(314.47850036621094, 571.9930419921875);
        this.figura.lineTo(309.5018997192383, 563.3777008056641);
        this.figura.lineTo(304.5252990722656, 554.762451171875);
        this.figura.lineTo(299.54869842529297, 546.1471557617188);
        this.figura.lineTo(294.5720977783203, 537.5318603515625);
        this.figura.lineTo(289.59549713134766, 528.9165649414062);
        this.figura.lineTo(284.618896484375, 520.30126953125);
        this.figura.lineTo(279.64229583740234, 511.68597412109375);
        this.figura.lineTo(274.6656951904297, 503.0706787109375);
        this.figura.lineTo(269.68907165527344, 494.45538330078125);
        this.figura.lineTo(264.7124938964844, 485.840087890625);
        this.figura.lineTo(259.7358932495117, 477.22483825683594);
        this.figura.lineTo(254.75929260253906, 468.6095428466797);
        this.figura.lineTo(249.7826919555664, 459.99424743652344);
        this.figura.lineTo(244.80606842041016, 451.37890625);
        this.figura.lineTo(239.8294677734375, 442.76365661621094);
        this.figura.lineTo(234.85286712646484, 434.1483612060547);
        this.figura.lineTo(229.8762664794922, 425.53306579589844);
        this.figura.lineTo(224.89966583251953, 416.9177703857422);
        this.figura.lineTo(219.92306518554688, 408.3025207519531);
        this.figura.lineTo(214.94646453857422, 399.6872253417969);
        this.figura.lineTo(209.96986389160156, 391.0719299316406);
        this.figura.lineTo(204.9932403564453, 382.4566116333008);
        this.figura.lineTo(200.01665115356445, 373.84131622314453);
        this.figura.lineTo(195.0400505065918, 382.3990020751953);
        this.figura.lineTo(190.06344985961914, 391.01427459716797);
        this.figura.lineTo(185.08686065673828, 399.6295700073242);
        this.figura.lineTo(180.11026000976562, 408.2448425292969);
        this.figura.lineTo(175.13365936279297, 416.8601379394531);
        this.figura.lineTo(170.1570587158203, 425.4754333496094);
        this.figura.lineTo(165.18043518066406, 434.0907287597656);
        this.figura.lineTo(160.2038345336914, 442.7060241699219);
        this.figura.lineTo(155.22723388671875, 451.3213195800781);
        this.figura.lineTo(150.2506332397461, 459.9366149902344);
        this.figura.lineTo(145.27403259277344, 468.5519104003906);
        this.figura.lineTo(140.29743194580078, 477.1671600341797);
        this.figura.lineTo(135.32083129882812, 485.78245544433594);
        this.figura.lineTo(130.34423065185547, 494.3977508544922);
        this.figura.lineTo(125.36761856079102, 503.0130920410156);
        this.figura.lineTo(120.39101791381836, 511.6283416748047);
        this.figura.lineTo(115.4144172668457, 520.2436370849609);
        this.figura.lineTo(110.43781661987305, 528.8589324951172);
        this.figura.lineTo(105.46121597290039, 537.4742279052734);
        this.figura.lineTo(100.48461532592773, 546.0894775390625);
        this.figura.lineTo(95.50802040100098, 554.7047729492188);
        this.figura.lineTo(90.53141975402832, 563.320068359375);
        this.figura.lineTo(85.55479621887207, 571.9354095458984);
        this.figura.lineTo(80.57820129394531, 580.5506591796875);
        this.figura.lineTo(75.60160064697266, 589.1659545898438);
        this.figura.lineTo(370.625, 597.78125);
        this.figura.lineTo(380.7035827636719, 597.78125);
        this.figura.lineTo(390.78214263916016, 597.78125);
        this.figura.lineTo(400.86072540283203, 597.78125);
        this.figura.lineTo(410.9392852783203, 597.78125);
        this.figura.lineTo(421.0178680419922, 597.78125);
        this.figura.lineTo(431.09645080566406, 597.78125);
        this.figura.lineTo(441.17503356933594, 597.78125);
        this.figura.lineTo(451.2535705566406, 597.78125);
        this.figura.lineTo(461.3321533203125, 597.78125);
        this.figura.lineTo(471.4107360839844, 597.78125);
        this.figura.lineTo(481.48931884765625, 597.78125);
        this.figura.lineTo(491.5679016113281, 597.78125);
        this.figura.lineTo(501.646484375, 597.78125);
        this.figura.lineTo(511.7250671386719, 597.78125);
        this.figura.lineTo(521.8036041259766, 597.78125);
        this.figura.lineTo(531.8821868896484, 597.78125);
        this.figura.lineTo(541.9607696533203, 597.78125);
        this.figura.lineTo(552.0393524169922, 597.78125);
        this.figura.lineTo(562.1178894042969, 597.78125);
        this.figura.lineTo(572.1964721679688, 597.78125);
        this.figura.lineTo(582.2750549316406, 597.78125);
        this.figura.lineTo(592.3536376953125, 597.78125);
        this.figura.lineTo(602.4322204589844, 597.78125);
        this.figura.lineTo(612.5108032226562, 597.78125);
        this.figura.lineTo(622.5893859863281, 597.78125);
        this.figura.lineTo(627.7278747558594, 594.9298400878906);
        this.figura.lineTo(622.6866607666016, 586.2026672363281);
        this.figura.lineTo(617.6454467773438, 577.4754943847656);
        this.figura.lineTo(612.6041870117188, 568.7483215332031);
        this.figura.lineTo(607.5629730224609, 560.0211029052734);
        this.figura.lineTo(602.5217590332031, 551.2939300537109);
        this.figura.lineTo(597.4804992675781, 542.5667572021484);
        this.figura.lineTo(592.4392852783203, 533.8395843505859);
        this.figura.lineTo(587.3980255126953, 525.1124114990234);
        this.figura.lineTo(582.3568115234375, 516.3852386474609);
        this.figura.lineTo(577.3155517578125, 507.65802001953125);
        this.figura.lineTo(572.2743377685547, 498.93084716796875);
        this.figura.lineTo(567.2331237792969, 490.20367431640625);
        this.figura.lineTo(562.1918640136719, 481.47650146484375);
        this.figura.lineTo(557.1506042480469, 472.74932861328125);
        this.figura.lineTo(552.1093902587891, 464.02215576171875);
        this.figura.lineTo(547.0681762695312, 455.29498291015625);
        this.figura.lineTo(542.0269165039062, 446.56781005859375);
        this.figura.lineTo(536.9857025146484, 437.84063720703125);
        this.figura.lineTo(531.9444427490234, 429.11346435546875);
        this.figura.lineTo(526.9032287597656, 420.38624572753906);
        this.figura.lineTo(521.8620147705078, 411.65911865234375);
        this.figura.lineTo(516.8207550048828, 402.93192291259766);
        this.figura.lineTo(511.779541015625, 394.20475006103516);
        this.figura.lineTo(506.73828125, 385.47755432128906);
        this.figura.lineTo(501.6970672607422, 376.75038146972656);
        this.figura.lineTo(496.6558532714844, 379.6018371582031);
        this.figura.lineTo(491.6145935058594, 388.32898712158203);
        this.figura.lineTo(486.57337951660156, 397.05615997314453);
        this.figura.lineTo(481.53216552734375, 405.7833557128906);
        this.figura.lineTo(476.49090576171875, 414.5105285644531);
        this.figura.lineTo(471.44964599609375, 423.2377014160156);
        this.figura.lineTo(466.40843200683594, 431.9648742675781);
        this.figura.lineTo(461.3672180175781, 440.6920471191406);
        this.figura.lineTo(456.3259582519531, 449.4192199707031);
        this.figura.lineTo(451.2847442626953, 458.1463928222656);
        this.figura.lineTo(446.2434844970703, 466.8736114501953);
        this.figura.lineTo(441.2022705078125, 475.6007843017578);
        this.figura.lineTo(436.1610565185547, 484.3279113769531);
        this.figura.lineTo(431.1197967529297, 493.0551300048828);
        this.figura.lineTo(426.0785827636719, 501.7823028564453);
        this.figura.lineTo(421.0373229980469, 510.5094757080078);
        this.figura.lineTo(415.99610900878906, 519.2366485595703);
        this.figura.lineTo(410.95489501953125, 527.9638214111328);
        this.figura.lineTo(405.91363525390625, 536.6909942626953);
        this.figura.lineTo(400.87239837646484, 545.4181671142578);
        this.figura.lineTo(395.83116149902344, 554.1453857421875);
        this.figura.lineTo(390.78992462158203, 562.87255859375);
        this.figura.lineTo(385.7486877441406, 571.5997314453125);
        this.figura.lineTo(380.7074737548828, 580.326904296875);
        this.figura.lineTo(375.6662368774414, 589.0540771484375);
        this.s = this.figura;
        this.s = f1;
    }
    
    public void CambioColor() {
        this.elige = new JColorChooser();
        this.color = JColorChooser.showDialog(null, "Seleccione el color", Color.black);
        System.out.println(this.color);
    }
    
    public void Gradiente() {
        this.elige = new JColorChooser();
        this.color1 = JColorChooser.showDialog(null, "Seleccione el color1", Color.black);
        System.out.println(this.color1);
        this.color2 = JColorChooser.showDialog(null, "Seleccione el color2", Color.black);
        System.out.println(this.color2);
    }
    
    public void FondoImagen() {
        final JFileChooser file = new JFileChooser();
        file.showOpenDialog(null);
        final File archivo = file.getSelectedFile();
        try {
            this.slate = ImageIO.read(archivo);
            this.slatetp = new TexturePaint(this.slate, this.s.getBounds2D());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(archivo.toString());
    }
    
    public void CambiarTransparencia(final float t) {
        try {
            if (t > 0.0f && t < 255.0f) {
                this.Transparencia = (int)t;
            }
            else {
                this.alert("el numero no esta dentro del rango");
            }
        }
        catch (Exception e) {
            this.alert("numero invalido");
        }
    }
    
    public void CambioColorContorno() {
        this.elige = new JColorChooser();
        this.color3 = JColorChooser.showDialog(null, "Seleccione el color", Color.black);
        System.out.println(this.color);
    }
    
    public void Contorno(final int g, final int ec, final int ep) {
        this.g2.setColor(this.color3);
        this.Grosor = g;
        this.EstiloContorno = ec;
        this.EstiloPuntas = ep;
    }
    
    public void alert(final String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
