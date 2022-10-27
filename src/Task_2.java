import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[]{50,20,10,5,2,1};
        System.out.print("Enter cooper: ");
        int cop = scanner.nextInt();
        int count = 0;
        System.out.print("Your changes: ");
        for (int i = 0; i < 6; i++) {
            if (cop == 0)
                break;
            while ( cop - arr[i] >=  0){
                cop -= arr[i];
                count++;

        }
            if (count > 0)
                System.out.print(arr[i] + " - " + count + " " ) ;
            count = 0;
        }

    }
}
/*
2. Номиналы белорусских монет: 1,2,5,10,20,50.
Дана сумма сдачи: 51..99 копеек.
Выдать сдачу минимальным количеством монет.
*/