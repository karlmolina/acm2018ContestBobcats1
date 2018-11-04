import sys
#file = open("in.txt", "r")
file = sys.stdin
numLines = file.readline()

product = 0

for index, line in enumerate(file):
    line.rstrip("\n")
    line = line.split(" ")
    line[1] = line[1].strip('\n')
    product += float(line[0])*float(line[1])

print("{:.3f}".format(product))