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
        String loginGenerer = logGen.generateLoginForNomAndPrenom("Durand","Pierre");
        Assert.assertEquals("PDUR", loginGenerer);
    }
}
