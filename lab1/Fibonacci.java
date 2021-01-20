package com.company;

public class Fibonacci
{
    private int[] sequence;
    private int pairP;
    private int oddP;
    private final int length;

    Fibonacci(int len)
    {
        sequence = new int[len];
        length = len;
    }
    /**
     * outputs Fibonacci sequence with adjusted length , percent of odd and pair numbers in it
     */
    public void fibonacci(int first,int second)
    {
        int num = length;
        sequence[0] = first;
        sequence[1] = second;
        num-=2;
        for(int count = 2;num != 0;num--,count++)
        {
            sequence[count] = sequence[count-1]+sequence[count - 2];
        }
    }
    /**
     * Counts percent of odd and pair numbers in sequence
     */
    public void percent()
    {
        pairP = 0;
        for(int i:sequence)
        {
            if(i%2 == 0)
            {
                pairP++;
            }
        }
        pairP = (pairP*100/length);
        oddP = 100 - pairP;
    }
    /**
     * Outputs sequence and percent of odd and pair numbers
     */
    public void print(){
        System.out.print("Fibonacci sequence : \n");
        for(int t:sequence){
            System.out.print(" "+t+" ");
        }
        percent();
        System.out.print("\nPercent of odd is : "+oddP+"%\n");
        System.out.print("Percent of pair is : "+pairP+"% ");
    }
}