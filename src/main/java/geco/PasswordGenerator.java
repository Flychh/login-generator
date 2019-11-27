package geco;

import java.util.Random;

public class PasswordGenerator {

    public PasswordGenerator(){

    }

    public String getRandomPassword(){
        String mdp = "";
        Random rand = new Random();
        for(int i=0; i<8; i++){
            char c = (char)(rand.nextInt(26) + 97);
            mdp += c;
        }
        return mdp;
    }
}
