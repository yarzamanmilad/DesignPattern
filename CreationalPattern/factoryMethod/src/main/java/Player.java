import exception.playerException;

public interface Player {
    public void play(String path) throws playerException;

    enum Type{
        mp3,oog
    }
}
