
public class FizzBuzz {
    public String execute(Integer number) {
        String toString = number.toString();

        if (number % 3 == 0 && number % 5 == 0) {
            toString = "FizzBuzz";
        } else if (number % 3 == 0) {
            toString = "Fizz";
        } else if (number % 5 == 0) {
            toString = "Buzz";
        }
        return toString;
    }
}
