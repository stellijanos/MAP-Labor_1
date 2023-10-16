package org.example;

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


    private int numberOfInsufficientGrades(int[] grades) {
        int result = 0;
        for (Integer grade: grades)
            result = isInsufficient(grade) ? result + 1 : result;
        return result;
    }

    /**
     *
     * @param grades an array with Integer numbers between 0 and 100
     * @return filtered grades by insufficiency
     */
    public int[] insufficientGrades(int[] grades) {
        int[] result = new int[numberOfInsufficientGrades(grades)];
        int index = 0;
        for (Integer grade: grades)
            if (isInsufficient(grade)) {
                result[index] = grade;
                index++;
            }
        return result;
    }

    public int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int element: array)
            sum += element;
        return sum;
    }

    public int averageGrade(int[] grades) throws IllegalAccessException {
        if (grades.length == 0 ) {
            throw new IllegalAccessException("Arry is empty!");
        }
        return sumOfArrayElements(grades) / grades.length;
    }

    public int[] roundedGrades(int[] grades) {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++)
            result[i] = round(grades[i]);
        return result;
    }

    public int maximalRoundedGrade(int[] grades) throws IllegalAccessException {
        int maximalRoundedGrade = 0;
        if (grades.length == 0) {
            throw new IllegalAccessException("Array is empty!");
        }
        for (int grade: grades)
            if (round(grade) != grade && maximalRoundedGrade < round(grade))
                maximalRoundedGrade = round(grade);
        return maximalRoundedGrade;
    }
}