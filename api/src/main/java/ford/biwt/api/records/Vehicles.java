package ford.biwt.api.records;

import jakarta.validation.constraints.NotBlank;

// records are type of classes to create acessible objects
// in wich we dont need to spend time creating all other
// classes and methods for it when defining a variable type

public record Vehicles(

    // @NotNull , if te field is a string we can vallidate
    // to check if it is blank os not as well

    @NotBlank
    String name
    ) {
    
}
