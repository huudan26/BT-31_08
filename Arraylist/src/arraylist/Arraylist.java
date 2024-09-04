
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("nhap phan tu thu:  " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    
    public static void printData(float[] arrays) {
        System.out.print("Mang so thuc: ");
        for (float value : arrays) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

   
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;
        for (float value : arrays) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value < max1) {
                max2 = value;
            }
        }
        return max2;
    }

    
    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> list = new ArrayList<>();
        for (float value : arrays) {
            if (value % 2 == 0) {
                list.add(value);
            }
        }
        float[] newArray = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        float[] arrays = new float[n];

        
        arrays = importData(arrays);

        
        printData(arrays);

        
        float max2 = findMax2(arrays);
        System.out.println("phan tu lon thu 2 trong mang: " + max2);

        // Xóa các phần tử lẻ
        arrays = deleteOddNumber(arrays);
        System.out.print("mang sau khi xoa phan tu le: ");
        printData(arrays);
    }
}
    
