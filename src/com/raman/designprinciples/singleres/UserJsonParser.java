package com.raman.designprinciples.singleres;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserJsonParser {
    private static final Pattern FIELD_PATTERN =
            Pattern.compile("\"([^\"]+)\"\\s*:\\s*\"([^\"]*)\"");

    public User parse(String userJson) throws IOException {
        if (userJson == null || userJson.trim().isEmpty()) {
            throw new IOException("Invalid or empty JSON payload");
        }

        Map<String, String> values = new HashMap<>();
        Matcher matcher = FIELD_PATTERN.matcher(userJson);
        while (matcher.find()) {
            values.put(matcher.group(1), matcher.group(2));
        }

        User user = new User();
        user.setName(values.get("name"));
        user.setEmail(values.get("email"));
        return user;
    }
}