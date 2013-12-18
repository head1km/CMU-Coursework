#!/usr/bin/perl

#Find all files that fit given pattern in given directory and all directories
sub Find_All {                                                                                                 #A
        #The given directory
 $dir = shift @_;                                                                                       #B
        #The given pattern
 $pat = shift @_;                                                                                      #C
        #Assume current working dir if no dir given
 $dir = cwd if not defined $dir;                                                              #D
        #Assume pattern should match all files if no pattern given
 $pat = "*" if not defined $pat;                                                               #E
        #Change into given directory
 chdir $dir;                                                                                                #F
        #Find all files that match the pattern
 @Files = glob $pat;                                                                               #G
        #Fore each file found
 for my $file (@Files) {                                                                            #H
                #If not a directory
 if (not -d $file) {                                                                                #I
                        #Full path to file
 $fullPath = cwd . "/$file";                                                        #J
                        #Add full path to file to array
 push @return, $fullPath;                                                       #K
 }                                                                                                          #L
 }                                                                                                                  #M
        #Find all files and directories
 @Everything = glob "*";                                                                          #N
        #For each potential directory in array
 for my $Pdir (@Everything) {                                                                 #O
                #If this is a directory
 if (-d $Pdir) {                                                                                     #P
                        #Call ourself with new found directory and given path
 push @return, &Find_All($Pdir,$pat);                                 #Q
 }                                                                                                          #R
 }                                                                                                                  #S
        #Return array with files found
 return @return;                                                                                        #T
}                                                                                                                          #U 