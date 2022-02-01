

public class MultiplyNumbers {

    private int[] num1;
    private int[] num2;
    private int[] result;
    private int carry;
    private int indexResult;

    public MultiplyNumbers(int[] num1, int[] num2) {
        this.num1 = this.RotateNumber(num1);
        this.num2 = this.RotateNumber(num2);
        this.result = new int[num1.length + num2.length];
        this.carry = 0;
        this.indexResult = 0;

        for (int i = 0; i < this.num1.length; i++) {

            this.carry = 0;
            this.indexResult = i;

            if(this.num1[i] == 0)
            {
                continue;
            }

            for (int j = 0; j < this.num2.length; j++) {
                int sum = this.num1[i] * this.num2[j] + this.carry + this.result[this.indexResult];
                this.carry = sum / 10;
                this.result[this.indexResult] = sum % 10;

                if (j + 1 == this.num2.length)
                {
                    this.result[this.indexResult + 1] = this.carry;
                }

                this.indexResult++;
            }
        }

        this.result = this.RotateNumber(this.result);

        if (this.result[0] == 0)
        {
            int[] newResult = new int[this.result.length - 1];
            for (int i = 0; i < newResult.length; i++)
            {
                newResult[i] = this.result[i + 1];
            }
            this.result = newResult;
        }

        for (int i = 0; i < this.result.length; i++) {
            System.out.print(this.result[i]);
        }
    }

    private int[] RotateNumber(int[] inputNumber)
    {
        int[] result = new int[inputNumber.length];
        for (int i = 0; i < inputNumber.length; i++)
        {
            result[i] = inputNumber[inputNumber.length - i - 1];
        }
        return result;
    }
}
