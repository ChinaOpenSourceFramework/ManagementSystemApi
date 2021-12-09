package com.chinaopensource.management.system.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 李其伟
 * @date Sep 13, 2018
 */
@SpringBootApplication(scanBasePackages={"com.chinaopensource.management"})
public class ManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}

}

