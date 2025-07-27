class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        start = 1
        end = max(piles)
        while start < end:
            mid = (start+end)//2
            #find f(mid)
            timeEat = 0
            for pile in piles:
                if pile % mid == 0:
                    timeEat += pile // mid
                else:
                    timeEat += pile//mid + 1
            
            #adjust boundary
            if timeEat <= h:
                end = mid
            else:
                start = mid + 1
        return start

        