# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import defaultdict, deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    # BFS
    def verticalOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        res = []
        if root == None:
            return res
        columns = defaultdict(list)
        q = collections.deque([(0,root)])

        min_x = math.inf
        max_x = -math.inf
        while q:
            x_coordinate, currNode = q.popleft()
            columns[x_coordinate].append(currNode.val)
            min_x = min(min_x,x_coordinate)
            max_x = max(max_x,x_coordinate)
            if currNode.left != None:
                q.append([x_coordinate-1,currNode.left])
            if currNode.right != None:
                q.append([x_coordinate+1,currNode.right])
        for col in range(min_x,max_x+1):
            res.append(columns[col])
        return res
