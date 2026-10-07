public class Main {
    public static void main(String[] args) {
        Jinx player1 = new Jinx();
        Jinx player2 = new Jinx();
        System.out.println(player2.getHealth());
        player1.attack(player2);
        System.out.println(player2.getHealth());
        player1.attack(player2);
        System.out.println(player2.getHealth());
    }
}