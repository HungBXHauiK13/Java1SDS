package Java2;

import java.util.Random;
import java.util.Scanner;

public class BVN1 {
    public static void main(String[] args) {
        /*
        Viết hàm tìm “giá trị lớn nhất” trong mảng một chiều số thực (lonnhat).
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int n = in.nextInt();
        in.close();
        double arr[] = new double[n];
        Random random = new Random();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextDouble(100);
                System.out.print(arr[i] + "\t");
            }
        } else System.out.println("n không hợp lệ");
        // tìm max
        double max = arr[0];
        int index_max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]){
                max = arr[i];
                index_max = i;
            }
        }
        System.out.printf("Max = %d", max);
        System.out.printf("\nVị trí max = %d", index_max);
    }
}
