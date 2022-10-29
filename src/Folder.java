public class Folder extends DataDecorator {

    public Folder(IFile decorator) {
        super(decorator);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Write " + data + " to folder");
    }

    @Override
    public String read() {
        super.read();
        return "Read folder";
    }
}
