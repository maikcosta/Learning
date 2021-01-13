class Pessoa():
    def __init__(self, _nome,_sobrenome,_idade):
        self.nome = _nome
        self.sobrenome = _sobrenome
        self.idade = _idade
    def apresentar(self):
        print(f' O eu sou  {self.nome} {self.sobrenome} e tenho {self.idade} anos!')

class Cachorro:
    def __init__(self, _nome, _raca,_dono) :
        self.nome = _nome
        self.raca = _raca
        self.dono = _dono
    def latir(self):
        print('Auau!')
    def mostrar_dono(self):
        print(f'O Dono de {self.nome} é {self.dono}')


pessoa1 = Pessoa('Maik','Costa', '36')
pessoa2 = Pessoa('Igor','Costa', '7')

cachorro1 = Cachorro('Trovão','Dalmata','Max')
cachorro2 = Cachorro('Nick','York','Nelly')

pessoa1.apresentar()
pessoa2.apresentar()

cachorro1.latir()
cachorro2.latir()

cachorro1.mostrar_dono()
cachorro2.mostrar_dono()