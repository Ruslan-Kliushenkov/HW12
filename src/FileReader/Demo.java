package FileReader;

import java.io.*;

public class Demo {
    public static String read(String path){

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder stringBuilder = new StringBuilder();
            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n ");
            }
            return stringBuilder.toString();
        } catch (FileNotFoundException f){
            return f.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    public static void main(String[] args){
        System. out .println( read ( "C:\\test.txt" ));
    }
}
