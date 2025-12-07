package builder.before

import java.time.LocalDate

class TourPlan(
    var title: String? = null,
    var nights: Int? = null,
    var days: Int? = null,
    var startDate: LocalDate? = null,
    var whereToStay: String? = null,
    var plans: List<DetailPlan>? = null,
) {
    fun addPlan(day: Int, plan: String) {
        if (plans == null) {
            plans = mutableListOf()
        }
        (plans as MutableList).add(DetailPlan(day, plan))
    }
}
