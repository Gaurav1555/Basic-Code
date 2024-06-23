public class temp{
    public static void main(String args[]){

        student s = new student();
        student r = new student();
        s.name="gaurav";
        s.age=22;

        s.walk(22);

        System.out.println(s.name);

        student gv = new student(22);

        gv.eat();
        gv.walk(22);
        System.out.println(student.count);
    }
}

class student{

    int age;
    String name;
    static int count;

     public student(){
           count++;
           System.out.println("A object of student is created:");
    }

      student(String name){
            this.name=name;
      }

    public student(int age){
        this();
        this.age= age;
        
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    void walk(int step){
        System.out.println(name+" walks "+step+" steps");
    }

}