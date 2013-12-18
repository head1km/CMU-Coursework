CDFLAGS	= -g -Wall -Werror
LDFLAGS	= -lpthread -lrt
CC	= gcc
LD	= gcc

TARG	= prodcons
OBJS	= prodcons.o

all:	$(TARG)

$(TARG): $(OBJS)
	$(LD) $(LDFLAGS) $(OBJS) -o $(TARG)

clean:
	rm -rf $(TARG) $(OBJS) a.out
