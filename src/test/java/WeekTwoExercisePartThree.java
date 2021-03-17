import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * Friday the thirteenth is fabled to be an 'unlucky' day.  Implement the code below to
 * discover which thirteenth dates from any given year fall on a Friday.
 *
 * Each test below has a @Disabled attribute that must be removed in order for that test
 * to run.
 *
 * Implement each step in the simplest manner possible where all tests continue to pass.
 *
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may include just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to the
 * called function, you did too much and should start over from the previous test unless it's one
 * if the last two or three.  The final couple of tests are just for verification.
 */

public class WeekTwoExercisePartThree {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?

    @Test
    public void sendingAnActualFridayTheThirteenthReturnsTrue() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2019, 9, 13);

        assertTrue(actual);
    }

    @Test
    public void sendingNotAFridayTheThirteenthDateReturnsFalse() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2019, 11, 13);

        assertFalse(actual);
    }

    @Test
    public void sendingFridayTheThirteenthFromAnotherYearReturnsTrue() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        boolean actual = isUnluckyDate(2020, 11, 13);

        assertTrue(actual);
    }

    @Test
    public void sendingTwentyNineteenReturnsOnlyTwoFridayTheThirteenths() {
        // TODO: Implement the code to make this test pass
        // TODO: don't forget to commit after passing the test
        LocalDate[] actual = unluckyDatesByYear(2019);
        LocalDate[] expected = new LocalDate[]{
                LocalDate.of(2016, 5, 13),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sendingTwentyFifteenReturnsOnlyOneFridayTheThirteenth() {
        //  TODO: write this test and, if necessary, make any changes to make it pass
        //  TODO: don't forget to commit after passing the test
        LocalDate[] actual = unluckyDatesByYear(2015);
        LocalDate[] expected = new LocalDate[]{
                LocalDate.of(2015, 2, 13),
                LocalDate.of(2015, 3, 13),
                LocalDate.of(2015, 11, 13),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void sendingTwentySixteenReturnsOnlyThreeFridayTheThirteenths() {
        //  TODO: write this test and, if necessary, make any changes to make it pass
        //  TODO: don't forget to commit after passing the test

        LocalDate[] actual = unluckyDatesByYear(2016);
        LocalDate[] expected = new LocalDate[]{
                LocalDate.of(2016, 5, 13),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null};

        assertArrayEquals(expected, actual);
    }

    // TODO Implementation Implement your changes to make the tests pass here...

    public LocalDate[] unluckyDatesByYear (int year) {
        LocalDate[] localDates = new LocalDate[12];
        int index = 0;

        for (int month = 1; month <= localDates.length; month++) {
            LocalDate unluckyDate = LocalDate.of(year, month, 13);

            if (isUnluckyDate(year, month, 13)) {
                localDates[index++] = unluckyDate; //keeping the array entries separate from the month so that it returns the non-null values first
            }
        }

        return localDates;

    }

    public boolean isUnluckyDate(int year, int month, int day) {

        if (day == 13) {
            LocalDate luckyJason = LocalDate.of(year, month, day);

            if (luckyJason.getDayOfWeek() == DayOfWeek.FRIDAY){
                return true;
            }
        }
        return false;
    }

}
