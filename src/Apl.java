import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class Apl extends JFrame{
    private static final long serialVersionUID = 1L;
    protected JButton ad;
    protected JTextField tf[]= new JTextField[3];
    protected JTextArea slist, hint;

    protected JPanel contr,plst;


    protected AdSt adSt;
    protected ArrayList<Student> prs=new ArrayList<Student>(10);



    Apl(int x, int y, int ln, int ht){

        this.setLayout(new BorderLayout());
        this.setBounds(x, y, ln, ht);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Student's directory - version 1");
        this.addMouseListener(new mouseIsClicked());
        slist = new JTextArea(5, 15);
        slist.setEditable(false);
        JLabel hint;
        //this.addPropertyChangeListener(new LabelChange());


        contr = new JPanel(new FlowLayout());
        plst = new JPanel(new FlowLayout());


        ad = new JButton("add");

        contr.add(ad);

        tf[0]= new JTextField("name",10);
        tf[1]= new JTextField("surname",10);
        tf[2]= new JTextField("note",5);

        contr.add(tf[0]);
        contr.add(tf[1]);
        contr.add(tf[2]);
        ad.addActionListener(adSt=new AdSt());

        tf[2].addActionListener(adSt);
        plst.add(new JScrollPane(slist));
        plst.add(hint = new JLabel("Hint"));
        add("South",hint);
        add("North",contr);
        add("Center",plst);
        revalidate();
    }




    public class AdSt implements ActionListener{
        public void actionPerformed(ActionEvent e ){






            Student s;
            int nt;

            String n=tf[0].getText();
            String sr=tf[1].getText();

            try{

                nt=Integer.parseInt(tf[2].getText());

                //hint.setText("Hello");




            }
            catch(NumberFormatException ex){
                tf[2].setText("note");
                JOptionPane.showMessageDialog(null, "Please add a mark");
                return;
            }

                prs.add(s=new Student(n,sr,nt));
                tf[0].setText("name");tf[1].setText("Surname");tf[2].setText("note");
                slist.append(s+"\n");
                slist.setCaretPosition(slist.getDocument().getLength());

                //JOptionPane.showMessageDialog(null, "Please fill in every field");






            revalidate();
        }


    }
    public static void main(String [] arg){
        new Apl(20,20,400,300);
    }


    private class mouseIsClicked implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
        plst.setBackground(Color.orange);
        tf[0].setBackground(Color.cyan);
        tf[1].setBackground(Color.cyan);
        tf[2].setBackground(Color.cyan);
        }



        @Override
        public void mouseExited(MouseEvent e) {
            plst.setBackground(Color.white);
            tf[0].setBackground(Color.white);
            tf[1].setBackground(Color.white);
            tf[2].setBackground(Color.white);
        }
    }


    /*private class LabelChange implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            hint.setText("hello");
        }
    }
     */
}
