
package temperature;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
//import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Sandeep
 */import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class TemperatureConversion extends Applet
implements AdjustmentListener {
String msg = "";
Scrollbar vertSB;

public void init() {
int height = Integer.parseInt(getParameter("height"));
vertSB = new Scrollbar(Scrollbar.VERTICAL,
0, 1, -273, height);

add(vertSB);
vertSB.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae) {
repaint();
}

public void paint(Graphics g) {
    String str;
    str = "Celsius to Farhenheit Converter";
    g.drawString(str, 1, 50);
msg = "Celcius: " + vertSB.getValue();
msg += ", Farhenheit: " + (((9* vertSB.getValue())/5)+32);
g.drawString(msg, 6, 160);
}
}  

