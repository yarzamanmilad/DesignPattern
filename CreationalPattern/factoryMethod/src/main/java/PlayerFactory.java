public class PlayerFactory {
    public Player getPlayer(String path,Player.Type type)
    {
        Player player=null;
        switch (type){
            case mp3:
                player=new Mp3PlayerImpl(path);
                break;

            case oog:
                player=new OggPlayerImpl(path);
                break;
            default:throw new IllegalStateException("type not found");
        }
        return player;
    }
}
