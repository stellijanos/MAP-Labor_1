package labor_1.classes;

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
        return  grade != 100 && nextMultipleOf5(grade) - grade < 3 ? nextMultipleOf5(grade) : grade;
    }

    /**
     *
     * @param grade an Integer between 0 and 100
     * @return true if the grade is insufficient or false otherwise
     */
    public boolean isInsufficient(int grade) {
        return grade < 38 || round(grade) < 40;
    }

    /**
     *
     * @param grades an array with Integer numbers between 0 and 100
     * @return filtered grades by insufficiency
     */
    public ArrayList<Integer> insufficientGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer grade: grades)
            if (isInsufficient(grade))
                result.add(grade);
        return result;
    }

    public int sumOfArrayElements(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer element: array)
            sum += element;
        return sum;
    }

    public int averageGrade(ArrayList<Integer> grades) {
        return grades.isEmpty() ? 0 : sumOfArrayElements(grades) / grades.size();
    }

    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer grade: grades)
            result.add(round(grade));
        return result;
    }

    public int maximalRoundedGrade(ArrayList<Integer> grades) {
        int maximalRoundedGrade = 0;
        for (Integer grade: grades)
            if (round(grade) != grade && maximalRoundedGrade < round(grade))
                maximalRoundedGrade = round(grade);
        return maximalRoundedGrade;
    }
}
