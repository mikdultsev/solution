public class Razbienie {
    public static void main(String args[]) {
        String stroka = "Razbienie";
        char[] strokaToArray = stroka.toCharArray();

        for(int i = 0; i < strokaToArray.length; i++) {
            System.out.print(strokaToArray[i] + " ");
        }
    }
}
