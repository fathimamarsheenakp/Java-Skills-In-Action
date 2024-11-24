
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
         sc.nextLine();

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextLine();
        }

        // int index1 = sc.nextInt();
        // int index2 = sc.nextInt();
        String[] index = sc.nextLine().split("\\s+");
        int index1 = Integer.parseInt(index[0]);
        int index2 = Integer.parseInt(index[1]);

        System.out.println(arr.length);

        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Index not found.");
        } else {
            System.out.println(arr[index1].length());
            System.out.println(arr[index2].length());
        }
    }
}
