import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HappyNumbers {
    public static void main(String[] args){
        List<Integer> happyNumber = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int player_count = 0;
        int interval = 0;

        System.out.println("*************  ---- Welcome to lottery game! ---- *****************");
        try {
            System.out.print("How many players do we have? ");
            player_count = Integer.parseInt(reader.readLine());
            System.out.print("Input num itervel: from 0 to ");
            interval = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random random = new Random();
        int num=0;
        while (true){
            int rand_num = random.nextInt(interval);
            if(happyNumber.contains(rand_num)){
                System.out.println(happyNumber);
                continue;
            }
            else {
                happyNumber.add(rand_num);
                num++;
            }
            if(num==4)break;
        }

        int[][] player = new int[player_count][4];

        for(int i=0;i<player_count;i++){
            for(int j=0; j<4; j++)
                player[i][j] = random.nextInt(interval);
        }

        for(int i=0; i<player_count; i++){
            int count = 0;
            for(int j=0;j<4;j++){
                if(happyNumber.contains(player[i][j])) count++;
            }

            System.out.print("Player "+i + " : " +player[i][0] + " " + player[i][1]+" "+
                        player[i][2]+ " " + player[i][3]);

            switch (count){
                case 0:
                    System.out.println("\t loser");
                    break;
                case 1:
                    System.out.println("\t\t 250.000$");
                    break;
                case 2:
                    System.out.println("\t\t\t 500.000$");
                    break;
                case 3:
                    System.out.println("\t\t\t\t 750.000$");
                    break;
                case 4:
                    System.out.println("\t\t\t\t\t 1.000.000$");
            }
        }

    }
}
