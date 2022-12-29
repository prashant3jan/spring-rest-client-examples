package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
