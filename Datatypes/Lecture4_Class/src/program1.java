import java.util.*;
class program1{
    public static void main(String[] args) {
        Scanner inputVal = new Scanner(System.in);
        int num[] = new int[10];
        int i;
        int srch;
        boolean flag = false;
        for(i=0; i<num.length; i++){
            num[i] = inputVal.nextInt();
        }
        System.out.print("Which number do you want to search ? ");
        srch = inputVal.nextInt();
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
}