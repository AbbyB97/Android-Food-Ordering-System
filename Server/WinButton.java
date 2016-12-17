import java.awt.*;
import javax.swing.*;
public class WinButton extends JButton
{
String text;
Color bgcolor;
Color rollovercolor;
String tool;
Color maincolor;
ImageIcon main;
ImageIcon rollover;
ImageIcon pressed;

public WinButton(ImageIcon main,ImageIcon rollover,ImageIcon pressed,String tool)
{
super();
setIcon(main);
this.main=main;
this.rollover=rollover;
this.pressed=pressed;
this.bgcolor=bgcolor;
if(tool!=null)
setToolTipText(tool);
UIManager.put("Button.select",bgcolor);
setFocusPainted(false);
setBorderPainted(false);
setRolloverIcon(rollover);
setPressedIcon(pressed);
setDisabledIcon(pressed);
setForeground(Color.white);
setBackground(bgcolor);
setContentAreaFilled(false);
super.setCursor(new Cursor(Cursor.HAND_CURSOR));
}
}