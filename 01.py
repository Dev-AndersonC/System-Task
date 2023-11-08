import os

caminho = os.path.join('Desktop', 'Curso', 'Hello')

arquivo, diretorio = os.path.split(caminho)

print(f'Diretorio:{arquivo}')
print(f'Arquivo: {diretorio}')