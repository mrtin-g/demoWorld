package com.sda.demoworld.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    protected UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public boolean userExists(User user) {
        User usr = this.userRepository
                .findByUsername((user.getUsername()));
        boolean res = usr != null;
        return res;
    }

    public void saveUser(User user) {

        if (!userExists(user)) {
            String str = encoder.encode(user.getPassword());
            user.setPassword(str);
            this.userRepository.save(user);
        }

    }

    public void deleteUser(User user) {

        //TODO do this
    }

    public void setUserEmail(User user){

        //TODO - this

    }
}
