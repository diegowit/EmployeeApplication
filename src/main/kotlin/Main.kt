package main
import main.models.Employee



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
║                  2 Search Employee Menu           ║
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

            //20 -> save()
           // 21 -> load()
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
╟───────────────────────────────────────────────────╢
║   20) Save Contacts                               ║
║   21) Load Contacts                               ║
╚═══════════════════════════════════════════════════╝
║   0) Return to Main Menu                          ║
╚═══════════════════════════════════════════════════╝
            
            
       ==>> """.trimMargin()
    )
    return readLine()!!.toInt()
    // Returning the user input as an integer.
}