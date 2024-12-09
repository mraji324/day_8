import java.util.*;
public class Additionarrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr1[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            arr1[i][j]=sc.nextInt();
            }
        }
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
            arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}