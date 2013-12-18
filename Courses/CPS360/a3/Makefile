####################################################################
# variables
####################################################################

CFLAGS= -g -O2 -Wall -Werror -D__EXTENSIONS__
LDFLAGS =
CC		= g++
LD		= g++
PROG		= driver

SRCS		= deck.cc card.cc player.cc driver.cc
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
	
deck.o: deck.h card.h

card.o: card.h

player.o: player.h card.h

driver.o: card.h player.h deck.h ARNG.h
