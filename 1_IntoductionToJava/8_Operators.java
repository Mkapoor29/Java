class Operators 
{
    public static void main(String[] args) 
    {
        /*Arithmatic operators 
             +, -, *, /, %, ++, --
         
        */
        // Integer arithmatic
        int a = 10;
        int b = 6;
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b)); // fractional part is trunacted.
        System.out.println("a%b: "+(a%b)); // remainder of division arthematic.

        // for modulo operator, sign of result is same as sign of dividend(first operand).
        // -10%6 = -4 , 10%-6 = 4 and -10%-6 = -4
        int c = -6;
        System.out.println("a%c: "+(a%c));


        // Floating point arithmatic
        // Unlinke c and c++, modulus operator can be applied to floating point numbers. The floating point modulus operator returns the floating point equivalent of am integer division. What this means id that the division carried out with both floating point operands, but the resulting divisor is treated as an integer, resulting in floating point remainder.
        float d = 10.5f;
        float e = 6.5f;
        System.out.println("d+e: "+(d+e));
        System.out.println("d-e: "+(d-e));
        System.out.println("d*e: "+(d*e));
        System.out.println("d/e: "+(d/e)); // fractional part is not trunacted.
        System.out.println("d%e: "+(d%e)); // remainder of division arthematic.


        System.out.println(15/10.0); // produces 1.5
        System.out.println(15/10); // produces 1


        // ---------------------------------------
        // increment and decrement operators
        int i = 10;
        // int j = i++; // j = 10, i = 11 //first b is assigned value of a and then a is incremented.
        // int j = ++i; // j = 11, i = 11 //first a is incremented and then b is assigned value of a.
        System.out.println("i: "+i);  //10
        System.out.println("i++: "+i++); //  prints 10 i becomes 11
        System.out.println("i: "+i); // 11
        System.out.println("++i: "+ ++i); // i = 12 prints 12
        System.out.println("i: "+i); //12


        // practice
        int y = 7;
        int x = ++y*8;
        System.out.println("x: "+x); // 64


        float v = 7/4 * 9/2; // 7/4 = 1.0 and 9/2 = 4.0 so 1.0*4.0 = 4.0 ;
        System.out.println("v: "+v); 
        // the answer comes out to be 4.0 which is incorrect.
        // this is because the result of integer division is always an integer.
        // the correct way is to use floating point numbers.
        float v1 = 7/4.0f * 9/2.0f;
        System.out.println("v1: "+v1); // 7.875
    }    
}
