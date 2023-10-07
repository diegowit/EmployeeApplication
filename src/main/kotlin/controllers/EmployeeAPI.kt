package main.controllers

import main.models.Employee

// Initialise a variable to store the last used employee ID.
var lastId = 0

// Function to generate unique employee IDs.
internal fun getId(): Int {
    // Increment the last used ID and return the result.
    return lastId++
}
