import exception.playerException;

public class Mp3PlayerImpl implements Player {
    private String path;
    public Mp3PlayerImpl(String path) {
        this.path=path;
    }

    @Override
    public void play() throws playerException {
        System.out.println("mp3player");
    }
}
