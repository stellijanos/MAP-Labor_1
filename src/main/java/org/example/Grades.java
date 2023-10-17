package org.example;


public class Grades {
    private final int[] _grades;
    public Grades(int...grades) {
        this._grades = grades;
    }

    public int[] get_grades() {
        return _grades;
    }

    /**
     *
     * @param number type of int
     * @return next multiple of 5 after the given number
     */
    public int nextMultipleOf5(int number) throws IllegalNumberException {
        if (number < 0 ) {
            throw new IllegalNumberException("Grade cannot be lower than 0");
        }
        return number / 5 * 5 + 5;
    }

    /**
     *
     * @param grade type of int
     * @return rounded up grade if it ends with 3, 4, 8 or 9
     */
    public int round(int grade) throws IllegalNumberException {
        return  grade != 100 && nextMultipleOf5(grade) - grade < 3 ? nextMultipleOf5(grade) : grade;
    }

    /**
     *
     * @param grade an Integer between 0 and 100
     * @return true if the grade is insufficient or false otherwise
     */
    public boolean isInsufficient(int grade) throws IllegalNumberException {
        return grade < 38 || round(grade) < 40;
    }


    private int numberOfInsufficientGrades() throws IllegalNumberException {
        int result = 0;
        for (Integer grade: _grades)
            result = isInsufficient(grade) ? result + 1 : result;
        return result;
    }

    /**
     * @return filtered grades by insufficiency
     */
    public int[] insufficientGrades() throws IllegalNumberException {
        int[] result = new int[numberOfInsufficientGrades()];
        int index = 0;
        for (Integer grade: _grades)
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

    public int averageGrade() throws IllegalAccessException {
        if (_grades.length == 0 ) {
            throw new IllegalAccessException("Arry is empty!");
        }
        return sumOfArrayElements(_grades) / _grades.length;
    }

    public int[] roundedGrades(int[] grades) throws IllegalNumberException {
        int[] result = new int[grades.length];
        for (int i = 0; i < grades.length; i++)
            result[i] = round(grades[i]);
        return result;
    }

    public int maximalRoundedGrade() throws IllegalAccessException, IllegalNumberException {
        int maximalRoundedGrade = 0;
        if (_grades.length == 0) {
            throw new IllegalAccessException("Array is empty!");
        }
        for (int grade: _grades)
            if (round(grade) != grade && maximalRoundedGrade < round(grade))
                maximalRoundedGrade = round(grade);
        return maximalRoundedGrade;
    }
}