####################################################################
# variables
####################################################################

CFLAGS= -g -O2 -Wall -Werror -D__EXTENSIONS__
LDFLAGS =
CC		= g++
LD		= g++
PROG		= ecc

SRCS		= ecc.cc
OBJS		= $(addsuffix .o, $(basename $(SRCS) .cc))

####################################################################
# rules
####################################################################

all: $(PROG)

$(PROG): $(OBJS)
		$(LD) $(LDFLAGS) $(OBJS) -o $(PROG)
		
%.o: %.cc
		$(CC) $(CFLAGS) -c $<
		
clean:
	rm -f *.o *~ $(PROG) 

#####################################################################
# dependencies
#####################################################################
#examples to be consulted when needed	
#deck.o: deck.h card.h

#card.o: card.h

#player.o: player.h card.h

#driver.o: card.h player.h deck.h ARNG.h
