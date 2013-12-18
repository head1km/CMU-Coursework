#!/usr/bin/python
'''
Created on Nov 19, 2013
@author: Kyle Head
CPS 280s
Homework 7

This assignment takes input from three separate files and then uses said data
to create a schedule for various students. 
'''
import re

'''
The function classListToDict takes the list created from the ClassList file and
formats the data into a list that can then be easily converted to a dictionary.
Once the dictionary is created it is returned to the main function. 
'''
def classListToDict(cList, cDict):
    cList = [line.strip() for line in cList]
    for item in cList:
        if item == "----":
            cList.remove(item)
    splitIndex = [i for i, x in enumerate(cList) if x == ""]
    cDict[cList[0]] = cList[1:splitIndex[0]]
    for num in xrange(len(splitIndex)):
        if num < len(splitIndex)-2:
            cDict[cList[splitIndex[num]+1]] = cList[splitIndex[num]+2:splitIndex[num+1]]
        elif num == len(splitIndex) - 2:
            cDict[cList[splitIndex[num]+1]] = cList[splitIndex[num]+2:-1]
    return cDict

'''
The function courseToDict takes the list created from the Courses file and
then formats it into a list that can be easily converted to a dictionary.
Once the dictionary is populated it is returned by the function. 
'''  
def courseToDict(cList, cDict):
    cList = [line.strip() for line in cList]
    for item in cList:
        if item == "----" or item == "":
            cList.remove(item)
    for num in xrange(len(cList)):
        if int(num % 2) == 0 or num == 0:
            cDict[cList[num]] = cList[num+1]
    return cDict

'''
The function studentsToDict takes the list created from the Students file and
then formats it into a list that can be easily converted to a dictionary. Once
the dictionary is populated it is returned by the function.
'''
def studentsToDict(students, studentDict):
    students = [line.strip() for line in students]
    students = students[2:]
    splitStudents = []
    for item in students:
        splitStudents.append(re.split(" *", item))
    for item in splitStudents:
        studentDict[item[-1]] = item[:-1]
    return studentDict

'''
The function printSchedule uses the dictionaries created by other functions
to create the output for the program. 
'''
def printSchedule(classDict, courseDict, studentDict):
    for skey in studentDict.keys():
        if len(studentDict[skey]) < 3:
            print "Name:{0}, {1}".format(studentDict[skey][0], studentDict[skey][-1])
        else:
            print "Name:{0}, {1} {2}".format(studentDict[skey][0], studentDict[skey][-1], studentDict[skey][1])
        print "StudentID:"+skey+"\n"
        for ckey in classDict.keys():
            for value in classDict[ckey]:
                if re.search(skey, value):
                    print ckey + ":" + courseDict[ckey]
        print "\ncut here\n" + "-"*24+"\n"

'''
In the main function the program stores the contents of three files in separate
lists. These lists are then passed to other functions to convert them to dictionaries. 
Once the dictionaries are populated the function passes them to printSchedule to output
the data. 
'''
def main():
    classDict = {}
    courseDict = {}
    studentDict = {}
    
    try:
        classList = open("ClassList", "r").readlines()
        courses = open("Courses", "r").readlines()
        students = open("Students", "r").readlines()
    except IOError as e:
        print "Cannot open files to create schedule!".format(e.errno, e.strerror)
        
    classDict = classListToDict(classList, classDict)    
    courseDict = courseToDict(courses, courseDict)
    studentDict = studentsToDict(students, studentDict)
    printSchedule(classDict, courseDict, studentDict)
    
if __name__ == '__main__':
    main()