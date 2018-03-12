package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.List;

public class ForumStatistic implements Statistics {

Statistics statistics;
    String name;

    public String getName()
    {
        return name;
    }

    public ForumStatistic(Statistics statistics) {

       this.statistics = statistics;

    }




    public void calculateAdvStatistics(Statistics statistics) {

        return;
    }


    public void ShowStatistics(Statistics statistics)
    {

//      //  System.out.println("Ilosc postow = " + postSize);
       // System.out.println("Ilosc komentarzy = " + commentsSize);

    }


    public HashMap<Integer, Double> calculateStatistics(){
        HashMap<Integer,Double> resultMap = new HashMap<Integer, Double>();

      //  for(Map.Entry<Integer,Double> temperature :



        return  resultMap;

    }

    @Override
    public List<String> usersNames()
    {
     return null;
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
