# Sistema Calculadora RMI

Este projeto implementa um sistema distribuído de calculadora usando Java RMI (Remote Method Invocation), onde um servidor centraliza as operações matemáticas e múltiplos clientes podem se conectar remotamente para realizar cálculos.

## 🚀 Como Usar

### 1. Compilação

Abra dois terminais para compilar servidor e cliente separadamente.

```bash
# Terminal 1 - servidor
cd servidor
javac calculadora/*.java Servidor.java

# Terminal 2 - cliente
cd cliente
javac calculadora/ICalculadora.java Cliente.java
2. Executar o Servidor
No terminal do servidor:

bash
Copiar
Editar
cd servidor
java Servidor
O servidor irá:

Iniciar na porta 1099 (padrão RMI)

Registrar o serviço como "CalculadoraService"

Exibir no console as operações solicitadas pelos clientes

Aguardar conexões simultâneas

3. Executar o Cliente
No terminal do cliente:

bash
Copiar
Editar
cd cliente
java Cliente
O cliente irá:

Solicitar o IP ou hostname do servidor (ex: localhost)

Permitir escolher a operação (soma, subtrai, multiplica, divide)

Solicitar os dois operandos

Exibir o resultado retornado pelo servidor

Permitir envio contínuo de operações até digitar sair

🔧 Operações Disponíveis
Operação	Comandos aceitos	Descrição
Soma	soma, somar	Adição de dois números
Subtração	subtrai, subtrair	Subtração de dois números
Multiplicação	multiplica, multiplicar	Multiplicação de dois números
Divisão	divide, dividir	Divisão de dois números

📝 Exemplo de Uso
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
🛠 Possíveis Erros
Erro	Causa Provável	Solução
Connection refused	Servidor não está rodando ou IP errado	Inicie o servidor e use o IP correto
NotBoundException	Serviço não registrado corretamente	Verifique o nome "CalculadoraService"
ClassNotFoundException	Interface ICalculadora ausente ou pacote incorreto	Verifique a interface no cliente

🔒 Observações
Toda lógica dos cálculos está no servidor

Cliente apenas envia requisições e exibe resultados

Suporte a múltiplos clientes simultâneos
