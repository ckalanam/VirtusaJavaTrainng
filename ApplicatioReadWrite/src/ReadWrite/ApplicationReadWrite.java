package ReadWrite;

import java.io.*;
import java.nio.Buffer;

public class ApplicationReadWrite {

    public static void main(String[] args) throws Exception {

        // Below methods are created as static. therefore we can call these methods without creating objects.
        System.out.println("\n 2). Read and Write functions\n");
        writeFile();
        readFile();
        System.out.println("\n3). Read and Write functions with resource\n");
        tryWriteWithResources();
        tryReadWithResources();
        }

    public static void readFile() /*throws Exception*/{

        try {
            FileReader frObj = new FileReader("/home/user/IdeaProjects/ApplicatioReadWrite/writeChe.txt");
            BufferedReader brObj = new BufferedReader(frObj);

            String phrase;
            while ((phrase = brObj.readLine())!=null){
                System.out.println(phrase);
            }
/*          // By executing this method, you can see the output as 1,3,5,7,9,null. That's because of stream problem.
            String phrase;
            while ((brObj.readLine())!=null){
                System.out.println(brObj.readLine());
            }
            */

            /*
            int i;
            while ((i.brObj.read()) != -1) {
                System.out.println((char) i);
            }
*/

            brObj.close();
            frObj.close();

            System.out.println("readFile() method has executed!");
            System.out.println("File has read successfully!\n");

        }catch(Exception e){

        }
    }

    public static void writeFile(){

        try{
            FileWriter fwObj = new FileWriter("/home/user/IdeaProjects/ApplicatioReadWrite/writeChe.txt");
            BufferedWriter bwObj = new BufferedWriter(fwObj);
            for(int mover=0;mover<=10;mover++){
                bwObj.write(""+mover);
                bwObj.newLine();
            }

            //System.out.println("File has updated successfully!");

            bwObj.close();
            fwObj.close();

            System.out.println("writeFile() method has executed!");
            System.out.println("File has written successfully!\n");

        }catch(Exception e){

        }
    }

    public static void tryReadWithResources(){
        try(
                FileReader frObj = new FileReader("/home/user/IdeaProjects/ApplicatioReadWrite/writeChe.txt");
                BufferedReader brObj = new BufferedReader(frObj);

                ){
            String readPhrase;
            while((readPhrase=brObj.readLine())!=null)
                System.out.println(readPhrase);

            System.out.println("tryReadWithResources() method has executed!");
            System.out.println("File has read successfully!\n");

        }catch(Exception e){

        }
    }

    public static void tryWriteWithResources(){
        try(
                FileWriter fwObj = new FileWriter("/home/user/IdeaProjects/ApplicatioReadWrite/writeChe.txt");
                BufferedWriter bwObj = new BufferedWriter(fwObj);
                ){
            for(int mover=0;mover<=15;mover++){
                bwObj.write(""+mover);
                bwObj.newLine();
                }

            System.out.println("tryWriteWithResources() method has executed!");
            System.out.println("File has written successfully!\n");

        }catch(Exception e){

        }
    }
}
