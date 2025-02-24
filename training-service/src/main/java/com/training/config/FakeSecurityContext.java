package com.training.config;

import org.springframework.stereotype.Component;

@Component
public class FakeSecurityContext {
    public String getCurrentUser() {
        return "test_author"; // TODO later change to keycloak
    }
    
    public boolean isAuthor() {
        return getCurrentUser().equals("test_author");
    }
}
