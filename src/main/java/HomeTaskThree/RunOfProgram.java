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



//        #FFFF00,#FFFACD,#FFFFE0,#FAFAD2,#FFEFD5,#FFE4B5,#FFDAB9,#EEE8AA
       System.out.println(testImplement.checkSet());

//        1,2,3,4,5,6,7,8,9
        System.out.println(testImplement.checkRange());

    }
}
