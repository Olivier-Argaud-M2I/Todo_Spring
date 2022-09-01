package fr.m2i.todospring.properties;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data
@Component
public class MyProperties {

    @Autowired
    ProprietesSpringName proprietesSpringName;
    @Autowired
    ProprietesSpringPort proprietesSpringPort;
    @Autowired
    ProprietesSpringDatasource proprietesSpringDatasource;

    private String name;
    private String port;
    private String url;
    private String username;
    private String password;

    public String getName() {
        return proprietesSpringName.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return proprietesSpringPort.getPort();
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUrl() {
        return proprietesSpringDatasource.getUrl();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return proprietesSpringDatasource.getUsername();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return proprietesSpringDatasource.getPassword();
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
