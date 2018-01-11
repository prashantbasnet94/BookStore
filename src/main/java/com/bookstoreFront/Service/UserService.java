package com.bookstoreFront.Service;

import org.springframework.context.annotation.Bean;

import com.bookstoreFront.Domain.User;
import com.bookstoreFront.Domain.security.PasswordResetToken;


public interface UserService {
	@Bean
	PasswordResetToken getPasswordResetToken(final String token);
	@Bean
	void createPasswordResetTokenForUser(final User user, final String token);
	

}
