package Java1;

import java.util.Scanner;

public class BVN_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap canh 1");
        double a = in.nextDouble();
        System.out.println("Nhap canh 2:");
        double b = in.nextDouble();
        System.out.println(("Nhap canh 3"));
        double c = in.nextDouble();
        in.close();

        if (( a + b <= c) || (a + c <= b) || (b + c <= a)){
            System.out.println("Khong tao thanh tam giac");
        } else {
            if (( a == b) && ( b == c)){
                System.out.println("Day la tam giac deu");
            } else if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
                System.out.println(("Day la tam giac vuong"));
            } else if ( a == b || b == c || c == a) {
                System.out.println("Day la tam giac can");
            } else System.out.println("Tam giac thuong");
        }
    }
}
