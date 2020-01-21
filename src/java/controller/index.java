/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author OTME
 */
@Controller
public class index {
    @RequestMapping(
              value = "/",
              method = RequestMethod.GET
      )
      public ModelAndView Index() throws Exception {          
          return new ModelAndView("index");
      }
}
