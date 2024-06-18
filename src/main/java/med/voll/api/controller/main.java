package med.voll.api.controller;

public class main {
    public static void main(String[] args) {
        int a = 1;
        int c = (int) Math.pow(2, 3);
        System.out.printf("valor" + "Valor de C é " + c);
        int b = c * 3 + a;


        if(b <= 25) {
        c = 3;
        int d = b-c + a+2;
            System.out.printf("Valor" + d );
        } else {
            c = 4;
            a=3;
            int d = b-c+a*2;
        }
    }
}
