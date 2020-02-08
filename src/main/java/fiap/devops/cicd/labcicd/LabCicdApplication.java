package fiap.devops.cicd.labcicd;

/*
teste ggggggg
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.*;

@SpringBootApplication
public class LabCicdApplication {
	
	@Test
        public void test_method_1() {
                System.out.println("@Test - test_method_1");
        }

	public static void main(String[] args) {
		SpringApplication.run(LabCicdApplication.class, args);
	}

}
