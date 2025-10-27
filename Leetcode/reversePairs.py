// brute force
class Solution:
    def reversePairs(self, nums: List[int]) -> int:
        count=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i] > 2*nums[j]:
                    count+=1
        
        return count

//optimal
class Solution:
    def merge(self,nums,low,mid,high):
        l=low
        r=mid+1
        temp=[]
        j=mid+1
        c=0

        for i in range(low,mid+1):
            while j<=high and nums[i] > 2*nums[j]:
                j+=1
            c+=(j-(mid+1))
        while l<=mid and r<=high:
            if nums[l]<=nums[r]:
                temp.append(nums[l])
                
                l+=1
            else:
                temp.append(nums[r])
                r+=1
                
        
        while l<=mid:
            temp.append(nums[l])
            l+=1
        while r<=high:
            temp.append(nums[r])
            r+=1
        
        for i in range(len(temp)):
            nums[low+i] = temp[i]
        
        return c

    def mergesort(self,nums,low,high):
        count=0
        if low<high:

            mid = (low+high)//2
            count+=self.mergesort(nums,low,mid)
            count+=self.mergesort(nums,mid+1,high)
            count+=self.merge(nums,low,mid,high)

        return count
    def reversePairs(self, nums: List[int]) -> int:
        a=self.mergesort(nums,0,len(nums)-1)

        return a
