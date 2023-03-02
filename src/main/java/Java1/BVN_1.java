package Java1;

import java.util.Scanner;

public class BVN_1 {
    public static void main(String[] args) {
        /*
        Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Xin moi nhao so a =");
        double a = input.nextDouble();
        System.out.println("Xin moi nhap so b =");
        double b = input.nextDouble();
        System.out.println("Xin moi nhao so c =");
        double c = input.nextDouble();
        input.close();

        if((a > b) && (a > c)){
            System.out.println("a la max");
            System.exit(0);
        }
        if((b > a) && (b > c)){
            System.out.println("b la max");
            System.exit(0);
        }
        if((c > a) && (c > b)){
            System.out.println("c la max");
            System.exit(0);
        }
    }

}
