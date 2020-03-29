import java.applet.*;
import java.awt.*;

public class SimpleBanner extends Applet implements Runnable{
String msg="   THIS IS A MOVING BANNER  ";
Thread t= null;
int state;
//font f1;
boolean stopFlag; 
public void init(){
//f1=new Font("ARIAL",Font.BOLD,50);
setBackground(Color.white);
setForeground(Color.red);
}
public void start(){
t=new Thread(this);
stopFlag=false;
t.start();
}
public void run(){
char ch;
for(; ;){
try{
repaint();
Thread.sleep(200);
ch=msg.charAt(0);
msg=msg.substring(1,msg.length());
msg=msg+ch;
if(stopFlag)
break;
}
catch(InterruptedException e){}
}
}
public void stop(){
stopFlag=true;
t=null;
}
public void paint(Graphics g){
//g.setFont(f1);
g.drawString(msg,100,50);
}
}
/*<html>
<body>
<applet code="SimpleBanner.class" width=200 height=200>
</applet>
</body>
</html>*/
