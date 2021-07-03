
def main():
    myNum = int(5) 
    myFloatNum = 5.99
    myDoubleNum = 5.99999999999
    myLetter = 'D'
    myBool = True
    myText = "Hello"

    print("My number: ", myNum, ", ", "My float: ", myFloatNum, ", ", "My double: ",
     myDoubleNum, ", ", "My letter: " , myLetter , ", " , "My Bool: " , myBool , ", " , "My Text: " , myText)

    print(f"Before new assignment, the type of myNum value is {myNum} and type is {type(myNum)}")
    myNum = 5.123   # this works
    print(f"After new assignment, the type of myNum value is {myNum} and type is {type(myNum)}")
    print(f"Before new assignment, the type of myNum value is {myBool} and type is {type(myBool)}")
    myBool = "True" # this works 
    print(f"Before new assignment, the type of myNum value is {myBool} and type is {type(myBool)}")

    myDoubleNum = myNum  # this is ok 

if __name__ == "__main__":
    main()