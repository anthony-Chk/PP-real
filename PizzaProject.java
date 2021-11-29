import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PizzaProject extends JFrame {
    private JPanel mainPanel;
    private JButton profileButton;
    private JLabel logoImage;
    private JButton homeButton;
    private JButton menuButton;
    private JButton contactUsButton;
    private JButton pizzaButton;
    private JButton sidesButton;
    private JButton beveragesButton;
    private JPanel pizzaPanel;
    private JButton Breadsticks;
    private JButton checkOutButton;
    private JTextArea quantity2;
    private JRadioButton marinara1;
    private JButton plusquantity2;
    private JButton minusquantity2;
    private JButton BreakstickBites;
    private JButton BCCC;
    private JPanel quantityTab;
    private JLabel quantityText;
    private JLabel breadstickImage;
    private JLabel BreadbitesImage;
    private JLabel Cookie;
    private JButton P1;
    private JButton P2;
    private JButton P3;
    private JRadioButton marinara2;
    private JButton Checkout;
    private JTextArea quantity1;
    private JTextArea quantity3;
    private JButton minusquantity1;
    private JButton plusquantity1;
    private JButton minusquantity3;
    private JButton plusquantity3;




    public PizzaProject(String name) {
        super(name);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1080,720));

        this.pack();

        //variables


        //makes quantity text field and buttons work







    }
    public Sides saveOrder(int[] quantity)
    {
        int bs=0;
        int bb=0;
        int cc=0;
        int m=0;

        if(minusquantity1.isSelected()){
            bs=-1;
        }
        else if(plusquantity1.isSelected()){
            bs=+1;
        }
        else if(minusquantity2.isSelected()){
            bb=-1;
        }
        else if(plusquantity2.isSelected()){
            bb=+1;
        }
        else if(minusquantity3.isSelected()){
            cc=-1;
        }
        else if(plusquantity3.isSelected()){
            cc=+1;
        }
        else if(marinara1.isSelected()){
            m=+1;
        }
        else if(marinara2.isSelected()){
            m=+1;
        }

        return new Sides(bs, bb, cc, m);
    }


    public static void main(String[] args) {

        JFrame frame = new PizzaProject("Pizza Creation");





    }
}

