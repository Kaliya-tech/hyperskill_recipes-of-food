package recipes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "recipe")
public class Recipe {
//    @Id
//    @Column(name = "id", nullable = false)
//    private Long id;

    @NotBlank
    private String name;
    @NotBlank
    private String description;

    @NotEmpty
    @Size(min = 1)
    private String[] ingredients;

    @NotEmpty
    @Size(min = 1)
    private String[] directions;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}


@ResponseStatus(code = HttpStatus.NOT_FOUND)
class RecipeNotFoundException extends RuntimeException {

    public RecipeNotFoundException(String cause) {
        super(cause);
    }
}