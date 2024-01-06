class ControlStructures 
{
    public static void main(String[] args) 
    {   // if - else statement
        int a = 10;
        if (a == 10) 
        {
            System.out.println("a is 10");
        } 
        else 
        {
            System.out.println("a is not 10");
        }


        // nested if
        int z = 10; int j = 25; int k = 900;
        int b = 67,c = 68,d = 69;
        if(z==10)
        {
            if(j<20) a = b;
            if(k>100) c = d; //this if is
            else a = c;      // assocoated with this else
        }
        else a = d;
        System.out.println("a: "+a);

    


    //switch statement
    /*
     * multi-way branch decision making statement.
     * works with byte, short, char, int, primitive data types and their wrapper classes, String, enum.
     */
    int number=20;  
    //Switch expression  
    switch(number)
    {  
        //Case statements  
        case 10: System.out.println("10");  
            break;  
        case 20: System.out.println("20");  
            break;  
        case 30: System.out.println("30");  
            break;  
        //Default case statement  
        default:System.out.println("Not in 10, 20 or 30");  
    }
    for(int i = 0; i<10; i++)
    {
        switch(i)
        {
            case 0:
                System.out.println("i is zero");
                break;
            case 1:
                System.out.println("i is one");
                break;
            case 2:
                System.out.println("i is two");
                break;
            case 3:
                System.out.println("i is three");
                break;
            default:
                System.out.println("i is greater than 3");
        }
    }

    // the java switch statement is fall through that means it executes all statement after first match if break statement is not used with switch cases.
}
}

