import exception.playerException;

public class OggPlayerImpl implements Player {
    private String path;
    public OggPlayerImpl(String path) {
        this.path=path;
    }

    @Override
    public void play(String path) throws playerException {

    }
}
