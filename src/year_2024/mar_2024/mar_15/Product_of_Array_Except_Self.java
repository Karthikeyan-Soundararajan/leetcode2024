package year_2024.mar_2024.mar_15;

public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = prefix;
            prefix *= nums[i];
        }
        prefix = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            products[i] *= prefix;
            prefix *= nums[i];
        }
        return products;
    }

    public static void main(String[] args) {
        Product_of_Array_Except_Self productOfArrayExceptSelf = new Product_of_Array_Except_Self();
        int[] out = productOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4});
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
