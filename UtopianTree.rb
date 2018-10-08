#!/bin/ruby


# Utopian Tree
# There are 3 test cases.

# In the first case (N=0), the initial height (H=1) of the tree remains unchanged.

# In the second case (N=1), the tree doubles in height and is 2 meters tall after the spring cycle.

# In the third case (N=4), the tree doubles its height in spring (H=2), then grows a meter in summer (H=3), then doubles after the next spring (H=6), and grows another meter after summer (H=7). Thus, at the end of 4 cycles, its height is 7 meters.
# Sample Input

# 3
# 0
# 1
# 4
# Sample Output

# 1
# 2
# 7
t = gets.strip.to_i

for a0 in (0..t-1)
    height = 1
    n = gets.strip.to_i
    for num in (1..n)
        if num % 2 == 0 #its even, so adds 1
            height += 1
        else
            height *= 2
            
        end
    end
    puts height
end


#usig bitwise:
t = gets.strip.to_i
for a0 in (0..t-1)
    n = gets.strip.to_i
    puts ~(~1<<(n>>1)) << n%2
end
