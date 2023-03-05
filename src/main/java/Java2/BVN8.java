package Java2;

import java.util.Scanner;

public class BVN8 {
    /*
    Hãy tìm “vị trí giá trị dương nhỏ nhất” trong mảng một chiều các số
    thực (vtduongnhonhat)
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
        int index_duongnhonhat = 0;
        for (int i = 0; i < n; i++) {
            if (index_duongnhonhat > arr[i] && arr[i] > 0){
                index_duongnhonhat = i;
            }
        }
        System.out.printf("\nduongnhonhat = %d", index_duongnhonhat);
    }
}
