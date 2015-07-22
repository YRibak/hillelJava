package homework9.tictactoe;

/**
 * Created by VSulevskiy on 19.07.2015.
 */
public class GameLogic {
    //default

    private int[] field = new int[9];

    public AiGameStrategy aiGameStrategy;

    public boolean makeTurn(int position){
        if (field[position] == 0) {
            field[position] = 1;
            return true;
        }
        return false;
    }
    public int aIMakeTurn(){
        if (aiGameStrategy == null){
            setAiGameStrategy(new RandomAiGameStrategy());
        }
        int fieldNumber =  this.aiGameStrategy.aiMakeTurn(field);
        field[fieldNumber] = 2;
        return fieldNumber;
    }

    public void setAiGameStrategy(AiGameStrategy gameStrategy){
        this.aiGameStrategy = gameStrategy;
    }

    public boolean checkPlayerWin() {
        if (field[0] == 1 && field[1] == 1 && field[2] == 1) {
            return true;
        }else if (field[3] == 1 && field[4] == 1 && field[5] == 1) {
            return true;
        }else if (field[6] == 1 && field[7] == 1 && field[8] == 1) {
            return true;
        }else if (field[0] == 1 && field[4] == 1 && field[8] == 1) {
            return true;
        }else if (field[0] == 1 && field[3] == 1 && field[6] == 1) {
            return true;
        }else if (field[1] == 1 && field[4] == 1 && field[7] == 1) {
            return true;
        }else if (field[2] == 1 && field[5] == 1 && field[8] == 1) {
            return true;
        }else if (field[2] == 1 && field[4] == 1 && field[6] == 1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean checkAiWin() {
        if (field[0] == 2 && field[1] == 2 && field[2] == 2) {
            return true;
        }else if (field[3] == 2 && field[4] == 2 && field[5] == 2) {
            return true;
        }else if (field[6] == 2 && field[7] == 2 && field[8] == 2) {
            return true;
        }else if (field[0] == 2 && field[4] == 2 && field[8] == 2) {
            return true;
        }else if (field[0] == 2 && field[3] == 2 && field[6] == 2) {
            return true;
        }else if (field[1] == 2 && field[4] == 2 && field[7] == 2) {
            return true;
        }else if (field[2] == 2 && field[5] == 2 && field[8] == 2) {
            return true;
        }else if (field[2] == 2 && field[4] == 2 && field[6] == 2) {
            return true;
        }else{
            return false;
        }
    }
    public boolean checkDraw(){
        boolean spaceField = true;
        for (int i=0; i<9; i++){
            if(field[i] == 0){
                spaceField = false;
                break;
            }
        }
        return spaceField;
    }
}
