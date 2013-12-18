'''
Created on Oct 29, 2013
The program uses two functions, main and fizzlist, to print out different
values. if a number is divisible by 3 then it will print fizz. If a number
is divisible by 5 then it will print buzz. If it is divisible by both 3 and 5
then it will print fizzbuzz. Finally if the number is not divisible by either
then the program will print out the number itself.  
@author: head1km
'''
def fizzbuzz(i):
    if i % 3 == 0 and i % 5 == 0:
        return "fizzbuzz"
    elif i % 3 == 0:
        return "fizz"
    elif i % 5 == 0:
        return "buzz"
    else:
        return str(i)
    
def main():
    fizzlist = 50
    i = 1
    while i <= fizzlist:
        value = fizzbuzz(i)
        print value
        i = i + 1
        
if __name__ == '__main__':
    main()