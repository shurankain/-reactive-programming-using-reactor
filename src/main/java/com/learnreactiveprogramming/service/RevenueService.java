package com.learnreactiveprogramming.service;

import static com.learnreactiveprogramming.util.CommonUtil.delay;

import com.learnreactiveprogramming.domain.Revenue;

public class RevenueService {

    public Revenue getRevenue(Long movieId) {
        delay(1000); // simulating a network call ( DB or Rest call)
        return Revenue.builder()
                .movieInfoId(movieId)
                .budget(1000000)
                .boxOffice(5000000)
                .build();

    }
}
