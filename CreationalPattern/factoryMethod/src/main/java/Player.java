import exception.playerException;

public interface Player {
    public void play() throws playerException;

    enum Type{
        mp3,ogg
    }
}
