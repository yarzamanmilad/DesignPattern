import java.io.File;

public class ImageFactory implements MediaFactory{


    @Override
    public Converter creatconvert(File file, Converter.CodecTypes codecTypes) {
        Converter converter=null;
        switch (codecTypes){
            case BMP:
                converter=new BmpToJpgConverterImpl(file);
                break;
        }
        return converter;
    }
}
