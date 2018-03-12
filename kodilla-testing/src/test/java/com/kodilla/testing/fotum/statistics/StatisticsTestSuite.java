package com.kodilla.testing.fotum.statistics;


import com.kodilla.testing.forum.statistics.ForumStatistic;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
public void testStatisticsWithMock()
{
    Statistics statisticsMock = mock(Statistics.class);

    List<String> users = new LinkedList<String>();
   // List<Integer> post = new LinkedList<>();
   // List<Integer> comment = new LinkedList<>();


    users.add("Adam");
    users.add("Piotr");
    users.add("Grzegorz");

  //  post.add(0, 101);

  //  comment.add(0,56);


    when(statisticsMock.usersNames()).thenReturn(users);
 //   when(statisticsMock.postNumber()).thenReturn(post);
//    when(statisticsMock.commentNumber()).thenReturn(comment);

    ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);

    //When
    int quantityOfSensors = forumStatistic.calculateStatistics().size();

    //Then
    Assert.assertEquals(3, quantityOfSensors);
}
}


