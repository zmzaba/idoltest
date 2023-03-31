package com.zithobile.demo.service;


import com.zithobile.demo.model.User;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class  UserServiceStub {

    private static Map<Long, User> users = new HashMap<>();
    public static Long index = 2L;

    static {
        User user1 = new User(1L, "Jane", "smith", "9999999999");
        User user2 = new User(2L, "kenneth", "john", "8888888888");
        users.put(1L, user1);
        users.put(2L, user2);
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public static User getUserDetails(Long userId) {
        return users.get(userId);
    }

    public static User addUser(User user) {
        index += 1;
        user.setId(index);
        users.put(index, user);
        return user;
    }

    public static User updateUser(Long userId, User user) {
        user.setId(userId);
        users.put(userId, user);
        return user;
    }

    public static User deleteUser(Long userId) {
        return users.remove(userId);
    }


}
