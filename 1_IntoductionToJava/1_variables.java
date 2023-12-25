class Variables
{
    int undeclaredVariable; // printing this uninitialized variable will give error
    // System.out.println("value of undeclared variable is: "+undeclaredVariable);
    int z = 40; // instance variable
    static int j = 10; // static variable
    void method1()
    {
        int i = 10; // local variable
        System.out.println("value of i in method1 is: " + i);
    }
    public static void main(String[] args) 
    {
        int k = 20; // local variable
        System.out.println("value of static variable is: "+j);
        System.out.println("value of local variable declared inside main is: "+k);
        System.out.println("value if instanstace variabloe is: "+new Variables().z);
        new Variables().method1();


         // static int a = 10; 
        // static variable cannot be declared inside a method; Illegal modifier for parameter a; only final is permitted
    }
}
/*
 * 3 different types of variables:
 * 1. Local Variables: 
        - Variables decalred inside a method.
        -  we cannot use access specifiers with local variable
        - we cannot use static keyword with local variable
        - we cannot declare local variable as final, abstract, synchronized, volatile, transient
 * 2. Instance Variables:
        - Variables declared inside a class but outside a method.
        - we can use access specifiers with instance variable
        - we can declare instance variable as final, abstract, synchronized, volatile, transient
        - To print the instance member we have to use the instance or object.
 * 3. Static Variables:
        - Variables declared inside a class but outside a method with static keyword.
        - we can use access specifiers with static variable
        - we can declare static variable as final, abstract, synchronized, volatile, transient
        - You can create a single copy of the static variable and share it among all the instances of the class. 
        - Memory allocation for static variables happens only once when the class is loaded in the memory.
 */
