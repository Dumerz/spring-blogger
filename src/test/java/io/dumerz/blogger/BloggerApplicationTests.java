package io.dumerz.blogger;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import io.dumerz.blogger.repository.UserAccountRepository;

@SpringBootTest
@WebMvcTest
class BloggerApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	UserAccountRepository userAccountRepository;

	@Test
	void contextLoads() throws Exception {
		mockMvc.perform(
			MockMvcRequestBuilders.get("/all/")
				.accept(MediaType.APPLICATION_JSON)
		).andReturn();
	}

}
