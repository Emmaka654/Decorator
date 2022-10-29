public class Demo {
    public static void main(String[] args){
        DataDecorator data = new XMLReader(new YAL(new Folder(new TXT())));
        data.write("decoratedData");
        System.out.println();
        data.read();
    }
}
