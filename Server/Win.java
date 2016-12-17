import java.awt.*;
import javax.swing.*;
import java.awt.TrayIcon.MessageType;
import javax.sound.sampled.*;
import java.io.*;

public class Win extends JFrame
{
Pan p;
static Middle m=new Middle();
static JFrame f1;
static String title="Untitled";
Image frameIcon=new JFrame().getIconImage();
int width=0,height=0;
static Color frameColor=Color.gray;

public Win(String title,Image frameIcon,Color frameColor)
{
this.title=title;
if(frameIcon!=null)
this.frameIcon=frameIcon;
Rectangle rec = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
this.setSize(rec.width, rec.height);
if(frameColor!=null)
this.frameColor=frameColor;
f1=this;
setUndecorated(true);
add(p=new Pan(this));
setIconImage(frameIcon);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
setTitle(title);
setLocationRelativeTo(null);
try
{
Middle.trayIcon.setImageAutoSize(true);
Middle.trayIcon.setToolTip("Server is started");
Middle.tray.add(Middle.trayIcon);
Middle.trayIcon.displayMessage("Virtual Waitress", "Server is started", MessageType.INFO);
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Images/1.wav").getAbsoluteFile());
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
}catch(Exception e){System.out.println(e);}
}
}