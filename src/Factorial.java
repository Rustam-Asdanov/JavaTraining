public class Factorial {

    /**
     *
     * 3! = 3 * 2 * 1 = 6
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println(getResult(9));
    }

    public static int getResult(int num){
        // return 3 * 2 * 1
        if(num==1) return 1;
        return num * getResult(num-1);
    }
}
