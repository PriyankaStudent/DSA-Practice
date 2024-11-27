def maxProfit(prices):
    b,s=min(sorted(prices)),max(sorted(prices))
    p=sorted(prices)[::-1]
    if p==prices:
        return 0
    if prices.index(s)==0:
        s=0
        for i in range(1,len(prices)):
            s=max(prices[i],s)
        return s-b
    return s-b

prices=list(map(int,input().split()))
print(maxProfit(prices))