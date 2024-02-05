@FunctionalInterface
interface IntBinaryOperator {
    int apply(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2};
        System.out.println(reduce(arr, (a, b) -> a + b));
        System.out.println(reduce(arr, Integer::sum));
        System.out.println(reduce(arr, Math::max));
    }

    public static int reduce(int[] arr, IntBinaryOperator operator) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = operator.apply(result, arr[i]);
        }

        return result;
    }
}