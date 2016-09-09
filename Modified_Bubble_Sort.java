package modified_bubble_sort;

import java.util.Scanner;

/**
 *
 * @author Devika
 */
public class Modified_Bubble_Sort {

     void display(int arr[],int n)
    {
    for(int i=0;i<n;i++)
        System.out.print(arr[i] + "\t");
    }
    
    void sort(int arr[],int n)
    {
        int temp;
        boolean flag = false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                }
            }
            if(flag==false)
                break;
        }

    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sorted");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements to be sorted");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
       Modified_Bubble_Sort b = new Modified_Bubble_Sort();
        System.out.println("Original array is");
        b.display(arr,n);
        b.sort(arr,n);
        System.out.println("Sorted array is");
        b.display(arr,n);
        
}
    
}
