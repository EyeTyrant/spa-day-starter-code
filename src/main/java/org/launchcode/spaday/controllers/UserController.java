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

    return "add";
  }

  @PostMapping("add")
  public String processAddUserForm(Model shmodel, @ModelAttribute User abuser, String verify) {
    // add form submission handling code here
    if (verify.equals(abuser.getPassword())){
      return "redirect:/user";
    }
    return "add";
  }

}
