# Definition of singly linked list:
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def rev(self,temp):

        prev=None
        curr=temp
        while curr:
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        
        return prev
    def addOne(self, head):
        if head.val<9 and head.next is None:
            head.val=head.val+1
            return head

        temp=head
        reverse=self.rev(temp)
        hold=reverse
        carry=1
        while reverse and carry!=0:
            reverse.val=reverse.val + carry

            if reverse.val<10:
                carry = 0
                break
            else:
                reverse.val=0
                reverse=reverse.next

        if carry==0:
            ans=self.rev(hold)
            return ans
        else:
            ans=self.rev(hold)
            first=ListNode(1,ans)
            return first

