public class BreakLabel 
{
    public static void main(String[] args) {
        outer: for(int i = 0; i<3; i++)
        {
            System.out.println("Pass " + i + ": ");
            for(int j = 0; j<50;j++)
            {
                if(j==10) break outer;
                System.out.println(j + " ");
            }
            System.out.println("This will not print");
        }
        System.out.println("Loops complete");
    }
}
