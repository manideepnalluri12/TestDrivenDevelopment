Name- Manideep Nalluri

# ICA8_TESTING
# How many urinals are free?
In men's public restrooms with urinals, there is this unwritten rule that you leave at 
least one urinal free between you and the next person peeing. 
You would select the urinal on the right instead of the middle, for instance, if 
there are three urinals and someone is currently urinating in the left one. That indicates 
that when observing this guideline, a maximum of 3 people can urinate simultaneously on
 public restrooms with 5 urinals (Only 2 if the first person pees into urinal 2 or 4).

# Your task:
You need to write a function that returns the
maximum of free urinals as an integer according to the unwritten rule.
# Input
A String containing 1s and 0s
(Example: 10001 ) (1 <= Length <= 20).
This string can come from the keyboard or
a file called urinal.dat. The program will
continue processing until a -1 or <eof> is reached.
(This means you handle unusual
input without crashing.)
A one stands for a taken urinal and a
zero for a free one.
# Output
If input is the keyboard, print the
results to the screen. If input is from a file,
output to rule.txt. If the file rule.txt already
exists, increment a counter and rename the file
using the following rule pattern: rule1.txt,
rule2.txt, etc.

# Examples
10001 returns 1 (10101)
1001 returns 0 (1001)
00000 returns 3 (10101)
0000 returns 2 (1001)
01000 returns 1 (01010 or 01001)