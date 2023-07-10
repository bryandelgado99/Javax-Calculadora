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
    private JButton potencia_boton;
    private JButton raiz_boton;
    private JButton porcent_boton;
    private JButton sen_boton;
    private JButton cos_boton;
    private JButton tan_boton;
    private JButton ACButton;
    private JLabel data_final;
    private JLabel data_operations;

    //variables para operaciones
    double num1 = 0;
    double num2 = 0;
    String operacion;

    public Javaxcalc() {
        //------------------Acciones para botones de numeros------------------------------
        boton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"1");
            }
        });
        boton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"2");
            }
        });
        boton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"3");
            }
        });
        boton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"4");
            }
        });
        boton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"5");
            }
        });
        boton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"6");
            }
        });
        boton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"7");
            }
        });
        boton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"8");
            }
        });
        boton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"9");
            }
        });
        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(data_final.getText() == "0" | data_final.getText() == null){
                    data_final.setText("");
                }
                data_final.setText(data_final.getText()+"0");
            }
        });
        //--------------------Acciones para botones de operaciones basicas------------------------
        sum_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "suma";
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(data_final.getText()+" + ");
                data_final.setText("");
            }
        });
        rest_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "resta";
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(data_final.getText()+" - ");
                data_final.setText("");
            }
        });
        multi_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "multiplicacion";
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(data_final.getText()+" x ");
                data_final.setText("");
            }
        });
        div_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "division";
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(data_final.getText()+" / ");
                data_final.setText("");
            }
        });
        //--------Acciones para botones potencia, raiz y porcentaje---------
        potencia_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion = "potencia";
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(data_final.getText()+" ^ ");
                data_final.setText("");
            }
        });
        //Para las operaciones raiz,porcentaje el propio boton registra el numero y realiza la operacion
        raiz_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //registro de numero
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText(" √ " + data_final.getText());
                data_final.setText("");

                //operacion raiz cuadrada
                data_operations.setText("√" + num1 + " = ");
                double resultado = Math.sqrt(num1);
                data_final.setText(String.valueOf(resultado));
                num1 = resultado;
            }
        });
        porcent_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(data_final.getText());
                data_operations.setText(num1 + " x "+ num2 + "% = ");

                double resultado = num1*(num2/100);
                data_final.setText(String.valueOf(resultado));
                num1 = resultado;
            }
        });
        //-------------Aciones para botones de funciones trigonometricas---------------
        //Para las funciones trigonometricas el propio boton registra el numero y realiza la operacion
        sen_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText("sin(" + data_final.getText() + ")");
                data_final.setText("");

                //Operacion seno
                data_operations.setText("sin(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.sin(radianes);
                data_final.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        cos_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText("cos(" + data_final.getText() + ")");
                data_final.setText("");

                //Operacion coseno
                data_operations.setText("cos(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.cos(radianes);
                data_final.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        tan_boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(data_final.getText());
                data_operations.setText("tan(" + data_final.getText() + ")");
                data_final.setText("");

                //Operacion tangente
                data_operations.setText("tan(" + num1 + ") = ");
                double radianes = Math.toRadians(num1);
                double resultado = Math.tan(radianes);
                data_final.setText(String.valueOf(resultado));
                num1 = radianes;
            }
        });
        //-------------Acciones para el boton igual---------------------------
        boton_igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(data_final.getText());
                if(operacion == "suma"){
                    data_operations.setText(num1 + " + "+ num2 + " = ");
                    double resultado = num1+num2;
                    data_final.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "resta"){
                    data_operations.setText(num1 + " - "+ num2 + " = ");
                    double resultado = num1-num2;
                    data_final.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "multiplicacion"){
                    data_operations.setText(num1 + " x "+ num2 + " = ");
                    double resultado = num1*num2;
                    data_final.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "division"){
                    data_operations.setText(num1 + " / "+ num2 + " = ");
                    double resultado = num1/num2;
                    data_final.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
                else if(operacion == "potencia"){
                    data_operations.setText(num1 + " ^ "+ num2 + " = ");
                    double resultado = Math.pow(num1,num2);
                    data_final.setText(String.valueOf(resultado));
                    num1 = resultado;
                }
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data_final.setText(null);
                data_operations.setText(null);
                num1 = num2 = 0;
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