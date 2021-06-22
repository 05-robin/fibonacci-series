
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        n=s.nextInt();
        int t1=0,t2=1;
        System.out.print(t1+","+t2);
        int nextterm = 0;
        for(int i=1;i<=n;i++)
        {
            nextterm=t1+t2;
            System.out.print(","+nextterm);
            t1=t2;
            t2=nextterm;
        }
        System.out.println();        
    }
    
}
