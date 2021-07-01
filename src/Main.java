import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("How many players we have: ");
        try {
            int players = Integer.parseInt(reader.readLine());
            int[] happyNumbers = new int[4];


                happyNumbers[0] = (new Random()).nextInt(100);
                happyNumbers[1] = (new Random()).nextInt(100);
                happyNumbers[2] = (new Random()).nextInt(100);
                happyNumbers[3] = (new Random()).nextInt(100);


            for(int i=0;i<players;i++){
                int playerNum = (new Random()).nextInt(100);
                System.out.println("Player "+(i+1)+" number " + playerNum +"  " +startWager(happyNumbers, playerNum));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int count = 0;
    public static String startWager(int[] happyNumbers, int playerNum){


        if(count==0){
            System.out.print("Happy numbers are: ");
            for(int i : happyNumbers){
                System.out.print(i + "  ");
            }
            count++;
            System.out.println();
        }
        for(int i : happyNumbers){
            if(i==playerNum) return "winner";
        }

        return "loser";
    }
}

/**
 * Программа у нас спрашивает сколько игроков учавствует в игре,
 *
 */