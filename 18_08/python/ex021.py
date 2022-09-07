d = int(input("Por quantos dias o carro foi alugado? "))
k = float(input("Quantos km o carro percorreu? "))
p = (d*60)+(k*0.15)
print("O carro foi alugado por {} dia(s). percorreu {} quilomêtro(s) e o preço a pagar é R${:.2f}".format(d, k, p))
