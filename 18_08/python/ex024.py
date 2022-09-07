 #import math #importo a biblioteca math inteira
 #from math import log #só importo log da biblioteca math
 #from math import log, ceil #só importo log e ceil de math
 #math ceil = arredonda pra cima
 #math floor = arredonda pra baixo
 #math trunc = trunca (deleta números depois da vírgula)
 #math pow = expoente
 #math sqrt = raiz quadrada
 #math factorial = fatorial
import math
n = int(input("Digite um número: "))
r = int(math.sqrt(n))
print("A raiz de {} é {}.".format(n, r))
