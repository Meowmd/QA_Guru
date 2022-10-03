package tests.properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class OwnerTest {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void credentialTest() {
        String login = config.login();
        String password = config.password();
        String baseUrl = config.baseUrl();
        System.out.println("login: "+ login);
        System.out.println("password: "+ password);
        System.out.println("baseUrl: "+ baseUrl);
    }
}