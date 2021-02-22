public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        rolls[index++] = pins; //creating array of each of the amount of pins in each roll
    }

    public int score() {
        int score = 0;
        int startOfNextFrameIndex = 0;

        for (int frame = 1 ; frame < 11 ; frame++) { //counting literal frames not using an array
            if (rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1] == 10) { // spare calculation
                score += 10 + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 2;
            } else if (rolls[startOfNextFrameIndex] == 10) { // strike calculation
                score += 10 + rolls[startOfNextFrameIndex + 1] + rolls[startOfNextFrameIndex + 2];
                startOfNextFrameIndex += 1;
            }
            else {
                score += rolls[startOfNextFrameIndex] + rolls[startOfNextFrameIndex + 1];
                startOfNextFrameIndex += 2;
            }
        }
        return score;
    }

}
