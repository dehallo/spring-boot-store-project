package com.codewithmosh.store.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {
    @NotBlank(message = "Name is required") //Ensures "" or " "
    @Size(min = 3, max = 255, message = "Name must be between 3 and 255 characters")
    public String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    @Lowercase(message = "Email must be lowercase")
    public String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 25, message = "Password must be between 6 and 25 characters")
    public String password;
}
