package learning;

import java.util.Scanner;

public class csh {
    public static void main(mString[] args) {
        double[] x=new double[5];


        for (int i=0;i<5;i++){
            Scanner s=new Scanner(System.in);
            x[i]=s.nextDouble();
            System.out.println(x[i]);
        }
        for (int i=0;i<5;i++){
            if(i<4)System.out.print(x[i]+" "+">>>>>");
            else System.out.print(x[i]);
        }
    }
}
