package quick_sort;
import java.util.*;
/**
 *
 * @author Devika
 */
public class Quick_Sort {
   
    public static int partition(int a[],int p,int r)
    {
    int x = a[r];     // store last element as pivot
    int i=p-1,temp;   
    for(int j=p;j<r;j++)  // scan from start of array passed till element right before pivot
    {
        if(a[j]<x)    //element less than pivot found
        {
            i++;      //move it to the left of array
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    temp= a[i+1];   //put pivot element in its correct position
    a[i+1]=a[r];
    a[r]=temp;
    return i+1;  //return index of pivot
    }
    public static void quicksort(int a[],int p, int r)
    {
        if(p<r)  //check start index less than end index
        {
            int q= partition (a,p,r);
            quicksort(a,p,q-1);
            quicksort(a,q+1,r);
        }
            
    }
    
    public static void print(int a[],int n)
    {
         for(int i=0;i<n;i++)
        {
            System.out.print(a[i] + "\t");
            
        }
         System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to sort");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Unsorted list is :");
        print(a,n);
        quicksort(a,0,n-1);
        System.out.println("Sorted list is :");
        print(a,n);
    }
    
}
