public class YAL extends DataDecorator {

    public YAL(IFile decorator) {
        super(decorator);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Write " + data + " to file yal");
    }

    @Override
    public String read() {
        super.read();
        return "Read file yal";
    }
}
