package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

  @GetMapping("add")
  public String displayAddUserForm(){
    return "user/add";
  }

  @PostMapping // ("add") a parameter is not needed when returning to a different page?
  public String processAddUserForm(@ModelAttribute User newUser, String verify, Model shmodel) {
    // add form submission handling code here
    shmodel.addAttribute("newUser", newUser.getUserName());
    shmodel.addAttribute("email", newUser.getEmail());
    if (newUser.getPassword().equals(verify)){
      return "user/index";
    } else {
    shmodel.addAttribute("err", "Error!");
        return "user/add";
    }
  }

}
