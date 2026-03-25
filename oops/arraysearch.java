import java.util.*;
public class arraysearch {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elemnts in the array");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            
        }
        int s;
        System.out.println("Enter the elemnt to be searched");
        s=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==s){
                System.out.println("Element found : "+arr[i]);
                break;
            }
        }
    }
}
