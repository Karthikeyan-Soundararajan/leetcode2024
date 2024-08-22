package year_2024.aug_2024.aug_22;

public class Complement {

//    public int findComplement(int num) {
//        int binary=0, twoComplement = 0,twoComplementDecimal=0;
//        while (num>1){
//            int reminder = num %2;
//            binary = binary*10;
//            if (reminder==1)
//                binary+=1;
//            num = num /2;
//        }
//        binary = binary*10;
//        if (num==1)
//            binary+=1;
//        while (binary>1){
//            int reminder = binary%10;
//            twoComplement = twoComplement * 10;
//            if (reminder==0) {
//                twoComplement = twoComplement + 1;
//            }
//            binary=binary/10;
//        }
//        twoComplement = twoComplement * 10;
//        if (binary==0) {
//            twoComplement = twoComplement + 1;
//        }
//        int i =0;
//        while (twoComplement>0){
//            int reminder = twoComplement%10;
//            twoComplementDecimal += reminder * Math.pow(2,i);
//            twoComplement = twoComplement / 10;
//            i++;
//        }
//        return twoComplementDecimal;
//    }

    public int findComplement(int num) {
        int len = Integer.toBinaryString(num).length();
        int mask = (1<<len)-1;
        return num ^ mask;
    }

    public static void main(String[] args) {
        Complement complement = new Complement();
        System.out.println(complement.findComplement(5));
    }
}
