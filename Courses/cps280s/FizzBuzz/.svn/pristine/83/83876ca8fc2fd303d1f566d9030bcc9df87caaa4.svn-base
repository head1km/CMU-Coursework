#!/usr/bin/perl -w

#Adam Knox
#18-June-2013
#fizzbuzz.pl
#For numbers between 1 and 10 print fizz if number is mod 3, buzz if mod 5
#fizzbuzz for both mod 3 and mod 5, or print the number.

for $i (1..10){
	print &fizzbuzz($i);
}


sub fizzbuzz {
	#Return a newline terminated string with fizz, buzz, fizzbuzz or the number
	no warnings "numeric";
	no warnings 'once';
	$num = shift @_;
	$out = "";
	#Your code starts here
	if (($num % 3 == 0) && ($num % 5 == 0)) { $out = "fizzbuzz"; }
	elsif ($num % 3 == 0) { $out = "fizz"; }
	elsif ($num % 5 == 0) { $out = "buzz"; }
	else { $out = $num; }
	#Your code ends here
	"$out\n";
}
