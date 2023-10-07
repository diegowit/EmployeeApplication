# Employee Payroll System - AppAssignment

This is a simple payroll system that calculates and displays various details about an employee's salary, including the monthly salary, monthly PRSI, monthly PAYE, monthly gross pay, monthly total deductions, and monthly net pay. The system also generates a full payslip that shows all the payment and deduction details.

## Features

The system utilizes the employee's following information to calculate and display various salary details:

- First name
- Surname
- Gender
- Employee ID
- Gross salary
- PAYE percentage
- PRSI percentage
- Annual bonus
- Cycle to work monthly deduction

### Calculated & Displayed Details:

- Monthly salary
- Monthly PRSI
- Monthly PAYE
- Monthly gross pay
- Monthly total deductions
- Monthly net pay
- Full payslip

The system provides a **menu-driven interface** that allows the user to:

- Choose which information to display
- Update employee's details by entering new values when prompted

## Requirements

- Kotlin
- IntelliJ IDEA

## Usage

1. Open the project in IntelliJ IDEA.
2. Run the `main` function.
3. A menu will be displayed. Choose an option from the menu to view corresponding information.
4. To update employee details, select option `8` from the menu and follow the prompts to enter new values.
5. To exit the program, select option `-1` from the menu.

## Note

The `roundTwoDecimals` function is implemented to round off calculated values to two decimal places. There are two versions of this function available in the code. Feel free to try both implementations and use the one that best fits your needs.

