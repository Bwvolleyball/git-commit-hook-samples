package ward.brandon.githooks;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitHooksApplicationTests {

	/**
	 * Empty test provided by Spring Boot to ensure that the application starts.
	 */
	@Test
	public void contextLoads() {
		// sample (dummy) assertion
		assertThat(2, is(2));
	}

}
