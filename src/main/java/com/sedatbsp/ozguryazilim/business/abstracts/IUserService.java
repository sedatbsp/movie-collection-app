package com.sedatbsp.ozguryazilim.business.abstracts;

import com.sedatbsp.ozguryazilim.model.User;
import com.sedatbsp.ozguryazilim.business.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto,String role);

}
