package recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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
@Entity(name = "recipe")
class Recipe {

    @Column
    @Id
    private String name;

    @Column
    private String description;

    @Column
    @NotEmpty
    @Size(min = 1)
    private String[] ingredients;

    @Column
    @NotEmpty
    @Size(min = 1)
    private String[] directions;
}

@ResponseStatus(code = HttpStatus.NOT_FOUND)
    class RecipeNotFoundException extends RuntimeException {

        public RecipeNotFoundException(String cause) {
            super(cause);
        }
    }

