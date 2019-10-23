import javax.swing.*;

public class UnderGrad extends Student {
    private String [] subjects;
    private String category;

    public UnderGrad(){
        this.subjects = null;
        this.category = "Unknown Category";
    }

    public String[] getSubjects() {

        for(int j=0; j<subjects.length;j++){
            JOptionPane.showMessageDialog(null,subjects,"All Subjects",JOptionPane.INFORMATION_MESSAGE);
        }
        return subjects;
    }

    public String getCategory() {
        return category;
    }

    public void setSubjects(String[] subjects) {

        for(int i = 0; i < 10; i++){
           String subject;

           subject = JOptionPane.showInputDialog("Please enter an UnderGrad subject(return to exit): ");

           subjects[0] = subject;

           subject = JOptionPane.showInputDialog("Please enter another UnderGrad subject(return to exit): ");

           i++;
        }

        this.subjects = subjects;
    }

    public void setCategory(String category) {
        this.category = "Full Time";
    }

    public UnderGrad(String name, int age){
        super(name, age);
        setSubjects(subjects);
    }

    public String toString() {
        return super.toString() + "Subjects: " + getSubjects() + "Category: " + getCategory();
    }
}
