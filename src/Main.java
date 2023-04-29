/*
@autor Iván Yanni Borgez Bautista
@email borgezyanni@gmail.com
@descripción práctica de números capicúa
*/

public class Main {

    private static boolean esCapicua(int num) {
        return num==invertirNumero(num);
    }

    private static int invertirNumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10;
            inverso = cifra + inverso * 10;
            num /= 10;
        }
        return inverso;
    }
    public static void main(String[] args) {
        int a = 0;
        while(a <= 9999) {
            boolean capicua = esCapicua(a);
            System.out.println("\nEl numero " + a +
                    (capicua?" si":" no") + " es capicua.");
            a++;
        }
    }
}