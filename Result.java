//package CourseFormSuper;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// MAIN METHOD
public class Result {
    static ArrayList<Float> scoreList = new ArrayList<Float>();
    static ArrayList<String> code = new ArrayList<String>();
    static ArrayList<Integer> creditList = new ArrayList<Integer>();
    static ArrayList<Integer> unitList = new ArrayList<Integer>();
    static ArrayList<String> gradeList = new ArrayList<String>();
    static boolean running = true;
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("yes", Pattern.CASE_INSENSITIVE);
        String name = "Null";
        boolean val0 = true;
        boolean val1 = true;
        boolean val2 = true;
        int unit = 0;
        float score = 0;
        while(val0) {
            System.out.print("\nWhat is your name: ");
            name = scan.nextLine();
            char[] chars = name.toCharArray();
            boolean digitf = false;
            for(int i = 0; i<chars.length; ++i) {
                if(Character.isDigit(chars[i])) {
                    //System.out.print("\033[H\033[2J");
                    digitf = true;
                    System.out.println("\nName should not contain numbers!");
                    break;
                }
            }
            if(digitf == true) {
                
            }
            else if(digitf == false) {
                val0 = false;
            }
        }
        while(running) {
            System.out.print("\nWhat is the course code: ");
            String userCode = scan.next();
            while(val1) {
                System.out.print("What is the unit: ");
                if(scan.hasNextInt()) {
                    unit = scan.nextInt();
                    if(unit>=0 && unit<=100) {
                        val1 = false;
                    }
                    else {
                        System.out.println("Invalid Input!\n");
                    }
                }
                else {
                    System.out.println("Input is not Numeric!\n");
                    scan.next();
                }
            }
            while(val2) {
                System.out.print("What is your score: ");
                if(scan.hasNextFloat()) {
                    score = scan.nextFloat();
                    if(score>=0 && score<=100) {
                        val2 = false;
                    }
                    else {
                        System.out.println("Invalid Input!\n");
                    }
                }
                else {
                    System.out.println("Input is not Numeric!\n");
                    scan.next();
                }
            }
            System.out.print("\nDo you want to add another course: ");
            String ans = scan.next();
            // REGEX TO MATCH THE USERS ANSWER TO A PATTERN THATS IN-CASE-SENSITIVE
            Matcher matcher = pattern.matcher(ans);
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                running = true;
                val1 = true;
                val2 = true;
            } 
            else {
                scan.close();
                System.out.print("\033[H\033[2J");
                System.out.flush();
                running = false;
            }
            Grade.grade(userCode, score, name, unit);
        }
    }
}