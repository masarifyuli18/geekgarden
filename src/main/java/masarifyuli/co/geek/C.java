package masarifyuli.co.geek;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/app")
public class C {

    @GetMapping(value = "fibonacci")
    public ResponseEntity<Integer> getFibonacci(@RequestParam int index) {
        return ResponseEntity.ok(new U().getFibonacci(index));
    }

    @GetMapping(value = "nonPalindrom")
    public ResponseEntity<String> palindrom(@RequestParam String key) {
        return ResponseEntity.ok(new U().nonPalindrom(key));
    }
}