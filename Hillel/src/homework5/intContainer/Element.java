package homework5.intContainer;

/**
 * Created by yura on 06.07.15.
 */
public class Element {
    private int[] value = new int[1];
    private int size;
    private int sign;

    public void changeSign(){
        sign = sign<0 ? 1 : -1;
    }

    private int[] increaseArr(int step){
        int[] tempArray = new int[this.value.length+step];
        for (int i=0; i<=size; i++){
            tempArray[i] = this.value[i];
        }
        return tempArray;
    }

    public void reversInt(){
        int[] tempArray = new int[size];
        for(int i=0; i<size; i++){
            tempArray[i] = this.value[size-1-i];
        }
        this.value = tempArray;
    }

    public int getSign() {
        return sign;
    }


    public int getValue() {
        int result =0;
        int k = 1;
        for(int i =0; i<size; i++){
            result += value[i] * k;
            k *=10;
        }
        return result * getSign();
    }

    public void setValue(int inputNumber) {
        sign = inputNumber<0 ? -1 : 1;
        size = 0;
        inputNumber = Math.abs(inputNumber);
        while (inputNumber>0){
            if (value.length> size-1){
                value= this.increaseArr(1);
            }
            value[size] = inputNumber % 10;
            size++;
            inputNumber = inputNumber / 10;
        }
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    public int getSize() {
        return size;
    }

}
