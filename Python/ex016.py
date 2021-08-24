r = float(input("Digite quantos reais você quer comprar em dólar: R$:")) #não deixar o usuário digitar $, pode dar problema, preço geralmente é float
print("Você pode comprar US${:.2f} com R${:.2f}.".format(r/5.27, r)) #dinheiro geralmente se usa 2 casas decimais, eu costumo usar 4 em tudo
