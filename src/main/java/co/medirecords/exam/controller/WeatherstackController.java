package co.medirecords.exam.controller;

import co.medirecords.exam.objects.WeatherstackResponse;
import co.medirecords.exam.service.WeatherstackService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/weather")
public class WeatherstackController {

    private final WeatherstackService weatherstackService;

    public WeatherstackController(WeatherstackService weatherstackService) {
        this.weatherstackService = weatherstackService;
    }

    @GetMapping("/current")
    public WeatherstackResponse getCurrent(@RequestParam("query") String location){
        return weatherstackService.getCurrent(location);
    }

}
