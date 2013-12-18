'''
Created on Nov 12, 2013

@author: Kyle Head
Implements the Grader program in Python. Program takes in grades and names
from the Grades file and then totals the grades into a letter grade. The 
new letter grade is then written to the Graded file along with the names of
the students.
'''

def main():
    possible = 400
    points = []
    graded = []
    try:
        lines = [line.strip() for line in open('Grades','r')]
    except IOError as e:
        print "Cannot write to Grades file!".format(e.errno, e.strerror)
    lines = sorted(lines, key=lambda name: name[0].lower())
    for i in range(len(lines)):
        temp= lines[i].split(',')
        graded.append([temp[1], temp[0]])
        total = 0
        for scores in temp[2:-1]:
            total += int(scores)
        points.append(100 * (float(total)/float(possible)))
    for i in range(len(points)):
        graded[i].append(points[i])

    for i in range(len(graded)): 
        if (graded[i][2] >= 92):
            graded[i][2] = "A"
        elif (graded[i][2] >= 90 and graded[i][2] < 92):
            graded[i][2] = "A-"
        elif (graded[i][2] >= 88 and graded[i][2] < 90):
            graded[i][2] = "B+"
        elif (graded[i][2] >= 82 and graded[i][2] < 88):
            graded[i][2] = "B"
        elif (graded[i][2] >= 80 and graded[i][2] < 82):
            graded[i][2] = "B-"
        elif (graded[i][2] >= 78 and graded[i][2] < 80):
            graded[i][2] = "C+"
        elif (graded[i][2] >= 72 and graded[i][2] < 78):
            graded[i][2] = "C"
        elif (graded[i][2] >= 70 and graded[i][2] < 72):
            graded[i][2] = "C-"
        elif (graded[i][2] >= 68 and graded[i][2] < 70):
            graded[i][2] = "D+"
        elif (graded[i][2] >= 62 and graded[i][2] < 68):
            graded[i][2] = "D"
        elif (graded[i][2] >= 60 and graded[i][2] < 62):
            graded[i][2] = "D-"
        else:
            graded[i][2] = "E"
    f =open('Graded', 'w')
    for item in graded:
        f.write("{0} {1}:{2}\n".format(item[0], item[1], item[2]))
    
if __name__ == '__main__':
    main()