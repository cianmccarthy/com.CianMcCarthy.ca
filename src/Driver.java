import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        UnderGrad [] graduates = new UnderGrad[10];

       // UnderGrad underGrad1 = new UnderGrad();

        //underGrad1.setName("David Clifford");
        //underGrad1.setAge(21);
        //underGrad1.setSubjects(subjects);
        //underGrad1.setCategory("Full Time");


        int i =0;
        String answer;

        answer = JOptionPane.showInputDialog("Would you like to enter some Under Graduates? (yes or no) ");

        while(answer.equals("yes") && i < graduates.length){

            String name, ageAsString, category;
            int age;

            name = JOptionPane.showInputDialog("Please the UnderGrads name: ");

            ageAsString = JOptionPane.showInputDialog("Please enter the age of the UnderGrad: ");
            age = Integer.parseInt(ageAsString);


            category = JOptionPane.showInputDialog("Please enter the category of his/her course: (Part Time/Full Time): " );

            UnderGrad underGrad1 = new UnderGrad(name, age, category);

            graduates[0] = underGrad1;


            JOptionPane.showConfirmDialog(null,"Would you like to enter another Under Graduate? ", "Under Graduates", JOptionPane.YES_NO_CANCEL_OPTION);

            i++;
        }

        public void selectOldestUnderGrad(){

        }

    }
}
