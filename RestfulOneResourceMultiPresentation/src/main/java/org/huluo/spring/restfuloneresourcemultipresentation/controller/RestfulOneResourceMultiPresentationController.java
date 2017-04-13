package org.huluo.spring.restfuloneresourcemultipresentation.controller;

import org.huluo.spring.restfuloneresourcemultipresentation.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestfulOneResourceMultiPresentationController {


    //Restful的一个资源多种表现形式的原则,若url的结尾名字是.json则直接返回json数据,若不是就以html文档的形式进行响应
    //当然这种方式是通过在url来进行标识的
    /*
    方式1  使用扩展名
    http://www.test.com/user.xml    呈现xml文件
    http://www.test.com/user.json    呈现json格式
    http://www.test.com/user       使用默认view呈现，比如jsp等
            -----------------------------------------------------------------------------------------------------
    方式2  使用http request header的Accept
    GET /user HTTP/1.1
    Accept:application/xml

    GET /user HTTP/1.1
    Accept:application/json
    -----------------------------------------------------------------------------------------------------
    方式3  使用参数
    http://www.test.com/user?format=xml
    http://www.test.com/user?format=json
    */
    @RequestMapping("/user/{presentationType}")
    public String user(@PathVariable String presentationType, Model model ) {
        User u = new User();
        model.addAttribute("User", u);
        return "User";
    }
}
