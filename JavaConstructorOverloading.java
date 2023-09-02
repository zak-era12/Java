//Practical 1A
//Program to demonstrate Java Constructor Overloading
class JavaConstructorOverloading {

  String language;
  String str;

  // constructor with no parameter
  JavaConstructorOverloading() {
    this.language = "Java";
  }

  // constructor with a single parameter
  JavaConstructorOverloading(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) {

    // call constructor with no parameter
    JavaConstructorOverloading obj1 = new JavaConstructorOverloading();

    // call constructor with a single parameter
    JavaConstructorOverloading obj2 = new JavaConstructorOverloading("Python");

    obj1.getName();
    obj2.getName();
  }
}
