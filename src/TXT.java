public class TXT implements IFile {
    @Override
    public void write(String data) {
        System.out.println("Write " + data + " to file txt");
    }

    @Override
    public String read() {
        return "Read file txt";
    }
}
