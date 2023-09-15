import java.util.Scanner;
class practice{
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int result = 0;
        System.out.print("1?–??????F");
        a = sc.nextInt();
        System.out.print("??–??????F");
        b = sc.nextInt();
        System.out.println("1???|???Z?A2?????Z?F");
        c = sc.nextInt();
        if(c == 1){
            result = mul(a, b);
        }
        if(c == 2){
            result = div(a,b);
        }
        System.out.print(result);
    }

    static void mul(int a, int b){
        System.out.println("a * b");
    }

    static int div(int a, int b){
        //??????
        int division = a / b;
        return division;
    }
}