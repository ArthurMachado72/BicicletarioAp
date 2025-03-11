# BicicletarioAp
Título do Projeto : BicicletarioAp.java
Desenvolvedor: Arthur Machado
Status : Em desenvolvimento
Objetivo do Projeto(Software):
O sistema de gerenciamento de aluguel de bicicletas foi projetado para auxiliar Seu João, que aluga bicicletas no Parque da Redenção. Atualmente, ele anota manualmente os dados em um caderno, incluindo o cadastro de clientes, as bicicletas numeradas e as horas de aluguel. Ao final do dia, ele calcula o valor total com base na taxa de R$ 5,00 por hora de aluguel. O novo sistema automatizará essas tarefas, proporcionando maior eficiência e precisão.

Funcionalidades do Sistema:
Cadastro de Bicicletas:
Permitirá registrar informações sobre cada bicicleta, como número de identificação e status (livre ou alugada).
Cadastro de Clientes:
Os dados dos clientes serão armazenados, incluindo nome, contato e histórico de aluguéis.
Cadastro de Usuários:
Administradores e funcionários poderão acessar o sistema com login e senha.
Registro de Aluguéis:
Será possível registrar os horários de início e término de cada aluguel, associando o cliente à bicicleta.
Cálculo do Valor Total Diário:
O sistema calculará automaticamente o valor total ganho por dia com base nas horas de aluguel.
3. Descrição dos Usuários
Os usuários do sistema incluem:

Seu João: O proprietário do negócio, responsável por gerenciar as operações.
Funcionários(Lucas,Daniel): Pessoas autorizadas a registrar aluguéis e atualizar informações no sistema.
4. Necessidades Observadas e Regras de Negócio
Algumas regras importantes:

Criptografia de Senhas:
Implementar um mecanismo de criptografia para proteger as senhas dos usuários.
Restrição de Cadastro:
Não permitir que um cliente seja cadastrado em uma bicicleta cujo status seja “alugada” (A).
5. Requisitos Funcionais
O sistema deve oferecer as seguintes funcionalidades:
*Cadastro de bicicletas
*Cadastro de usuários
*Cadastro de clientes
*Registro de aluguéis
*Visualização dos aluguéis (total por cliente e por dia)
*Tela de login com autenticação de usuário e senha
Requisitos Não Funcionais e Tecnologias:
Plataforma: O sistema será desenvolvido para Windows.
Linguagem de Programação: Utilizaremos Java.
Conectividade Web: Não é necessário acesso à web para o funcionamento do sistema.
Três Funcionalidades Principais:
Tela de Login de Usuário:
Os usuários deverão fazer login com suas credenciais para acessar o sistema.
Cadastro de Bicicletas:
Permite adicionar novas bicicletas e atualizar seus status (livre ou alugada).
Cálculo do Total de Aluguel e Gasto por Cliente:
Ao final do dia, o sistema apresentará o valor total ganho e o gasto individual de cada cliente.
Registros a Serem Armazenados
O sistema manterá registros dos seguintes dados:
*Nome dos usuários
*Nome dos clientes
*Número das bicicletas
*Histórico de aluguéis
9. Uso de Banco de Dados
O banco de dados escolhido para armazenar esses registros será o MySQL Workbench.
