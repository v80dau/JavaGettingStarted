
public class FizzBuzz {
    public String execute(Integer number) {
        String toString = number.toString();
        if (number > 2) {
            toString = "Fizz";
        }
        return toString;
    }
}
