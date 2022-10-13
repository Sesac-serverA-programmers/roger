import heapq as hq

heap = []

hq.heappush(heap, 4)
hq.heappush(heap, 1)
hq.heappush(heap, 7)
hq.heappush(heap, 3)
hq.heappush(heap, 2)
print(heap)
# print(heap.pop(0))
print(hq.heappop(heap))
print(heap)