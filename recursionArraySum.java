public class recursionArraySum
 {
    static int sum=0;
    public static int s(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return sum;
        }
        sum=sum+arr[i];
        return s(arr, i+1);
    }
    public static void main(String[] args)
     {
        int[] arr1={1,4,2,3,5,8,9,6}; 
        int Sum1 = s(arr1, 0);
        System.out.println("sum:"+Sum1);
        
    }
}
