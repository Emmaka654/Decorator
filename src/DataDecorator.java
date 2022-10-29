public class DataDecorator implements IFile {
    protected IFile decorator;

    public DataDecorator(IFile decorator) {
        this.decorator = decorator;
    }

    @Override
    public void write(String data) {
        System.out.println("Write " + data);
    }

    @Override
    public String read() {
        return "Read";
    }
}
