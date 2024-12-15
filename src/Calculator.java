import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField t;
    JLabel lb;
    JPanel p;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul, bmin,badd, bdot,beq,bclr;
    static  double a=0 , b=0, result=0 ;
    static  int operator=0;

    Calculator(){
        frame =new JFrame("Calculator");
        t=new JTextField();

        lb=new JLabel("Calculator");
        lb.setBounds(30,5,125,40);
        lb.setFont(new Font("Arial",Font.BOLD,25));
        lb.setForeground(Color.MAGENTA);
        lb.setBorder(new MatteBorder(0, 0, 3, 0, Color.BLACK));

        b1=new JButton("1");
        b1.setBackground(Color.orange);
        b2=new JButton("2");
        b2.setBackground(Color.ORANGE);
        b3=new JButton("3");
        b3.setBackground(Color.orange);
        b4=new JButton("4");
        b4.setBackground(Color.orange);
        b5=new JButton("5");
        b5.setBackground(Color.orange);
        b6=new JButton("6");
        b6.setBackground(Color.orange);
        b7=new JButton("7");
        b7.setBackground(Color.orange);
        b8=new JButton("8");
        b8.setBackground(Color.orange);
        b9=new JButton("9");
        b9.setBackground(Color.orange);
        b0=new JButton("0");
        b0.setBackground(Color.orange);
        bdiv=new JButton("/");
        bdiv.setBackground(Color.GREEN);
        bmul=new JButton("*");
        bmul.setBackground(Color.GREEN);
        bmin=new JButton("-");
        bmin.setBackground(Color.GREEN);
        badd=new JButton("+");
        badd.setBackground(Color.GREEN);
        bdot =new JButton(".");
        bdot.setBackground(Color.GREEN);
        beq=new JButton("=");
        beq.setBackground(Color.GREEN);
        bclr=new JButton("Clear");
        bclr.setBackground(Color.GREEN);


        t.setBounds(30,50,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bmin.setBounds(250,240,50,40);

        bdot.setBounds(40,310,50,40);
        b0.setBounds(110,310,120,40);
        badd.setBounds(250,310,50,40);

        bclr.setBounds(60,380,100,40);
        beq.setBounds(180,380,100,40);

        frame.add(t);
        frame.add(lb);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bmin);
        frame.add(bdot);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bclr);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        /*
         Eğer setResizable(false) kullanırsanız, pencere yeniden boyutlandırılamaz.
         Yani kullanıcı fareyi kullanarak pencerenin kenarlarını çekip bırakarak
         boyutunu değiştiremez. Pencerenin boyutu sabit kalır.
        */
        /*
        this şu anki sınıfın (this ile işaret edilen) bir ActionListener olduğunu ima eder.
        Yani, bu sınıfın actionPerformed metodunda buton tıklamalarına verilen yanıtlar tanımlanmalıdır.
        */
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bmin.addActionListener(this);
        bdot.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);

        /*
        Kullanıcı butona tıkladığında ActionListener tetiklenir
        ve actionPerformed adlı bir metot çağrılır. Bu metodun
        içeriğine göre bir işlem gerçekleştirilir.
        */
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() ==b1)
            t.setText(t.getText().concat("1"));
        if (e.getSource() ==b2)
            t.setText(t.getText().concat("2"));
        if (e.getSource() ==b3)
            t.setText(t.getText().concat("3"));
        if (e.getSource() ==b4)
            t.setText(t.getText().concat("4"));
        if (e.getSource() ==b5)
            t.setText(t.getText().concat("5"));
        if (e.getSource() ==b6)
            t.setText(t.getText().concat("6"));
        if (e.getSource() ==b7)
            t.setText(t.getText().concat("7"));
        if (e.getSource() ==b8)
            t.setText(t.getText().concat("8"));
        if (e.getSource() ==b9)
            t.setText(t.getText().concat("9"));
        if (e.getSource() ==b0)
            t.setText(t.getText().concat("0"));
        if (e.getSource() == bdot)
            t.setText(t.getText().concat("."));
        if (e.getSource() ==badd){
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if (e.getSource() == bmin){
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if (e.getSource() ==bmul){
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if (e.getSource() ==bdiv){
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if (e.getSource() ==beq){
            b=Double.parseDouble(t.getText());
            String opSymbol="";
            switch (operator){
                case 1: result=a+b;
                    opSymbol="+";
                    break;
                case 2:result=a-b;
                    opSymbol="-";
                    break;
                case 3:result=a*b;
                    opSymbol="x";
                    break;
                case 4:result=a/b;
                    opSymbol="/";
                    break;
                default:result=0;
            }
            t.setText(""+ result);
            int first =(int) a;
            int second=(int) b;
            System.out.println(String.valueOf(first)+opSymbol+ String.valueOf(second)+ "="+ result);
        }
        if (e.getSource() ==bclr){
            t.setText("");
        }

    }
    public static void main(String[] args) {
        new Calculator();
    }

}
