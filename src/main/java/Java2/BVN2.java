package Java2;

import java.util.Random;
import java.util.Scanner;

public class BVN2 {
    public static void main(String[] args) {
        /*
        Tìm “giá trị dương đầu tiên” trong mảng một chiều các số thực
        (duongdau). Nếu mảng không có giá trị dương thì trả về giá trị -1.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang n =");
        int n = in.nextInt();
        double arr[] = new double[n];
        //Random random = new Random();

        for (int i = 0; i < n; i++) {
        //    arr[i] = random.nextDouble(100);
            System.out.println("\tphan tu " + i + "=");
            arr[i] = in.nextDouble();
        }
        in.close();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0){
                System.out.printf("duongdau = %f tai vi tri %d", arr[i], i);
                break;
            }
        }
    }
}
