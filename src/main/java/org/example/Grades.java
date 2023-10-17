package org.example;


public class Grades {
    private final int[] _grades;
    public Grades(int...grades) {
        _grades = grades;
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
        if (number > 100) {
            throw new IllegalNumberException("Grade cannot be higher than 100");
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
    public int[] insufficientGrades() throws IllegalNumberException, EmptyArrayException {
        if (_grades.length  == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        int[] result = new int[numberOfInsufficientGrades()];
        int index = 0;
        for (Integer grade: _grades)
            if (isInsufficient(grade)) {
                result[index] = grade;
                index++;
            }
        return result;
    }

    public int sumOfGrades() {
        int sum = 0;
        for (int grade: _grades)
            sum += grade;
        return sum;
    }

    public int averageGrade() throws IllegalAccessException {
        if (_grades.length == 0 ) {
            throw new IllegalAccessException("Array is empty!");
        }
        return sumOfGrades() / _grades.length;
    }

    public int[] roundedGrades() throws IllegalNumberException, EmptyArrayException {
        if (_grades.length == 0) {
            throw new EmptyArrayException("Array is empty");
        }
        int[] result = new int[_grades.length];
        for (int i = 0; i < _grades.length; i++)
            result[i] = round(_grades[i]);
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
