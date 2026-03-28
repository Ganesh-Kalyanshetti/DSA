n,r,end = 4,4,3
a = [0]*n
count=0
def generate(pos,count):
    # global count
    if pos == n:
        return count+1
        
    if pos == n-1:
        if a[pos-1] != end:
            a[pos] = end
            return generate(pos+1,count)
        return count
    for i in range(1,r+1):
        if a[pos-1] == i:
            continue
        a[pos] = i
        count = generate(pos+1,count)
    
    return count
a[0]=1
count = generate(1,count)

print(count)
