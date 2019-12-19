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

  @PostMapping("add")
  public String processAddUserForm(Model shmodel, @ModelAttribute User shmuser, String verify) {
    // add form submission handling code here
    shmodel.addAttribute("abuser", shmuser);
    if (verify.equals(shmuser.getPassword())){
      return "redirect:/user";
    }
    return "redirect:";
  }

}
