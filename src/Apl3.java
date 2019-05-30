import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Apl3 extends Apl2 {

    public static void main(String[] args) {
        new Apl3();
    }

    Apl3() {
         class AdSt implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                Student s;
                int nt;

                String n=tf[0].getText();
                String sr=tf[1].getText();


                try{

                    nt=Integer.parseInt(tf[2].getText());
                }
                catch(NumberFormatException ex){
                    tf[2].setText("note");
                    return;
                }

                prs.add(s=new Student("Name",sr,nt));
                tf[0].setText("name");tf[1].setText("surname");tf[2].setText("note");
                slist.append(s+"\n");
                slist.setCaretPosition(slist.getDocument().getLength());

                revalidate();


            }

        }
    }
}

