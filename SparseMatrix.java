public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] ={{0,0,3,0,0,4},{0,0,5,7,0,0},{0,0,0,0,0,0},{0,2,6,0,0,0}};
        int rows =4;
        int cols = 6;
        int size = 0;
        for (int i = 0; i<rows; i++){
            for(int j=0; j <cols; j++){
                if (arr[i][j] !=0){
                    size++;
                }
            }
        }
        int[][] Sparse =new int[3][size];
        int k = 0;
        for (int i = 0; i<rows; i++){
            for(int j=0; j <cols; j++){
                if (arr[i][j] !=0){
                    Sparse[0][k]=i;
                    Sparse[1][k]=j;
                    Sparse[2][k]=arr[i][j];
                    k++;
                }
            }
        }
        System.out.println("Sparse Matrix");
        for(int i = 0; i<3; i++){
            for(int j=0; j<size; j++){
                System.out.println(Sparse[i][j] + " ");
            }
            System.out.println();

        }
    }
}

