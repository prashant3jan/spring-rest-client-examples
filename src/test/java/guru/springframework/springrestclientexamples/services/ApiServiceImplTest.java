package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
    @Autowired
    ApiService apiService;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void getUser() {
        List<User> users = apiService.getUser(1);
        assertEquals(1, users.size());
    }
}