package com.example.demo;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

/**
 * oontroller
 * data layer from user interface
 * handle server related data,e.g http request
 *docker push whispering-earth-31297.herokuapp.com/web  image name of this file to push on heroku
**/
@RestController ///anotate using rest controller //point sepecific poin
@RequestMapping(path = "")
public class MyDemo {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public
    @ResponseBody
    String index() {
        return "hello";
    }

    @RequestMapping(path = "getUser", method = RequestMethod.GET)
    public
    @ResponseBody
    String getUeser() {
        User user = new User("name", "hello", 20);
        Gson gson = new Gson();

        return gson.toJson(user);
    }

    @RequestMapping(path = "user", method = RequestMethod.GET)
    public
    @ResponseBody
    String specificUser(@RequestParam(name = "id") int id) {
        User user = new User("name", "hello", id);
        Gson gson = new Gson();

        return gson.toJson(user);
    }


    @RequestMapping(path = "add", method = RequestMethod.POST)
    public @ResponseBody String adduser(@RequestParam(name = "username") String username,
                                        @RequestParam(name = "email")String email,@RequestParam(name = "id")int id) {
        User user = new User(username,email , id);
        Gson gson = new Gson();

        return gson.toJson(user);
    }


}
