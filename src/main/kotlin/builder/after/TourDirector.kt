package builder.after

import builder.before.TourPlan

class TourDirector(
    private val tourBuilder: TourPlanBuilder
) {
    fun cancunTrip(): TourPlan {
        return tourBuilder.title("칸쿤 여행")
            .nightsAndDays(2, 3)
            .startDate(java.time.LocalDate.of(2020, 12, 9))
            .whereToStay("리조트")
            .addPlan(0, "체크인하고 짐 풀기")
            .addPlan(0, "저녁 식사")
            .getPlan()
    }

    fun longBeachTrip(): TourPlan {
        return tourBuilder.title("롱비치")
            .startDate(java.time.LocalDate.of(2021, 7, 15))
            .getPlan()
    }
}
