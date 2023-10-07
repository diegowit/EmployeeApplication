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
║                  2 Search  Employee Menu           ║
╚═══════════════════════════════════════════════════╝
║                  0    Exit                        ║
╚═══════════════════════════════════════════════════╝
==>> """.trimMargin()
    )
    return readLine()!!.toInt()
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
          //  1 -> add()
           // 2 -> list()
           // 3 -> paySlip()
           // 4 -> update()
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
    return readLine()!!.toInt()
    // Returning the user input as an integer.
}


/**
 *
 *  Search Employee Menu
 *
 */
fun runEmployeeSearch () {

    do {
        when (val option = searchMenu()) {
            // 1 -> listByName()
            // 2 ->  listBySurname()
            // 3 ->  listByGender()
            // 4 ->  listOfManagers()
            // 5 -> sortBySurname()


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
║   1) List Employee By Name                        ║
║   2) List Employee By Surname                     ║
║   3) list Employee by Gender                      ║
║   4) list Managers                                ║
║   5) Sort Employee By surname in ascending order  ║
║                                                   ║
╚═══════════════════════════════════════════════════╝
║   0) Return to Main Menu                          ║
╚═══════════════════════════════════════════════════╝
            
            
       ==>> """.trimMargin()
    )
    return readLine()!!.toInt()
    // Returning the user input as an integer.
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