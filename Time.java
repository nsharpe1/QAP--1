public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour()
    {
        return this.hour;
    }

    public int getMinute()
    {
        return this.minute;
    }

    public int getSecond()
    {
        return this.second;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString()
    {
        return String.format("%02d:%02d:%d", this.hour, this.minute, this.second);
    }

    public Time nextSecond()
    {
        int sameHour = this.hour;
        int sameMinute = this.minute;
        int increasedSecond = this.second + 1;

        return new Time(sameHour, sameMinute, increasedSecond);
    }

    public Time previousSecond()
    {
        int sameHour = this.hour;
        int sameMinute = this.minute;
        int decreasedSecond = this.second - 1;

        return new Time(sameHour, sameMinute, decreasedSecond);
    }
}
