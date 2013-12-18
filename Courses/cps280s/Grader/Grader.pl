#!/usr/bin/perl

#Kyle Head
#22-September-2013
#Grader.pl
# Grader.pl addes up the scores for every person in a class and then converts
# Their scores to a letter grade. The program accepts the first argument given
# as a file to be parsed. Given that the file is in the format specified in the
# homework it will add up the numbers given into a total grade. This grade will
# then be converted to a letter grade. The program then outputs to the Graded
# file in the format specified.  

my @names;
my $possible = 440;

open my $fh, "<", $ARGV[0]  || die "Can't open $argv[0]: $!";
open my $graded, ">", "Graded" || die "Can't open Graded: $!";
my @grades = <$fh>;

my @grades = sort {lc($a) cmp lc($b)} @grades;
@totals = map {
  my @f = split ",";
  $name = join " ", $f[1], $f[0];
  push @names, $name;
  my $total;
  $total += $_ for splice @f, 2;
  $total = $total / $possible * 100;
  $total;
} @grades;
@totals = map {
	my $grade;
	if ($_ >= 92 && $_ <= 100)
	{
		$grade = "A";
	}
	elsif ($_ >= 90 && $_ < 92)
	{
		$grade = "A-";
	}
	elsif ($_ >= 88 && $_ < 90)
	{
		$grade = "B+";
	}
	elsif ($_ >= 82 && $_ < 88)
	{
		$grade = "B";
	}
	elsif ($_ >= 80 && $_ < 82)
	{
		$grade = "B-";
	}
	elsif ($_ >= 78 && $_ < 80)
	{
		$grade = "C+";
	}
	elsif ($_ >= 72 && $_ < 78)
	{
		$grade = "C";
	}
	elsif ($_ >= 70 && $_ < 72)
	{
		$grade = "C-";
	}
	elsif ($_ >= 68 && $_ < 70)
	{
		$grade = "D+";
	}
	elsif ($_ >= 62 && $_ < 68)
	{
		$grade = "D";
	}
	elsif ($_ >= 60 && $_ < 62)
	{
		$grade = "D-";
	}
	else
	{
		$grade = "E";
	}
	$grade;
} @totals;
for(my $i = 0; $i <= ($#totals); $i++){
	print { $graded } "$names[$i]: $totals[$i]\n";
}
close $graded || die "Can't close Graded: $!";
