# 🎮 Game Java — Jogo de Sobrevivência

Jogo de sobrevivência por turnos desenvolvido em Java com interface gráfica via `JOptionPane`.  
Projeto criado como exercício prático de lógica de programação, estruturas de controle e organização de código orientado a métodos.

---

## 🕹️ Como jogar

- Seu personagem começa com **10 de energia**
- A cada turno você escolhe uma ação: **Caçar**, **Comer** ou **Dormir**
- O objetivo é atingir **10 de experiência** antes de:
  - Ficar sem energia (energia = 0)
  - Estar com muita fome (fome ≥ 10)
  - Estar muito cansado (cansaço ≥ 10)

### Ações disponíveis

| Ação    | Efeito |
|---------|--------|
| 🏹 Caçar  | -2 energia, +1 fome, +1 cansaço, +1 experiência |
| 🍖 Comer  | -1 fome, +1 energia |
| 😴 Dormir | -1 cansaço, +1 energia |

---

## ⚙️ Tecnologias utilizadas

- Java (JDK 17+)
- `javax.swing` (JOptionPane para interface gráfica)
- Apache NetBeans IDE

---

## ▶️ Como executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/game-java-sobrevivencia.git
```
2. Abra o projeto no NetBeans (ou qualquer IDE Java)
3. Execute a classe `Jogo.java`

---

## 📁 Estrutura do projeto

```
src/
└── com/mycompany/gamejava/
    └── Jogo.java   ← classe principal com toda a lógica do jogo
```

---

## 💡 Conceitos praticados

- Variáveis estáticas e escopo
- Estruturas de repetição (`while`)
- Estruturas de decisão (`switch`, `if/else`)
- Modularização com métodos `void`
- Passagem de parâmetros por valor em Java
- Interface gráfica simples com `JOptionPane`

---

## 👨‍💻 Autor

**Gabriel** — Estudante de Desenvolvimento de Software, buscando oportunidade de estágio.  
📧 [seu-email@email.com] | 💼 [linkedin.com/in/seu-perfil]
