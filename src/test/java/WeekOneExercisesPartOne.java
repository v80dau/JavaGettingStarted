import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekOneExercisesPartOne {
    // ** EXERCISE INSTRUCTIONS **
    // Make the smallest change(s) possible to get each test to pass in sequence.

    // TODO Commit:  Commit to git after each test passes with a message describing what you did.
    // TODO Refactor: Refactor your code (remove duplication, etc.) and commit again

    final double ROUND_TO_NEAREST_PENNY = .001;

    @Test
    // TODO Code: What is the least amount of code we need to make this test pass?
    // DONE Code: Reworked from initial commit and assigned the number of slices in the pizza to the method being called for the actual calculation.
    public void numberOfWholeSlicesForOnePizzaAndEightPeople() {
        int numberOfPeople = 8;
        int numberOfEightSlicePizzas = 1;

        int actualSlicesPerPerson = divideUpEightSlicePizzasEvenly(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(1, actualSlicesPerPerson);
    }

    @Test
    public void numberOfWholeSlicesFromOnePizzaAndEightPeople() {
        int numberOfPeople = 4;
        int numberOfEightSlicePizzas = 2;

        int actualSlicesPerPerson = divideUpEightSlicePizzasEvenly(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(4, actualSlicesPerPerson);
    }

    @Test
    // TODO Response: What operator is used to determine remainders?
    // DONE Response: %
    public void leftoversWithFivePeopleAndTwoPizzas() {
        int numberOfPeople = 5;
        int numberOfEightSlicePizzas = 2;

        int actualLeftoverSlices = determineLeftoverSlicesOfPizza(numberOfEightSlicePizzas, numberOfPeople);

        assertEquals(1, actualLeftoverSlices);
    }

    private int divideUpEightSlicePizzasEvenly(int numberOfPizzas, int numberOfPeople) {
        return (numberOfPizzas * 8) / numberOfPeople;
    }

    private int determineLeftoverSlicesOfPizza(int numberOfPizzas, int numberOfPeople) {
        return (numberOfPizzas * 8) % numberOfPeople;
    }

    @Test
    // TODO Response: In the variable declarations below, why is it necessary to place
    //  an 'f' after 4.3 but not after 1500 or 4?
    // DONE Response: Due to the literal type of a decimal float being required to include the "f" by java.
    // DONE Code: The interest rate has to be converted back to a decimal value from a percentage in order to calculate correctly against the principal and duration
    public void simpleInterestReturnsCorrectAmount() {
        float principalAmount = 1500;
        float interestRateAsAPercent = 4.3f;
        float termOfInvestmentInYears = 4;

        float actualInvestmentValue = calcSimpleInterest(principalAmount, interestRateAsAPercent, termOfInvestmentInYears);

        assertEquals(1758f, actualInvestmentValue, ROUND_TO_NEAREST_PENNY);
    }

    /**
     * The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual
     * rate of interest, t is the number of years the amount is invested, and A is the amount at the end of
     * the investment.
     *
     * @param principal
     * @param percentInterestRate
     * @param numberOfYears
     * @return
     */
    private float calcSimpleInterest(float principal, float percentInterestRate, float numberOfYears) {

        return (principal * (percentInterestRate /100) * numberOfYears) + principal;
    }
}
