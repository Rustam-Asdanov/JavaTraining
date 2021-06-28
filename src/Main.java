public class Main {
    public static void main(String[] args){
        int counter = 0;
        int tester=0;
        while(true){
            System.out.println(counter);
            if(deadCode(tester).equals("You win")) counter++;
            tester++;
            if(tester>100)break;
        }
        System.out.println(counter);
    }

    public static String deadCode(int num){
        while(true){
            System.out.print(".");
            num+=7;
            if(num>35 && num<38) {
                num+=10;
            };
            if(num >45 && num<50) {
                return "You win";
            }

            if(num>100) return "infinity";
        }
    }
}
