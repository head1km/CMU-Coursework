'''
Created on Dec 4, 2013

@author: Kyle Head

This program is an implementation of tic-tac-toe in Python.
The game supports 1 and 2 person games as well as a computer
simulated game. 
'''

import os
import random
import sys
import time

def playagain(players, first):
    if players != 0:
        print "Enter 'y' to play another game."
        again = raw_input()
        if again == "y":
            board = [x for x in range(1, 10)]
            writeboard(board)
            startGame(board, players, first)
    sys.exit(0)
        
def win(winner, players, first):
    if winner == "x":
        print "Player X wins!"
        playagain(players, first)
    else:
        print "Player O wins!"
        playagain(players, first)
    
def checkWin(board, players, first):
    if board[0] == "X" and board[1] == "X" and board[2] == "X":
        win("x", players, first)
    elif board[3] == "X" and board[4] == "X" and board[5] == "X":
        win("x", players, first)
    elif board[6] == "X" and board[7] == "X" and board[8] == "X":
        win("x", players, first)
    elif board[0] == "X" and board[3] == "X" and board[6] == "X":
        win("x", players, first)
    elif board[1] == "X" and board[4] == "X" and board[7] == "X":
        win("x", players, first)
    elif board[2] == "X" and board[5] == "X" and board[8] == "X":
        win("x", players, first)
    elif board[0] == "X" and board[4] == "X" and board[8] == "X":
        win("x", players, first)
    elif board[2] == "X" and board[4] == "X" and board[6] == "X":
        win("x", players, first)
    elif board[0] == "O" and board[1] == "O" and board[2] == "O":
        win("o", players, first)
    elif board[3] == "O" and board[4] == "O" and board[5] == "O":
        win("o", players, first)
    elif board[6] == "O" and board[7] == "O" and board[8] == "O":
        win("o", players, first)
    elif board[0] == "O" and board[3] == "O" and board[6] == "O":
        win("o", players, first)
    elif board[1] == "O" and board[4] == "O" and board[7] == "O":
        win("o", players, first)
    elif board[2] == "O" and board[5] == "O" and board[8] == "O":
        win("o", players, first)
    elif board[0] == "O" and board[4] == "O" and board[8] == "O":
        win("o", players, first)
    elif board[2] == "O" and board[4] == "O" and board[6] == "O":
        win("o", players, first)
        
def tie(players, first):
    print "Tie game!"
    playagain(players, first)
    
def simulate(board, players, first):
    moves = 0
    while moves < 9:
        os.system('cls' if os.name=='nt' else 'clear')
        if first == 0:
            player1 = board.index(random.choice(board))
            while not isinstance(board[player1], int):
                player1 = board.index(random.choice(board))
            board[player1] = "X"
            writeboard(board)
            checkWin(board, players, first)
            time.sleep(1)
            moves += 1
            if moves < 8:
                os.system('cls' if os.name=='nt' else 'clear')
                player2 = board.index(random.choice(board))
                while not isinstance(board[player2], int):
                    player2 = board.index(random.choice(board))
                board[player2] = "O"
                writeboard(board)
                checkWin(board, players, first)
                time.sleep(1)
                moves += 1
            else: 
                tie(players, first)
        else:
            player2 = board.index(random.choice(board))
            while not isinstance(board[player2], int):
                player2 = board.index(random.choice(board))
            board[player2] = "O"
            writeboard(board)
            checkWin(board, players, first)
            time.sleep(1)
            moves += 1
            if moves < 8:
                os.system('cls' if os.name=='nt' else 'clear')
                player1 = board.index(random.choice(board))
                while not isinstance(board[player1], int):
                    player1 = board.index(random.choice(board))
                board[player1] = "X"
                writeboard(board)
                checkWin(board, players, first)
                time.sleep(1)
                moves += 1
            else: 
                tie(players, first)
                 
def doubles(board, players, first):
    moves = 0
    while moves < 9:
        if first == 0:
            print "Player X, place your move by entering the appropriate number:"
            player1 = raw_input()
            while (not player1.isdigit) or board[int(player1)-1] == "X" or board[int(player1)-1] == "O":
                os.system('cls' if os.name=='nt' else 'clear')
                writeboard(board)
                print "Player X, place your move by entering the appropriate number:"
                player1 = raw_input()
            board[int(player1)-1] = "X"
            writeboard(board)
            checkWin(board, players, first)
            moves += 1
            if moves < 8:
                print "Player O, place your move by entering the appropriate number:"
                player2 = raw_input()
                while (not player2.isdigit) or board[int(player2)-1] == "X" or board[int(player2)-1] == "O":
                    os.system('cls' if os.name=='nt' else 'clear')
                    writeboard(board)
                    print "Player O, place your move by entering the appropriate number:"
                    player2 = raw_input()
                board[int(player2)-1] = "O"
                writeboard(board)
                checkWin(board, players, first)
                moves += 1
            else:
                tie(players, first)
        else:
            print "Player O, place your move by entering the appropriate number:"
            player2 = raw_input()
            while (not player2.isdigit) or board[int(player2)-1] == "X" or board[int(player2)-1] == "O":
                os.system('cls' if os.name=='nt' else 'clear')
                writeboard(board)
                print "Player O, place your move by entering the appropriate number:"
                player2 = raw_input()
            board[int(player2)-1] = "O"
            writeboard(board)
            checkWin(board, players, first)
            moves += 1
            if moves < 8:
                print "Player X, place your move by entering the appropriate number:"
                player1 = raw_input()
                while (not player1.isdigit) or board[int(player1)-1] == "X" or board[int(player1)-1] == "O":
                    os.system('cls' if os.name=='nt' else 'clear')
                    writeboard(board)
                    print "Player X, place your move by entering the appropriate number:"
                    player1 = raw_input()
                board[int(player1)-1] = "X"
                writeboard(board)
                checkWin(board, players, first)
                moves += 1
            else:
                tie(players, first)
def single(board, players, first):
    moves = 0
    while moves < 9:
        if first == 0:
            print "Player X, place your move by entering the appropriate number:"
            player1 = raw_input()
            while (not player1.isdigit) or board[int(player1)-1] == "X" or board[int(player1)-1] == "O":
                os.system('cls' if os.name=='nt' else 'clear')
                writeboard(board)
                print "Player X, place your move by entering the appropriate number:"
                player1 = raw_input()
            board[int(player1)-1] = "X"
            writeboard(board)
            checkWin(board, players, first)
            moves += 1
            if moves < 8:
                player2 = board.index(random.choice(board))
                while not isinstance(board[player2], int):
                    player2 = board.index(random.choice(board))
                board[player2] = "O"
                writeboard(board)
                checkWin(board, players, first)
                time.sleep(1)
                moves += 1
            else:
                tie(players, first)
        else:
            player1 = board.index(random.choice(board))
            while not isinstance(board[player1], int):
                player1 = board.index(random.choice(board))
            board[player1] = "X"
            writeboard(board)
            checkWin(board, players, first)
            time.sleep(1)
            moves += 1
            if moves < 8:
                print "Player O, place your move by entering the appropriate number:"
                player2 = raw_input()
                while (not player2.isdigit) or board[int(player2)-1] == "X" or board[int(player2)-1] == "O":
                    os.system('cls' if os.name=='nt' else 'clear')
                    writeboard(board)
                    print "Player O, place your move by entering the appropriate number:"
                    player2 = raw_input()
                board[int(player2)-1] = "O"
                writeboard(board)
                checkWin(board, players, first)
                moves += 1
            else:
                tie(players, first)
          
def startGame(board, players, first):
    if players == 0:
        simulate(board, players, first)
    elif players == 1:
        single(board, players, first)
    else:
        doubles(board, players, first)
        
def writeboard(board):
    os.system('cls' if os.name=='nt' else 'clear')
    print "-" * 10
    for x in range(len(board)):
        if x == 0 or x == 3 or x == 6:
            print "{0} | {1} | {2}".format(board[x], board[x+1], board[x+2])
            print "-" * 10
    print ""

def getfirst():
    random.seed()
    return random.randint(0, 1)

def getinput():
    print "Please enter the number of human players:"
    while 1:
        players = raw_input()
        if players.isdigit():
            players = int(players)
            if not(0 <= players <= 2):
                print "Invalid number please choose a number 0-2."
            else:
                break
        else:
            print "Invalid number please choose a number 0-2."
    return players

def main():
    players = getinput()
    first = getfirst()
    board = [x for x in range(1, 10)]
    writeboard(board)
    startGame(board, players, first)
    
if __name__ == '__main__':
    main()