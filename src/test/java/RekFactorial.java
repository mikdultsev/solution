public class RekFactorial {
    int fact(int n)
    {
        int result;

        if(n==1)
            return 1;

        result = fact(n-1) * n;
        return result;
    }
}

class Factoriall
{
    public static void main(String args[])
    {
        RekFactorial obj = new RekFactorial();

        int s = obj.fact(5);
        System.out.println("The factorial is : " + s);
    }
}
