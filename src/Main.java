public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Mansur Akhmetov", "SE2517","SE" );
        Student s2 = new Student("Princeton Davud", "CS8296","CS" );
        Student s3 = new Student("Rosaleen Kronos", "IT2001","IT" );
        Student s4 = new Student("Veli Frej", "IT3372","IT" );
        Student s5 = new Student("Jamal Tryggvi", "CS8544","CS" );

        s1.updateGPA(3);
        s1.addCredits(67);
        s2.updateGPA(3.5);
        s2.addCredits(70);
        s3.updateGPA(3.7);
        s3.addCredits(65);
        s4.updateGPA(2.8);
        s4.addCredits(43);

        Student[] arr = {s1, s2, s3, s4, s5};


        for (Student s : arr) {
            System.out.println(s);
        }

        Course course = new Course("Object Oriented Programming", "Dr. Smith", 5);

        for (int i = 0; i < arr.length; i++) {
            course.addStudent(arr[i], i);
        }



        System.out.println();
        System.out.println("Top GPA student: " + getTopStudent(arr));
        System.out.println("Honors count: " + countHonors(arr));
        System.out.println("Total credits: " + totalCredits(arr));
    }

    public static Student getTopStudent(Student[] arr) {
        Student top = null;

        for (Student s : arr) {
            if (s != null) {
                if (top == null || s.getGpa() > top.getGpa()) {
                    top = s;
                }
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;

        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int sum = 0;

        for (Student s : arr) {
            if (s != null) {
                sum += s.getCredits();
            }
        }
        return sum;
    }


}