package geco;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class TestLoginService {
    @Test
    public void testCreationLogService(){
        LoginService logServ = new LoginService(new String[] {});
        List<String> listeVide = logServ.findAllLogins();
        Assert.assertSame(listeVide, logServ.findAllLogins());
    }

    @Test
    public void testLoginDansLoginService(){
        LoginService logServ = new LoginService(new String[] {});
        logServ.addLogin("clf");
        Assert.assertTrue("Ne contient pas le login", logServ.loginExists("clf"));
    }

    @Test
    public void testRecupNLoginDansLoginService(){
            LoginService logServ = new LoginService(new String[] {});
            logServ.addLogin("clf");
            logServ.addLogin("fgl");
            logServ.addLogin("ytu");
            List<String> listEx = new ArrayList<>();
            listEx.add("fgl");
            List<String> liste = logServ.findAllLoginsStartingWith("f");
            Assert.assertEquals(listEx.get(0), liste.get(0));

    }

}
