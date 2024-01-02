import java.util.Scanner;
public class swapAlternet {
    // Fields (variables)

    // Constructors

    // Methods

    // Main method (entry point of the program)
    public static void swapAlternate(int arr[]) {
        int i=0;
        while(i<arr.length-1){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i = i+2;
        }
    }
    public static void main(String[] args) {
        // Code to be executed
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        swapAlternate(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
