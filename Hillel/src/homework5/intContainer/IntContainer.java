package homework5.intContainer;

/**
 * Created by yura on 06.07.15.
 */
public class IntContainer {
    int[] intNum = new int[1];
    int size =1;

    public IntContainer(){

    }

    public IntContainer(int inNum){
        this.intNum[0] =inNum;
    }

    public void setIntNum(int inNum) {

        this.intNum = incArray();
        this.intNum[size-1] = inNum;
    }

    private int[] incArray(){
        size = intNum.length+1;
        int[] tmpArray = new int[size];
        for(int i=0; i<size-1; i++){
            tmpArray[i] = intNum[i];
        }
        return tmpArray;
    }

    public int getIntNum(int id) {
        return intNum[id];
    }

    public int[] getIntNum() {
        return intNum;
    }

    public boolean contains(int inNum){
        for (int i = 0; i<size; i++){
            if(intNum[i]==inNum){
                return true;
            }
        }
        return false;
    }

    public void sortNum(){
        fastSort(0, size-1);
    }

    private  void fastSort(int start, int end) {
        int i = start;
        int j = end;
        int x = intNum[(start+end)/2];
        do {
            while(intNum[i] < x) ++i;
            while(intNum[j] > x) --j;
            if(i <= j){
                int temp = intNum[i];
                intNum[i] = intNum[j];
                intNum[j] = temp;
                i ++ ; j --;
            }
        } while(i <= j);

        if(start < j){
            fastSort(start, j);
        }
        if(i < end){
            fastSort(i, end);
        }
    }
}
