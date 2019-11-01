package com.demo.ElectricBill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ElectricBillApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricBillApplication.class, args);
	}

}
