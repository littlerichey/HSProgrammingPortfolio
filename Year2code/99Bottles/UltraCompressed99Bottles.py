def p(c,d,e,g):
 print(c+d+l+c+d+s+e+g+a)
f=" of beer on the wall"
l=f+', '
a=f+'.'
s=" of beer, take 1 down pass it around, "
t=" bottle"
m=t+'s'
b=99
while b>2:
 p(str(b),m,str(b-1),m)
 b-=1
p('2',m,'1',t)
p('1',t,'0',m)
