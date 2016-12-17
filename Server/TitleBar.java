import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
class TitleBar extends JPanel implements ActionListener
{
JFrame f;
JButton close=new JButton(new ImageIcon("images/close1.png"));
JButton min=new JButton(new ImageIcon("images/min1.png"));

TitleBar(JFrame f)
{
this.f=f;
setLayout(null);
setBackground(Win.frameColor);

close.setLocation(f.getWidth()-48,1);
close.addActionListener(this);
close.setSize(39,29);
MakeButton(close);
close.setRolloverIcon(new ImageIcon("images/close2.png"));
close.setToolTipText("Close");
add(close);

min.setLocation(f.getWidth()-86,1);
min.addActionListener(this);
min.setSize(39,29);
MakeButton(min);
min.setRolloverIcon(new ImageIcon("images/min2.png"));
min.setToolTipText("Minimize");
add(min);
}

public void MakeButton(JButton b)
{
b.setBackground(Win.frameColor);
b.setBorderPainted(false);
b.setFocusPainted(false);
b.setContentAreaFilled(true);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==close)   {	System.exit(0);		      }
else if(ae.getSource()==min){	f.setState(JFrame.ICONIFIED); }
}

@Override
  protected void paintComponent(Graphics g) 
{
super.paintComponent(g);
Graphics2D g1=(Graphics2D)g;
FontMetrics fm = g1.getFontMetrics();
Rectangle2D r2 = fm.getStringBounds(Win.title, g1);
int x = (int)(getWidth() - (int) r2.getWidth()) / 2;
int y = (int)(getHeight() - (int) r2.getHeight()) / 2 + fm.getAscent();
g.setFont(new Font("Calibri (Body)",Font.BOLD,14));
g.drawString(Win.title, x, y);
g1.setStroke(new BasicStroke(2f));
g1.setColor(Color.black);
g1.draw(new Line2D.Float(0,0,getWidth(),0));
g1.draw(new Line2D.Float(0,0,0,getHeight()));
g1.draw(new Line2D.Float(getWidth(),0,getWidth(),getHeight()));
}
}
