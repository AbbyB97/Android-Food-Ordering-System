import java.awt.*;
import javax.swing.*;
class Pan extends JPanel
{
JFrame f;
TitleBar t;
Pan(JFrame f)
{
this.f=f;
setLayout(null);
add(Win.m);
add(t=new TitleBar(f));
setLayout(null);
t.setBounds(0,0,f.getWidth(),30);
Win.m.setBounds(8,30,f.getWidth()-16,f.getHeight()-38);
}

@Override
  protected void paintComponent(Graphics g) 
{
super.paintComponent(g);
Rectangle t;
Graphics2D g1=(Graphics2D)g;
g1.setStroke(new BasicStroke(15f));
g1.setColor(Win.frameColor);
g1.draw(t=new Rectangle(0,0,f.getWidth(),f.getHeight()));
g1.setStroke(new BasicStroke(2f));
g1.setColor(Color.black);
g1.draw(t);
}
}