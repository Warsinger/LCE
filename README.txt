Live coding exercise done for a job interview. After the interview I went back and fixed a couple things that were trouble spots (mostly w/ Maven) and fleshed out the unit tests.

initial requirements
print #s from 1-100 if divisible by 3 print "fizz" if divisible by 5 print "buzz" if divisible by both then print "fizzbuzz"

step 2
allow arbitray range

step 3
make into a library
(this is where maven gave me some fits)

step 4
test
(probably should have done this earlier)
(solution caused problems with memory size)

step 5 (after the interview)
fixed maven problem which turned out to be the use of the wrong groupId
added chunking to avoid memory problem


still takes a long time to go from -MAXINT to MAXINT and running from maven cli as a JUnit test kills the memory in the test app output interceptor after a hundred million or so