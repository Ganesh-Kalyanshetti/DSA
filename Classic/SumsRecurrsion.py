def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        if target==sums:
            for j in a:
                res.append(j)
        return
    
    a.append(givenarr[i])
    sums+=givenarr[i]
    
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
