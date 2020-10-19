import exception.playerException;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerFactoryTest {

    @Test
    public void getPlayer() throws playerException {

        PlayerFactory playerFactory=new PlayerFactory();
        Player player = playerFactory.getPlayer("mil", Player.Type.mp3);
        Assert.assertTrue(player instanceof Mp3PlayerImpl);
            player.play();
        player = playerFactory.getPlayer("mil", Player.Type.ogg);
        Assert.assertTrue(player instanceof OggPlayerImpl);
        player.play();
    }
}