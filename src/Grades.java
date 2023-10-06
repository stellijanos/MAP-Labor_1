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
     * @return the grade rounded up if it ends with 3, 4, 8, 9,
     */
    public int round(int grade) {
        return grade - nextMultipleOf5(grade) < 3 ? nextMultipleOf5(grade) : grade;
    }

    /**
     *
     * @param grade
     * @return true if the grade is insuficient or false otherwise
     */
    public boolean insuficient(int grade) {
        return grade < 38 || round(grade) < 40;
    }



}

