public class Student {

    String name = "Demon";

    Student(){
        System.out.println("Student Name:"+name);
    }

}

class Branch extends Student{

    String name = "Stefan";
    String branch = "CSE";

    Branch(){
        super();
        System.out.println("Branch:"+branch);
    }

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Name:"+super.name);
    }


}

class Main{
    public static void main(String[] args) {
        Student s = new Student();
        Branch b = new Branch();

        b.display();
    }
}

