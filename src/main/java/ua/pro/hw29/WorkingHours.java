package ua.pro.hw29;

import java.time.LocalTime;
import java.util.List;

public class WorkingHours {


    private static List<LocalTime> workingHoursListLocalTime;


    public static void initWorkingHours(List<LocalTime> workingHoursListLocal) {
        workingHoursListLocalTime = workingHoursListLocal;
    }

    public static List<LocalTime> getWorkingHoursListLocalTime() {
        return workingHoursListLocalTime;
    }
}
