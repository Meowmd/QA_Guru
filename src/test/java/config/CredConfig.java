package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/credentials.properties")
public interface CredConfig extends Config {
    String login();
    String password();
    String baseUrl();
}