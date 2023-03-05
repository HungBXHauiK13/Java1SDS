package Java2;

import java.util.Scanner;

public class BVN7 {
    /*Hãy tìm “giá trị dương nhỏ nhất” trong mảng các số thực
    (duongnhonhat). Nếu mảng không có giá trị dương thì trả về giá trị
    không dương là – 1
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhập kích thước mảng: ");
        int n = in.nextInt();
        double arr[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("nhập phần tử %d:", i);
            arr[i] = in.nextDouble();
        }
        double min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i] && arr[i] > 0){
                min = arr[i];
            }
        }
        System.out.printf("\nduongnhonhat = %f", min);
    }
}
