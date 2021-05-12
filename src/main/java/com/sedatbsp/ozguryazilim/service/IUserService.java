package com.sedatbsp.ozguryazilim.service;

import com.sedatbsp.ozguryazilim.model.User;
import com.sedatbsp.ozguryazilim.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);

}
