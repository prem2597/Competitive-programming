# bestQuiz(a)
# Write the function bestQuiz(a), which takes a rectangular 2d list of numbers that represents a 
# gradebook, where each column represents a quiz, and each row represents a student, and each value 
# represents that student's score on that quiz (except -1 indicates the student did not take the quiz). 
# For example:

#   a = [ [ 88,  80, 91 ],
#         [ 68, 100, -1 ]
#       ]

# This list indicates that student0 scored 88 on quiz0, 80 on quiz1, and 91 on quiz2. Also, student1 
# scored 68 on quiz0, 100 on quiz1, and did not take quiz2. The function returns the quiz with the 
# highest average. In this case, quiz0 average is 78, quiz1 average is 90, and quiz2 average is 91 (since 
# we ignore the -1). Thus, quiz2 is the best, and so the function returns 2 in this case. You are not 
# responsible for malformed input, except you should return None if there are no quizzes. Also, resolve 
# ties in favor of the lower quiz number. Here is a test function for you: 
# a = [ [ 88,  80, 91 ],
#       [ 68, 100, -1 ]]
# assert(bestQuiz(a) == 2)
# a = [ [ 88,  80, 80 ],
#       [ 68, 100, 100 ]]
# assert(bestQuiz(a) == 1)
# a = [ [88, -1, -1 ],
#       [68, -1, -1 ]]
# assert(bestQuiz(a) == 0)
# a = [ [-1, -1, -1 ],
#       [-1, -1, -1 ]]
# assert(bestQuiz(a) == None)
""""
@author Prem
"""

def bestQuiz(a):
	# pass
	# Your code goes here
	flag = False
	for i in range(len(a[0])):
		for j in range(len(a)):
			if a[j][i] != -1:
				flag = True
	if flag :
		max = -1
		result1 = -1
		result2 = -1
		for i in range(len(a[0])):
			count = 0
			sum = 0
			x = 0
			for j in range(len(a)):
				if a[j][i] != -1:
					sum += a[j][i]
					count = count + 1
			if count > 0 :
				x = sum/count
			max = i
			if x > result1:
				result1 = x
				result2 = max
			elif x == result1 :
				result2 = min(x, result2)
		return result2
		






