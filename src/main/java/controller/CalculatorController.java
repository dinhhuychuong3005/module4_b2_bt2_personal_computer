package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/")
    public String showForm() {
        return "index";
    }
    @RequestMapping("/calculate")
    public String calculate(@RequestParam(name = "number1") double number1, @RequestParam(name = "number2") double number2,
                            @RequestParam(name = "calculation") String string, ModelMap model) {
        double result = 0;
        switch (string) {
            case "Addition(+)":
                result = number1 + number2;
                string = "addition";
                break;
            case "Subtraction(-)":
                result = number1 - number2;
                string = "Subtraction";
                break;
            case "Multiplication(X)":
                result = number1 * number2;
                string = "Multiplication";
                break;
            case "Division(/)":
                result = number1 / number2;
                string = "Division";
                break;
        }
        model.addAttribute("result", result);
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("string", string);
        return "index";
    }
}

