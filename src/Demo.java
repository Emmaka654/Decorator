public class Demo {
    public static void main(String[] args){
        IFileReader readFile1 = new ReadFile(new TXTReader());
        readFile1.read();
        IFileReader readFile2 = new ReadFile(new XMLReader());
        readFile2.read();
        IFileReader readFile3 = new ReadFile(new YALReader());
        readFile3.read();
        IFileReader readFile4 = new ReadFile(new FolderReader());
        readFile4.read();
    }
}
