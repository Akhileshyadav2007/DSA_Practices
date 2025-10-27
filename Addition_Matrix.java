public class Addition_Matrix {
    public static void main(String[] args) {
        int arr1 [][] ={{1,2,3},{5,6,7}};
        int arr2 [][] = {{5,6,7},{9,9,7}};
        int row=2;
        int colm=3;
        int add[][] = new int[2][3] ;
        for(int i=0; i < row; i++){
            for(int j=0; j < colm; j++){
                add[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0; i < row; i++){
            for(int j=0; j < colm; j++){
                System.out.println(add[i][j]);

            }
            System.out.println();
        }
    }
}
