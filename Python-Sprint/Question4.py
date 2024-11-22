#Calculate Armstrong Number
a=int(input("Enter a number"))
m=a
s=0
while m!=0:
    d=m%10
    s=s+(d*d*d)
    m=m/10
if s==a:
    print("Armstrong")
else:
    print(" Not Armstrong")
    