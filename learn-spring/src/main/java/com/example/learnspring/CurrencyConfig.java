package com.example.learnspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//to perform addition of configs to project more properly
@ConfigurationProperties(prefix = "currency-service") //config properties
//binds the external properties to the java object
//allowing us to bind config properties to the java object
//by mapping the external properties to the java object's setters and fields
// avoids manual configurations
@Component //lets Spring handle this component
public class CurrencyConfig {
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
