package task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

class Message {
    private String importantMessage;

    public Message() {}

    public void setImportantMessage(String importantMessage) {
        this.importantMessage = importantMessage;
    }

    public String getImportantMessage() {
        return importantMessage;
    }
}

@RestController
public class Controller {
    ArrayList inf = new ArrayList();

    @PostMapping("/message")
    public Object postImportantMessage(@RequestBody Message message) {
        inf.add(message);
        return message;
    }

    @GetMapping("/message")
    public Object getImportantMessage(Message message){
        return inf.get(inf.size() - 1);
    }
}
