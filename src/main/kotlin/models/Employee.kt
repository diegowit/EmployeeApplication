package main.models
import main.roundTwoDecimals


class Employee(var firstName: String, var surname: String, var gender: Char, var employeeID: Int,
               var grossSalary: Double, var payePercentage: Double,
               var prsiPercentage: Double, var annualBonus: Double, var cycleToWorkMonthlyDeduction: Double, var isManager: Boolean) {

    fun getFullName() = when (gender) {
        'm', 'M' -> "Mr. ${firstName} ${surname}"
        'f', 'F' -> "Ms.  ${firstName} ${surname}"
        else -> "${firstName} ${surname}"
    }

    fun getMonthlySalary() = roundTwoDecimals(grossSalary / 12)
    fun getMonthlyPRSI() = roundTwoDecimals(getMonthlySalary() * (prsiPercentage / 100))
    fun getMonthlyPAYE() = roundTwoDecimals(getMonthlySalary() * (payePercentage / 100))
    fun getGrossMonthlyPay() = roundTwoDecimals(getMonthlySalary() + (annualBonus / 12))
    fun getTotalMonthlyDeductions() = roundTwoDecimals((getMonthlyPRSI() + getMonthlyPAYE() + cycleToWorkMonthlyDeduction))
    fun getNetMonthlyPay() = roundTwoDecimals(roundTwoDecimals(getGrossMonthlyPay() - getTotalMonthlyDeductions()))

    fun getPayslip() =
        """
    ╔════════════════════════════════════════════════════════════════════════╗
    ║                            Monthly Payslip                             ║
    ║ Employee: ${getFullName()} ID: $employeeID                             ║
    ╠════════════════════════════════════════════════════════════════════════╣
    ║                          PAYMENT DETAILS                               ║
    ║ Gross Pay: ${String.format("%,.2f", getGrossMonthlyPay())}             ║
    ╟────────────────────────────────────────────────────────────────────────╢
    ║ Salary:    ${String.format("%,.2f", getMonthlySalary())}                       ║
    ║ Bonus:     ${String.format("%,.2f", roundTwoDecimals(annualBonus / 12))}║
    ╠════════════════════════════════════════════════════════════════════════ ╣
    ║                         DEDUCTION DETAILS                               ║
    ║ Total Deductions: ${String.format("%,.2f", getTotalMonthlyDeductions())}║
    ╟─────────────────────────────────────────────────────────────────────────╢
    ║ PAYE:      ${String.format("%,.2f", getMonthlyPAYE())}                  ║
    ║ PRSI:      ${String.format("%,.2f", getMonthlyPRSI())}                  ║
    ║ Cycle To Work: ${String.format("%,.2f", cycleToWorkMonthlyDeduction)}   ║
    ╠════════════════════════════════════════════════════════════════════════ ╣
    ║ Net Pay: ${String.format("%,.2f", getNetMonthlyPay())}                  ║
    ╚════════════════════════════════════════════════════════════════════════ ╝
""".trimIndent()


    override fun toString(): String {
        return "Employee(firstName='$firstName', surname='$surname', gender=$gender, employeeID=$employeeID, grossSalary=$grossSalary, payePercentage=$payePercentage, prsiPercentage=$prsiPercentage, annualBonus=$annualBonus, cycleToWorkMonthlyDeduction=$cycleToWorkMonthlyDeduction, isManager=$isManager)"
    }

}
