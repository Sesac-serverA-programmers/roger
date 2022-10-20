def solution(nums):

    l = len(nums)
    t = len(set(nums))

    if(l/2>t):
        return t
    else:
        return int(l/2)


print(solution([3,1,2,3]))
print(solution([3,3,3,2,2,4]))
print(solution([3,3,3,2,2,2]))
