package DependencyTest2;

/**
 * A simple calculator class.
 */
public class Calculator {

    /**
     * Does integer multiplication
     *
     * @param a first integer
     * @param b second integer
     *
     * @return integers multiplied
     */
    public static int multiply(Integer a, Integer b) {
        if (a != null && b != null) {
            return a * b;
        } else {
            return 0;
        }
    }
}