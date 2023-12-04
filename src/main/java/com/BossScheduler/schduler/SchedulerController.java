package com.BossScheduler.schduler;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/schedulers")
public class SchedulerController {

    private final ScheduleMapper scheduleMapper;
    private final ScheduleService scheduleService;

    @GetMapping
    public String getSchedule(Model model) {

        List<Schedule> scheduleList = scheduleService.getSchedules();
        model.addAttribute("scheduleList", scheduleList);

        return "getSchedule";
    }

    @GetMapping("/post")
    public String getPostSchedule() {

        return "postSchedule";
    }

    @PostMapping
    public ResponseEntity postSchedule(@RequestBody PostSchedule postSchedule) {

        Schedule schedule = scheduleMapper.postToEntity(postSchedule);
        scheduleService.postSchedule(schedule);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity deleteSchedule() {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
