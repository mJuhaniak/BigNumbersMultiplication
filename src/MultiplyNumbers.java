

public class MultiplyNumbers {

    private int[] num1;
    private int[] num2;
    private int[] result;

    public MultiplyNumbers(int[] num1, int[] num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = new int[num1.length + num2.length];

        this.MultiplicateNumbers();

        if (this.result[0] == 0)
        {
            this.CutResult();
        }

        this.PrintResult();
    }

    private void MultiplicateNumbers()
    {
        int carry;
        int indexResult;
        for (int i = 0; i < this.num1.length; i++) {

            carry = 0;
            indexResult = this.result.length - i - 1;

            if(this.num1[i] == 0)
            {
                continue;
            }

            for (int j = 0; j < this.num2.length; j++) {
                int sum = this.num1[i] * this.num2[j] + carry + this.result[indexResult];
                carry = sum / 10;
                this.result[indexResult] = sum % 10;

                if (j + 1 == this.num2.length)
                {
                    this.result[indexResult - 1] = carry;
                }

                indexResult--;
            }
        }
    }

    private void CutResult()
    {
        int[] newResult = new int[this.result.length - 1];
        for (int i = 0; i < newResult.length; i++)
        {
            newResult[i] = this.result[i + 1];
        }
        this.result = newResult;
    }

    private void PrintResult()
    {
        for (int i : this.result) {
            System.out.print(i);
        }
    }
}
