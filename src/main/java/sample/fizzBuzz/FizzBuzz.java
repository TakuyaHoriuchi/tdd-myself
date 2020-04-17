package sample.fizzBuzz;

public class FizzBuzz {

    public String execute(int num) {
        if (num != 3) {
            return String.valueOf(num);
        }

        return "Fizz";
    }
}
