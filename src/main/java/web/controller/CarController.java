package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/")
public class CarController {

    @RequestMapping("cars")
    public String showCars(@RequestParam(name="locale", defaultValue = "en", required = false) String locale, Model model){
        model.addAttribute("cars", new CarService().getCars());
        ResourceBundle bundle = ResourceBundle.getBundle("messages_" + locale);
        model.addAttribute("cars_table_name", bundle.getString("cars_table_name"));
        return "cars";
    }
}
