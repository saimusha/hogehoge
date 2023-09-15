import java.util.Scanner;
class practice{
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("1つ目の数字：");
        a = sc.nextInt();
        System.out.print("二つ目の数字：");
        b = sc.nextInt();
        System.out.println("1なら掛け算、2なら割り算：");
        c = sc.nextInt();
        if(c == 1){
            int result = mul(a, b);
        }
        if(c == 2){
            int result = div(a,b);
        }
    }

    static int mul(int a, int b){
        //中身書いてね
    }

    static int div(int a, int b){
        //中身書いてね
        int division = a / b;
        return division;
    }
}