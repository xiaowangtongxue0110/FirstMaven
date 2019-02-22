package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import gentleman.bean.User;
import gentleman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
     @Autowired
    private UserService userService;

     @PostMapping("/users")
     public String addUser(@RequestBody User user){
              if (user!=null){
                  userService.addUser(user);
                  return JSON.toJSONString("success");
              }else {
                  return JSON.toJSONString("no");
              }
     }

     @GetMapping("/users/{name}")
    public String selectLogin(@PathVariable String name) {
             User user = userService.selectLogin(name);
             if (user!=null){
                 return JSON.toJSONString("success");
             }else{
                 return JSON.toJSONString("fail");
             }
     }

     @GetMapping("/emails/{email}")
    public String selectLoginemail(@PathVariable String email) {
         User user = userService.selectLoginemail(email);
             if (user!=null){
                 return JSON.toJSONString("success");
             }else{
                 return JSON.toJSONString("fail");
             }
     }

     @GetMapping("/phones/{phone}")
    public String selectUserPhone(@PathVariable String phone) {
         User user = userService.selectUserPhone(phone);
             if (user!=null){
                 return JSON.toJSONString("success");
             }else{
                 return JSON.toJSONString("fail");
             }
     }

     @GetMapping("/getUser")
     public String selectGetAll(){
         List<User> users = userService.selectUser();
         return JSON.toJSONString(users);
     }

     @PutMapping("/users/{id}")
    public String updateUser(@PathVariable int id,@RequestBody User user){
         try {
             user.setId(id);
             userService.updateUser(user);
             return JSON.toJSONString("success");
         } catch (Exception e) {
             e.printStackTrace();
             return JSON.toJSONString("fail");
         }
     }

     @GetMapping("/ids/{id}")
    public String selectUserById(@PathVariable int id){
         User user = userService.selectUserById(id);
         return JSON.toJSONString(user);
     }

     @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable int id){
         try {
             userService.deleteUserById(id);
             return JSON.toJSONString("success");
         } catch (Exception e) {
             e.printStackTrace();
             return JSON.toJSONString("fail");
         }
     }
}
