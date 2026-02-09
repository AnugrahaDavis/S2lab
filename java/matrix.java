import java.util.Scanner;

public class matrix{

    static int[][] matrix1= new int[200][200];
    static int[][] matrix2= new int[200][200];
    static int[][] matrix3= new int[200][200];

    public static void main(String[] arg){
    Scanner  sc = new Scanner(System.in);

    System.out.println("enter the number of matrix");
    int n = sc.nextInt();

    System.out.println("enter the value of 1st matrix");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix1[i][j]= sc.nextInt();
        }
    }
    System.out.println("First matrix is:");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix1[i][j]+"\t");
            // matrix1[i][j]= sc.nextInt();
        }
        System.out.print("\n");
    }
    
    System.out.println("enter the value of 2nd matrix");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix2[i][j]= sc.nextInt();
        }
    }
    System.out.println("Second matrix is :");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix2[i][j]+"\t");
            // matrix1[i][j]= sc.nextInt();
        }
        System.out.print("\n");
    }
    

    System.out.println("Added matrix");

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            System.out.print(matrix3[i][j]+"\t");
        }
        System.out.print("\n");
    }
    }
}
