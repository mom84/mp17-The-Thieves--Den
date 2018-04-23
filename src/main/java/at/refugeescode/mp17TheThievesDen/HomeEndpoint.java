package at.refugeescode.mp17TheThievesDen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeEndpoint {

    @GetMapping
    String message() {
        return " treasures that the thievery organization has been robbing for decades";
    }
}
