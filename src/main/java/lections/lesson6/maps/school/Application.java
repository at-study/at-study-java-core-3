package lections.lesson6.maps.school;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
        List<Lesson> monday = Arrays.asList(Lesson.PHYSICS, Lesson.HISTORY, Lesson.MATH);
        List<Lesson> tuesday = Arrays.asList(Lesson.MATH, Lesson.MATH, Lesson.MATH);
        List<Lesson> wednesday = Arrays.asList(Lesson.PHYSICS, Lesson.PHYSICS, Lesson.PHYSICS);
        List<Lesson> thursday = Arrays.asList(Lesson.HISTORY, Lesson.HISTORY, Lesson.HISTORY);
        List<Lesson> friday = Arrays.asList(Lesson.GEOGRAPHY, Lesson.GEOGRAPHY, Lesson.GEOGRAPHY);
        List<Lesson> saturday = Arrays.asList(Lesson.MATH);

        Map<DayOfWeek, List<Lesson>> diaryWeek = new TreeMap<>();
        diaryWeek.put(DayOfWeek.MONDAY, monday);
        diaryWeek.put(DayOfWeek.TUESDAY, tuesday);
        diaryWeek.put(DayOfWeek.WEDNESDAY, wednesday);
        diaryWeek.put(DayOfWeek.THURSDAY, thursday);
        diaryWeek.put(DayOfWeek.FRIDAY, friday);
        diaryWeek.put(DayOfWeek.SATURDAY, saturday);

        List<Map<DayOfWeek, List<Lesson>>> diary = Arrays.asList(diaryWeek, diaryWeek, diaryWeek);

        // Как получить из дневника урок, который был вторым в среду на 3-ьей неделе?
        Lesson lesson = diary.get(2).get(DayOfWeek.WEDNESDAY).get(1);

        // Как посчитать общее количество уроков в данном дневнике?
        int lessonCount = 0;

        for (Map<DayOfWeek, List<Lesson>> week : diary) {
            for (DayOfWeek day : week.keySet()) {
                List<Lesson> lessons = week.get(day);
                lessonCount += lessons.size();
            }
        }
        System.out.println("Общее количество уроков в дневнике = " + lessonCount);

        // Как посчитать количество каждого из уроков на неделе?
        Map<Lesson, Integer> counts = new TreeMap<>();
        for (Lesson currentLesson : Lesson.values()) {
            int currentLessonCount = 0;
            for (DayOfWeek day : diaryWeek.keySet()) {
                List<Lesson> lessons = diaryWeek.get(day);
                for (Lesson currentDiaryLesson : lessons) {
                    if (currentDiaryLesson == currentLesson) {
                        currentLessonCount++;
                    }
                }
            }
            counts.put(currentLesson, currentLessonCount);
        }
        System.out.println(counts);

    }

}
