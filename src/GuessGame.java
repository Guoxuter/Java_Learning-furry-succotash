public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess_p1;
        int guess_p2;
        int guess_p3;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and9...");
        while (true) {
            System.out.println("Number to guess is" + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guess_p1 = p1.number;
            System.out.println("Player one guessed" + guess_p1);
            guess_p2 = p2.number;
            System.out.println("Player one guessed" + guess_p2);
            guess_p3 = p3.number;
            System.out.println("Player one guessed" + guess_p3);

            if (guess_p1 == targetNumber) {
                p1isRight = true;
            }
            if (guess_p2 == targetNumber) {
                p2isRight = true;
            }

            if (guess_p3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right?" + p1isRight);
                System.out.println("Player 2 got it right?" + p2isRight);
                System.out.println("Player 3 got it right?" + p3isRight);
                break;
            } else {
                System.out.println("Players will have to try again.");
            }


        }


    }
}
