package gentleman.dao;

import gentleman.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Userdao {
    void addUser(User user);

    User selectLogin(String name);

    User selectLoginemail(String email);

    User selectUserPhone(String phone);

    User selectLoginUserAndPassword ( @Param("username") String username,@Param("password")String password);

    List<User> selectUser();

    void updateUser(User user);

    User selectUserById(int id);

    void deleteUserById(int id);

}
