import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.sql.*;
import java.io.*;
import java.util.Date;
import java.util.Vector;
import java.text.SimpleDateFormat;

class Loading
{
public static Connection con=null;
public static Statement st=null;
public static void closeData(){	  try{ con.close(); st.close(); } catch(Exception e){}	}
//public static String prevoo="",nextoo="";
//public static int oldcost=0,newcost=0;
public static Vector oldor=new Vector();
public static Vector newor=new Vector();
public static Vector oldqt=new Vector();
public static Vector newqt=new Vector();
public static Vector allor=new Vector();
public static Vector allqt=new Vector();

public static String prevoo[]=new String[26];
public static String nextoo[]=new String[26];
public static int oldcost[]=new int[26];
public static int newcost[]=new int[26];


public static int iudData(String qry)
{
int n=0;
try 
{


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
n=st.executeUpdate(qry);
st.close();
con.close();
}catch(Exception e){}
return n;
}

public static ResultSet getData(String qry)
{
ResultSet rs=null;
try 
{


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Images/d.mdb");
st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
rs=st.executeQuery(qry);
}catch(Exception e){}
return rs;
}

public static void load()
{
final JWindow window = new JWindow();
final JProgressBar pbar=new JProgressBar();
pbar.setMinimum(0);
pbar.setMaximum(100);
pbar.setStringPainted(true);
pbar.setForeground(Color.RED);
window.getContentPane().add(new JLabel("", new ImageIcon("images/bg.jpg"), SwingConstants.CENTER));
window.getContentPane().add(pbar,BorderLayout.SOUTH);
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
int height = screenSize.height;
int width = screenSize.width;
window.setSize(width/2, height/2+10);
window.setLocationRelativeTo(null);
window.setVisible(true);
Thread t = new Thread() 
{
public void run() 
{
int i = 0;
while (i <= 100) 
{
pbar.setValue(i);
try { sleep(20); } catch(InterruptedException ex) {}
i++;
}
window.setVisible(false);
window.dispose();
Win w=new Win("Virtual Waitress",new ImageIcon("images/1.png").getImage(),null);
}};
t.start();
}


public static void main(String args[])throws Exception
{
boolean a=false;
String p=null;
String no=null;
UIManager.put("ScrollBar.width", new Integer(0)); 
Loading.load();
ServerSocket serverSocket=null;
	
Socket clientSocket;
	
InputStreamReader inputStreamReader;
	
BufferedReader bufferedReader;
	
PrintWriter w;
String message;
try 
{
			
serverSocket = new ServerSocket(4444); 
} 
catch (Exception e) 
{
			
System.out.println("Could not listen on port: 4444"+e);
		
}

	
System.out.println("Server started. Listening to the port 4444");

		
ResultSet rs1=null;
while (true) 
{

try 
{


clientSocket = serverSocket.accept(); 
inputStreamReader = new InputStreamReader(clientSocket.getInputStream());
				
bufferedReader = new BufferedReader(inputStreamReader);	
message = bufferedReader.readLine();



	
p=message.replace("Order:","");	
no=p.substring(0,p.indexOf("|"));
p=p.replace(no+"|","");




rs1=getData("select * from current where tab="+no);
rs1.last();
if(rs1.getRow()==0)
a=true;
else
a=false;

String oo;
oo=p.substring(0,p.lastIndexOf(","));
int cost=Integer.parseInt(p.substring(p.indexOf("|")+1,p.lastIndexOf("|")));
String pp=p.substring(p.lastIndexOf("|")+1);



if(a)
{
Loading.oldcost[Integer.parseInt(no)]=cost;
Loading.prevoo[Integer.parseInt(no)]=oo;
SimpleDateFormat sdfDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
Date now = new Date();
String strDate = sdfDate.format(now);
String s="insert into current (tab,name,cost,ord,pp) values("+no+",\'"+Loading.prevoo[Integer.parseInt(no)]+"\',"+""+Loading.oldcost[Integer.parseInt(no)]+",\'"+strDate+"\',\'"+pp+"\')";				
int n=iudData(s);
closeData();
System.out.println("Data stored successfully");
Middle.notify(no);
View.set(no,Loading.prevoo[Integer.parseInt(no)],""+cost,pp,true);
}
else
{

oldor=new Vector();
newor=new Vector();
oldqt=new Vector();
newqt=new Vector();
allor=new Vector();
allqt=new Vector();
int c1=0,c2=0;

Loading.nextoo[Integer.parseInt(no)]=oo;
Loading.newcost[Integer.parseInt(no)]=cost;

for(int i=0;i<Loading.prevoo[Integer.parseInt(no)].length();i++)
if(Loading.prevoo[Integer.parseInt(no)].charAt(i)=='-')     c1++;
for(int i=0;i<Loading.nextoo[Integer.parseInt(no)].length();i++)
if(Loading.nextoo[Integer.parseInt(no)].charAt(i)=='-')     c2++;

for(int j=0;j<=c1-1;j++)
{
oldor.addElement(Loading.prevoo[Integer.parseInt(no)].substring(0,Loading.prevoo[Integer.parseInt(no)].indexOf("-")));
prevoo[Integer.parseInt(no)]=Loading.prevoo[Integer.parseInt(no)].substring(Loading.prevoo[Integer.parseInt(no)].indexOf("-")+1);
if(j==c1-1)
oldqt.addElement(Loading.prevoo[Integer.parseInt(no)]);
else
{
oldqt.addElement(Loading.prevoo[Integer.parseInt(no)].substring(0,Loading.prevoo[Integer.parseInt(no)].indexOf(",")));
prevoo[Integer.parseInt(no)]=Loading.prevoo[Integer.parseInt(no)].substring(Loading.prevoo[Integer.parseInt(no)].indexOf(",")+1);
}
}

for(int j=0;j<=c2-1;j++)
{
newor.addElement("*"+Loading.nextoo[Integer.parseInt(no)].substring(0,Loading.nextoo[Integer.parseInt(no)].indexOf("-")));
Loading.nextoo[Integer.parseInt(no)]=Loading.nextoo[Integer.parseInt(no)].substring(Loading.nextoo[Integer.parseInt(no)].indexOf("-")+1);
if(j==c2-1)
newqt.addElement(Loading.nextoo[Integer.parseInt(no)]);
else
{
newqt.addElement(nextoo[Integer.parseInt(no)].substring(0,Loading.nextoo[Integer.parseInt(no)].indexOf(",")));
Loading.nextoo[Integer.parseInt(no)]=Loading.nextoo[Integer.parseInt(no)].substring(Loading.nextoo[Integer.parseInt(no)].indexOf(",")+1);
}
}


for(int i=0;i<c1;i++)
{
allor.addElement(oldor.elementAt(i));
allqt.addElement(oldqt.elementAt(i));
}

for(int i=0;i<c2;i++)
{
if(!allor.contains(newor.elementAt(i)))
{
allor.addElement(newor.elementAt(i));
allqt.addElement(newqt.elementAt(i));
}
else
{
int v=Integer.parseInt(allqt.elementAt(i).toString())+Integer.parseInt(newqt.elementAt(i).toString());
allqt.set(allor.indexOf(newor.elementAt(i)),""+v);
}
}


String finalord="";

for(int i=0;i<allor.size();i++)
finalord=finalord+allor.elementAt(i)+"-"+allqt.elementAt(i)+",";


System.out.println("orddd="+finalord);


finalord=finalord.substring(0,finalord.lastIndexOf(","));

String q="update current set name=\'"+finalord+"\' where tab="+no;
int n=iudData(q);


int cccc=Loading.newcost[Integer.parseInt(no)]+Loading.oldcost[Integer.parseInt(no)];
String q1="update current set cost="+Loading.newcost[Integer.parseInt(no)]+" where tab="+no;
int n1=iudData(q1);

if(n!=0 && n1!=0)
System.out.println("order accepted");

closeData();
Middle.notify(no);
View.set(no,finalord,""+Loading.newcost[Integer.parseInt(no)],pp,true);

Loading.prevoo[Integer.parseInt(no)]=finalord;
Loading.nextoo[Integer.parseInt(no)]="";

}


rs1.close();
inputStreamReader.close();
				
clientSocket.close();

			
} 
catch (Exception ex) {
	System.out.println(ex+"Problem in message reading");
	}
		
}

	
}

}
