n = input('Input a String to have permutated: ')
s= [('+'+n)]
p= []
while (len(s)>0):
	t = s.pop()
	if ( t[len(t)-1]=='+'):
		p.append(t[:len(t)-1])
	else:
		i=0
		g=True 
		while(g):
			if(t[i:i+1]=='+'):
				g=False
			else:
				i+=1
		for j in range(i+1,len(t)):
			s.append(t[0:i]+t[j:j+1]+t[i:j]+t[j+1:len(t)])
c=0
while(len(p)>0):
	print(p.pop()+',', end=' ')
	c+=1
print(c)
				