import java.util.Scanner;
/**
 * minMax
 */
public class minMax {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int n;
    int i = 1, k = 1, max = 1, min = 1;
    
    System.out.print("Kaç Kere Sayı Gireceksiniz: ");
    n = input.nextInt();

    while (i <= n){
    System.out.println(i + ".sayıyı giriniz:");
      k = input.nextInt();
      
        if (i == 1){ // i=1 olduğunda min'e ve max'a atamalar yapılıyor, i = 2 olduğunda false oluyor ve aşağıdaki else koduna geçiyor
          max = k;
          min = k;
        }

        else{

            if (k >= max) {
            max = k;
          }

            else if (k <= min) {
            min = k;
          }

        } 

      i++;
    }
    System.out.println("En büyük sayı: " + max);
    System.out.println("En küçük sayı: " + min);

   input.close();
    
  }
}