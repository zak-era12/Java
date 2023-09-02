//Method Overloading by changing the data type of parameters

class MethodOverloading2{
	public void overloadingMethod(int num,String string){
		System.out.println("Method with integer and String inputs is called.");
	}
	public void overloadingMethod(int num1,float num2){
		System.out.println("Method with integer and float inputs is called.");
	}
}

class MethodOverloadingWithDifferentDataTypes{
	public static void main(String[] args){
		MethodOverloading2 obj=new MethodOverloading2();
		obj.overloadingMethod(10,"Overloading");
		obj.overloadingMethod(1,5.3f);
	}
}