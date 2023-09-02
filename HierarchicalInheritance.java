public class HierarchicalInheritance
{
    public static void main(String args[])
    {
        //Assigning ClassH2 object to ClassH2 reference
        ClassH2 h2 = new ClassH2();
        //call dispH2() method of ClassH2
        h2.dispH2();
        //call dispH1() method of ClassH1
        h2.dispH1();
        
        
        //Assigning ClassH3 object to ClassH3 reference
        ClassH3 h3 = new ClassH3();
        //call dispH3() method of ClassH3
        h3.dispH3();
        //call dispH1() method of ClassH1
        h3.dispH1();
        
        //Assigning ClassH4 object to ClassH4 reference
        ClassH4 h4 = new ClassH4();
        //call dispH4() method of ClassH4
        h4.dispH4();
        //call dispH1() method of ClassH1
        h4.dispH1();
    }
}
