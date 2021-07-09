import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPlayer {
//    public static void main(String[] args){
//        List<String> names = new ArrayList<>();
//        names.add("Ali Qasimov");
//        names.add("Ali Ismayilov");
//        names.add("Altay Abbasquliyev");
//        names.add("Nihad");
//        names.add("Magomed");
//        names.add("Shahmar");
//        names.add("Huseyn");
//        names.add("Deniz");
//
//        Random random = new Random();
//        for(int i=0;i<4;i++){
//            String first = names.get(random.nextInt(names.size()));
//            names.remove(first);
//            String second = names.get(random.nextInt(names.size()));
//            names.remove(second);
//            System.out.println(first + " and " + second);
//
//
//        }
//
//    }
public static void main(String[] args){
        Random random = new Random();
        List<String> names = new ArrayList<>();
        names.add("Elnur");
        names.add("Said");
        names.add("Kazim");
        names.add("Ayxan");
        names.add("Alishan");
        names.add("Huseyn");
        names.add("Ramazan");
        names.add("" + (random.nextInt(3)+1));


        for(int i=0;i<4;i++){
            String first = names.get(random.nextInt(names.size()));
            names.remove(first);
            String second = names.get(random.nextInt(names.size()));
            names.remove(second);
            System.out.println(first + " and " + second);


        }

    }
}
