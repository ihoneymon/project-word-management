package kr.pe.ihoney.pwm.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController {

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity test() {
        return ResponseEntity.ok("test");
    }
}
