package org.bhagya.scicalcbe.Controller;

import org.bhagya.scicalcbe.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/sqrt/{x}")
    public double sqrt(@PathVariable double x) {
        return calcService.squareRoot(x);
    }

    @GetMapping("/fact/{x}")
    public long fact(@PathVariable int x) {
        return calcService.factorial(x);
    }

    @GetMapping("/ln/{x}")
    public double ln(@PathVariable double x) {
        return calcService.naturalLog(x);
    }

    @GetMapping("/power/{x}/{y}")
    public double power(@PathVariable double x, @PathVariable double y) {
        return calcService.power(x, y);
    }
}
