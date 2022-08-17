package com.devmountain.currentdate;

import java.time.*;

public class WorldClock
{

    public LocalDate getNowForDate()
    {
        return LocalDate.now();
    }
    public LocalDateTime getNowForDateAndTime()
    {
        return LocalDateTime.now();
    }

    public DayOfWeek getDayOfWeekForNow()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow()
    {
        LocalDateTime localDate = LocalDateTime.now();
        return localDate.getDayOfMonth();
    }

    public int getDayOfYearForNow()
    {
        LocalDateTime localDate = LocalDateTime.now();
        return localDate.getDayOfYear();
    }

    public ZonedDateTime getNowDateTimeForNewYork()
    {
        return getNowDateTimeWithZoneId("America/New_York");
    }



    public ZonedDateTime getNowDateTimeForLA()
    {
        return null;
    }

    public ZonedDateTime getNowDateTimeForLondon()
    {
        return null;
    }

    public ZonedDateTime getNowDateTimeForMoscow()
    {
        return null;
    }

    public ZonedDateTime getNowDateTimeForTokyo()
    {
        return null;
    }

    private ZonedDateTime getNowDateTimeWithZoneId(String zoneId) {
        ZonedDateTime now = ZonedDateTime.now();
        return now.withZoneSameInstant(ZoneId.of(zoneId));
    }

}
