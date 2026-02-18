
public class Main {
    public static void main(String[] args) {

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};

        Integer[] mergedIntegers = GenericArrayUtility.mergeArrays(arr1, arr2);

        System.out.print("Merged Integer Array: ");
        for (Integer num : mergedIntegers) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] str1 = {"apple", "banana"};
        String[] str2 = {"Aline", "date"};

        String[] mergedStrings = GenericArrayUtility.mergeArrays(str1, str2);

        System.out.print("Merged String Array: ");
        for (String s : mergedStrings) {
            System.out.print(s + " ");
        }
    }
}