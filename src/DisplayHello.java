import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name=scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
