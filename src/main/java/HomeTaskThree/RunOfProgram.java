package HomeTaskThree;

import java.util.List;

public class RunOfProgram {
    public static void main(String[] args) {
        TestImplement testImplement = new TestImplement();
        List<String> spaceInTheMiddle = testImplement.checkSpaceInTheMiddle();
        System.out.println(spaceInTheMiddle);

        System.out.println(testImplement.lengthOfInput());

        System.out.println(testImplement.checkEmptyString());

        String outPut = testImplement.checkString();
        System.out.println(outPut);
    }
}
