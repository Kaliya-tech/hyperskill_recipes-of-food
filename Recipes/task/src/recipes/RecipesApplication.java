package recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

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
    String name;
    String description;
    String ingredients;
    String directions;
}


@RestController
class Controller {

    private ArrayList allRecipes = new ArrayList<>();

    @PostMapping("/api/recipe")
    public Object postRecipe(@RequestBody Recipe recipe) {
        allRecipes.add(recipe);
        return recipe;
    }

    @GetMapping("/api/recipe")
    public Object getRecipe(Recipe recipe) {
        return allRecipes.get(allRecipes.size() - 1);
    }
}
