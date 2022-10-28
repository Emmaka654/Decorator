public abstract class ReaderDecorator implements IFileReader {
    protected IFileReader decoratedReader;

    public ReaderDecorator (IFileReader decoratedReader){
        this.decoratedReader = decoratedReader;
    }

    @Override
    public void read() {
        decoratedReader.read();
    }
}
