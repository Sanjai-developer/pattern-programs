

public class diagonalpattern {
    
    public static void main(String[] args) {
        int n=5;
       int[][] matrix = new int [n][n];
       int num =1;
       for(int d=0;d< 2*(n-1);d++){
        for(int i=0;i<n;i++){
            int j= d-i; // i+j =d 
            if(j>=0 && j<n){
              matrix[i][j]=num++;
            }
        }
       }

       for(int i =0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.printf("%-4d",matrix[i][j]);
        }System.out.println();
       }
    }
}
