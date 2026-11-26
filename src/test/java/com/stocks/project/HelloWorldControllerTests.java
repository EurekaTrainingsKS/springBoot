package com.stocks.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldControllerTests {
    @Autowired
    private MockMvc mvc;

    @Test
    void greetingWithoutParameters() throws Exception {
        mvc.perform(get("/helloWorld"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World!, this is my 1st webMethod"));
    }

    @Test
    void nameFromPath() throws Exception {
        mvc.perform(get("/helloWorld/Sumanth"))
                .andExpect(status().isOk())
                .andExpect(content().string("HelloWorld! , My name is Sumanth"));
    }

    @Test
    void namesFromQueryParameters() throws Exception {
        mvc.perform(get("/helloWorldRequest")
                        .param("firstName", "Sumanth").param("secondName", "Dyapa"))
                .andExpect(status().isOk())
                .andExpect(content().string("HelloWorld! My name is Sumanth Dyapa"));
    }

    @Test
    void missingRequiredQueryParameterReturnsBadRequest() throws Exception {
        mvc.perform(get("/helloWorldRequest").param("firstName", "Sumanth"))
                .andExpect(status().isBadRequest());
    }
}
