class Student{
    static String college = "Amity Noida";
    String name;

    static void show() {
        System.err.println(name);
    }
    
}


class Mathutils {
    static int add (int a, int b){
        return a + b;    
    }
    static int sub (int a, int b){
        return a - b;    
    }
    static int mul (int a, int b){
        return a * b;    
    }
    static int div (int a, int b){
        return a / b;    
    }
}

class Database {
    static {
        System.out.println("Initializing Database...");
    }
}

class Outer {
    static class Inner {
        void show(){
            System.out.println("This is Inner Class");
        }
    }
}

public class College {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.name = "Suraj";
        s2.name = "Manav";

        System.out.println(s1.college);
        System.out.println(s2.college);

        System.out.println(Student.college);
    
        System.out.println(Mathutils.add(10, 20));
        System.out.println(Mathutils.sub(10, 20));
        System.out.println(Mathutils.mul(10, 20));
        System.out.println(Mathutils.div(10, 20));
    }
}
