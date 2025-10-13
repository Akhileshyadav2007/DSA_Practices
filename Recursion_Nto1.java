
    public class Recursion_Nto1 {
        static void printNto1(int n){  // isako call kar rha hai
            if(n<1){
                return;
            }
            System.out.println(n);
            printNto1(n-1);   //recursion ko call kar raha hai
        }
        public static void main(String[] args) {
            int n=5;
            printNto1(n);

        }
    }

