package com.cardvalidator.cardvalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cardvalidator.CardValidator;

@SpringBootApplication
public class CardValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardValidatorApplication.class, args);

		String cardNumber = "5448 2845 4245 0928";
        String cardType = CardValidator.validateCard(cardNumber);
        System.out.println("Card Type: " + cardType);
	}

}
