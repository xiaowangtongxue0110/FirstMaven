package gentleman.Controller;

import com.alibaba.fastjson.JSON;
import gentleman.bean.User;
import gentleman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ModelController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String requestlogin(String username,String password){
        User user = userService.selectLoginUserAndPassword(username, password);
        if(user!=null){
            return JSON.toJSONString("success");
        }else {
            return JSON.toJSONString("fail");
        }
    }
}
