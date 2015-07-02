package homework3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yura on 29.06.15.
 */
public class StudentsArray {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] firstGroup = new String[] {"Ivanov", "Petrov", "Yanukovich", "Leopoldov", "Pyatochkin", "Ivanov"};
    public static String[] secondGroup = new String[] {"Petrov", "Ivanow", "Sidorov"};
    public static int groupNumber;
    public static void main(String[] args) {

        boolean mark = true;
        String inputData;
        do {
            printMenu();
            inputData = scanner.nextLine();
            switch (inputData) {
                case "1":
                    addStudent(getData(), inputedText("Input Last Name of Students"));

                    break;
                case "2":
                    deleteStudent(getData(), inputedText("Input Last Name of Students"));
                    break;
                case "3":
                    searchStudent(getData(), inputedText("Input Last Name of Students"));
                    break;
                case "4":
                    clearGroup(getData());
                    break;
                case "5":
                    trimArray(getData());
                    break;
                case "6":
                    sortArray(getData());
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    printGroup(getData());
                    break;
                case "EXIT":
                    mark = false;
                    break;
                default:
                    System.out.println("You've entered incorrect data, try again");
            }

        } while (mark);
    }

    public static void printMenu(){
        System.out.println("Input \"1\" for add new Student;");
        System.out.println("Input \"2\" for delete new Student;");
        System.out.println("Input \"3\" for search student;");
        System.out.println("Input \"4\" for clean array;");
        System.out.println("Input \"5\" for delete empty elements;");
        System.out.println("Input \"6\" for sorting by Last Name;");
        System.out.println("Input \"7\" if you wont to know about the same students in both groups;");
        System.out.println("Input \"8\" if you wont to know about the same students;");
        System.out.println("Input \"9\" for print;");
        System.out.println("Input \"EXIT\" for quit;");
    }

    public static String inputedText(String instruction){
        System.out.println(instruction);
        return scanner.nextLine();

    }

    public static String[] getData(){
        chooseGroupDialog();
        return groupNumber == 0 ? firstGroup : secondGroup;
    }

    public static void setData(String[] arr){
        if (groupNumber == 0){
            firstGroup = arr;
        }
        else if (groupNumber == 1){
            secondGroup = arr;
        }
    }


    public static void chooseGroupDialog(){
        System.out.print("Input number of group (1 or 2): ");
        boolean mark = true;
        do {
            switch (inputedText("")) {
                case "1":
                    groupNumber = 0;
                    mark = false;
                    break;
                case "2":
                    groupNumber = 1;
                    mark = false;
                    break;
                default:
                    System.out.println("Inputed data incorrect, please try again: ");
            }
        } while(mark);

    }


    public static void addStudent(String[] innerArray, String secondName){
            innerArray = Arrays.copyOf(innerArray,innerArray.length+1);
            innerArray[innerArray.length-1] = secondName;
            setData(innerArray);
    }

    public static void deleteStudent(String[] inputedArray, String delName){
            String[] tempArray = new String[inputedArray.length-1];
            int count = 0;
            for (String val : inputedArray) {
                if (!val.equals(delName)){
                    tempArray[count] = val;
                    count++;
                }
            }
            tempArray = trimArray(tempArray);
            setData(tempArray);
    }

    public static String[] trimArray(String[] inputedArray){
        int count = 0;
        for(String val : inputedArray){
            if ( val != null) {
                count++;
            }
        }
        String[] tempArray = new String[count];
        count =0;
        for (String val : inputedArray){
            if (val != null) {
                tempArray[count] = val;
                count++;
            }
        }
        return tempArray;
    }

    public static  void sortArray(String[] inputedArray){
        Arrays.sort(inputedArray);
        setData(inputedArray);
    }
    public static void searchStudent (String[] inputedArray, String searchName){
        String[] tempArray = new String[inputedArray.length-1];
        int count =0;
        for (String val : inputedArray) {
            if (val.equals(searchName)){
                tempArray[count] = val;
                count++;
            }
        }
        tempArray = trimArray(tempArray);
        printGroup(tempArray);
    }

    public static void clearGroup(String[] tempArray){
        tempArray = new String[0];
        setData(tempArray);

    }

    public  static void printGroup(String[] arr){
        int i;
        for (i=0; i<=35; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("| %-10s | %-20s", "Number", "Last Name");
        System.out.println();
        for (i=0; i<=35; i++){
            System.out.print("-");
        }
        System.out.println();
        for (i=0; i<arr.length; i++){
            System.out.printf("| %-10s | %-20s", i, arr[i]);
            System.out.println("|");
        }
        for (i=0; i<=35; i++){
            System.out.print("-");
        }
    }
}
