package Arrays;
import java.util.Scanner;

void countApper(){
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    System.out.println("enter the number to count: ");
    int number = sc.nextInt();
    int count = 0;
    int ans = -1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==number){
            ans = i;
            count++;
            break;
        }
    }
    System.out.println("Index of " + number + " is " + ans);
    System.out.println("Count of " + number + " is " + count);
}

public class count {
    public static void main(String[] args) {
        count obj = new count();
        obj.countApper();
    }
}
