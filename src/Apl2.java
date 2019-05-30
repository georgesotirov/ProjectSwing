import java.awt.*;
import java.awt.event.*;
public class Apl2 extends Apl1{
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        new Apl2();
    }
    Apl2(){
        tf[0].addFocusListener(new InName());
        tf[1].addFocusListener(new InSurname());

        tf[2].addFocusListener(new InNote());

        this.setTitle("Student's directory - version 3");
    }
    public class InName implements FocusListener{
        public void focusGained(FocusEvent e) {
            if (tf[0].getText().equals("name"))
                tf[0].setText("");


        }
        public void focusLost(FocusEvent e){
            if (tf[0].getText().equals(""))
                tf[0].setText("name");

        }


    }
    public class InSurname implements FocusListener{
        public void focusGained(FocusEvent e) {
            if (tf[1].getText().equals("surname"))
                tf[1].setText("");
        }
        public void focusLost(FocusEvent e){
            if (tf[1].getText().equals(""))
                tf[1].setText("surname");
        }

    }


    public class InNote implements FocusListener{
        public void focusGained(FocusEvent e) {
            if (tf[2].getText().equals("note"))
                tf[2].setText("");
        }
        public void focusLost(FocusEvent e){
            if (tf[2].getText().equals(""))
                tf[2].setText("note");
        }
    }

        }



