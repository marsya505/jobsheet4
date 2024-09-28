import java.util.Scanner;
/**
 * Weapons11
 */
public class Weapons11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enemy distance: ");
        int enemyDistance = sc.nextInt();

        if (enemyDistance <= 5) {
            System.out.println("Use melee weapons");
        }else{
            System.out.println("Use ranged weapons");
        }
    }
}