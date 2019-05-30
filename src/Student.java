
import java.io.*;
class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    String name,surname; int note;
    Student(String name, String surname, int note){this.name = name;this.surname = surname;this.note = note;}
    public String toString(){
        return name+" "+ surname +" "+note;
    }
}