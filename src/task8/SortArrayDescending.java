package task8;
import java.util.Scanner;

public class SortArrayDescending {

	public static void main(String[] args) {
		
		int n, temp;
        Scanner s = new Scanner(System.in);
        //taking number of elements for array to store from user
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        //taking elements from user as input
        System.out.println("Enter all the elements:");
        //logic to sort the array in descending order
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        s.close();
        //printing results to stdout
        System.out.print("Descending Order is :");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}