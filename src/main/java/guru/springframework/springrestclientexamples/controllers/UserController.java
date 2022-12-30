package guru.springframework.springrestclientexamples.controllers;

import guru.springframework.springrestclientexamples.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ServerWebExchange;

import java.util.concurrent.ExecutionException;

/**
 * Created by jt on 9/22/17.
 */
@Slf4j
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("${rest.url}")
@RestController
public class UserController {
    @Value("${rest.url}")
    public String restUrl;

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @RequestMapping(method=RequestMethod.GET, path={"", "/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping(path="/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange) throws ExecutionException, InterruptedException {

        MultiValueMap<String, String> map = serverWebExchange.getFormData().toFuture().get();

        Integer limit = new Integer(map.get("limit").get(0));

        log.debug("Received Limit value: " + limit);
        //default if null or zero
        if(limit == null || limit == 0){
            log.debug("Setting limit to default of 10");
            limit = 10;
        }

        model.addAttribute("users", apiService.getUsers(limit));

        return "userlist";
    }
}