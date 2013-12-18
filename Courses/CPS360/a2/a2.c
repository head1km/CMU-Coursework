// 3 or 4 variable karnaugh map minimizer
// created by Kyle Head

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define BINSIZE 3
#define AMAX 8
#define BMAX 16
	
void swap(char *str1, char *str2)
{
  char *temp = (char *)malloc((strlen(str1) + 1) * sizeof(char));
  strcpy(temp, str1);
  strcpy(str1, str2);
  strcpy(str2, temp);
  free(temp);
}  

char *ConvertToBinary(int num, char *bin)
{
	int i;
	int mask = 1;
	int size = BINSIZE;

	for (i = size - 1; i >= 0; i--, num >>= 1)
		bin[i] = (mask & num) + '0';

	bin[size] = '\0';
	
	return bin;
}

char *ConvertToBinary2(int num, char *bin)
{
	int i;
	int mask = 1;
	int size = BINSIZE + 1;

	for (i = size - 1; i >= 0; i--, num >>= 1)
		bin[i] = (mask & num) + '0';

	bin[size] = '\0';
	
	return bin;
}

int main(int argc, char *argv[])
{
	int type;
	int terms;
	int maxterm;
	int i;
	int i2;
	int i4;
	int i5;
	int i6;
	int j;
	int n;
	int tmp;
	char bin[BINSIZE + 1];
	char bin2[BINSIZE + 2];
	char inputsa[AMAX][BINSIZE + 1];
	char inputsb[BMAX][BINSIZE + 2];
	char tinputa[4][BINSIZE + 1];
	char tinputb[4][BINSIZE +1];
	char finputa[4][BINSIZE + 2];
	char finputb[4][BINSIZE +2];
	char finputc[4][BINSIZE + 2];
	char finputd[4][BINSIZE + 2];
	int row3a = 0;
	int row3b = 0;
	int row4a = 0;
	int row4b = 0;
	int row4c = 0;
	int row4d = 0;
	
	maxterm = 0;
	i2 = 0;
	type = getchar();
	if(type == 51) maxterm = 8;
	else if(type == 52) maxterm = 16;
	else exit(1);
	tmp = getchar();
	tmp = getchar();
	terms = tmp - '0';
	tmp = getchar();
	int values[terms];
	
	//-------------------reads inputs---------------
	while(i2 < terms){
		scanf("%d", &tmp);
		values[i2++] = tmp;
	}
	
	//--------------------converts to binary--------
	for(n = 0; n < i2; n++) {
		if(maxterm == AMAX) {
			ConvertToBinary(values[n], bin);
			strcpy(inputsa[n], bin);
		}
		else {
			ConvertToBinary2(values[n], bin2);
			strcpy(inputsb[n], bin2);
		}
	}
	
	//---------------------sorts into rows-------------
	for(n = 0; n < i2; n++) {
		if(maxterm == AMAX) {
			if(inputsa[n][0] == '0') {
				if(n != 0) {
					if(strcmp(tinputa[row3a], inputsa[n]) != 0) strcpy(tinputa[row3a++], inputsa[n]);
				}
				else strcpy(tinputa[row3a++], inputsa[n]);
			}
			else if(inputsa[n][0] == '1') { 
				if(n != 0) {
					if(strcmp(tinputb[row3b], inputsa[n]) != 0) strcpy(tinputb[row3b++], inputsa[n]);
				}
				else strcpy(tinputb[row3b++], inputsa[n]);
			}
		}
		else {
			if(inputsb[n][0] == '0' && inputsb[n][1] == '0') {
				if(n != 0) {
					if(strcmp(finputa[row4a], inputsb[n]) != 0) strcpy(finputa[row4a++], inputsb[n]);
				}
				else strcpy(finputa[row4a++], inputsb[n]);
			}
			else if(inputsb[n][0] == '0' && inputsb[n][1] == '1') {
				if(n != 0) {
					if(strcmp(finputb[row4b], inputsb[n]) != 0) strcpy(finputb[row4b++], inputsb[n]);
				}
				else strcpy(finputb[row4b++], inputsb[n]);
			}
			else if(inputsb[n][0] == '1' && inputsb[n][1] == '1') {
				if(n != 0) {
					if(strcmp(finputc[row4c], inputsb[n]) != 0) strcpy(finputc[row4c++], inputsb[n]);
				}
				else strcpy(finputc[row4c++], inputsb[n]);
			}
			else if(inputsb[n][0] == '1' && inputsb[n][1] == '0') {
				if(n != 0) {
					if(strcmp(finputd[row4d], inputsb[n]) != 0) strcpy(finputd[row4d++], inputsb[n]);
				}
				else strcpy(finputd[row4d++], inputsb[n]);
			}
		}
	}
		
//----------------sorts rows into gray code------------------
	i4 = 0;
	i5 = 0;
	if(maxterm == AMAX) {
		while(i4 < 4){
			if(i4 == 0) {
				if(strncmp(tinputa[i4], "000", 3) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(tinputa[j], "000", 3) == 0) swap(tinputa[j], tinputa[i4]);
					}
				}
			}
			else if(i4 == 1) {
				if(strncmp(tinputa[i4], "001", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputa[j], "001", 3) == 0) swap(tinputa[j], tinputa[i4]);
					}
				}
			}
			else if(i4 == 2) {
				if(strncmp(tinputa[i4], "011", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputa[j], "011", 3) == 0) swap(tinputa[j], tinputa[i4]);
					}
				}
			}
			else if(i4 == 3) {
				if(strncmp(tinputa[i4], "010", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputa[j], "010", 3) == 0) swap(tinputa[j], tinputa[i4]);
					}
				}
			} 
			i4++;
		}
		while(i5 < 4){
			if(i5 == 0) {
				if(strncmp(tinputb[i5], "100", 3) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(tinputb[j], "100", 3) == 0) swap(tinputb[j], tinputb[i5]);
					}
				}
			}
			else if(i5 == 1) {
				if(strncmp(tinputb[i5], "101", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputb[j], "101", 3) == 0) swap(tinputb[j], tinputb[i5]);
					}
				}
			}
			else if(i5 == 2) {
				if(strncmp(tinputb[i5], "111", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputb[j], "111", 3) == 0) swap(tinputb[j], tinputb[i5]);
					}
				}
			}
			else if(i5 == 3) {
				if(strncmp(tinputb[i5], "110", 3) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(tinputb[j], "110", 3) == 0) swap(tinputb[j], tinputb[i5]);
					}
				}
			}
			i5++;
		}
	}
	else {
		i6 = 0;
		while(i6 < 4) {
			if(i6 == 0) {
				if(strncmp(finputa[i6], "0000", 4) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(finputa[j], "0000", 4) == 0) swap(finputa[j], finputa[i6]);
					}
				}
			}
			else if(i6 == 1) {
				if(strncmp(finputa[i6], "0001", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputa[j], "0001", 4) == 0) swap(finputa[j], finputa[i6]);
					}
				}
			}
			else if(i6 == 2) {
				if(strncmp(finputa[i6], "0011", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputa[j], "0011", 4) == 0) swap(finputa[j], finputa[i6]);
					}
				}
			}
			else if(i6 == 3) {
				if(strncmp(finputa[i6], "0010", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputa[j], "0010", 4) == 0) swap(finputa[j], finputa[i6]);
					}
				}
			}
			i6++	;
		}
		i6 = 0;
		while(i6 < 4) {
			if(i6 == 0) {
				if(strncmp(finputb[i6], "0100", 4) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(finputb[j], "0100", 4) == 0) swap(finputb[j], finputb[i6]);
					}
				}
			}
			else if(i6 == 1) {
				if(strncmp(finputb[i6], "0101", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputb[j], "0101", 4) == 0) swap(finputb[j], finputb[i6]);
					}
				}
			}
			else if(i6 == 2) {
				if(strncmp(finputb[i6], "0111", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputb[j], "0111", 4) == 0) swap(finputb[j], finputb[i6]);
					}
				}
			}
			else if(i6 == 3) {
				if(strncmp(finputb[i6], "0110", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputb[j], "0110", 4) == 0) swap(finputb[j], finputb[i6]);
					}
				}
			}
			i6++	;
		}
		i6 = 0;
		while(i6 < 4) {
			if(i6 == 0) {
				if(strncmp(finputc[i6], "1100", 4) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(finputc[j], "1100", 4) == 0) swap(finputc[j], finputc[i6]);
					}
				}
			}
			else if(i6 == 1) {
				if(strncmp(finputc[i6], "1101", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputc[j], "1101", 4) == 0) swap(finputc[j], finputc[i6]);
					}
				}
			}
			else if(i6 == 2) {
				if(strncmp(finputc[i6], "1111", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputc[j], "1111", 4) == 0) swap(finputc[j], finputc[i6]);
					}
				}
			}
			else if(i6 == 3) {
				if(strncmp(finputc[i6], "1110", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputc[j], "1110", 4) == 0) swap(finputc[j], finputc[i6]);
					}
				}
			}
			printf("%d\n", i6);
			i6++	;
		}
		i6 = 0;
		while(i6 < 4) {
			if(i6 == 0) {
				if(strncmp(finputd[i6], "1000", 4) != 0) {
					for(j = 1; j < 4; j++) {
						if(strncmp(finputd[j], "1000", 4) == 0) swap(finputd[j], finputd[i6]);
					}
				}
			}
			else if(i6 == 1) {
				if(strncmp(finputd[i6], "1001", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputd[j], "1001", 4) == 0) swap(finputd[j], finputd[i6]);
					}
				}
			}
			else if(i6 == 2) {
				if(strncmp(finputd[i6], "1011", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputd[j], "1011", 4) == 0) swap(finputd[j], finputd[i6]);
					}
				}
			}
			else if(i6 == 3) {
				if(strncmp(finputd[i6], "1010", 4) != 0) {
					for(j = 0; j < 4; j++) {
						if(strncmp(finputd[j], "1010", 4) == 0) swap(finputd[j], finputd[i6]);
					}
				}
			}
			i6++;
		}
	}
	
	char tbins[maxterm][BINSIZE + 1];
	char fbins[maxterm][BINSIZE + 2];
//------------------finds covers------------------
	if(maxterm = AMAX) {
		for(i = 0; i < maxterm + 1;i++) {
			if(tinputa[0] != NULL) {
				if(tinputa[1] != NUll) strcpy(tbins[i], "00-");
				else if(tinputa[3] != NUll) strcpy(tbins[i], "0-0");
				else if(tinputb[0] != NUll) strcpy(tbins[i], "-00");
			}	 
		}
	}
//------------------outputs results---------------
}
