package academy.learnprogramming.section4;

public class KeywordsAndExpressions {
    public static void main(String[] args) {
        // add values for method
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    // Java Method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        // -1 indicates an error
        return -1;
    }
}
