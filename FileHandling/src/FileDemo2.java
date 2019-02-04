import java.io.*;
import java.util.*;
class FileDemo2 {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("C:\\Users\\Ajay\\Desktop\\JAVA\\Java_FocpII\\FileHandling\\files\\file1.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
       Scanner sc = new Scanner(System.in);
             System.out.println("Press N to exit");
             System.out.println("\nEnter a String:");
       do{
               String temp = sc.nextLine();
               if(temp.charAt(0) == 'N')
                break;
              else{
                bout.write(temp);
                bout.newLine();
              }
        }while(sc.hasNext());
            bout.close();
}         
    catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }    } }
