package org.huluo.springapiprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringProfileController {
    @Autowired
    private SpringProfileDao springProfileDao;

    @RequestMapping("springProfiletest")
    @ResponseBody
    public Object springProfiletest() {
        System.out.println("数据库的用户名是:" + springProfileDao.getUsername());
        System.out.println("数据库的密码是:" + springProfileDao.getPassword());
        System.out.println("数据库的类型是:" + springProfileDao.getDbType());
        return "success";
    }
}
