package com.company ;

public class Output
{
    private int Pair;
    private int Odd;
    private int start;
    private int end;

    Output(int st ,int ed)
    {
        start = st;
        end = ed;
    }
    /**
     * outputs interval,all pair numbers in ascending sequence
     */
    public  void interval()
    {
        System.out.print("Interval: \n");
        for(int num = start;num<=end;num++)
        {
            System.out.print(num + " ");
        }
    }
    public void pair()
    {
        int sum = 0;
        System.out.print("\nPair numbers in range are : \n");
        for(int num = end;num != start;num--)
        {
            if(num % 2 == 0)
            {
                System.out.print(num + " ");
                sum+=num;
            }
        }
        System.out.print("\nSum of pair : "+sum+";\n");
        Pair = end % 2 == 0 ?end:end - 1;
    }

    /**
     * outputs all odd numbers in descending sequence
     */
    public void odd()
    {
        int sum = 0;
        System.out.print("Odd numbers in range are : \n");
        for(int num = start;num != end;num++)
        {
            if(num % 2 != 0)
            {
                System.out.print(num + " ");
                sum += num;
            }
        }
        System.out.print("\nSum of odd : "+sum+ ";\n");
        Odd = end % 2 == 0 ?end - 1:end;
    }

    public int getLPair()
    {
        return Pair;
    }
    public int getLOdd()
    {
        return Odd;
    }
}