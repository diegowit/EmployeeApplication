package main.models

class Employee {
    class Employee(var firstName: String,
                   var surname: String,
                   var gender: Char,
                   var employeeID: Int,
                   var grossSalary: Double,
                   var payePercentage: Double,
                   var prsiPercentage: Double,
                   var annualBonus: Double,
                   var cycleToWorkMonthlyDeduction: Double,
                   var isManager: Boolean,)
}

fun getFullName() = when (gender) {
    'm', 'M' -> "Mr. ${firstName} ${surname}"
    'f', 'F' -> "Ms.  ${firstName} ${surname}"
    else -> "${firstName} ${surname}"
}

