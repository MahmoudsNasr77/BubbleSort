

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nasr
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("\t\t\t Bubble Sort");
        System.out.println("\t\t\t ----------------");
        System.out.println("Enter Size Of Array as You Want:");
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Array element No." + (i+1));
            arr[i] = s.nextInt();
        }
        System.out.println("Want To Sort Elements ?(y/n)");
        String chosse = s.next();
        switch (chosse) {
            case "y": {
                System.out.println("Sort Ascending or Descending ? (A/D)");
                String sort = s.next();
                switch (sort) {
                    case "A":
                        bubbleSortAsc(arr);
                        break;
                    case "D":
                        bubbleSortDec(arr);
                        break;
                    case "a":
                        bubbleSortAsc(arr);
                        break;
                    case "d":
                        bubbleSortDec(arr);
                        break;
                    default:
                        System.out.println("Worng Chosse");
                        System.exit(0);
                        
                }
            }
            break;
            case "n":
                System.out.println("Element With  no sort : ");
                System.out.println(Arrays.toString(arr));
                break;
            default:
                 System.out.println("Worng Chosse");
                        System.exit(0);
        }

      
    }
    public static void bubbleSortDec(int arr[]) {
        int temp = 0;
        boolean flag=true;
        int counter=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag=false;
                }
                counter++;
                if (flag==true)
                    break;
            }
            

        }
        System.out.println("Number of rounds :"+counter+" ");
        System.out.println(Arrays.toString(arr));
    }
        public static void bubbleSortAsc(int arr[]) {
        int temp = 0;
        boolean flag=true;
        int counter=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag=false;
                }
                counter++;
                if (flag==true)
                    break;
            }
            

        }
        System.out.println("Number of rounds :"+counter+" ");
        System.out.println(Arrays.toString(arr));
    }
}
