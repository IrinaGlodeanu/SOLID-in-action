# SOLID-in-action
SOLID principles exemplified for FIIPractic Course 2019

## 1.S - Single responsability principle

Exemplified by comparing the ro.fiipractic.solid.notsolid.SugarVendingMachineManagerImpl class that contains all the functionality of a vending machine in a single place with the ro.fiipractic.solid.solid.services.moneymanagement and ro.fiipractic.solid.solid.services.productmanagement packages that contain classes with a specific purpose.

## 2.O - Open-closed principle

Exemplified by comparing the ro.fiipractic.solid.notsolid.CurrencyConverter class that contains the whole conversion algorithm between currencies with the classes found in ro.fiipractic.solid.solid.services.currencymanagement package that implement the Strategy Pattern.

## 3.L - Liskov substitution principle

Exemplified by comparing the ro.fiipractic.solid.notsolid.CoinConverter class that does not respect the purpose of the parent class with the one of the ro.fiipractic.solid.solid.services.currencymanagement.RonMealTicketConverter class that does.

## 4.I - Interface segregation principle

Exemplified by comparing the ro.fiipractic.solid.notsolid.SugarVendingMachineManager interface with the segregated interfaces from the ro.fiipractic.solid.solid.services.moneymanagement and ro.fiipractic.solid.solid.services.productmanagement packages.

## 5.D - Depenency Inversion principle 

Exemplified by the two implementations of a vending machine (ro.fiipractic.solid.notsolid.VendingMachineFromBucharest and ro.fiipractic.solid.notsolid.VendingMachineFromLondon) that are tied to the currency type in comparison with the general mechanism of defining a vending machine from ro.fiipractic.solid.solid.VendingMachine and the two concrete implementations (ro.fiipractic.solid.solid.VendingMachineFromBucharest and ro.fiipractic.solid.solid.VendingMachineFromLondon) that get the currency type when they are instantiated.
