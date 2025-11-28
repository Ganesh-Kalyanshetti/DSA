def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        if target==sums:
            res.append(a.copy())
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


#### for only one
def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        if target==sums:
            return a.copy()
        return None
    
    a.append(givenarr[i])
    sums+=givenarr[i]

    ans=totalsum(i+1,a,res,givenarr,target,sums,n)
    if ans is not None:
        return ans
    sums-=givenarr[i]
    a.pop()
    
    ans=totalsum(i+1,a,res,givenarr,target,sums,n)
    
    if ans is not None:
        return ans
    return None

a=[]
res=[]
givenarr=[1,2,1]
sums=0
target=2
n=3
b=totalsum(0,a,res,givenarr,target,sums,n)

print(b)
