package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// @ExtendWith(SpringExtension.class)
// @ContextConfiguration(classes= {MyApplication.class})
@SpringBootTest(classes= {MyApplication.class})
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
