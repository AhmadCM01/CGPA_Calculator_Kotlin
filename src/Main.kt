import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val courses = mutableListOf<Course>()
    val calculator = CGPACalculator()

    println("=== Student CGPA Calculator (5.0 Scale) ===")
    print("How many courses did you take? ")

    val count = try { reader.nextInt() } catch (e: Exception) { 0 }

    for (i in 1..count) {
        println("\n--- Course #$i ---")
        print("Course Name: ")
        val name = reader.next()

        print("Credit Units (1-5): ")
        val units = reader.nextInt()

        print("Grade (A, B, C, D, E, or F): ")
        val gradeChar = reader.next().uppercase()

        // Grading Scale Logic
        val points = when (gradeChar) {
            "A" -> 5.0
            "B" -> 4.0
            "C" -> 3.0
            "D" -> 2.0
            "E" -> 1.0
            else -> 0.0
        }

        courses.add(Course(name, units, points))
    }

    val finalCGPA = calculator.calculate(courses)
    val finalRemark = calculator.getRemark(finalCGPA)

    println("\n============================")
    println("FINAL SEMESTER RESULTS")
    println("Total Units: ${courses.sumOf { it.units }}")
    println("CGPA: ${"%.2f".format(finalCGPA)}")
    println("Remark: $finalRemark")
    println("============================")
}