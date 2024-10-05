import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Input your 10 arrays: ");
        for(int i =0;i<10;i++){
            array[i] = input.nextInt();
        }

        System.out.println("Your inputed 10 arrays are: ");
        for(int i =0;i<10;i++){
            System.out.println(array[i]);
        }

        int sum = 0;
        for(int i =0;i<10;i++){
            sum = sum + array[i];
        }
        System.out.println("The sum is: "+sum);

        int max =0;
        for(int i =0;i<10;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("The max number is: "+max);
    }
}
