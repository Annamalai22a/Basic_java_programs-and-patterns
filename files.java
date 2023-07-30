
import java.io.*;
import java.util.Scanner;

class PrinterWithScanner{
    String defaultSpace;
    Scanner inp = new Scanner(System.in);
    PrinterWithScanner(String Destination){
        defaultSpace = Destination;
        File IpuOpuSpace = new File(Destination);
        if(!IpuOpuSpace.exists()){
            System.out.println("As there is no outlet,It has been created..!");
            IpuOpuSpace.mkdir();
        }
    }
    public void printMyDoc(String name){
        File paper = new File(defaultSpace+"\\"+name);
        FileWriter fWriter;
        try{
            paper.createNewFile();
            fWriter = new FileWriter(paper);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            System.out.println("Enter your text to print:");
            bWriter.write(inp.nextLine());
            bWriter.flush();
            bWriter.close();
        }catch (IOException e){
            System.out.println("Printer Error!!!");
        }
    }
    public void scanMyDoc(String name){
        File paper = new File(defaultSpace+"\\"+name);
        try{
            FileReader fReader = new FileReader(paper);
            BufferedReader bReader = new BufferedReader(fReader);
            System.out.println("The text on the Doc:"+bReader.readLine());
        }catch(Exception e){
            System.out.println("Cannot scan the document!!!");
        }
    }
}

public class files {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        String Destination = "D:\\";
        String fileName = "op.txt";
        PrinterWithScanner p1 = new PrinterWithScanner(Destination);
        p1.printMyDoc(fileName);
        p1.scanMyDoc(fileName);
        System.out.println("Do you want to shred the paper(y/n)");
        if(inp.next().equals("y")){
            System.out.println("Sending to paper shredder machine...");
            paperShredder(Destination+"\\"+fileName);
        }
    }
    public static void paperShredder(String path){
        File unwantedFile = new File(path);
        Boolean isDeleted = unwantedFile.delete();
        if(isDeleted) System.out.println("Your Paper has been Shredded Successfully!!!");
        else System.out.println("Cannot Shred..!");
    }
}