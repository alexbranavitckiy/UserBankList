package ComponentScan.controller;

import ComponentScan.dao.AccountDAOimpl;
import ComponentScan.model.Account;
import ComponentScan.model.User;
import ComponentScan.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    private int page;

    private Services<User> userService;

    private Services<Account> accountService;


      @Autowired
   public void setServices(Services<User> userService) {
        this.userService = userService;   }



    @Autowired
        public void setService(Services<Account> accountService) {
           this.accountService=accountService;   }
    @Transactional
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView sratrPage() {
        List users = userService.allUsers();
        List accounts = accountService.allUsers();

        int maxsumm= accountService.Maxsumm(12);
        int rich= accountService.rich(12);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Index");
        modelAndView.addObject("List", users);
        modelAndView.addObject("summ", maxsumm);
        modelAndView.addObject("rich", rich);
                modelAndView.addObject("AccountList", accounts);

        return modelAndView;
    }

     @RequestMapping(value="/deleter/{userid}", method = RequestMethod.GET)
       public ModelAndView delete(@PathVariable("userid") int userid) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("redirect:/");
            Account account = accountService.getById(userid);
         accountService.delete(account);
           return modelAndView;
      }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete2(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        User user = userService.getById(id);
        userService.delete(user);
        return modelAndView;
    }



    @RequestMapping(value = "/userr", method = RequestMethod.POST)
    public ModelAndView Summm(@ModelAttribute("index") User user) {
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
