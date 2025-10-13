  public class BinarySearch {
      public static int binarySearch(int arr[], int tar, int low, int high) {
          int st = 0;
          high= arr.length - 1;
          while (st <= high) {
              int mid = (st + high) / 2;
              if (tar > arr[mid]) {
                  st = mid + 1;
              } else if (tar < arr[mid]) {
                  high = mid - 1;
              } else {
                  return mid;
              }
          }
          return -1;

      }

      public static void main(String[] args) {

          int arr1[] = {-1, 0, 3, 4, 5, 9, 12};
          int tar1 = 12;
          int result = binarySearch(arr1, tar1,0, arr1.length-1);
          System.out.println(result);

      }
  }

