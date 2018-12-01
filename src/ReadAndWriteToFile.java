import java.io.*;
import java.util.Scanner;
class ReadAndWriteToFile{
    public static void readNames(String path) {
        File file = new File(path);
        FileReader filereader = null;
        Scanner scanner ;
        try {
            filereader = new FileReader(file);
            scanner = new Scanner(filereader);
            while (scanner.hasNext()){
               System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.printf("I have found an IOexception in :%s", path);
        } finally {
            try {
                if (filereader == null) {
                    filereader.close();
                }
            } catch (IOException e) {
                System.out.printf("I have found an IOexception%s", path);
            }
        }
    }
    public static void writeNames(String[] names, String path) {
        File f = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
            for (int i = 0; i < names.length; i++) {
                fw.write(names[i]);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.printf("");
            }
        }
    }
    public static void main(String args[]){
        String[] names  = new String[3];
        names[0] = "John ";
        names[1] = "Mary ";
        names[2] = "kemi ";
        writeNames(names,"C:\\Users\\Jane\\Desktop\\example.txt");
        readNames("C:\\Users\\Jane\\Desktop\\example.txt");

    }
}