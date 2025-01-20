package com.example.kiemthunangcao.Buoi2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestUser {
    @Test
    public void testGetName() {
        User profile = new User("John Doe");
        assertEquals("John Doe", profile.getName());

        User emptyProfile = null;
        assertThrows(NullPointerException.class, () -> {
            if (emptyProfile == null) throw new NullPointerException("Profile is null");
            emptyProfile.getName();
        });
    }
}
