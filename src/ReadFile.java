public class ReadFile extends ReaderDecorator {
    public ReadFile(IFileReader decoratedReader) {
        super(decoratedReader);
    }

    @Override
    public void read() {
        decoratedReader.read();
        setReader(decoratedReader);
    }

    private void setReader(IFileReader decoratedReader) {
        System.out.println("Reader was set");
    }
}
