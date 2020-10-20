import java.io.File;

public class BmpToJpgConverterImpl extends Converter {
    public BmpToJpgConverterImpl(byte[] temp) {
        super(temp);
    }

    public BmpToJpgConverterImpl(File file) {
        super(file);
    }

    @Override
    public byte[] convert() {
        System.out.println("BmpToJpgConverterImpl.convert");
        return new byte[0];
    }
}
