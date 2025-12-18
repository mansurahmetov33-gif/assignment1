public class Student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public Student(String name, String id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setId(String id) {
        this.id = id;
    }



    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateGPA(double newGPA){
        if(newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        }
    }

    public void addCredits(int c) {
        if (c > 0){
            this.credits += c;
        }
    }

    public boolean isHonors(){
        return gpa >= 3.5;
    }

    public String toString(){
        return "Student:" + "name = " + name + ", id = " + id + ", major = " + major + ", gpa = " + gpa + ", credits = " + credits;
    }
}