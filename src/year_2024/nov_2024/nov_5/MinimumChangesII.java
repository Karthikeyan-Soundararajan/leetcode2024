package year_2024.nov_2024.nov_5;

public class MinimumChangesII {

    public int minChanges(String s) {
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i)-'0';
            if(i%2==1){
                ans+=(c%2);
                c=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumChangesII minimumChangesII = new MinimumChangesII();
        System.out.println(minimumChangesII.minChanges("1001"));
    }
}
