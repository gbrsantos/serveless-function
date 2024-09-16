package com.example.servelessfunction.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class FunctionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test case to verify the behavior of converting a string to uppercase in the FunctionController class.
     * @throws Exception if any error occurs during the test execution
     */
    @Test
    public void testConvertToUppercase() throws Exception {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";

        mockMvc.perform(MockMvcRequestBuilders.post("/api/uppercase")
                        .contentType(MediaType.TEXT_PLAIN)
                        .content(input))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }
}