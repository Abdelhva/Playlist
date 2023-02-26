import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {
@Test
    void CheckOfAantalnummersIsGelijkAanNul(){
    Playlist playlist = new Playlist();
    assertEquals(0,playlist.Aantalnummers);
}
}