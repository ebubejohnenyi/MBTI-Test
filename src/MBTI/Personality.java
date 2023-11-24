package MBTI;

import javax.crypto.spec.PSource;
import java.util.*;

public class Personality {
    public static void main(String[] args) {
        personalityMBTI();
    }
    static Scanner scan = new Scanner(System.in);
    public static void personalityMBTI() {
        String userAnswer = "";
        String[] questionHolder = new String[40];

        System.out.println("Enter your name: ");
        String userName = scan.nextLine();

        questionHolder[0] = "A. expend energy, enjoy groups";
        questionHolder[1] = "B. converse energy, enjoy one-on-one";
        questionHolder[2] = "A. Interpret literally,";
        questionHolder[3] = "B. look for meaning and responsibility";
        questionHolder[4] = "A. logical, thinking , question";
        questionHolder[5] = "B. empathetic, feeling, accommodating";
        questionHolder[6] = "A. organized, orderly";
        questionHolder[7] = "B. flexible, adaptiable";
        questionHolder[8] = "A. more outgoing, think out loud ";
        questionHolder[9] = "B. more reserve, think to your self";
        questionHolder[10] = "A. practical, realistic, experiential";
        questionHolder[11] = "B. imagination, innovation, theoritical";
        questionHolder[12] = "A. candid, straight forward, frank";
        questionHolder[13] = "B. tactful, kind, encouraging";
        questionHolder[14] = "A. plan, schedule";
        questionHolder[15] = "B. unplanned, spontaneous";
        questionHolder[16] = "A. seek many tasks, public activities, interract with others";
        questionHolder[17] = "B. seek private, solitary activities with quiet concentrate ";
        questionHolder[18] = "A. standard, usaual, concentration";
        questionHolder[19] = "B. different, novel, unique";
        questionHolder[20] = "A. firm, tend to criticize, hold the line";
        questionHolder[21] = "B. gentle, tend to appreciate, conciliate";
        questionHolder[22] = "A. regulate, structured";
        questionHolder[23] = "B. easy-going live and let live";
        questionHolder[24] = "A. external, communicative, express yourself";
        questionHolder[25] = "B. internal, reticent, keep to yourself";
        questionHolder[26] = "A. focus on here-and-now";
        questionHolder[27] = "B. look to the future, global perspective, big picture";
        questionHolder[28] = "A. tough-minded just";
        questionHolder[29] = "B. tender-hearted, merciful";
        questionHolder[30] = "A. preparation, plan ahead";
        questionHolder[31] = "B. go with the flow, adapt as you go";
        questionHolder[32] = "A. active, initiate";
        questionHolder[33] = "B. reflective, deliberate";
        questionHolder[34] = "A. fact, things, what is";
        questionHolder[35] = "B. ideas, dream, what could be, philosophical";
        questionHolder[36] = "A. matter of fact, issue-oreinted";
        questionHolder[37] = "B. sensitive, people- oriented, compassionate";
        questionHolder[38] = "A. control govern";
        questionHolder[39] = "B. latitude, freedom ";
        
        List <String> firstAnswerHolder = new ArrayList<>();
        int index = 0;
        for (; index < questionHolder.length; index += 2){
            System.out.println(questionHolder[index] + "    " + questionHolder[index + 1]);
            userAnswer = scan.nextLine().toLowerCase();
            userValidation(userAnswer, questionHolder, index);
            if(userAnswer.equals("a")){
                firstAnswerHolder.add(questionHolder[index]);
            }
            else if(userAnswer.equals("b")){
                firstAnswerHolder.add(questionHolder[index + 1]);
            }
        }
        System.out.println("\n");
        System.out.println("Thank you " + userName + " for taking the MBTI personality test. \nYOU SELECTED: ");
        int count = 0;
        for (; count < 5; count++) {
                System.out.println(firstAnswerHolder.get(count));
        }
        System.out.println("Numbers of selected is: " + count + "\n");
        int secondIndex = 5;
        for (; secondIndex < 10; secondIndex++) {
            System.out.println(firstAnswerHolder.get(secondIndex));
        }
        System.out.println("Numbers of selected is: " + secondIndex + "\n");
        int thirdIndex = 10;
        for (; thirdIndex < 15; thirdIndex++) {
            System.out.println(firstAnswerHolder.get(thirdIndex));
        }
        System.out.println("Numbers of selected is: " + thirdIndex + "\n");
        int forthIndex = 15;
        for (;forthIndex < 20; forthIndex++) {
            System.out.println(firstAnswerHolder.get(forthIndex));
        }
        System.out.println("Numbers of selected is: " + forthIndex + "\n");
    }

    private static void userValidation(String userAnswer, String[] questionHolder, int index) {
        String enterCorrectAnswer;
        if (!userAnswer.equals("a") && !userAnswer.equals("b")) {
            System.out.println("Expected A or B as Response \nI know this is an error, Please try again: ");
            System.out.println(questionHolder[index] + "     " + questionHolder[index + 1]);
            enterCorrectAnswer = scan.nextLine().toLowerCase();
            secondValidatingUserInput(questionHolder, enterCorrectAnswer, index);
        }
    }
    private static void secondValidatingUserInput(String[] questionHolder, String enterCorrectAnswer, int index) {
        if (!enterCorrectAnswer.equals("a") && !enterCorrectAnswer.equals("b")){
           while (!enterCorrectAnswer.equals("a") && !enterCorrectAnswer.equals("b")){
               System.out.println("Expected A or B as Response \nI know this is an error, Please try again: ");
               System.out.println(questionHolder[index] + "      " + questionHolder[index + 1]);
                enterCorrectAnswer = scan.nextLine().toLowerCase();
           }
        }
    }

}
