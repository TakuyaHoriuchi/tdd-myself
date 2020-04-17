package sample.fizzBuzz;

public class FizzBuzz {

    public String execute(int num) {

        if (num % 5 == 0) {
            return "Buzz";
        }

        if (num % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(num);
    }
}
