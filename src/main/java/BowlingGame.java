public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
        for(int i = 0; i < index; i++) {
            int spare = rolls[0] + rolls[1];
            int strike = rolls[0];
            if (spare == 10) {
                rolls[1] = 10;
            }
            if (strike == 10) {
                rolls[0] = rolls[0] + rolls[1] + rolls[2];
            }
            score += rolls[i];
        }
        return score;
    }

}
