import math
import sys
file = sys.stdin

list = file.readline().split(" ")
q = int(list[0])
m = int(list[1])
s = int(list[2])
l = int(list[3])

seconds = 0

while(l>m):
    seconds += q
    l -= m

if (l>0):
    seconds += q
    s -= q*(m-l)
    l = 0

while (s > m):
    seconds += 1
    s -= m

if (s > 0):
    seconds += 1
    s = 0

print(seconds)