public class XMLReader extends DataDecorator {

    public XMLReader(IFile decoratedReader) {
        super(decoratedReader);
    }

    @Override
    public void write(String data) {
        super.write(data);
        System.out.println("Write " + data + " to file xml");
    }

    @Override
    public String read() {
        super.read();
        return "Read file xml";
    }
}
