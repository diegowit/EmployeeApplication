package main
import main.controllers.EmployeeAPI
import main.models.Employee
import kotlin.system.exitProcess
import kotlin.math.round

// Initialize the employee API instance
var employees = EmployeeAPI()


// Function to display the menu options and return the user input.
fun main() = runMainMenu()
/**
 * Runs the main menu loop.
 */
// Function to display the menu options and return the user input.
fun runMainMenu() {
    do {
        when (val option = mainMenu()) {
            1 -> runEmployeeMenu()
            2 -> runEmployeeSearch()
            0 -> exitApp()
            else -> println("Invalid menu choice: $option")
        }
    } while (true)
}

/**
 *
 *  Main Menu
 *
 */
fun mainMenu(): Int {
    print(
        """
    
▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌
▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀▀▀ 
▐░▌       ▐░▌▐░▌          ▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌ ▐░▌▐░▌▐░▌          
▐░▌   ▄   ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄▄▄ 
▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌
▐░▌ ▐░▌░▌ ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀▀▀ 
▐░▌▐░▌ ▐░▌▐░▌▐░▌          ▐░▌          ▐░▌          ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          
▐░▌░▌   ▐░▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ 
▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌
 ▀▀       ▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀ 
            
╔═══════════════════════════════════════════════════╗
║                 Employee APP                      ║
╠═══════════════════════════════════════════════════╣
║                                                   ║
║                  1 Employee Menu                  ║
║                  2 Search  Employee Menu          ║
╚═══════════════════════════════════════════════════╝
║                  0    Exit                        ║
╚═══════════════════════════════════════════════════╝
==>> """.trimMargin()
    )
    return readln().toInt()
    // Returning the user input as an integer.
}

/**
 *
 *  Employee Menu
 *
 */

fun runEmployeeMenu () {

    do {
        when (val option = employeeMenu()) {
            1 -> add()
            2 -> list()
            3 -> paySlip()
            4 -> update()
            5 -> delete()
            80 -> dummyData()
          //  5 -> delete()


            0 -> return // Return to main menu
            else -> println("Invalid menu choice: $option")
        }
    } while (true)
}

fun employeeMenu(): Int {

    print(
        """
╔═══════════════════════════════════════════════════╗
║                   Employee Menu                   ║
╠═══════════════════════════════════════════════════╣
║   1) Add a Employee                               ║
║   2) List All Employee                            ║
║   3) Print Payslip for Employee                   ║
║   4) Update Employee details                      ║
║   5) Delete Employee                              ║
║                                                   ║
╚═══════════════════════════════════════════════════╝
║   0) Return to Main Menu                          ║
╚═══════════════════════════════════════════════════╝
            
            
       ==>> """.trimMargin()
    )
    return readln().toInt()
    // Returning the user input as an integer.
}

internal fun getEmployeeById(): Employee? /* The return type of the method is """Employee?""",
 which means that it returns an instance of the Employee class or null.
  The ? symbol in the type declaration indicates that the value can be either
  an instance of the Employee class or null.*/

{
    // Prompt the user for the employee id to search by.
    print("Enter the employee id to search by: ")
    val employeeID = readln().toInt()

    // Search for the employee with the specified id and return the result.
    return employees.findOne(employeeID)
}

fun add(){
    print("Enter first name: ")
    val firstName = readlnOrNull().toString()
    print("Enter surname: ")
    val surname = readlnOrNull().toString()
    print("Enter gender (m/f): ")
    val gender = readln().toCharArray()[0]
    print("Enter gross salary: ")
    val grossSalary = readln().toDouble()
    print("Enter PAYE %: ")
    val payePercentage = readln().toDouble()
    print("Enter PRSI %: ")
    val prsiPercentage = readln().toDouble()
    print("Enter Annual Bonus: ")
    val annualBonus= readln().toDouble()
    print("Enter Cycle to Work Deduction: ")
    val cycleToWorkMonthlyDeduction= readln().toDouble()
    print("is this EWmployee a manager. (true/false) ")
    val isManager= readln().toBoolean()


    employees.create(Employee(firstName, surname, gender, 0, grossSalary, payePercentage, prsiPercentage, annualBonus, cycleToWorkMonthlyDeduction, isManager))
}


// Function to update an employee's details.
fun update(){
    // Call the getEmployeeById() function to get the employee instance.
    val employee = getEmployeeById()
    // If the employee is found, update the details.
    if (employee != null) {
        // Get the new first name from the user and update the employee instance.
        println("Enter the new first name: ")
        employee.firstName = readln()

        // Prompt the user for the new surname and update the employee instance.
        println("Enter the new surname: ")
        employee.surname = readln()

        // Prompt the user for the new gender and update the employee instance.
        println("Enter the new gender (m/f): ")
        employee.gender = readln()[0]

        // Prompt the user for the new gross salary and update the employee instance.
        println("Enter the new gross salary: ")
        employee.grossSalary = readln().toDouble()

        // Prompt the user for the new PAYE percentage and update the employee instance.
        println("Enter the new PAYE percentage: ")
        employee.payePercentage = readln().toDouble()

        // Prompt the user for the new PRSI percentage and update the employee instance.
        println("Enter the new PRSI percentage: ")
        employee.prsiPercentage = readln().toDouble()

        // Prompt the user for the new annual bonus and update the employee instance.
        println("Enter the new annual bonus: ")
        employee.annualBonus = readln().toDouble()

        // Prompt the user for the new cycle to work monthly deduction and update the employee instance.
        println("Enter the new cycle to work monthly deduction: ")
        employee.cycleToWorkMonthlyDeduction = readln().toDouble()

        println("is a Manager (true/false): ")
        employee.isManager = readln().toBoolean()

val updatedEmployee = Employee( employee.firstName,
    employee.surname, employee.gender,
    employee.employeeID, employee.grossSalary,
    employee.payePercentage, employee.prsiPercentage,
    employee.annualBonus, employee.cycleToWorkMonthlyDeduction,
    employee.isManager)

if (employees.updateEmployee(employee.employeeID, updatedEmployee)){
    println("Update Successful")
}else {
    println("Update Failed")
}


    } else {
        println("There are no employee to update")
    }
}




// Function to print the payslip of an employee.
fun paySlip(){
    // Call the getEmployeeById() function to get the employee instance.
    val employee = getEmployeeById()
    // If the employee is found, print the payslip.
    if (employee != null)
        println(employee.getPayslip())
}




// Function to list all the employees.
fun list(){
    // Call the findAll() function from the EmployeeAPI class to get all the employees.
    employees.findAll()
        // Loop through each employee and print it.
        .forEach{ println(it) }
}


fun dummyData() {
    employees.create(Employee("Yessi", "Paul", 'f', 0, 3625.43, 81.0, 8.0, 3000.0, 20.6, true))
    employees.create(Employee("John", "Lopez", 'm', 0, 969955.13, 12.5, 6.5, 1200.0, 45.3, false))
    employees.create(Employee("Laura", "Smith", 'f', 0, 457825.41, 10.0, 9.9, 6500.0, 0.0, true))
}

fun delete() {
    val employee = getEmployeeById()

    if (employee != null) {
        val deleted = employees.deleteEmployee(employee.employeeID)

        if (deleted) {
            println("deleted successfully")
        } else {
            println("Failed to delete")
        }
    } else {
        println("Employee not found.")
    }
}

/**
 *
 *  Search Employee Menu
 *
 */

fun runEmployeeSearch () {

    do {
        when (val option = searchMenu()) {
             1 -> listBySurname()
             2 -> listByGender()
             3 -> listManagers()

            0 -> return // Return to main menu
            else -> println("Invalid menu choice: $option")
        }
    } while (true)
}



fun searchMenu(): Int {

    print(
        """
╔═══════════════════════════════════════════════════╗
║                   Employee Menu                   ║
╠═══════════════════════════════════════════════════╣
║   1) List Employee By Surname                     ║
║   2) List Employee By Gender                      ║
║   3) list Managers                                ║
║                                                   ║
║                                                   ║
║                                                   ║
╚═══════════════════════════════════════════════════╝
║   0) Return to Main Menu                          ║
╚═══════════════════════════════════════════════════╝
            
            
       ==>> """.trimMargin()
    )
    return readln().toInt()
    // Returning the user input as an integer.
}




fun listBySurname() {
    // Get employee grouped by Surname using employeeApi
    val contactsBySurname = employees.listBySurname()

    // the results are showed
    if (contactsBySurname.isEmpty()) {
        println("No employees found")
    } else {
        println("Listing employees by Surname:")
        contactsBySurname.forEach{ println(it) }
    }
}


fun listByGender() {
    // Get employees grouped by Gender using employeeApi
    val contactsByLastName = employees.listByGender()

    // the results are showed
    if (contactsByLastName.isEmpty()) {
        println("No employees found")
    } else {
        println("Listing employees by Gender:")
        contactsByLastName.forEach{ println(it) }
    }
}


fun listManagers() {
    // Get employee grouped by isManager using employeeApi
    val contactsByLastName = employees.listManagers()

    // the results are showed
    if (contactsByLastName.isEmpty()) {
        println("No employees found")
    } else {
        println("Listing Manager employees :")
        contactsByLastName.forEach{ println(it) }
    }
}






fun exitApp() {
    println(
        "_______  _______  _______    __   __  _______  __   __    _______  _______  _______  __    _ \n" +
                "|       ||       ||       |  |  | |  ||       ||  | |  |  |       ||       ||       ||  |  | |\n" +
                "|  _____||    ___||    ___|  |  |_|  ||   _   ||  | |  |  |  _____||   _   ||   _   ||   |_| |\n" +
                "| |_____ |   |___ |   |___   |       ||  | |  ||  |_|  |  | |_____ |  | |  ||  | |  ||       |\n" +
                "|_____  ||    ___||    ___|  |_     _||  |_|  ||       |  |_____  ||  |_|  ||  |_|  ||  _    |\n" +
                " _____| ||   |___ |   |___     |   |  |       ||       |   _____| ||       ||       || | |   |\n" +
                "|_______||_______||_______|    |___|  |_______||_______|  |_______||_______||_______||_|  |__|\n" +
                "                                                                                              \n" +
                "\n" +
                "      Thank you for using this App!\n" +
                "Exiting... Have a great day!"
    )
    exitProcess(0)
}

//https://discuss.kotlinlang.org/t/how-do-you-round-a-number-to-n-decimal-places/8843
//There are several options...try each of them out
fun roundTwoDecimals(number: Double) = round(number * 100) / 100
//fun roundTwoDecimals(number: Double) = "%.2f".format(number).toDouble()