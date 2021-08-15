package com.project.MSAlesson;

import com.project.MSAlesson.config.ConsumerChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;


@SpringBootApplication
@EnableBinding(ConsumerChannel.class)
public class MsAlessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAlessonApplication.class, args);
	}

}
