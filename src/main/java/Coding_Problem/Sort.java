package Coding_Problem;

public class Sort {


     public static void main()
     {
      int [] arr =   {0, 1, 2, 1, 0, 2, 1, 0} ;

      int count0= 0 , count1 = 0 ,count2 =0 ;

      for(int i : arr)
      {
          if(i ==0)
              count0++;
          if(i==1)
              count1++;
          if(i==2)
              count2++;
      }

      for(int i =0 ;i<arr.length ;i++)
      {
          if(i < count0 )
              arr[i] =0;
          else if (i < count0+count1 ) {
               arr[i] = 1 ;
          }
          else
              arr[i]  = 2 ;
      }




     }

}
