package Java1;

import java.util.Scanner;

public class BVN_2 {
    public static void main(String[] args) {
        /*
        Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
        dấu hay không.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap so thu nhat:");
        double S1 = input.nextDouble();
        System.out.println("Moi nhap so thu hai:");
        double S2 = input.nextDouble();
        input.close();

        if (S1 != 0 && S2 != 0) {
            if (S1 * S2 > 0)
                System.out.println("2 so cung dau");
            else System.out.println("2 so khong cung dau");
        } else System.out.println("khong thoa man dieu kien");
    }
}
