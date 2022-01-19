package recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@SpringBootApplication
public class RecipesApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecipesApplication.class, args);
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Recipe {

    private String name;
    private String description;
    private String[] ingredients;
    private String[] directions;
}

@ResponseStatus(code = HttpStatus.NOT_FOUND)
    class RecipeNotFoundException extends RuntimeException {

        public RecipeNotFoundException(String cause) {
            super(cause);
        }
    }

