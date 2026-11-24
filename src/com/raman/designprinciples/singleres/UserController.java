package com.raman.designprinciples.singleres;

import java.io.IOException;

// Handles incoming JSON requests that work on User resource/entity
public class UserController {
    private final Store store = new Store();
    private final UserJsonParser parser = new UserJsonParser();
    private final UserValidator validator = new UserValidator();

    // Create a new user
    public String createUser(String userJson) throws IOException {
        User user = parser.parse(userJson);

        if (!validator.isValidUser(user)) {
            return "ERROR";
        }

        store.store(user);

        return "SUCCESS";
    }
}