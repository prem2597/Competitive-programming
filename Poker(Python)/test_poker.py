import pytest
from poker import poker
import os
import sys
sys.path.append(os.getcwd())


@pytest.mark.parametrize('a, check', [
	([["2D","3S","5S","4C","6D"], ["3H","9S","7H","TC","KD"], ["AH","3H","9H","5H","QH"], ["AD","KD","TD","JD","QD"]], ['AD', 'KD', 'TD', 'JD', 'QD']),
	([["2D","3S","5S","4C","6D"], ["2D","7D","3D","JD","QD"], ["3H","9S","7H","TC","KD"], ["5S","8C","2H","9C","3S"]], ['2D', '7D', '3D', 'JD', 'QD']),
	([["2D","3S","5S","4C","6D"], ["3H","9S","7H","TC","KD"], ["QH","2H","4H","QS","KS"]], ['2D', '3S', '5S', '4C', '6D']),
	([["2D","9C","AS","AH","AC"], ["3D","6D","7D","TD","QD"]], ['3D', '6D', '7D', 'TD', 'QD']),
	([["5H","5C","6S","7S","KD"], ["2C","3S","8S","8D","TD"]], ['2C', '3S', '8S', '8D', 'TD'])
	])
def test_poker(a, check):
	assert poker(a) == check
