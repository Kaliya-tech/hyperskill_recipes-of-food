package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {

    private ArrayList <String> allNames = new ArrayList<>();

    @PostMapping("/users")
    public void postNames(@RequestParam String name) {
        allNames.add(name);
    }

    @GetMapping("/users")
    public ArrayList getNames(String name) {
        return allNames;
    }

}
