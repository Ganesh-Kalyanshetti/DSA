res = ["1","2","4","234"]
print(res)
ans="".join(res)
print(ans)
nums = [1, 2, 3]

print(nums)

#map(function,itrable) 
#used to itrates in nums and apply logic which is in function and save in given varibale
a =" ".join(map(str,nums))
print(a)
print(type(a))

#filter(function,itrable)
#used to itrates in nums and apply logic which is in function but saves only true va;lues 

b = filter(lambda x : x**2,nums)
print(b)
print(list(b))

