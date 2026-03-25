import java.util.Scanner;;
public class symmetricmatrix {
    public static void main(String args[]){
        int[][] matrix=new int[200][200];
        int[][] matrix1=new int[200][200];
        int flag=0;
        System.out.println("Enter number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         System.out.println("Enter elements of matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
             
            }
        
        }
        System.out.println("Matrix is :");
           for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
      
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("Transpose of matrix is :");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                matrix1[i][j]=matrix[j][i];
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.print("\n");
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

               if(matrix1[i][j]==matrix[i][j]){
                flag=1;
               }
               else{
                flag=0;
                break;
               }
        }
    }
    if(flag==1)
               {System.out.print("Matrix is Symmetric");

               }
               else{
                System.out.println("Matrix is not symmetric");
               }
    }}
