import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Javaxcalc {
    private JPanel rootPanel;
    private JButton boton_cero;
    private JButton boton_igual;
    private JButton boton_1;
    private JButton boton_2;
    private JButton boton_3;
    private JButton sum_boton;
    private JButton boton_4;
    private JButton boton_5;
    private JButton boton_6;
    private JButton rest_boton;
    private JButton boton_7;
    private JButton boton_8;
    private JButton boton_9;
    private JButton multi_boton;
    private JButton decimal_but;
    private JButton div_boton;
    private JButton raiz_boton;
    private JButton potencia_boton;
    private JButton porcent_boton;
    private JButton sen_boton;
    private JButton cos_boton;
    private JButton tan_boton;
    private JButton ACButton;
    private JLabel data_input;
    private JLabel resultado;

    public Javaxcalc() {
        boton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"1");
            }
        });
        boton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"2");
            }
        });
        boton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"3");
            }
        });
        boton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"4");
            }
        });
        boton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"5");
            }
        });
        boton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"6");
            }
        });
        boton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"7");
            }
        });
        boton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"8");
            }
        });
        boton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"9");
            }
        });
        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_input.getText() == "0" | data_input.getText() == null){
                    data_input.setText("");
                }
                data_input.setText(data_input.getText()+"0");
            }
        });
    }

    //Main section
    public static void main(String[] args) {
        JFrame frame = new JFrame("Javax Calculator");
        frame.setContentPane(new Javaxcalc().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize (435,630);
    }
}