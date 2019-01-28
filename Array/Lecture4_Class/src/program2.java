import java.util.*;
class program2{
    static int num[] = new int[10];
    static int i=0;
    static int srch=0;
    static Scanner inputVal = new Scanner(System.in);
    static void getInput(){
        for(i=0; i<num.length; i++){
            num[i] = inputVal.nextInt();
        }
    }
    static void searchElement(){
        System.out.print("Which number do you want to search ? ");
        srch = inputVal.nextInt();
    }

    static void displayIndex(){
        boolean flag = false;
        for(i=0; i<num.length; i++){
            if(num[i] == srch){
                flag = true;
                break;
            }
        }    
        if(flag){
            System.out.println("Index is :- "+i);
        }
        else{
            System.out.println("-1");
        }  
    }
    public static void main(String[] args) {
        getInput();
        searchElement();
        displayIndex();   
    }
}        

