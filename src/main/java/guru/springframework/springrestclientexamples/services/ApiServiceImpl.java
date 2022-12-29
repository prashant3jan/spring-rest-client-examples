package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ApiServiceImpl implements ApiService{
    /**
     * @param Limit
     * @return
     */
    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUser(Integer limit) {
        List<User> userData = new ArrayList<>();
        User[] userArray = Arrays.stream(restTemplate.getForObject("http://localhost:3000/data", User[].class)).limit(limit).toArray(User[]::new);
        userData= Arrays.asList(userArray);
        for(int i=0; i<userData.size(); i++){
            System.out.println(userData.get(i));
            System.out.println("gender"+userData.get(i).getGender());
        }
        return userData;
    }
}
