package year_2024.aug_2024.aug_19;

public class Keys_Keyboard {

    public int minSteps(int n) {
        if(n<1)
            return 0;
        int steps = 0,factor = 2;
        while (n>1){
            while (n%factor==0){
                steps+= factor;
                n = n/factor;
            }
            factor++;
        }
        return steps;
    }

    public static void main(String[] args) {
        Keys_Keyboard keysKeyboard = new Keys_Keyboard();
        System.out.println(keysKeyboard.minSteps(9));
    }
}
