package schedule.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Student on 30.12.2016.
 */

@Controller
@RequestMapping("/remind")
public class RemindController {



    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public  String getRemind(ModelMap model){

    return "May";
    }
}
