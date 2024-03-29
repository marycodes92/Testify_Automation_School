package weekonechallenge;

// Find two numbers of which the product is maximum in an array
public class Challenge3 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 8};
        int[] result = findMaxProduct(nums);
        System.out.println("Two numbers with maximum product: " + result[0] + " and " + result[1]);
    }
    public static int[] findMaxProduct(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two numbers");
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return new int[]{max2, max1};
    }
}
