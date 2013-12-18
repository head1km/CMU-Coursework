/*
	Kyle Head
	CPS 360
	Assignment #3
	Due Date: October 15th
	Total Points: 15
*/
#include <stdio.h>
#include <stdlib.h>

/*
	The ConvertToBinary function converts a character array into an array of binary 
	integers. It accomplishes this by using a mask and walking through the array. 
	It then makes an and operation on each value and then an or operation with '0'.
	Once the array has been iterated through a terminating character is placed at the
	end of the array. The function then returns the converted array. It is limited to only
	putting out meaningful output when an integer number is input. 
*/
char ConvertToBinary(int num, char* bin)
{
	int i;
	int mask = 1;
	int size = 32;

	for (i = size - 1; i >= 0; i--, num >>= 1)
		bin[i] = (mask & num) + '0';

	bin[size] = '\0';
	return *bin;
}


/*
	ConvertToInt takes in a character array and outputs an integer number. This is done by
	iterating through the character array and when a '1' is present the function then adds
	a 1 to the integer number at that bit position. This is done by performing num ^ 1. The function
	only produces meaningful output if a character array of '0's and '1's is passed to it. 
*/
int ConvertToInt(char* bin)
{
	int num = 0;
	
	while(*bin) {
		num <<= 1;
		if(*bin++ == '1') num ^= 1;
	}
	return num;
}


/*
	The function fadder simulates a full adder circut. The function takes in two binary numbers, a and b,
	a carry input, and an arry of outputs. output[0] is the sum bit. output[1] is the carry bit. After the
	appropriate boolean algebra is preformed the function returns the contents of the output array. If 
	the correct values are not passed to the function, three chars and a char array, the function 
	will not have a meaningful output.
*/
char fadder(char a, char b, char ci, char* output)
{
	output[0] = ((a ^ b) ^ ci);
	output[1] = (((a ^ b) & ci) | (a & b));
	return *output;
}


/*
	The function pfadder is a partial full adder. The function accepts the same inputs as fadder, but 
	performs different operations on them. output[0] is the sum bit. output[1] is the generator and 
	output[2] is the propigator. This function is used in a look ahead carry adder. It performs the 
	proper boolean algebra to generate each value and then puts it into the output array. The array 
	is then returned. If three chars and a char array are not passed to the function then it
	will not perform the correct boolean alegbra; thus the output will be useless.
*/
char pfadder(char a, char b, char ci, char* output)
{
	output[0] = ((a ^ b) ^ ci);
	output[1] = (a & b);
	output[2] = (ci & (a | b));
	return *output;
}


/*
	The function rcadder4 performs the operations of a 4-bit ripple carry adder circuit. The function
	takes in eight characters which correspond to two 4-bit numbers and a character array which is
	to store the outputs of the addition plus the final carry. The funciton calls upon the fadder
	function to perform the bit addition for each of the corresponding bits. The funciton then
	puts each sum into one of the first four positions in the output4 array. Each full adder is passed
	the carry of the previous adder. If a bad input is passed, i.e. a non binary digit,then the whole
	function will no longer funciton correctly. Once all of the work is done the function will return
	the output4 array. 
*/
char rcadder4(char a0, char a1, char a2, char a3, char b0, char b1, char b2, char b3, char* output4)
{
	char output[] = {"00"};
	
	fadder(a0, b0, output4[4], output);
	output4[0] = output[0];
	fadder(a1, b1, output[1], output);
	output4[1] = output[0];
	fadder(a2, b2, output[1], output);
	output4[2] = output[0];
	fadder(a3, b3, output[1], output);
	output4[3] = output[0];
	output4[4] = output[1];
	return *output4;
}


/*
	The function lacadder4 simulates a 4-bit look ahead carry adder. It takes in eight characters which
	are two 4-bit numbers and a character array which holds the outputs and carry values once they are
	calculated. The function operates by calling the pfadder function to generate a sum, generator, and
	propigator value. Then by performing boolean algebra it can generate a carry. Once all four bits are 
	calculated the function will return the outputs and the final carry.
*/
char lacadder4(char a0, char a1, char a2, char a3, char b0, char b1, char b2, char b3, char* lacoutput)
{
	char laoutput[] = {"0000"};
	char laoutput2[] = {"0000"};
	char laoutput3[] = {"0000"};
	char laoutput4[] = {"0000"};

	pfadder(a0, b0, lacoutput[4], laoutput);
	laoutput[3] = (laoutput[1] | (laoutput[2] & lacoutput[5]));
	lacoutput[0] = laoutput[0];
	pfadder(a1, b1, laoutput[3], laoutput2);
	laoutput2[3] = (laoutput2[1] | (laoutput2[2] & laoutput[3]));
	lacoutput[1] = laoutput2[0];
	pfadder(a2, b2, laoutput2[3], laoutput3);
	laoutput3[3] = (laoutput3[1] | (laoutput3[2] & laoutput2[3]));
	lacoutput[2] = laoutput3[0];
	pfadder(a3, b3, laoutput3[3], laoutput4);
	laoutput4[3] = (laoutput4[1] | (laoutput4[2] & laoutput3[3]));
	lacoutput[3] = laoutput4[0];
	lacoutput[4] = laoutput4[3];
	
	return *lacoutput;
}


/*
	The function rcadder32 simulates a 32-bit ripple carry adder. The function takes in three
	character arrays which are two binary numbers and the last array is the sum of the other
	two arrays. The function makes calls to the 4-bit ripple carry adder and then puts the 
	outputs of the adder into the sum array. Once the array is filled it is then converted back
	to an integer by a call to the ConvertToInt funciton. Once the number is converted back to 
	integer form it is returned to main. If the arrays are not in binary form then the boolean
	algebra performed on them will probably be wrong. 
*/
int rcadder32(char* bin1, char* bin2, char* final)
{
	int finnum = 0;
	char output4[] = {"00000"};
		
	rcadder4(bin1[31], bin1[30], bin1[29], bin1[28], bin2[31], bin2[30], bin2[29], bin2[28], output4);
	final[31] = output4[0];
	final[30] = output4[1];
	final[29] = output4[2];
	final[28] = output4[3];
	rcadder4(bin1[27], bin1[26], bin1[25], bin1[24], bin2[27], bin2[26], bin2[25], bin2[24], output4);
	final[27] = output4[0];
	final[26] = output4[1];
	final[25] = output4[2];
	final[24] = output4[3];
	rcadder4(bin1[23], bin1[22], bin1[21], bin1[20], bin2[23], bin2[22], bin2[21], bin2[20], output4);
	final[23] = output4[0];
	final[22] = output4[1];
	final[21] = output4[2];
	final[20] = output4[3];
	rcadder4(bin1[19], bin1[18], bin1[17], bin1[16], bin2[19], bin2[18], bin2[17], bin2[16], output4);
	final[19] = output4[0];
	final[18] = output4[1];
	final[17] = output4[2];
	final[16] = output4[3];
	rcadder4(bin1[15], bin1[14], bin1[13], bin1[12], bin2[15], bin2[14], bin2[13], bin2[12], output4);
	final[15] = output4[0];
	final[14] = output4[1];
	final[13] = output4[2];
	final[12] = output4[3];
	rcadder4(bin1[11], bin1[10], bin1[9], bin1[8], bin2[11], bin2[10], bin2[9], bin2[8], output4);
	final[11] = output4[0];
	final[10] = output4[1];
	final[9] = output4[2];
	final[8] = output4[3];
	rcadder4(bin1[7], bin1[6], bin1[5], bin1[4], bin2[7], bin2[6], bin2[5], bin2[4], output4);
	final[7] = output4[0];
	final[6] = output4[1];
	final[5] = output4[2];
	final[4] = output4[3];
	rcadder4(bin1[3], bin1[2], bin1[1], bin1[0], bin2[3], bin2[2], bin2[1], bin2[0], output4);
	final[3] = output4[0];
	final[2] = output4[1];
	final[1] = output4[2];
	final[0] = output4[3];
	finnum = ConvertToInt(final);
	return finnum;
}


/*
	The function lacadder32 simulates a 32-bit look ahead carry adder. It accepts three inputs,
	two character arrays which represent binary numbers, bin1 & bin2, and a character array to input the sum
	into, final. The function calls the 4-bit look ahead carry adder to do the addition. Then it puts
	the outputed sum into the sum array. Once this is completed and the sum is converted back to an integer.
	The integer is then passed back to the main function.
*/
int lacadder32(char* bin1, char* bin2, char* final2)
{
	int finnum2 = 0;
	char lacoutput[] = {"00000"};
	
	lacadder4(bin1[31], bin1[30], bin1[29], bin1[28], bin2[31], bin2[30], bin2[29], bin2[28], lacoutput);
	final2[31] = lacoutput[0];
	final2[30] = lacoutput[1];
	final2[29] = lacoutput[2];
	final2[28] = lacoutput[3];
	lacadder4(bin1[27], bin1[26], bin1[25], bin1[24], bin2[27], bin2[26], bin2[25], bin2[24], lacoutput);
	final2[27] = lacoutput[0];
	final2[26] = lacoutput[1];
	final2[25] = lacoutput[2];
	final2[24] = lacoutput[3];
	lacadder4(bin1[23], bin1[22], bin1[21], bin1[20], bin2[23], bin2[22], bin2[21], bin2[20], lacoutput);
	final2[23] = lacoutput[0];
	final2[22] = lacoutput[1];
	final2[21] = lacoutput[2];
	final2[20] = lacoutput[3];
	lacadder4(bin1[19], bin1[18], bin1[17], bin1[16], bin2[19], bin2[18], bin2[17], bin2[16], lacoutput);
	final2[19] = lacoutput[0];
	final2[18] = lacoutput[1];
	final2[17] = lacoutput[2];
	final2[16] = lacoutput[3];
	lacadder4(bin1[15], bin1[14], bin1[13], bin1[12], bin2[15], bin2[14], bin2[13], bin2[12], lacoutput);
	final2[15] = lacoutput[0];
	final2[14] = lacoutput[1];
	final2[13] = lacoutput[2];
	final2[12] = lacoutput[3];
	lacadder4(bin1[11], bin1[10], bin1[9], bin1[8], bin2[11], bin2[10], bin2[9], bin2[8], lacoutput);
	final2[11] = lacoutput[0];
	final2[10] = lacoutput[1];
	final2[9] = lacoutput[2];
	final2[8] = lacoutput[3];
	lacadder4(bin1[7], bin1[6], bin1[5], bin1[4], bin2[7], bin2[6], bin2[5], bin2[4], lacoutput);
	final2[7] = lacoutput[0];
	final2[6] = lacoutput[1];
	final2[5] = lacoutput[2];
	final2[4] = lacoutput[3];
	lacadder4(bin1[3], bin1[2], bin1[1], bin1[0], bin2[3], bin2[2], bin2[1], bin2[0], lacoutput);
	final2[3] = lacoutput[0];
	final2[2] = lacoutput[1];
	final2[1] = lacoutput[2];
	final2[0] = lacoutput[3];
	finnum2 = ConvertToInt(final2);
	return finnum2;
}


/*
	The checkargs function checks the arguments of the function to make sure that they are truely
	integer values. Since the values come into the function as a character array, the function 
	checks the ASCII values to see if they corespond to the 0-9 values in the ASCII table. if 
	the values are not in that range an error message is sent out and the program terminates. The
	function will check each value to make sure it is in fact a digit. The function also checks 
	if a number is too large, but only in the billions or hundred million column of the number.
	The function does not check the negative number range.
*/
void checkargs(char *n1, char *n2)
{
	int size1 = sizeof(char)/sizeof(*n1);
	int size2 = sizeof(char)/sizeof(*n2);
	
	if(size1 >= 10 && (n1[0] >= '2' && n1[1] > '1')) {
		printf("This number is too big!!\n");
		exit(1);
	}
	while(*n1) {
		if(*n1 < 48 || *n1 > 57) {
			printf(" The arguments entered are not positive integer numbers!\n");
			exit(1);
		}
		*n1++;
	}
	if(size2 >= 10 && (n2[0] >= '2' && n2[1] > '1')) {
		printf("This number is too big!");
		exit(1);
	}
	while(*n2) {
		if(*n2 < 48 || *n2 > 57) {
			printf(" The arguments entered are not positive integer numbers!\n");
			exit(1);
		}
		*n2++;	
	}
	
}

/*
	The main function will take in two inputs and then, through calls to other funtions, try to
	add them. This is done by first converting them to integers, and then to binary form. After
	this is done the program will print out the integer and binary value of the number. The function
	then will make calls to two kinds of addition functions, ripple carry and look ahead carry, and
	print out the results. Once this is completed the program will terminate. The program will only
	perform correctly if two decimal numbers are inputed from the command line separated by a blank
	space.
*/
int main(int argc, char *argv[])
{
	checkargs(argv[1], argv[2]);
	char bin1[] = {"99999999999999999999999999999999"};
	char bin2[] = {"99999999999999999999999999999999"};
	char final[] = {"00000000000000000000000000000000"};
	char final2[] = {"00000000000000000000000000000000"};
	int n1 = atoi(argv[1]);
	int n2 = atoi(argv[2]);
	
	ConvertToBinary(n1, bin1);
	ConvertToBinary(n2, bin2);
	printf("n1:		%d	(%s)\n", n1, bin1);
	printf("n2:		%d	(%s)\n", n2, bin2);
	printf("n1 + n2(RCA):	%d	(%s)\n", rcadder32(bin1, bin2, final), final);
	printf("n1 + n2(LAC):	%d	(%s)\n", lacadder32(bin1, bin2, final2), final2);
	exit(0);
}
