import sys
file = open("in.txt", "r")

#file = sys.stdin
numLines = int(file.readline())

product = 0

list = []
for line in file:
    line = line.rstrip("\n")
    list.append(int(line))

list = sorted(list)
list.reverse()
#print(list)

for index in range(numLines):
    if index + 1 > list[index]:
        print(index)
        break
else:
    print(numLines)
#
# for i in range(numLines + 1):
#     k = 0
#     for j in list:
#         if j >= i:
#             k +=1
#     #print("i",i,"k",k)
#
#     if k < i:
#         print(i-1)
#         break
# else:
#     print(numLines)