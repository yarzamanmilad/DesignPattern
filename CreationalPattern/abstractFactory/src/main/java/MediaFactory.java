import java.io.File;

public interface MediaFactory {
    public Converter creatconvert(File file, Converter.CodecTypes codecTypes);


}
