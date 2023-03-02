package Java1;

import java.util.Scanner;
import java.lang.Math;
public class BVN_3 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số:
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Xin moi nhap x =");
        double x = in.nextDouble();
        in.close();
        double result1 = 2 * Math.pow(x,2) + 5 * x + 9;
        double result2 = -2 * Math.pow(x,2) + 4 * x - 9;
        if(x >= 5){
            System.out.printf("Gia tri cua phuong trinh %f", result1);
        }else System.out.printf("Gia tri cua phuong trinh %f", result2);
    }
}
