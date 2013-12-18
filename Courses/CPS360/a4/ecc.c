/*
	Kyle Head
	CPS 360
	Assignment #4
	Due Date: November 6th
	Total Points: 10
*/
#include <stdio.h>
#include <stdlib.h>

/*
	The extractMessage function converts integer into an array of binary 
	characters. It accomplishes this by using a mask and walking through the array. 
	It then makes an and operation on each value and then an or operation with '0'.
	Once the array has been iterated through a terminating character is placed at the
	end of the array. The function then returns the converted array. It is limited to only
	putting out meaningful output when an integer number is input. 
*/
char extractMessage(int num, char* bin)
{
	int i;
	int mask = 1;
	int size = 16;

	for (i = size - 1; i >= 0; i--, num >>= 1)
		bin[i] = (mask & num) + '0';

	bin[size] = '\0';
	return *bin;
}


/*
	printResults prints out the results of the encoding process. 
*/
void printResults(char *bin, char *encode)
{
	printf("uncoded-message:\t%s\n", bin);
	printf("redundent bites:\t1:%c\t2:%c\t4:%c\t8:%c\t16:%c\n", encode[0], encode[1], encode[3], encode[7], encode[15]);
	printf("coded message:\t\t%s\n\n", encode);
}


/*
	readMessage reads from the stdin stream. It looks for
	integer numbers and puts them into an array. After the EOF is reached the program returns the array to main. 
*/
void readMessage(int inputs[], int max)
{
	int i;
	
	for(i = 0; i < max; i++) {
		inputs[i] = 0;
	}
	i = 0;
	while(feof(stdin) == 0) {
		scanf("%d", &inputs[i]);
		i++;
	}
}


/*
	LengthOfFile is used to trim down the size of the original array used to store integers
	from input. It will count all non-zero integers and pass that back to the main function.
	Then when the numbers are converted to binary the program will know how many to expect.
*/
int LengthOfFile(int inputs[])
{
	int length = 0;

	while(inputs[length] > 0) {
		length++;
	}
	return length;
}


/*
	The setBit function is where the parity bits are calculated. For each of the five parity
	bits there is a different switch statement. Depending on which bit is being calculated the
	corresponding related bits are added up. Because we are using even parity if the sum is
	even then the parity bit will be set to 1. 
*/
char setBit(int pos, char message[]) 
{
	int n;
	char s;
	switch(pos) {
		case 0:
			n = 0;
			if((message[0] + message[2] + message[4] + message[6] + message[8] + message[10]
			 + message[12] + message[14] + message[16] + message[18] + message[20]) % 2 == 0) {
					s = '0';
				}
			else {
				s = '1';
			}
			break;
		case 1:
			n = 1;
			if((message[1] + message[2] + message[5] + message[6] + message[9] + message[10]
			 + message[13] + message[14] + message[17] + message[18]) % 2 == 0) {
				s = '0';
			}
			else {
				s = '1';
			}
			break;
		case 3:
			n = 3;
			if((message[3] + message[4] + message[5] + message[6] + message[11] + message[13] + message[14]
			+ message[19] + message[20]) % 2 == 0) {
				s = '0';
			}
			else {
				s = '1';
			}
			break;
		case 7:
			n = 7;
			if((message[7] + message[8] + message[9] + message[10] + message[11] + message[12] + message[13] + message[14]) % 2 == 0) {
				s = '0';
			}
			else {
				s = '1';
			}
			break;
		case 15:
			n = 15;
			if((message[15] + message[16] + message[17] + message[18] + message[19] + message[20]) % 2 == 0) {
				s = '0';
			}
			else {
				s = '1';
			}
			break;
		default:
			puts("A bad array input was detected!");
			exit(1);
			break;
	}	
	return s;
}


/*
	In makeMessage the uncoded message is placed into a new array according to in the correct position. After
	all the bits have been set the parity bits are then calculated and stored in the encoded array. After this
	step the message is encoded and the printResults function is called.
*/
void makeMessage(char message[], char emessage[], int bin, int code)
{
	int j;
	
	for(j = 0; j < code; j++) {
		switch(j) {
			case 0:
				emessage[0] = '0';
				break;
			case 1:
				emessage[1] = '0';
				break;
			case 2:
				emessage[2] = message[0];
				break;
			case 3:
				emessage[3] = '0';
				break;
			case 4:
				emessage[4] = message[1];
				break;
			case 5:
				emessage[5] = message[2];
				break;
			case 6:
				emessage[6] = message[3];
				break;
			case 7:
				emessage[7] = '0';
				break;
			case 8:
				emessage[8] = message[4];
				break;
			case 9:
				emessage[9] = message[5];
				break;
			case 10:
				emessage[10] = message[6];
				break;
			case 11:
				emessage[11] = message[7];
				break;
			case 12:
				emessage[12] = message[8];
				break;
			case 13:
				emessage[13] = message[9];
				break;
			case 14:
				emessage[14] = message[10];
				break;
			case 15:
				emessage[15] = '0';
				break;
			case 16:
				emessage[16] = message[11];
				break;
			case 17:
				emessage[17] = message[12];
				break;
			case 18:
				emessage[18] = message[13];
				break;
			case 19:
				emessage[19] = message[14];
				break;
			case 20:
				emessage[20] = message[15];
				break;
			default:
				puts("A bad array input was detected!");
				exit(1);
				break;
		}
		emessage[0] = setBit(0, message);
		emessage[1] = setBit(1, message);
		emessage[3] = setBit(3, message);
		emessage[7] = setBit(7, message);
		emessage[15] = setBit(15, message);
	}
	printResults(message, emessage);
}


/*
	In the main method the arrays that will hold the integers and later the binary 
	encoded messages are created. Other functions are called to perform the operations
	involved in changing an integer to an encoded binary number. 
*/
int main(int argc, char *argv[]) 
{	
	int maxnumbers = 500, codelength = 21, i, binlen;
	int numbers[maxnumbers];
	
	readMessage(numbers, maxnumbers);
	binlen = LengthOfFile(numbers);
	
	char binary[binlen][codelength];
	char encodedbinary[binlen][codelength];
	
	puts("The inputs in the file have been encoded with the Hamming code technique.");
	for(i = 0; i < binlen; i++) {
		extractMessage(numbers[i], binary[i]);
		makeMessage(binary[i], encodedbinary[i], binlen, codelength);
	}
}
