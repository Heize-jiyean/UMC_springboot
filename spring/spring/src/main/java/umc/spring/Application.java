package umc.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication  // 이것만으로도 umc.spring 패키지 이하를 모두 스캔합니다
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}