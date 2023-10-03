import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ITECalculator extends JFrame implements ActionListener {
    private JPanel panelTextField;
    private JPanel panel;
    private JPanel crads;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton badd;
    private JButton brem;
    private JButton bmul;
    private JButton bdiv;
    private JButton bdot;
    private JButton bequal;
    private JButton bac;
    private JButton bsin;
    private JButton bcos;
    private JButton btan;
    private JTextField nameTextfile;
    private JLabel label;
    private int value1, value2;
    private char option;
    double result;

    public  void createTextField(){
        panelTextField= new JPanel(new GridLayout(2,2,10,10));

        label=new JLabel();
        label.setFont(new Font("Khmer IOS",Font.BOLD,20));
        label.setHorizontalAlignment(JLabel.RIGHT);
        nameTextfile=new JTextField();
        nameTextfile.setFont(new Font("Khmer IOS",Font.BOLD,20));
        nameTextfile.setPreferredSize(new Dimension(200,30));

        panelTextField.add(label);
        panelTextField.add(nameTextfile);
    }
    public void createButton(){
        panel=new JPanel(new GridLayout(5,4,5,5));
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        badd=new JButton("+");
        brem=new JButton("-");
        bdiv=new JButton("/");
        bmul=new JButton("X");
        bdot=new JButton(".");
        bequal=new JButton("=");
        bac=new JButton("AC");
        bsin=new JButton("Sin");
        bcos=new JButton("Cos");
        btan=new JButton("Tan");

        //add listener
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
        brem.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bequal.addActionListener(this);
        bac.addActionListener(this);
        bdot.addActionListener(this);
        bsin.addActionListener(this);
        bcos.addActionListener(this);

        //add to panel
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(badd);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(brem);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bmul);
        panel.add(b0);
        panel.add(bdot);
        panel.add(bequal);
        panel.add(bdiv);
        panel.add(bac);
        panel.add(bsin);
        panel.add(bcos);
        panel.add(btan);

    }
    public ITECalculator(){
        createTextField();
        createButton();

        crads = new JPanel(new GridLayout(2,2,10,10) );
        crads.add(panelTextField);
        crads.add(panel);

        this.getContentPane().add(crads);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source==b1){
            nameTextfile.setText(nameTextfile.getText().concat("1"));
        }else if (source==b2){
            nameTextfile.setText(nameTextfile.getText().concat("2"));
        }else if (source==b3){
            nameTextfile.setText(nameTextfile.getText().concat("3"));
        }else if (source==b4){
            nameTextfile.setText(nameTextfile.getText().concat("4"));
        }else if (source==b5){
            nameTextfile.setText(nameTextfile.getText().concat("5"));
        }else if (source==b6){
            nameTextfile.setText(nameTextfile.getText().concat("6"));
        }else if (source==b7){
            nameTextfile.setText(nameTextfile.getText().concat("7"));
        }else if (source==b8){
            nameTextfile.setText(nameTextfile.getText().concat("8"));
        }else if (source==b9){
            nameTextfile.setText(nameTextfile.getText().concat("9"));
        }else if (source==b0){
            nameTextfile.setText(nameTextfile.getText().concat("0"));
        } else if (source==badd){
            value1 = Integer.parseInt(nameTextfile.getText());
            label.setText(nameTextfile.getText().concat("+"));
            nameTextfile.setText("");
            option='+';
        }else if (source==brem){
            value1 = Integer.parseInt(nameTextfile.getText());
            label.setText(nameTextfile.getText().concat("-"));
            nameTextfile.setText("");
            option='-';
        }else if (source==bdiv){
            value1 = Integer.parseInt(nameTextfile.getText());
            label.setText(nameTextfile.getText().concat("/"));
            nameTextfile.setText("");
            option='/';
        }else if (source==bmul){
            value1 = Integer.parseInt(nameTextfile.getText());
            label.setText(nameTextfile.getText().concat("*"));
            nameTextfile.setText("");
            option='*';
        }else if (source==bdot){
            label.setText(nameTextfile.getText().concat("."));
            nameTextfile.setText("");
        }else if (source==bequal){
            try{
                value2 =  Integer.parseInt(nameTextfile.getText());
                if (option =='+'){
                    result = value1 + value2;
                    label.setText(value1+" + "+value2+" = ");
                    nameTextfile.setText(String.valueOf(result));
                }else if (option =='-'){
                    result = value1 - value2;
                    label.setText(value1+" - "+value2+" = ");
                    nameTextfile.setText(String.valueOf(result));
                }else if (option =='*'){
                    result = value1 * value2;
                    label.setText(value1+" * "+value2+" = ");
                    nameTextfile.setText(String.valueOf(result));
                }else if (option =='/'){
                    result = value1 / value2;
                    label.setText(value1+" / "+value2+" = ");
                    nameTextfile.setText(String.valueOf(result));
                }
            }catch (Exception exception){
                JOptionPane.showMessageDialog(null,"Error");
            }
        }else if (source==bac){
            nameTextfile.setText("");
            label.setText("");
        }else if (source==bsin){
            nameTextfile.setText("Sin");
            label.setText("");
        }else if (source==bcos){
            nameTextfile.setText("Cos");
            label.setText("");
        }
    }
}