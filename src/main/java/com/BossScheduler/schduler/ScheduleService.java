package com.BossScheduler.schduler;

import com.BossScheduler.bossimage.BossImage;
import com.BossScheduler.bossimage.BossImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final BossImageRepository bossImageRepository;

    public Schedule postSchedule(Schedule schedule){

//        BossImage bossImage = bossImageRepository.findByBossAndDifficulty(schedule.getBoss(),schedule.getDifficulty());
//        schedule.setBossImage(bossImage.getUrl());

        return scheduleRepository.save(schedule);
    }

    public List<Schedule> getSchedules(){

        return scheduleRepository.findAll();
    }
}
