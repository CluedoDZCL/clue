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
   JFrame f = new JFrame("������ ");//ֱ��ʵ������
   JButton b0 = new JButton("0");
   JLabel display=new JLabel();//����һ��д�ı���,��new��һ��ʵ���������еĶ���Ҫ����ʵ������
    
     public void init(){//����һ��static�ͱ����һ����̬�ķ��������ܴ���ľͱ���˾�̬�ĳ�Ա����������ֻ�����ξ�̬�ĳ�Ա����
           b0.addActionListener(this);//this �϶��������ھ�̬����
           p.setLayout(new BorderLayout());
           p.setLayout(new GridLayout(2, 2));
           p.add(b0);
           p.add(display); //��ֱ�ӵ��ú���
           f.add(p);
           f.addWindowListener(new news());
           f.setSize(300,100);
           f.setVisible(true);
           f.pack();
      }
       
        public void actionPerformed(ActionEvent e) {//������д�����������Ժ����ô�졣
          if(e.getSource() == b0){
              display.setText("queding");
          }
          }
       public void windowClosing(WindowEvent e){//����
          System.exit(0);
      }
       public static void main(String arg[]){ //������      
          // new news().init();//û��ʵ��������
    	   news xin=new news();//������Ч����һ����
    	   xin.init();
           }
}
