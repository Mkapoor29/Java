class CLIArgument  
{
    public static void main(String args[]) {
        System.out.println("Number of arguments passed: "+args.length);
        System.out.println("Arguments passed are: ");
        for(int i = 0; i<args.length; i++)
        {
            System.out.println(args[i]);
        }
    }    
}
/*
  complie -> javac 4_CLIArgument.java
  execute -> java CLIArgument a b c d
  here a,b,c,d will be the elements of args[].
*/
