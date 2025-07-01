# RMI_JAVA

# 🧮 Calculadora Distribuída com Java RMI

Este repositório contém uma aplicação cliente-servidor desenvolvida em **Java**, utilizando **RMI (Remote Method Invocation)** para comunicação remota.

O servidor oferece uma calculadora com quatro operações básicas, e múltiplos clientes podem se conectar simultaneamente ao serviço.

---

## 📁 Estrutura do Projeto

calculadora-rmi/
├── servidor/
│ ├── calculadora/
│ │ ├── ICalculadora.java # Interface remota
│ │ └── Calculadora.java # Implementação do serviço
│ └── Servidor.java # Classe principal do servidor
│
├── cliente/
│ ├── calculadora/
│ │ └── ICalculadora.java # Interface remota (mesma do servidor)
│ └── Cliente.java # Classe principal do cliente
│
└── README.md
---

## ⚙️ Requisitos

- Java JDK 8 ou superior
- Nenhuma biblioteca externa
- Terminal para compilar e executar os arquivos `.java`

---

## 🚀 Como Executar

### 1. Compile os projetos

Abra dois terminais diferentes para compilar o servidor e o cliente.

#### 🔧 Servidor

```bash
cd servidor
javac calculadora/*.java Servidor.java
💻 Cliente
bash
Copiar
Editar
cd cliente
javac calculadora/ICalculadora.java Cliente.java
2. Execute o servidor
No terminal do servidor:

bash
Copiar
Editar
cd servidor
java Servidor
O servidor:

Escutará na porta 1099 (padrão do RMI)

Registrará o serviço com o nome fixo: "CalculadoraService"

Exibirá no console cada operação solicitada pelos clientes

3. Execute o cliente
No terminal do cliente:

bash
Copiar
Editar
cd cliente
java Cliente
O cliente:

Solicita o IP ou hostname do servidor (localhost, por exemplo)

Pede ao usuário a operação desejada (soma, subtrai, multiplica, divide)

Solicita os dois números

Exibe o resultado recebido do servidor

Continua até o usuário digitar sair

🧪 Exemplo de Uso
text
Copiar
Editar
Digite o IP ou hostname do servidor (ex: 127.0.0.1 ou localhost): localhost

== Cliente RMI da Calculadora ==
Operações disponíveis: soma, subtrai, multiplica, divide
Digite 'sair' para encerrar

Operação: multiplica
Digite o primeiro número: 3
Digite o segundo número: 4
Resultado: 12.0
