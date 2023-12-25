class finalVar 
{
    final int i = 21;
    public static void main(String[] args) 
    {
        final int i;
        i = 10; // final variable must be initialized
        // int i = 5; // eduplicate local variable i is not allowed
        System.out.println("value of final variable is: "+i);
        // i = 20; // cannot re assign a value to final variable i
    }    
}
/* final variables are constant.  */
