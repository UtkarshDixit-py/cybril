import java.util.*;

public class Main {
  
    public static void uniqueTriplets (int arr[]){
    int i;
       
        
        Arrays.sort(arr);
        boolean flag = false;
        for (i = 0; i < arr.length - 2; i++)
        {
            if (i == 0 || arr[i] > arr[i - 1]){
              
            
                int start = i + 1;
       
                int end = arr.length - 1;
       
                int target = 0 - arr[i];
       
                while (start < end)
                {
                    if (start > i + 1
                        && arr[start] == arr[start - 1])
                    {
                        start++;
                        continue;
                    }
       
                 
                    if (end < arr.length - 1
                        && arr[end] == arr[end + 1])
                    {
                        end--;
                        continue;
                    }
                    if (target == arr[start] + arr[end])
                    {
                        System.out.printf("%d %d %d\n", arr[i], arr[start], arr[end]);
                             
                        flag = true;
                        start++;
                        end--;
                    }
                    else if (target > (arr[start] + arr[end]))
                    {
                        start++;
                    }
                    else {
                        end--;
                    }
                }
            }
        }
       
        if (flag == false) {
            System.out.print("No Such Triplets Exist");
        }
      
    }
  
    public static void main(String[] args) {
        int array[] = {-1,0,1,2,-1,4};
        
        uniqueTriplets(array);

  }
}