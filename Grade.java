//package CourseFormSuper;

// GRADE CALCULATOR
public class Grade {
    static void grade(String userCode, float score, String name, int unit) {
        Result.scoreList.add(score);
        Result.code.add(userCode);
        Result.unitList.add(unit);
        int i = 0;
        String[] benchmark = {"A", "B", "C", "D", "E", "F"};
        int[] credits = {5, 4, 3, 2, 1, 0};
        int credit = 0;
        String grade = "Null";
        if(score<0 || score>100) {
            System.out.println("\nInvalid Score!\n");
        }
        else {
            if(score>=80 && score<=100) {
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            if(score>=60 && score<80) {
                i+=1;
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            if(score>=50 && score<60) {
                i+=2;
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            if(score>=45 && score<50) {
                i+=3;
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            if(score>=40 && score<45) {
                i+=4;
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            if(score>=0 && score<40){
                i+=5;
                grade = benchmark[i];
                credit = credits[i];
                Result.creditList.add(credit);
                Result.gradeList.add(grade);
                
            }
            //System.out.print("Your grade is "+grade);
            //GPA.gpa(userCode, grade, credit);
        }
        //System.out.print("\nYou have: "+code.size()+" in your course form");
        GPA.print(name);
    }
}