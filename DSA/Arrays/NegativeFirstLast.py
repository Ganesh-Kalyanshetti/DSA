a=[1,3,-1,-6,2,5,-1]
n=len(a)
print(a)
j=0
    
for i in range(n):
    if a[i]<0:
        a[i],a[j]=a[j],a[i]
        j+=1
        
print(a)
j=0

for i in range(n):
    if a[i]>=0:
        a[i],a[j]=a[j],a[i]
        j+=1
        
print(a)

a=sorted(a)
print(a)
a=sorted(a,reverse=True)
print(a)
