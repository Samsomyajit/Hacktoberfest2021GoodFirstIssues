row = int(input("Enter The Number of Row: "))
alphabet = 65
i = 0
while(i < row):
    j = row - 1
    while(j>i):
        print(" ", end="")
        j -= 1
    k = 0
    while(k <= i):
        print(chr(alphabet + k), end="")
        k += 1
    l = i-1
    while(l >= 0 ):
        print(chr(alphabet + l), end="")
        l -= 1
    print()
    i += 1
