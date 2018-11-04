file = open("inG.txt", "r")

firstLine = file.readline().split(" ")

numHouses = int(firstLine[0])
safeHouses = []

for line in file:
    safeHouses.append(int(line))

rating = 0
for house in range(1, numHouses+1):
    # nextSafe = house-1
    # if nextSafe != 1 and nextSafe != 0:
    #     count = 0
    #     while nextSafe not in safeHouses:
    #         nextSafe -= 1
    #         count += 1
    #     rating += (nextSafe-count)
    ##
    nextSafe = house+1
    if nextSafe != numHouses and nextSafe != numHouses+1:
        while nextSafe not in safeHouses:
            nextSafe += 1
        rating += numHouses-nextSafe

print(rating)
