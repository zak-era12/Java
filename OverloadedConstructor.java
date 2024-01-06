//class with multiple constructors
class DemoClass{
      int  val1;
      int  val2;
      //no args Constructor
      DemoClass(){
       val1 = 10;
       val2 = 20;
       System.out.println("DemoClass:: No argument Constructor");
     }
     //Overloaded Constructor
     DemoClass(int num1){
      val1 = num1;
      val2 = num1;
      System.out.println("DemoClass:: Overloaded Constructor with one argument");
    }
    //Overloaded
    DemoClass(int num1,int num2){
    val1 = num1;
    val2 = num2;
    System.out.println("DemoClass:: Overloaded Constructor with two arguments");
   }
   public void display(){
      System.out.println("val1 === "+val1 + " ; val2 === "+val2 );
       
  }
}
class OverloadedConstructor{
  public static void main(String args[]){
    DemoClass d1 = new DemoClass();     //object with no-args Constructor
    d1.display();
    DemoClass d2 = new DemoClass(10);   //object with 1 arg Constructor
    d2.display();
    DemoClass d3 = new DemoClass(20,40); //object with 2 arg Constructor
    d3.display();
  }
}