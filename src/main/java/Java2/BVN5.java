package Java2;

import java.util.Scanner;

public class BVN5 {
    public static void main(String[] args) {
        /*
        Tìm “vị trí của giá trị chẵn đầu tiên” trong mảng một chiều các số
        nguyên (vitrichandau). Nếu mảng không có giá trị chẵn thì hàm sẽ trả
        về giá trị là – 1
         */
        Scanner in = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua mang: ");
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("\nPhan tu thu %d: ",i);
            a[i] = in.nextInt();
            System.out.printf("\nPhan tu thu %d = %d",i,a[i]);
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        int index_chandau =  0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0){
                index_chandau = i;
                System.out.printf("\nvitri_chandau = %d", i);
                break;
            }
        }
    }
}
