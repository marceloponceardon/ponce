import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SortIntArrayRec2
{

 public static void main(String[] args)
 throws IOException
 // Illustrates constructive merge sort to sort an array of integers
 {
  int n;
  int[] array, array1;
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter number of integers : ");
  n = Integer.parseInt(in.readLine());
  array = new int[n];
  for(int i=0; i<n; i++)
     {
      System.out.print("Enter integer "+i+": ");
      array[i] = Integer.parseInt(in.readLine());
     }
  System.out.println("The array you entered is:");
  System.out.println(arrayToString(array));
  array1 = sort(array);
  System.out.println("After sorting, the array is:");
  System.out.println(arrayToString(array));
  System.out.println("The new array is:");
  System.out.println(arrayToString(array1));
 }

 private static String arrayToString(int[] a)
 {
  String str="[";
  if(a.length>0)
     {
      str+=a[0];
      for(int i=1; i<a.length; i++)
         str+=","+a[i];
     }
  return str+"]";
 }

 public static int[] sort(int[] a)
 // Sort the contents of array a in ascending numerical order
 // and return in a new array
 {
  if(a.length>1)
     {
      int i,mid = a.length/2;
      int[] half1 = new int[mid];
      int[] half2 = new int[a.length-mid];
      for(i=0; i<mid; i++)
         half1[i]=a[i];
      for(; i<a.length; i++)
         half2[i-mid]=a[i];
      half1=sort(half1);
      half2=sort(half2);
      int j=0, k=0;
      int[] b = new int[a.length];
      for(i=0; j<half1.length&&k<half2.length; i++)
         if(half1[j]<half2[k])
            {
             b[i]=half1[j];
             j++;
            }
         else
            {
             b[i]=half2[k];
             k++;
            }
      for(; j<half1.length; i++, j++)
         b[i]=half1[j];
      for(; k<half2.length; i++, k++)
         b[i]=half2[k];
      return b;
     }
  else
     {
      int[] b = new int[1];
      b[0]=a[0];
      return b;
     }
 }

}