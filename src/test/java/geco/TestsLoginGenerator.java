package geco;

import org.junit.*;

public class TestsLoginGenerator {

    private LoginGenerator logGen;

    @Before
    public void creationLoginGenerator(){
        LoginService logServ = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        logGen = new LoginGenerator(logServ);
        Assert.assertNotNull(logGen);
    }

    @Test
    public void ajoutLoginGenerator(){
        String loginGenerer = logGen.generateLoginForNomAndPrenom("Rolling","Jean");
        Assert.assertEquals("JROL1", loginGenerer);
    }

    @Test
    public void accentLoginGenerator(){
        String loginGenerer = logGen.generateLoginForNomAndPrenom("Dùrand","Pierre");
        Assert.assertEquals("PDUR", loginGenerer);
    }

    @Test
    public void testLoginDoubleLogGen(){
        String loginDouble = logGen.generateLoginForNomAndPrenom("Ralling", "John");
        Assert.assertEquals("JRAL2", loginDouble);
    }
}
