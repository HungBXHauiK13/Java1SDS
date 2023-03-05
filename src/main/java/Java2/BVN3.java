package Java2;

import java.util.Random;
import java.util.Scanner;

public class BVN3 {
    public static void main(String[] args) {
        /*
        Tìm “số chẵn cuối cùng” trong mảng một chiều các số nguyên
        (chancuoi). Nếu mảng không có giá trị chẵn thì trả về giá trị -1.
        */
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        int n = in.nextInt();
        double arr1[] = new double[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            //arr1[i] = rand.nextDouble(100);
            System.out.println("\tphan tu " + i + "=");
            arr1[i] = in.nextDouble();
        }
        in.close();

        for (int i = n - 1; i > 0; i -- ) {
            if (arr1[i] > 0 && arr1[i] % 2 == 0 ){
                System.out.printf("\nchancuoi = %f",arr1[i]);
                break;
            }
        }
    }
}
