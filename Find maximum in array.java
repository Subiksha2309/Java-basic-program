// import java.util.*;

// public class maximum {
//     public static void main(String[] args) {
//     {
//         int arr[] = {23,45,82,27,66,12,78,13,71,86};
//         int n = arr.length;
//         int result = arr[0],index=0;
//         // int index=0;
//          for(int i=0; i<n; i++){
//            if(arr[i]>result)
//               result = arr[i];
//               index = i;  
            
//          }
//          System.out.println("Max no in array:  "+result);
//          System.out.println("index of max no: "+index);
//       }
//     }
// }


import java.util.*;

public class maximum {
    public static void MaxInArray(int arr[], int n,int index)
    {
        int result = arr[0];
         for(int i=0; i<n; i++){
           if(arr[i]>result)
              result = arr[i];
              index = i;  
            
         }
        System.out.println("Max no in array: "+result);

         System.out.println("index of max no: "+index);
      }
        public static void main(String[] args) {
        {
            int arr[] = {23,45,82,27,66,12,78,13,71,86};
            int n = arr.length;
            int index=0;
            MaxInArray(arr,n,index);
    }
  }
}

