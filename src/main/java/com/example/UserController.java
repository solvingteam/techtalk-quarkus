package com.example;

import com.example.domain.User;
import com.example.dto.SaveUserDTO;
import io.quarkus.elytron.security.common.BcryptUtil;
import org.apache.sshd.common.config.keys.loader.openssh.kdf.BCrypt;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Path("users")
public class UserController {

    @GET
    public List<User> findAllUsers(){
        return User.findAll().list();
    }

    @POST
    @Transactional
    public User saveNewUser(SaveUserDTO saveUserDTO){
        User user = new User();
        user.setUsername(saveUserDTO.getUsername());
        user.setPassword(BcryptUtil.bcryptHash(saveUserDTO.getPassword()));

        user.persist();

        return user;
    }

}
