public class Factorial {
    static int vychislenieFactoriala(int t){
    int result = 1;
    for (int i = 1; i <=t; i ++){
        result = result*i;
    }
    return result;
}

    public static void main(String[] args){
        System.out.println(vychislenieFactoriala(5));
    }
}
