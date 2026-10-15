class Student{

    String sname;
    String semester;
    double CGPA;

        Student(){
            // this("Vani","4th",9.00);
            String sname = "Krish Kapoor";
            String semester = "4th";
            double CGPA = 7.09;
            
            System.out.println("Name:"+sname);
            System.out.println("Semester:"+semester);
            System.out.println("CGPA:"+CGPA);

            System.out.println("Name:"+this.sname);
            System.out.println("Semester:"+this.semester);
            System.out.println("CGPA:"+this.CGPA);
        }

        // Student(String name, String sem, double cgpa){
        //     // this();
        //     sname = name;
        //     semester = sem;
        //     CGPA = cgpa;
        // }

        public static void main(String[] args){
            // Student s1 = new Student("Eren","6th",8.76);
            Student s1 = new Student();
            // System.out.println("Name:"+s1.sname);
            // System.out.println("Semester:"+s1.semester);
            // System.out.println("CGPA:"+s1.CGPA);
        }
}