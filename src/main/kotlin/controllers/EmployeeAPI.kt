package main.controllers

import main.models.Employee

// Initialize a variable to store the last used employee ID.
var lastId = 0

// Function to generate unique employee IDs.
internal fun getId(): Int {
    // Increment the last used ID and return the result.
    return lastId++
}

class EmployeeAPI {

    // Collection to store employee instances.
    private val employees = ArrayList<Employee>()

    // Method to retrieve all employees in the collection.
    fun findAll(): List<Employee> {
        // Return the entire employee collection.
        return employees
    }

    // Method to retrieve a single employee based on their ID.
    fun findOne(id: Int): Employee? {
        // Use the find function to search for an employee with the specified ID.
        return employees.find { p -> p.employeeID == id }
    }

    // Method to add a new employee to the collection.
    fun create(employee: Employee) {
        // Assign a unique ID to the new employee.
        employee.employeeID = getId()
        // Add the new employee to the collection.
        employees.add(employee)
    }

    /**
     * Function to update the details of an existing employee identified by the given ID with the details of a new Employee object.
     *
     * @param id The ID of the employee whose details are to be updated.
     * @param updatedEmployee An Employee object containing the updated details.
     * @return Boolean indicating success (true) or failure (false) of the update operation.
     */
    fun updateEmployee(id: Int, updatedEmployee: Employee): Boolean {
        // Retrieve the existing Employee object with the specified ID.
        val foundEmployee = findOne(id)

        // Check if an Employee object with the specified ID exists and if the updatedEmployee is not null.
        if (foundEmployee != null) {
            // Update the details of the found employee with the details from the updatedEmployee object.
            foundEmployee.firstName = updatedEmployee.firstName
            foundEmployee.surname = updatedEmployee.surname
            foundEmployee.gender = updatedEmployee.gender
            foundEmployee.grossSalary = updatedEmployee.grossSalary
            foundEmployee.payePercentage = updatedEmployee.payePercentage
            foundEmployee.prsiPercentage = updatedEmployee.prsiPercentage
            foundEmployee.annualBonus = updatedEmployee.annualBonus
            foundEmployee.cycleToWorkMonthlyDeduction = updatedEmployee.cycleToWorkMonthlyDeduction
            foundEmployee.isManager = updatedEmployee.isManager
            // Return true to indicate that the update operation was successful.
            return true
        }
        // If no employee with the specified ID is found, or if updatedEmployee is null, return false.
        return false
    }

    /**
     * Function to delete an employee identified by the given ID from the list of employees.
     *
     * @param id The ID of the employee to be deleted.
     * @return Boolean indicating success (true) or failure (false) of the deletion operation.
     */
    fun deleteEmployee(id: Int): Boolean {
        // Retrieve the Employee object with the specified ID.
        val findEmployee = findOne(id)

        // Check if an Employee object with the specified ID exists.
        if (findEmployee != null) {
            // If found, remove the employee from the list of employees and return true to indicate success.
            employees.remove(findEmployee)
            return true
        }
        // If no employee with the specified ID is found, return false.
        return false
    }

    /**
     * Function to group and list employees based on their gender.
     *
     * This function use the Map data structure in Kotlin.
     * For more information on Map, refer to the Kotlin documentation:
     * [Kotlin Map Documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/)
     *
     * @return A Map where the key is a Char representing gender, and the value is a List of Employee objects with that gender.
     */
    fun listByGender(): Map<Char, List<Employee>>{
        // The groupBy function organizes the employees collection into a Map,
        // where each key is a gender (Char), and the value is a List of Employee objects with that gender.
        return  employees.groupBy { it.gender }
    }

    /**
     * Function to group and list employees based on their surname.
     *
     * This function use the Map data structure in Kotlin.
     * For more information on Map, refer to the Kotlin documentation:
     * [Kotlin Map Documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/)
     *
     * @return A Map where the key is a String representing surname, and the value is a List of Employee objects with that surname.
     */
    fun listBySurname(): Map<String, List<Employee>>{
        // The groupBy function organizes the employees collection into a Map,
        // where each key is a surname (String), and the value is a List of Employee objects with that surname.
        return  employees.groupBy { it.surname }
    }

    /**
     * Function to group and list employees based on their manager status.
     *
     * This function use the Map data structure in Kotlin.
     * For more information on Map, refer to the Kotlin documentation:
     * [Kotlin Map Documentation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/)
     *
     * @return A Map where the key is a Boolean representing manager status, and the value is a List of Employee objects with that status.
     */
    fun listManagers(): Map<Boolean, List<Employee>>{
        // The groupBy function organizes the employees collection into a Map,
        // where each key is a manager status (Boolean), and the value is a List of Employee objects with that status.
        return  employees.groupBy { it.isManager }
    }

}