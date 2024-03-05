package com.example.controllers;

import com.example.dtos.LoginRequestDTO;
import com.example.dtos.LoginResponseDTO;
import com.example.dtos.RegistrationRequestDTO;
import com.example.models.ApplicationUser;
import com.example.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationRequestDTO body) {
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody LoginRequestDTO body) {
        return authenticationService.loginUser(body.getUsername(), body.getPassword());
    }
}
