public abstract class Student implements Categorizable{
    private String name;
    private int age;

    public Student(){
        this.name = "Unknown Name";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age){
        setName(name);
        setAge(age);
    }

    // public abstract Student implements Categorizable(){};

    public String toString() {
        return "Name: " + getName() + "Age: " + getAge();
    }
}
