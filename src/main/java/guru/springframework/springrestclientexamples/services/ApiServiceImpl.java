package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.domain.User;
import guru.springframework.springrestclientexamples.domain.UserData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiServiceImpl implements ApiService{
    /**
     * @param Limit
     * @return
     */
    private RestTemplate restTemplate;
    private String api_url;

    public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
        this.restTemplate = restTemplate;
        this.api_url=api_url;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(api_url);
        UserData userData = new UserData();
        User[] userArray = Arrays.stream(restTemplate.getForObject(uriBuilder.toUriString(), User[].class)).limit(limit).toArray(User[]::new);
        userData.setData(Arrays.asList(userArray));
        for(int i=0; i<userData.getData().size(); i++){
            System.out.println(userData.getData().get(i));
            System.out.println("gender"+userData.getData().get(i).getGender());
        }
        return userData.getData();

    }
}
