import java.awt.*;
import java.util.*;
import java.applet.*;
/*
<Applet code="Animation" Width=400 Height=300>
</Applet>
*/
public class Animation extends Applet implements Runnable
{
int x1=1,x2=380,y1=1,y2=250;
public void paint(Graphics g)
{
setBackground(Color.cyan);
x1=x1+16;
x2=x2-16;
y1=y1+16;
y2=y2-16;
if(y2<0)
y2=250;
if(x2<0)
x2=380;
if(x1>380)
x1=1;
if(y1>250)
y1=1;
g.setColor(Color.BLACK);
g.fillRect(0,130,400,40);
g.fillRect(180,0,40,305);
g.setColor(Color.white);
for(int i=0;i<20;i++)

	        {

if(i!=9 && i!=10)
g.drawLine(i*20,150,i*20+10,150);

          }

for(int j=0;j<15;j++)        

     {

if(j!=7 && j!=8)
g.drawLine(200,j*20,200,j*20+10);

            }

g.setColor(Color.red);
g.fillRoundRect(x2,152,20,8,2,2);

g.fillRoundRect(x1,140,20,8,2,2);

g.fillRoundRect(190,y1,8,40,2,2);

g.fillRoundRect(202,y2,8,40,2,2);

}

Thread t;
public void init()

{

t=new Thread(this,"New Thread");
t.start();

}

public void start()

{ }

public void run()
{
while(true)
{
repaint();
try
{
Thread.sleep(100);
}
catch(Exception e)
{ }
}
}
}