class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child's display method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
    }
}
