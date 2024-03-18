package year_2024.mar_2024.mar_16;

public class Contiguous_Array {

    public int findMaxLength(int[] nums) {
        int zeroCount = 0, onesCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                zeroCount++;
            }else {
                onesCount++;
            }
        }
        return Math.min(zeroCount,onesCount)*2;
    }

    public static void main(String[] args) {
        Contiguous_Array contiguousArray = new Contiguous_Array();
        System.out.println(contiguousArray.findMaxLength(new int[]{0,1}));
    }
}
