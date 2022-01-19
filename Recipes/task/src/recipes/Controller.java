package recipes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class Controller {

    private List<Recipe> allRecipes = new ArrayList<>();

    @PostMapping("/api/recipe/new")
    private Map<String, Integer> postRecipe(@RequestBody Recipe recipe) {
        allRecipes.add(recipe);
        return Map.of("id", allRecipes.size());
    }

    @GetMapping("/api/recipe/{id}")
    private Recipe getRecipe(@PathVariable int id) {

        if (id > allRecipes.size()) {
            throw new RecipeNotFoundException("Recipe not found for id = " + id);
        }
        return allRecipes.get(id - 1);
    }
}
