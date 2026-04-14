public class TestSolution{

    // Helper function to check results
    static void runTest(Complex obj, int[] c1, int[] c2, int[] expected, String testName) {
        int[] result = obj.add(c1, c2);

        if (result == null) {
            System.out.println(testName + ": FAIL (function not implemented)");
            return;
        }

        if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println(testName + ": PASS");
        } else {
            System.out.println(testName + ": FAIL");
            System.out.println("  Expected: " + expected[0] + " + " + expected[1] + "i");
            System.out.println("  Got:      " + result[0] + " + " + result[1] + "i");
        }
    }

    public static void main(String[] args) {

        Complex obj = new Complex();

        runTest(obj, new int[]{3, 2},  new int[]{1, 4},  new int[]{4, 6},  "Test 1");
        runTest(obj, new int[]{0, 0},  new int[]{0, 0},  new int[]{0, 0},  "Test 2");
        runTest(obj, new int[]{-5, 3}, new int[]{2, -7}, new int[]{-3, -4}, "Test 3");
        runTest(obj, new int[]{10, -2},new int[]{-3, 5}, new int[]{7, 3},  "Test 4");
        runTest(obj, new int[]{1, 1},  new int[]{-1, -1},new int[]{0, 0},  "Test 5");
        runTest(obj, new int[]{7, 8},  new int[]{0, -8}, new int[]{7, 0},  "Test 6");
    }
}
