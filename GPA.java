import java.util.ArrayList;

// FINAL METHOD
public class GPA {
    static void print(String name) {
        if(Result.running == false) {
            ArrayList<Integer> qp = new ArrayList<Integer>();
            int usum = 0;
            int qpsum = 0;
            String hon = "Null";
            // CALCULATES QUALITY POINTS
            for(int a = 0; a<Result.unitList.size(); ++a) {
                qp.add((Result.creditList.get(a)*Result.unitList.get(a)));
                //System.out.println("\n\n"+qp);
            }
            for(int b : Result.unitList) {
                usum += b;
            }
            for(int s : qp) {
                qpsum += s;
            }
            //CGPA.cgpa(usum, qpsum);
            // CALCULATES GPA
            float gpa = ((float)qpsum/(float)usum);
            if(gpa>=4.50 && gpa<=5.00) {
                hon = "First Class";
            }
            else if(gpa>=3.50 && gpa<4.50) {
                hon = "Second Class Upper";
            }
            else if(gpa>=2.50 && gpa<3.50) {
                hon = "Second Class Lower";
            }
            else if(gpa>=0.00 && gpa<2.50) {
                hon = "Third Class";
            }
            // PRINTS OUT STUDENTS RESULT
            System.out.println("\n"+name+"'s Result\n\n");
            System.out.println("Total Units: "+usum+" "+"\tGPA: "+String.format("%.2f", gpa)+" "+"\tHonor: "+hon+"\n\n");
            for(int j = 0; j<Result.unitList.size(); ++j) {
                System.out.print("Course: "+Result.code.get(j)+" "+"\tScore: "+Result.scoreList.get(j)+"\tGrade: "+Result.gradeList.get(j)+"\tCredit: "+Result.creditList.get(j)+" "+"\tUnits: "+Result.unitList.get(j)+" "+"\tQualityPoints: "+qp.get(j)+"\n\n");
            }
        }
    }
}
