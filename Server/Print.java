import java.awt.Desktop;
import java.io.*;
import java.sql.*;
public class Print
{
String tab,order,payment,items[],qty[],price[],total;
int i;
Print(String tab,String order,String payment,String items[],String qty[],String price[],String total)
{
this.tab=tab;
this.order=order;
this.payment=payment;
this.items=items;
this.qty=qty;
this.price=price;
this.total=total;


try
{
PrintWriter writer = new PrintWriter("a.txt", "UTF-8");
writer.println("         XYZ Restaurant        ");
writer.println("-------------------------------");
writer.println(tab);
writer.println("Item\t\tQty\t\tPrice");
for(i=0;i<items.length;i++)
writer.println(items[i]+"\t"+qty[i]+"\t"+price[i]);
writer.println("-------------------------------");
writer.println("         Total:"+total+"        ");
writer.println(order);
writer.println(payment);
writer.println("         Thank You        ");
writer.close();
}catch(Exception e){}



try 
{
Desktop desktop = null;
if (Desktop.isDesktopSupported()) 
desktop = Desktop.getDesktop();
desktop.print(new File("a.txt"));
}catch (IOException ioe){}

}


}