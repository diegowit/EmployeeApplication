package main
import main.models.Employee




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
fun mainMenu(args: Array<String>){
    //start()
    // logger.info { "Launching Employee App" }

}
