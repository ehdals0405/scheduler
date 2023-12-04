package com.BossScheduler.schduler;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleResponse {

    private String bossImage;
    private String time;
    private String difficulty;
}
