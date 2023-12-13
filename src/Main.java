public class Main {
    public static void main(String[] args) {
        int[] grades1 = {34, 78, 91, 34, 76, 45};
        ArrayAlgorithms.bookEnd(grades1, 20);
        for (int i = 0; i < grades1.length; i++) {
            System.out.print(grades1[i]+ " ");
        }
        System.out.println();
        int[] grades2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        ArrayAlgorithms.bookEnd(grades2, 0);
        for (int i = 0; i < grades2.length; i++) {
            System.out.print(grades2[i]+ " ");
        }
        System.out.println();
        int[] grades3 = {50};
        ArrayAlgorithms.bookEnd(grades3, 100);
        for (int i = 0; i < grades3.length; i++) {
            System.out.print(grades3[i]+ " ");
        }
        System.out.println();

//        int[] nums = {5, 10, 15, 12, 2, 4};
//        ArrayAlgorithms.multiplyBy(nums, 6);
//// original nums array IS modified
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//        int[] nums2 = {-5, -7, 14, 0, 5, 20, -30};
//        ArrayAlgorithms.multiplyBy(nums2, -12);
//// original nums2 array IS modified
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println();
//
//        int[] nums1 = {5, 10, 15, 12, 2, 4};
//        int[] result = ArrayAlgorithms.multiplyByNoModify(nums1, 6);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
//// original array is NOT modified
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums1[i] + " ");
//        }
//        System.out.println();

        String[] words1 = {"yo", "what", "nice", "dude"};
        ArrayAlgorithms.addExclamation(words1);
        for (int i = 0; i < words1.length; i++) {
            System.out.print(words1[i] + " " );
        }
        System.out.println();
        String[] words3 = {"yo!", "what!", "nice!", "dude!"};
        ArrayAlgorithms.addExclamation(words3);
        for (int i = 0; i < words3.length; i++) {
            System.out.print(words3[i] + " " );
        }
        System.out.println();
        String[] words2 = {"a!bc", "!abc", "ab!c", "!abc"};
        ArrayAlgorithms.addExclamation(words2);
        for (int i = 0; i < words2.length; i++) {
            System.out.print(words2[i] + " " );
        }
        System.out.println();
        String[] words4 = {"hello!!", "hola!", "hi", "what?", "rain!", "shine", "out!"};
        ArrayAlgorithms.addExclamation(words4);
        for (int i = 0; i < words4.length; i++) {
            System.out.print(words4[i] + " " );
        }
        System.out.println();

        int[] temps = {32, 35, 40, 31, 29, 33, 50, 27};
        boolean[] result = ArrayAlgorithms.isFreezing(temps);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
// original array is NOT modified
        for (int i = 0; i < temps.length; i++) {
            System.out.print(temps[i] + " ");
        }
        System.out.println();
        int[] temps2 = {10, 20, 30, 0, -20};
        boolean[] result2 = ArrayAlgorithms.isFreezing(temps2);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
        int[] temps3 = {40, 45, 50, 60, 55};
        boolean[] result3 = ArrayAlgorithms.isFreezing(temps3);
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i] + " ");
        }
        System.out.println();

//        int[] nums = {5, 1, 3, 4, 7, 6};
//        ArrayAlgorithms.shiftLeft(nums);
//// original nums array IS modified; all elements shifted left 1
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
//        ArrayAlgorithms.shiftLeft(nums2);
//// original nums2 array IS modified; all elements shifted left 1
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println();
//// shift nums2 AGAIN:
//        ArrayAlgorithms.shiftLeft(nums2);
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println();
//// shift nums2 A THIRD TIME:
//        ArrayAlgorithms.shiftLeft(nums2);
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i] + " ");
//        }
//        System.out.println();

        int[] nums = {6, 1, 3, 4, 7, 5};
        ArrayAlgorithms.shiftRight(nums);
// original nums array IS modified; all elements shifted right 1
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayAlgorithms.shiftRight(nums2);
// original nums2 array IS modified; all elements shifted right 1
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
// shift nums2 AGAIN:
        ArrayAlgorithms.shiftRight(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
// shift nums2 A THIRD TIME:
        ArrayAlgorithms.shiftRight(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        int[] even = {1, 2, 3, 4, 5, 6};
        ArrayAlgorithms.reverse2(even);
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        int[] odd = {1, 2, 3, 4, 5, 6, 7};
        ArrayAlgorithms.reverse2(odd);
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        int[] even2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayAlgorithms.reverse2(even2);
        for (int i = 0; i < even2.length; i++) {
            System.out.print(even2[i] + " ");
        }
        System.out.println();
        int[] odd2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArrayAlgorithms.reverse2(odd2);
        for (int i = 0; i < odd2.length; i++) {
            System.out.print(odd2[i] + " ");
        }
        System.out.println();

    }
}