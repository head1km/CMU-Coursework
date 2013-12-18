CDFLAGS	= -g -Wall -Werror
LDFLAGS	=
CC	= gcc
LD	= gcc

TARG	= sharedraw
OBJS	= sharedraw.o
TARG2	= sharedsm
OBJS2	= sharedsm.o

all:	$(TARG) $(TARG2)

$(TARG): $(OBJS)
	$(LD) $(LDFLAGS) $(OBJS) -o $(TARG)
$(TARG2): $(OBJS2)
	$(LD) $(LDFLAGS) $(OBJS2) -o $(TARG2)

clean:
	rm -rf $(TARG) $(OBJS) $(TARG2) $(OBJS2) a.out
