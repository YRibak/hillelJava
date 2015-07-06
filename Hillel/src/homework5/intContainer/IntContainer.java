package homework5.intContainer;

/**
 * Created by yura on 06.07.15.
 */
public class IntContainer {
    int[] intArray = new int[1];
    int size =1;

    public IntContainer(){

    }

    public IntContainer(int inNum){
        this.intArray[0] =inNum;
    }

    public void setIntNum(int inNum) {
        this.intArray = incArray();
        this.intArray[size-1] = inNum;
    }

    private int[] incArray(){
        size = intArray.length+1;
        int[] tmpArray = new int[size];
        for(int i=0; i<size-1; i++){
            tmpArray[i] = intArray[i];
        }
        return tmpArray;
    }

    public int getIntNum(int id) {
        return intArray[id];
    }

    public int[] getIntNum() {
        return intArray;
    }

    public boolean contains(int inNum){
        for (int i = 0; i<size; i++){
            if(intArray[i]==inNum){
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
        int x = intArray[(start+end)/2];
        do {
            while(intArray[i] < x) ++i;
            while(intArray[j] > x) --j;
            if(i <= j){
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
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
