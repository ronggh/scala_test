// 集合元素不能重复，且是无序的
var numberSet = Set(1, 2, 3)
// Sets numberSet to the immutable set numberSet + 5
numberSet += 5
numberSet

// 移除元素
Set(1, 2, 3) - 2
// 添加元素，由于已在集合中，故集合不会变
Set(1, 2, 3) +1

// 无序访问
for(x <- Set(1, 2, 3, 4 ,5, 6)) println(x)
