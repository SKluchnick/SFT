package HomeTaskThreeSelenium;

import java.util.Scanner;

public class InputDataFromConsole extends InputData{
    @Override
    public String getParameters() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase().trim();;
        return input;
    }
}
