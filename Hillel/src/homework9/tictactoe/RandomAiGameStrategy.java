package homework9.tictactoe;

import java.util.Random;

/**
 * Created by VSulevskiy on 19.07.2015.
 */
public class RandomAiGameStrategy implements AiGameStrategy {

    @Override
    public int aiMakeTurn(int[] field) {
        int numberField;
        boolean marker = true;
        Random random = new Random();
        do{
            numberField = random.nextInt(9);
            if(field[numberField]==0){
                marker = false;
            }
        }while (marker);
        return numberField;
    }
}
