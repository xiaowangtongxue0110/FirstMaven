package gentleman.service;

import gentleman.bean.User;
import gentleman.dao.Userdao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class serviceimpl implements UserService {
    @Autowired
    private Userdao userdao;

    @Override
    public void addUser(User user) {
        userdao.addUser(user);
    }

    @Override
    public User selectLogin(String name) {
        return userdao.selectLogin(name);
    }

    @Override
    public User selectLoginemail(String email) {
        return userdao.selectLoginemail(email);
    }

    @Override
    public User selectUserPhone(String phone) {
        return userdao.selectUserPhone(phone);
    }

    @Override
    public User selectLoginUserAndPassword(String username, String password) {
        return userdao.selectLoginUserAndPassword(username,password);
    }

    @Override
    public List<User> selectUser() {
        return userdao.selectUser();
    }

    @Override
    public void updateUser(User user) {
        userdao.updateUser(user);
    }

    @Override
    public User selectUserById(int id) {
        return userdao.selectUserById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteUserById(int id) throws Exception {
        userdao.deleteUserById(id);
        throw new Exception();
    }


}
