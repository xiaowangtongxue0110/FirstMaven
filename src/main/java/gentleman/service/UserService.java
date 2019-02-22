package gentleman.service;

import gentleman.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User selectLogin(String name);

    User selectLoginemail(String email);

    User selectUserPhone(String phone);

    User selectLoginUserAndPassword (String username,String password);

    List<User> selectUser();

    void updateUser(User user);

    User selectUserById(int id);

    void deleteUserById(int id) throws Exception;

}
