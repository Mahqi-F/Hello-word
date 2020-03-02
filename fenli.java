import java.util.Scanner;
public class fenli {
    public static void main(String[] args) {
        System.out.println("请输入一个小于1000的整数");
        Scanner san = new Scanner(System.in);
        int n = san.nextInt();
        if(0<n && n<10) {
            System.out.print("输出结果："+n);
        }
        else if (n<100 && 10<=n ) {
            int a = n/10;
            int b = n%10;
            System.out.print("输出结果："+a+" "+b);
        }
        else if(n>=100 && n<1000)
        {
            int a = n/100;
            int b = n%100/10;
            int c = n%100%10;
            System.out.print("输出结果："+a+" "+b+" "+c);
        }
        else{
            System.out.println("您输入的数不是小于1000的整数");
        }
        san.close();

    }

}
