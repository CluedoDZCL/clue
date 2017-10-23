package news;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class news extends WindowAdapter implements ActionListener{
   JPanel p =new JPanel(); //
   JFrame f = new JFrame("计算器 ");//直接实例化类
   JButton b0 = new JButton("0");
   JLabel display=new JLabel();//定义一个写文本框,加new是一种实例化，所有的对象都要经过实例化。
    
     public void init(){//加了一个static就变成了一个静态的方法，它能处理的就变成了静态的成员变量，所以只能修饰静态的成员变量
           b0.addActionListener(this);//this 肯定不能用在静态里面
           p.setLayout(new BorderLayout());
           p.setLayout(new GridLayout(2, 2));
           p.add(b0);
           p.add(display); //类直接调用函数
           f.add(p);
           f.addWindowListener(new news());
           f.setSize(300,100);
           f.setVisible(true);
           f.pack();
      }
       
        public void actionPerformed(ActionEvent e) {//方法。写监听到内容以后该怎么办。
          if(e.getSource() == b0){
              display.setText("queding");
          }
          }
       public void windowClosing(WindowEvent e){//方法
          System.exit(0);
      }
       public static void main(String arg[]){ //主函数      
          // new news().init();//没有实例，就用
    	   news xin=new news();//这两个效果是一样的
    	   xin.init();
           }
}
