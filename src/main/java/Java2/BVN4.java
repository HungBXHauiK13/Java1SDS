package Java2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BVN4 {
    /*
    Tìm “một vị trí mà giá trị tại vị trí đó là giá trị nhỏ nhất” trong mảng
    một chiều các số thực (vitrinhonhat)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int n = in.nextInt();
        in.close();

        double array[] = new double[n];
        Random random = new Random();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                array[i] = random.nextDouble(100);
                System.out.print(array[i] + "\t");
            }
        }else System.out.println("Điều kiện không hợp lệ");
        double min = array[0];
        int index_min = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
               index_min = i;
               min = array[i];
            }
        }

        System.out.printf("\nMin = %f tại vị trí %d", min, index_min);
    }


}
