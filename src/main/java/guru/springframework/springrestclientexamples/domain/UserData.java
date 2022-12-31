package guru.springframework.springrestclientexamples.domain;

import java.util.List;

public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}