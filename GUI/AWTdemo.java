/*
 * AWT: Abstract Windowing Toolkit
 * This is a package that offers classes to form Windowing Control
 * Objects such as Frame, Button, Label, TextField etc
 */

package GUI;

import java.applet.Applet;
import java.awt.*;

public class AWTdemo extends Applet
{
    Button btn;
    Label lbl;
    TextField txt;

    public void init()
    {
        btn = new Button("Click Me ");
        lbl = new Label("This is a Label");
        txt = new TextField(20);

        /* //flowLayout
        add(btn);
        add(lbl);
        add(txt);*/
        //custom Layout
        setLayout(null);
        txt.setBounds(20, 20, 100, 30);
        lbl.setBounds(150, 20, 100, 30);
        btn.setBounds(20, 80, 100, 30);
        add(btn);
        add(lbl);
        add(txt);
    }
    public void paint(Graphics g)
    {
        this.setSize(300, 150);
    }
}
