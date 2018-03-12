package com.kodilla.testing.forum.statistics;

import java.util.LinkedList;
import java.util.List;

public class StatisticsStub implements Statistics {
    @Override
    public List<String> usersNames() {
        List<String> stubResult = new LinkedList<>();

        stubResult.add("Michał");
        stubResult.add("Michał");
        stubResult.add("Michał");
        stubResult.add("Michał");
        stubResult.add("Michał");


        return stubResult;
    }

    @Override
    public int postsCount() {
        return 0;
    }

    @Override
    public int commentsCount() {
        return 0;
    }
}
