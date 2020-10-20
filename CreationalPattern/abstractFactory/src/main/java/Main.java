import java.io.File;

public class Main {
    public static void main(String[] args) {
        MediaFactory factory = MediaConverterAbstractFactory.createFactory(MediaConverterAbstractFactory.MediaTypes.IMAGE);
        Converter creatconvert = factory.creatconvert(new File("C://m.bmp"), Converter.CodecTypes.BMP);
        creatconvert.convert();
        System.out.println(factory.getClass());
        System.out.println(creatconvert.getClass());
    }
}
