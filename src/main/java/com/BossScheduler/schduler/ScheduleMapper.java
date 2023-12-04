package com.BossScheduler.schduler;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ScheduleMapper {

    public Schedule postToEntity(PostSchedule postSchedule) {

        return Schedule.builder()
                .day(postSchedule.getDay())
                .boss(postSchedule.getBoss())
                .difficulty(postSchedule.getDifficulty())
                .time(postSchedule.getTime())
                .build();
    }

    public List<ScheduleResponse> entityToResponse(List<Schedule> scheduleList) {

        return scheduleList.stream()
                .map(schedule -> ScheduleResponse.builder()
                .bossImage(schedule.getBossImage())
                .time(schedule.getTime())
                .difficulty(schedule.getDifficulty())
                .build()
        ).collect(Collectors.toList());

    }
}
