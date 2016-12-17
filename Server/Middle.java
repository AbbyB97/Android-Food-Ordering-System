import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.TrayIcon.MessageType;
import javax.sound.sampled.*;
import java.io.*;

class Middle extends JPanel
{
public static WinButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
public static SystemTray tray = SystemTray.getSystemTray();
public static TrayIcon trayIcon = new TrayIcon(new ImageIcon("images/1.png").getImage(), "Virtual Waitress");
public static View v=new View();
ResultSet rs=null;
Middle()
{
b1=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table1");
b2=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table2");
b3=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table3");
b4=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table4");
b5=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table5");
b6=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table6");
b7=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table7");
b8=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table8");
b9=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table9");
b10=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table10");
b11=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table11");
b12=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table12");
b13=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table13");
b14=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table14");
b15=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table15");
b16=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table16");
b17=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table17");
b18=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table18");
b19=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table19");
b20=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table20");
b21=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table21");
b22=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table22");
b23=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table23");
b24=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table24");
b25=new WinButton(new ImageIcon("images/tab2.png"),null,new ImageIcon("images/tab1.png"),"Table25");
setLayout(null);
add(b1);
b1.setBounds(10,50,100,100);
add(b2);
b2.setBounds(140,50,100,100);
add(b3);
b3.setBounds(270,50,100,100);
add(b4);
b4.setBounds(400,50,100,100);
add(b5);
b5.setBounds(530,50,100,100);
add(b6);
b6.setBounds(10,180,100,100);
add(b7);
b7.setBounds(140,180,100,100);
add(b8);
b8.setBounds(270,180,100,100);
add(b9);
b9.setBounds(400,180,100,100);
add(b10);
b10.setBounds(530,180,100,100);
add(b11);
b11.setBounds(10,310,100,100);
add(b12);
b12.setBounds(140,310,100,100);
add(b13);
b13.setBounds(270,310,100,100);
add(b14);
b14.setBounds(400,310,100,100);
add(b15);
b15.setBounds(530,310,100,100);
add(b16);
b16.setBounds(10,440,100,100);
add(b17);
b17.setBounds(140,440,100,100);
add(b18);
b18.setBounds(270,440,100,100);
add(b19);
b19.setBounds(400,440,100,100);
add(b20);
b20.setBounds(530,440,100,100);
add(b21);
b21.setBounds(10,570,100,100);
add(b22);
b22.setBounds(140,570,100,100);
add(b23);
b23.setBounds(270,570,100,100);
add(b24);
b24.setBounds(400,570,100,100);
add(b25);
b25.setBounds(530,570,100,100);
addAction(b1,"1");
addAction(b2,"2");
addAction(b3,"3");
addAction(b4,"4");
addAction(b5,"5");
addAction(b6,"6");
addAction(b7,"7");
addAction(b8,"8");
addAction(b9,"9");
addAction(b10,"10");
addAction(b11,"11");
addAction(b12,"12");
addAction(b13,"13");
addAction(b14,"14");
addAction(b15,"15");
addAction(b16,"16");
addAction(b17,"17");
addAction(b18,"18");
addAction(b19,"19");
addAction(b20,"20");
addAction(b21,"21");
addAction(b22,"22");
addAction(b23,"23");
addAction(b24,"24");
addAction(b25,"25");
add(v);
v.setBounds(650,150,500,600);
try
{
rs=Loading.getData("select * from current");
String s=null;
while(rs.next())
{
s=new Integer(rs.getInt(1)).toString();
notify(s);
}
rs.close();
Loading.closeData();
}catch(Exception e){e.printStackTrace();System.out.println(e);}
}

public static void renotify(String s)
{
if(s.equals("1"))
Middle.b1.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("2"))
Middle.b2.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("3"))
Middle.b3.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("4"))
Middle.b4.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("5"))
Middle.b5.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("6"))
Middle.b6.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("7"))
Middle.b7.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("8"))
Middle.b8.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("9"))
Middle.b9.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("10"))
Middle.b10.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("11"))
Middle.b11.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("12"))
Middle.b12.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("13"))
Middle.b13.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("14"))
Middle.b14.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("15"))
Middle.b15.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("16"))
Middle.b16.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("17"))
Middle.b17.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("18"))
Middle.b18.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("19"))
Middle.b19.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("20"))
Middle.b20.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("21"))
Middle.b21.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("22"))
Middle.b22.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("23"))
Middle.b23.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("24"))
Middle.b24.setIcon(new ImageIcon("images/tab2.png"));
else if(s.equals("25"))
Middle.b25.setIcon(new ImageIcon("images/tab2.png"));
try
{
Middle.trayIcon.displayMessage("Virtual Waitress", "Bill Paid of table"+s, MessageType.INFO);
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Images/1.wav").getAbsoluteFile());
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
}catch(Exception e){e.printStackTrace();}
}

public static void notify(String s)
{
if(s.equals("1"))
Middle.b1.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("2"))
Middle.b2.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("3"))
Middle.b3.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("4"))
Middle.b4.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("5"))
Middle.b5.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("6"))
Middle.b6.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("7"))
Middle.b7.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("8"))
Middle.b8.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("9"))
Middle.b9.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("10"))
Middle.b10.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("11"))
Middle.b11.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("12"))
Middle.b12.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("13"))
Middle.b13.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("14"))
Middle.b14.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("15"))
Middle.b15.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("16"))
Middle.b16.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("17"))
Middle.b17.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("18"))
Middle.b18.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("19"))
Middle.b19.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("20"))
Middle.b20.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("21"))
Middle.b21.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("22"))
Middle.b22.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("23"))
Middle.b23.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("24"))
Middle.b24.setIcon(new ImageIcon("images/tab1.png"));
else if(s.equals("25"))
Middle.b25.setIcon(new ImageIcon("images/tab1.png"));
try
{
Middle.trayIcon.displayMessage("Virtual Waitress", "Order from Table "+s, MessageType.INFO);
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Images/1.wav").getAbsoluteFile());
Clip clip = AudioSystem.getClip();
clip.open(audioInputStream);
clip.start();
}catch(Exception e){e.printStackTrace();}
}

public void addAction(WinButton b,String s)
{
final String s1=s;
b.removeActionListener(null);
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
try
{
ResultSet rs=Loading.getData("select * from current where tab="+s1);
String item=null,total=null,pp=null;
int i=0;
while(rs.next())
{
item=rs.getString(2);
total=rs.getString(3);
pp=rs.getString(6);
i++;
}
rs.close();
Loading.closeData();
if(i==0)
{
View.reset();
JOptionPane.showMessageDialog(null,"No Order from table "+s1,"Information",JOptionPane.INFORMATION_MESSAGE);
}
else
{
View.set(s1,item.replace("|0",""),total,pp,false);
}
}catch(Exception e){e.printStackTrace();System.out.println(e);}
}});

}

@Override
  protected void paintComponent(Graphics g) 
{
super.paintComponent(g);
g.drawImage(new ImageIcon("images/b.jpg").getImage(),0,0,null);
}

}
