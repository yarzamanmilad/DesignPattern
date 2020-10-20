import java.io.File;

public abstract class Converter {
    private byte[] temp;
    private File file;

    public Converter(byte[] temp) {
        this.temp = temp;
    }

    public Converter(File file) {
        this.file=file;
    }

    public abstract byte[] convert();

    enum CodecTypes{
        MP4,MPEG
        ,MP3,WAV
        ,JPG,BMP
    }
}
