/*
 * Applet are small java programs that are compiled but
 * not interpreted because these do not contain a main method.
 * These are instead embedded into HTML docs or run with an applet viewer.
 *
 * It is done by deriving an Applet class  from an applet package
 * It produces a graphical container which is actually a canvas and
 * supports various graphic functions
 *
*/
package GUI;

import java.applet.Applet;
import java.awt.*;

public class apletdemo extends Applet
{
    public void paint(Graphics g)
    {
        this.setSize(600,600);
        // to set size of screen

        g.drawString("Hello Applet", 100,100);
        g.drawLine(100,100,300,300);
        g.setColor(Color.red);
        g.drawRect(100, 100, 200, 200);
        g.fillRect(130, 130, 140, 140);
        g.setColor(Color.green);
        //g.drawOval(200, 200, 100, 100);
        g.fillOval(200, 200, 100, 100);
        g.drawRoundRect(300, 300, 200, 200, 20, 20);
        //g.fillRoundRect(WIDTH, WIDTH, WIDTH, WIDTH, WIDTH, HEIGHT);
        //g.drawArc(100, 400, 200, 100, 180,180);
        g.fillArc(100, 400, 200, 100, 180,180);
        Polygon p = new Polygon();
        p.addPoint( 300 ,10 );
        p.addPoint( 10 ,590 );
        p.addPoint( 590 ,590 );
        p.addPoint( 300 ,10 );
        g.drawPolygon(p);
    }
}
