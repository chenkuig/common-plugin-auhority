package common.plugin.authority.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemberController {

    @GetMapping("/member")
    public Principal user(Principal member) {
        //获取当前用户信息
        return member;
    }
}
