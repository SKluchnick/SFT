package HomeTaskThreeSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestImplement {
    Scanner scanner = new Scanner(System.in);
    private InputDataFromConsole inputDataFromConsole = new InputDataFromConsole();
    private String enteredString;
    private String enteredStringSecond;
    private String enteredStringThird;


    public List<String> checkSpaceInTheMiddle() {
        List<String> listEnteredParameters = new ArrayList<>();
        int number = 3;
        boolean flag = false;
        while (!flag) {
            System.out.println("Would you like to write number? (y/n)");
            String input = scanner.nextLine().toLowerCase().trim();
            if (!isContinue(input)) {
                break;
            }
            System.out.println("Please write first word,space,second word");
            enteredString = inputDataFromConsole.getParameters();

            listEnteredParameters = Arrays.asList(enteredString.split(","));
            if (listEnteredParameters.size() != number) {
                continue;
            }
            if (!(listEnteredParameters.get(1).equals(""))) {
                continue;
            } else {
                flag = true;
            }

        }
        return listEnteredParameters;
    }


    public boolean lengthOfInput() {
        int numFirst = 0;
        int numSecond = 0;
        System.out.println("Please write word");
        enteredString = inputDataFromConsole.getParameters();
        System.out.println("Please write digit");
        enteredStringSecond = inputDataFromConsole.getParameters();
        System.out.println("Please write digit");
        enteredStringThird = inputDataFromConsole.getParameters();
        try {
            numFirst = Integer.parseInt(enteredStringSecond);
            numSecond = Integer.parseInt(enteredStringThird);
        } catch (NumberFormatException nfe) {
            System.err.println("Must be positive  digit");
        }
        if (!(enteredString.length() >= numFirst && enteredString.length() <= numSecond)) {
            return false;
        }
        return true;
    }


    public boolean checkEmptyString() {
        System.out.println("Please write word");
        enteredString = inputDataFromConsole.getParameters();
        if (enteredString.isEmpty()) {
            return false;
        }
        return true;
    }


    public String checkString() {
        System.out.println("Please write string");
        enteredString = inputDataFromConsole.getParameters();
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(enteredString);
        for (int i = 0; i < enteredString.length(); i++) {
            while (!matcher.find()) {
                throw new IllegalArgumentException("Must be only string");
            }
        }
        return enteredString;
    }


    public boolean checkSet(){
        List<String> listEnteredParameters = new ArrayList<>();
        System.out.println("Please write Set");
        enteredString = inputDataFromConsole.getParameters();
        listEnteredParameters = Arrays.asList(enteredString.split(","));
        System.out.println("Please write value");
        enteredStringSecond = inputDataFromConsole.getParameters();
        if (!(listEnteredParameters.contains(enteredStringSecond))){
            return false;
        }

        return true;
    }

    public boolean checkRange(){
        List<String> listEnteredParameters = new ArrayList<>();
        List<String> listEnteredParametersTwo = new ArrayList<>();
        System.out.println("Please write Range");
        enteredString = inputDataFromConsole.getParameters();
        listEnteredParameters = Arrays.asList(enteredString.split(","));
        for (String i:listEnteredParameters){
            try {
                int enter = Integer.parseInt(i);
            }catch (NumberFormatException nfe){
                System.err.println("Must be positive  digit");
                throw new NumberFormatException();
            }
            listEnteredParametersTwo.add(i);

            }

        System.out.println("Please write value");
        enteredStringSecond = inputDataFromConsole.getParameters();
        if (!(listEnteredParameters.contains(enteredStringSecond))){
            return false;
        }

        return true;
    }


    public boolean isContinue(String enter) {
        return enter.equalsIgnoreCase("yes") || enter.equalsIgnoreCase("y");

    }
}
