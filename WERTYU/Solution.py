while(True):
    try:
        data = "`1234567890-=QWERTYUIOP[]\ASDFGHJKL;'ZXCVBNM,./"
        str = input()
        result = ''
        for character in (str):
            if (character == ' ' or character == ':'):
                result += character
            else:
                result += data[data.find(character) - 1]
        print(result)
    except EOFError:
        break