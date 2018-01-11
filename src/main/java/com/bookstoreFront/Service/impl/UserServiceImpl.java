package com.bookstoreFront.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstoreFront.Domain.User;
import com.bookstoreFront.Domain.security.PasswordResetToken;
import com.bookstoreFront.Repository.PasswordResetTokenRepository;
import com.bookstoreFront.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private PasswordResetTokenRepository passwordResetTokenRepository;
	
	@Override
	public PasswordResetToken getPasswordResetToken(String token) {

		return passwordResetTokenRepository.findByToken(token);
	}

	@Override
	public void createPasswordResetTokenForUser(final User user, final String token) {
		
		final PasswordResetToken myToken =new PasswordResetToken(token, user);
		passwordResetTokenRepository.save(myToken);
	}

}
