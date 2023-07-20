import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int bit = scanner.nextInt();
        int x=number;
        for(int i=0;i<bit;i++){
            x>>=1;
        }
        if((x&1)==1){
            System.out.println(number^(1<<bit));
        }
        else{
            System.out.println(number);
        }
    }
}