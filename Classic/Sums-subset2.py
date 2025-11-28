def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        return
   
            
    a.append(givenarr[i])
    sums+=givenarr[i]
    
    if target==sums:
        if a.copy() not in res:
            res.append(a.copy())
            
    totalsum(i+1,a,res,givenarr,target,sums,n)
    
    sums-=givenarr[i]
    a.pop()
    
    totalsum(i+1,a,res,givenarr,target,sums,n)
    


a=[]
res=[]
givenarr=[1,2,1]
sums=0
target=2
n=3
totalsum(0,a,res,givenarr,target,sums,n)

print(res)
