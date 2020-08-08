import pytest
from bestquiz import bestQuiz
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('a, check', [

	([ [ 88,  80, 91 ],
		[ 68, 100, -1 ]],2),
	([ [ 80,  91, 82 ],
		[ -1, -1, 100 ]],1),
	([ [ 88,  89, 90 ],
		[ -1, -1, -1 ]],2),
	([ [ 80, 88,  80],
		[ 100, 68, 100]],0),
	([ [-1,  -1, -1 ],
		[-1, -1, -1 ]],None),

	])
def test_bestquiz(a, check):
	assert bestQuiz(a) == check

