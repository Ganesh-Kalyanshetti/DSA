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

#for only one elemeent
def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        return
    a.append(givenarr[i])
    sums+=givenarr[i]
    
    if target==sums:
        if a.copy() not in res:
            res.append(a.copy())
        return True 
    if totalsum(i+1,a,res,givenarr,target,sums,n) == True:
        return True
    
    sums-=givenarr[i]
    a.pop()
    
    if totalsum(i+1,a,res,givenarr,target,sums,n) == True:
        return True
    return False

a=[]
res=[]
givenarr=[1,2,1]
sums=0
target=2
n=3
totalsum(0,a,res,givenarr,target,sums,n)

print(res)


# if u want count
def totalsum(i,a,res,givenarr,target,sums,n):
    if i==n:
        return 0
        
    a.append(givenarr[i])
    sums+=givenarr[i]
    
    if target==sums:
        return 1
            
    l=totalsum(i+1,a,res,givenarr,target,sums,n)
    
    sums-=givenarr[i]
    a.pop()
    
    r=totalsum(i+1,a,res,givenarr,target,sums,n)
    
    return l+r
a=[]
res=[]
givenarr=[1,2,1]
sums=0
target=2
n=3
result = totalsum(0,a,res,givenarr,target,sums,n)

print(result)
