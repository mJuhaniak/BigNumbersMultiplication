public class Main {
    public static void main(String[] args)
    {
        String arg1 = args[0];
        String arg2 = args[1];
        int[] num1 = new int[arg1.length()];
        int[] num2 = new int[arg2.length()];

        for (int i = 0; i < arg1.length(); i++)
        {
            num1[i] = arg1.charAt(arg1.length() - i - 1) - '0';
            //System.out.print(num1[i]);
        }
        //System.out.println("");

        for (int i = 0; i < arg2.length(); i++)
        {
            num2[i] = arg2.charAt(arg2.length() - i - 1) - '0';
            //System.out.print(num2[i]);
        }
        //System.out.println("");

        MultiplyNumbers multiplication = new MultiplyNumbers(num1, num2);
    }
}
