import java.util.Scanner;
class practice{
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("1�ڂ̐����F");
        a = sc.nextInt();
        System.out.print("��ڂ̐����F");
        b = sc.nextInt();
        System.out.println("1�Ȃ�|���Z�A2�Ȃ犄��Z�F");
        c = sc.nextInt();
        if(c == 1){
            int result = mul(a, b);
        }
        if(c == 2){
            int result = div(a,b);
        }
    }

    static int mul(int a, int b){
        //���g�����Ă�
    }

    static int div(int a, int b){
        //���g�����Ă�
        int division = a / b;
        return division;
    }
}