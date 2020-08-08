# In the card game poker, a hand consists of five cards and are ranked, from lowest to highest, in the 
# following way:
# High Card: Highest value card.
# One Pair: Two cards of the same value.
# Two Pairs: Two different pairs.
# Three of a Kind: Three cards of the same value.
# Straight: All cards are consecutive values.
# Flush: All cards of the same suit.
# Full House: Three of a kind and a pair.
# Four of a Kind: Four cards of the same value.
# Straight Flush: All cards are consecutive values of the same suit.
# Royal Flush: Ten, Jack, Queen, King, Ace, in the same suit.
# More on Poker Hands (https:#en.wikipedia.org/wiki/List_of_poker_hands)
# The cards are valued in the order:
# 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace

# If two players have the same ranked hands then the rank made up of the highest value wins; for 
# example, a pair of eights beats a pair of fives. But if two ranks tie, for 
# example, both players have a pair of queens, then highest cards in each hand are compared; if the highest 
# cards tie then the next highest cards are compared, and so on. 

def tie(faces) :
    faces.reverse()
    return faces

def kind(hand):
    dic = {}
    for i in hand:
        if i in dic:
            dic[i] += 1
        else :
            dic[i] = 1

    original = len(set(hand))
    b = 0
    if original == 2:
        if 4 in dic.values():
            for i in hand:
                if dic[i] == 4 :
                    b += i
                    break
            return 800+b
        else :
            for i in hand:
                if dic[i] == 3:
                    b+=i
                    break
            return 700+b
    elif original==3:
        if 3 in dic.values():
            for i in hand:
                if dic[i] == 3:
                    b += i
                    break
            return 400 + b
        else :
            for i in hand:
                if dic[i] == 2 and b < i:
                    b = i
            return 300 + b
    elif original == 4:
        for i in hand:
            if dic[i] == 2:
                b += i
                break
        return 200 + b
    else:
        return 100 + hand[4]

def is_flush(hand, faces, suits):
    if len(set(suits)) == 1:
        faces= sorted(faces)
        c = 0
        for i in range(len(faces) - 1):
            if abs(faces[i] -faces[i+1]) == 1:
                c = c + 1
        if c == 4:
            return royal_flush(faces)
        else :
            return 600 + faces[4]
    else :
        return is_straight(hand, faces, suits)



def is_straight(hand, faces, suits):
    c = 0
    faces.sort()
    faces1 = faces[:]
    if faces1[4] == 14:
        faces1[4] = 1
    faces1 = sorted(faces1)

    for i in range(len(faces1)):
        if faces1[i] <= 5 or faces1[i] == 14 :
            if faces1[i] == 14:
                i = 1
    
    for i in range(len(faces)-1):
        d = faces1[i]-faces1[i+1]
        if d==(-1):
            c = c + 1
    
    if c == 4 and len(set(suits)) > 1:
        return 500+faces1[4]
    else:
        return kind(faces)

def royal_flush(faces):
    c = 0
    if("A" in faces and "K" in faces and "Q" in faces and "J" in faces and "T" in faces):
        c = 1
    if c > 0:
        return 1000
    else :
        return 900

def is_str_flush(list1):
    if royal_flush(list1) == False:
        return True
    else:
        return False

def hand_rank(hand):
    faces = []
    suits = []
    current = {"A":14, "K":13, "Q":12, "J": 11, "T": 10, "9":9, "8":8, "7":7, "6":6, "5":5, "4":4, "3":3, "2":2}
    for i in range(len(hand)):
        faces.append(current[hand[i][0]])
        suits.append(hand[i][1])
    first = is_flush(hand, faces, suits)
    faces1 = tie(faces)
    return first, faces1


def poker(hands):
    '''
        Input: List of 2 or more poker hands
               Each poker hand is represented as a list
               Print the hands to see the hand representation

        Output: Return the winning poker hand
    '''
    # Your code goes here
    return max(hands, key=hand_rank)
