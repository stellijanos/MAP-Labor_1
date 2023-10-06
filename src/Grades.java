import java.util.ArrayList;

public class Grades {

    /**
     *
     * @param number type of int
     * @return next multiple of 5 after the given number
     */
    public int nextMultipleOf5(int number) {
        return number / 5 * 5 + 5;
    }

    /**
     *
     * @param grade type of int
     * @return rounded up grade if it ends with 3, 4, 8 or 9
     */
    public int round(int grade) {
        return grade - nextMultipleOf5(grade) < 3 ? nextMultipleOf5(grade) : grade;
    }

    /**
     *
     * @param grade an Integer between 0 and 100
     * @return true if the grade is insuficient or false otherwise
     */
    public boolean isInsuficient(int grade) {
        return grade < 38 || round(grade) < 40;
    }

    /**
     *
     * @param grades an array with Integer numbers between 0 and 100
     * @return filtered grades by insuficiency
     */
    public ArrayList<Integer> insuficientGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer grade: grades)
            if (isInsuficient(grade))
                result.add(grade);
        return result;
    }

    public int sumOfArrayElements(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer element: array) sum += element;
        return sum;
    }

    public int averageGrade(ArrayList<Integer> grades) {
        return sumOfArrayElements(grades) / grades.size();
    }


    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer grade: grades)
            result.add(round(grade));
        return result;
    }
}

