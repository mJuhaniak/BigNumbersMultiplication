public class Main {
    public static void main(String args[])
    {
        String arg1 = args[0];
        String arg2 = args[1];
        int[] num1 = new int[arg1.length()];
        int[] num2 = new int[arg2.length()];

        for (int i = 0; i < arg1.length(); i++)
        {
            num1[i] = arg1.charAt(i) - '0';
        }

        for (int i = 0; i < arg2.length(); i++)
        {
            num2[i] = arg2.charAt(i) - '0';
        }

        MultiplyNumbers mn = new MultiplyNumbers(num1, num2);
    }
}
