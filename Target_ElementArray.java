
    public class Target_ElementArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 3, 4, 6, 5};

            int target1 = 6;
            int target2 = 19;

            System.out.println(Target(arr, target1));
            System.out.println(Target(arr, target2));
        }


        public static boolean Target(int[] arr, int target) {


            for (int n : arr) {
                if (n == target) {
                    return true;
                }
            }
            return false;
        }
    }

