import java.util.Scanner;

public class ExactPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("단가(원): ");
        long priceWon = scanner.nextLong();
        System.out.print("수량(개): ");
        long count = scanner.nextLong();
        System.out.print("할인율(%): ");
        long discountRate = scanner.nextLong();

        long subtotalWon = priceWon * count;
        long discountWon = subtotalWon * discountRate / 100;
        long paymentWon = subtotalWon - discountWon;

        System.out.println("소계: " + subtotalWon + "원");
        System.out.println("할인: " + discountWon + "원");
        System.out.println("결제: " + paymentWon + "원");
    }
}
