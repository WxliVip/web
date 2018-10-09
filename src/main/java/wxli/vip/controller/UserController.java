package wxli.vip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wxli.vip.model.JsonResult;
import wxli.vip.model.UserDTO;
import wxli.vip.service.UserService;

import java.lang.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v3/user/")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/detail/{userid}")
    public UserDTO detail(@PathVariable int userid) {
        return userService.queryById(userid);
    }

    @GetMapping("/list")
    public JsonResult list(@RequestParam int page,@RequestParam int size) {
        List<UserDTO> users = userService.queryList(page,size);
        return JsonResult.ok(users);
    }
}
