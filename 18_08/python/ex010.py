n1 = int(input("Primeiro número: "))
n2 = int(input("Segundo número: "))
s = n1 + n2
m = n1 * n2
d = n1 / n2
di = n1 // n2
e = n1 ** n2
print("A soma é {}, o produto é {} e a divisão é {:.3f}".format(s, m, d))  #, end=" ") <-junta a linha e no whitespace posso colocar o que mostra no começo dela
print("A divisão inteira é {} e a potência é {}".format(di, e))  #\n <-quebra a linha
