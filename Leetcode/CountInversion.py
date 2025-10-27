class Solution:
    def merge(self,nums,low,mid,high):
        l=low
        r=mid+1
        temp=[]
        c=0
        while l<=mid and r<=high:
            if nums[l]<=nums[r]:
                temp.append(nums[l])
                l+=1
            else:
                temp.append(nums[r])
                r+=1
                c+=(mid-l+1)
        
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



    def numberOfInversions(self, nums):

        a=self.mergesort(nums,0,len(nums)-1)
        return a
       

