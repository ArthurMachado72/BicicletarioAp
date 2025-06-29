# BicicletarioAp.java

### 👤 Desenvolvedor: Arthur Machado  
### 🟡 Status: Em desenvolvimento

---

## 🎯 Objetivo do Projeto

O sistema de gerenciamento de aluguel de bicicletas foi projetado para auxiliar **Seu João**, que aluga bicicletas no Parque da Redenção. Atualmente, ele anota manualmente os dados em um caderno, incluindo o cadastro de clientes, as bicicletas numeradas e as horas de aluguel. Ao final do dia, ele calcula o valor total com base na taxa de **R$ 5,00 por hora de aluguel**.

O novo sistema automatiza essas tarefas, proporcionando maior **eficiência**, **precisão** e **segurança** no controle do negócio.

---

## ⚙️ Funcionalidades do Sistema

### 🚲 Cadastro de Bicicletas
- Registro de número de identificação
- Status (livre ou alugada)

### 👥 Cadastro de Clientes
- Nome, telefone, histórico de aluguéis

### 🔐 Cadastro de Usuários
- Acesso ao sistema via login e senha

### 🕐 Registro de Aluguéis
- Horário de início e término
- Associação entre cliente e bicicleta

### 💰 Cálculo do Valor Total Diário
- Valor automático com base nas horas de aluguel (R$ 5,00/hora)

---

## 👤 Descrição dos Usuários

- **Seu João**: Proprietário do negócio, gerencia todas as operações
- **Funcionários (Lucas e Daniel)**: Cadastram clientes e bicicletas, registram aluguéis

---

## 🧠 Regras de Negócio

- **Criptografia de senhas**
- **Restrição de aluguel**: Um cliente não pode alugar uma bicicleta já alugada (status A)

---

## ✅ Requisitos Funcionais

- Cadastro de bicicletas
- Cadastro de usuários
- Cadastro de clientes
- Registro de aluguéis
- Visualização dos aluguéis por cliente e por dia
- Tela de login com autenticação

---

## 🚫 Requisitos Não Funcionais

- Plataforma: Windows
- Linguagem: Java
- Banco de dados: MySQL (via MySQL Workbench)
- Não requer conectividade web

---

## 🌟 Destaques Técnicos Recentes

- 🔧 **Implementação de logging com SLF4J + Logback**
  - Logs organizados no terminal e em arquivos rotacionados
  - Arquivo `logback.xml` incluído com configuração de rotação automática

- 🧪 **Testes unitários com JUnit**
  - Classe `TestaBicicletarioApJUnit` testando a conexão com o banco de dados
  - Testes automatizados com Maven Surefire Plugin

- 📁 **Organização com Maven**
  - Projeto estruturado em padrão `src/main/java`, `src/test/java`, `src/main/resources`
  - Dependências gerenciadas no `pom.xml`

- 💻 **Versionamento com Git e GitHub**
  - Projeto controlado por Git
  - Commits claros e históricos de alterações bem definidos

---

## 🗃️ Registros Armazenados

- Nome dos usuários
- Nome dos clientes
- Número das bicicletas
- Histórico de aluguéis

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Maven
- Jakarta Persistence (JPA)
- MySQL Workbench
- NetBeans
- SLF4J + Logback
- JUnit 5

---

## 💡 Contribuições Futuras

- Interface gráfica com dashboards
- Exportação de relatórios em PDF
- Cadastro de bicicletas com QR Code   
