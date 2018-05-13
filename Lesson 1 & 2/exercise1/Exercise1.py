import csv
import sys

def main():
    print("Please enter 5 numbers. \nSpaces will be trimmed.")
    askInput()

# ask for input
def askInput():
    list = [] # list which will contain user inputs
    for x in range(0, 5):
        list.append(''.join( input("Enter input: ").split()))
    if (validateInput(list)):
        print("they're all numbers, good, move on")
        calcMaxNum(list)
    else:
        print("please try again. Only postive numbers will be accepted")
        askInput()

# trim the inputs so spaces will convert numbers to string
def trimInputs(input):
    input.replace(' ', '')
    return

# check if the user inputted only numbers
def validateInput(list):
    i = 0; # check against the list

    for x in range(0, len(list)):
        if (list[x].isdigit()):
            i +=1
    if (i == len(list)):
        return True
    else:
        return False

# function returns largest number
def calcMaxNum(list):
    printList(list)
    printNum(max(list))

# function that prints list after the change
def printNum(num):
    print("Largest number: " + num)

# function that prints list before the change
def printList(list):
    print("Your list : " + ', '.join(map(str, list)))

if __name__ == "__main__":
    main()