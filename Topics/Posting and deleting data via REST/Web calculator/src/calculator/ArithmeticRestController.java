package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {

    @GetMapping ("/{operation}")
    public String calculate(@PathVariable String operation, int a, int b) {

        int res = 0;

        switch(operation) {
            case "add":
                res = a + b;
                return String.valueOf(res);

            case "subtract":
                res = a - b;
                return String.valueOf(res);

            case "mult":
                res = a * b;
                return String.valueOf(res);

        }

        return "Unknown operation";
    }
}