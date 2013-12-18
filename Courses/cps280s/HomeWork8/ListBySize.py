#!/usr/bin/python
'''
Created on Nov 26, 2013
CPS 280S
@author: Kyle Head

A program that uses os.walk() to scan a directory, given as an argument. Then
the files found are then printed out to stdout in order from smallest to largest.
'''
import os
import sys

def scanDir(root):
    paths = []
    for currentDir, subDirs, files in os.walk(root):
        for filename in files:
            paths.append(os.path.join(currentDir,filename))
    paths.sort(key=lambda pathsize: os.path.getsize(pathsize), reverse=False)
    for path in paths:
        print path
        
def main():
    root = sys.argv[1]
    
    if(os.path.isdir(root)):
        scanDir(root)
    else:
        print >> sys.stderr, "Error path not found!"
        sys.exit(1)
if __name__ == '__main__':
    main()