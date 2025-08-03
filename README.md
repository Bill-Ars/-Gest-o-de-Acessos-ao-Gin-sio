# 🏋️‍♂️ Sistema de Gestão de Acessos ao Ginásio – Java POO

Este projeto Java implementa um sistema de controle de acessos e cálculo de mensalidades 
para diferentes tipos de membros de um ginásio (academia), utilizando conceitos 
de **Programação Orientada a Objetos (POO)** como herança, classes abstratas, polimorfismo e sobreposição de métodos.

---

## 📌 Enunciado do Exercício

Desenvolver um programa que:

- Possua uma classe abstrata `Membro`, com os atributos:
  - `id` (inteiro)
  - `nome` (String)
  - `mensalidade base` de 2000 MZN

- Implemente **três tipos de membros**:

### 🔹 MembroLivreTransito
- Atributo extra: `temEstacionamento` (boolean)
- Paga +30% sobre a mensalidade base

### 🔹 MembroPiscina
- Atributo extra: `temToalha` (boolean)
- Paga +10% sobre a mensalidade base

### 🔹 MembroAulas
- Atributo extra: Lista de `Aulas`, onde cada aula possui:
  - `nome da aula` (ex: Yoga)
  - `número da sala`
- Paga +5% da mensalidade base **por aula frequentada**

Cada subclasse deve implementar o método:
```java
double calculaMensalidade();
