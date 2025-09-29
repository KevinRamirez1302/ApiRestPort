package com.example.apiRestPort.services;
import java.util.List;
import java.util.Optional;

import com.example.apiRestPort.model.User;
import com.example.apiRestPort.repository.iUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private iUserRepository userRepository ;

   public List<User> obtenerTodos () {
        return userRepository.findAll();
   };

    public Optional<User> obtenerPorId(Long id) {
        return userRepository.findById(id);
    }

    public User guardarProducto(User user) {
        return userRepository.save(user);
    }

    public void eliminarProducto(Long id) {
        userRepository.deleteById(id);
    }



}
