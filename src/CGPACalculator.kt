class CGPACalculator {
    // Math: (Grade Points * Units) / Total Units
    fun calculate(courses: List<Course>): Double {
        val totalQualityPoints = courses.sumOf { it.gradePoint * it.units }
        val totalUnits = courses.sumOf { it.units }
        return if (totalUnits > 0) totalQualityPoints / totalUnits else 0.0
    }

    // Logic for the class of degree
    fun getRemark(cgpa: Double): String {
        return when {
            cgpa >= 4.5 -> "First Class! Outstanding."
            cgpa >= 3.5 -> "Second Class Upper."
            cgpa >= 2.5 -> "Second Class Lower."
            else -> "Pass. Keep working hard!"
        }
    }
}