package Random;

/**
 * Created by arun on 11/09/18.
 */
public class RotateArrayTowardsRight {

    private void rightRotate(int[] arr, int d, int n) {
        int temp[] = new int[d], k = 0;
        for (int j = n-d; j < n; j++) {
            temp[k++] = arr[j];
        }
        for (int i = n-d-1; i >= 0; i--) {
            arr[i+d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    private void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

        public static void main(String[] args)
        {
            RotateArrayTowardsRight rotate = new RotateArrayTowardsRight();
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
            rotate.rightRotate(arr, 10, 10);
            rotate.printArray(arr, 10);
        }

}
