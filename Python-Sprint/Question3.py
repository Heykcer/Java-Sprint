#Check for Prime
a=int(input("Enter a number"))
c=0
for i in range(1,a,1):
    if a%i==0:
        c=c+1
if c==2:
    print("Prime number")
else:
    print("Not Prime Number")