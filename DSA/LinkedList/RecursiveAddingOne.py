# Definition of singly linked list:
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    carry=1
    def added(self,head):
        if head is None:
            return 1
        carry=self.added(head.next)
        head.val = head.val+carry

        if head.val<10:
            return 0
        else:
            head.val=0
            return 1    
        

    def addOne(self, head):
        
        ans = self.added(head)
          
        if ans == 1:
            first = ListNode(1,head)
            return first
        else:
            return head
