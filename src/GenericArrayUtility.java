import java.lang.reflect.Array;

public class GenericArrayUtility {

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        int lengthA = a.length;
        int lengthB = b.length;

        T[] merged = (T[]) Array.newInstance(a.getClass().getComponentType(), lengthA + lengthB);

        // Copy elements from first array
        for (int i = 0; i < lengthA; i++) {
            merged[i] = a[i];
        }


        for (int i = 0; i < lengthB; i++) {
            merged[lengthA + i] = b[i];
        }

        return merged;
    }
}
