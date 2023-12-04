package com.BossScheduler.bossimage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BossImageRepository extends JpaRepository<BossImage, Long> {

    BossImage findByBoss(String boss);
}
