package net.vanillacraft.CoreFunctions.datastores;

import java.util.concurrent.TimeUnit;

/*
Created by Mr_Little_Kitty on 5/8/2015
*/
public class Cooldown
{
    private long timeInMillis;
    Cooldown(long timeInMillis)
    {
        this.timeInMillis = timeInMillis;
    }

    public long getAsMinutes()
    {
        return TimeUnit.MINUTES.convert(timeInMillis,TimeUnit.MILLISECONDS);
    }

    public long getAsSeconds()
    {
        return TimeUnit.SECONDS.convert(timeInMillis,TimeUnit.MILLISECONDS);
    }

    public long getAsMiliseconds()
    {
        return timeInMillis;
    }
}
