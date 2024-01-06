class DefaultConstructor {
 
int num;
boolean flag;
DefaultConstructor()
 {
  //Empty Constructor
 }
public static void main(String[] args) {        
 
         // A default constructor is called        
        DefaultConstructor obj = new DefaultConstructor();   
 
System.out.println("num:default value = " + obj.num);
System.out.println("flag:default value = " + obj.flag);
    }
}
