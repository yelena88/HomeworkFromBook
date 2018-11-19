package com.lena.homework.ex22;

public class TimeFragment implements Comparable<TimeFragment> {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeFragment(int hours, int minutes, int seconds) {
        requireNonNegative("hours", hours);
        requireNonNegative("minutes", minutes);
        requireNonNegative("seconds", seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeFragment(int seconds) {
        requireNonNegative("seconds", seconds);
        this.hours = seconds / 3600 % 24;
        seconds %= 3600;
        this.minutes = seconds / 60;
        this.seconds = seconds % 60;
    }
    public TimeFragment toSeconds () {
        TimeFragment result = new TimeFragment(0);
        result.seconds += this.hours * 3600 + this.minutes * 60 + this.seconds;
        return result;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int compareTo(TimeFragment o) {
        int hoursToComp = Integer.compare(hours, o.hours);
        if (hoursToComp != 0)
            return hoursToComp;

        int minutesToComp = Integer.compare(minutes, o.minutes);
        if (minutesToComp !=0)
            return minutesToComp;

        return Integer.compare(seconds,o.seconds);
    }

    @Override
    public String toString() {
        return "TimeFragment [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + ']';
    }

    private static void requireNonNegative(String name, int timeunit) {
        if (timeunit < 0) {
            throw new IllegalArgumentException("Negative " + name);
        }
    }
}

