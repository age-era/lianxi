import java.util.Scanner;
public class Helloworld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //
        int price = 20;
        System.out.println("**********");
        System.out.println("*   "+price+"   *");
        System.out.println("**********");
        System.out.println("Please");
        int mount = in.nextInt();
        //
        if (mount >= price){
            System.out.println(5 == 5);
        }else{
            System.out.println("please");
        }
    }
}
