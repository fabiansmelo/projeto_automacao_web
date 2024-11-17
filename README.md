## Projeto de automação Web 
Projeto reaizado durante a formação em Q.A ministrada pela empresa Stefanini em 2021

### **Principais Componentes**
- **Page Objects:** 
  - Contém as classes que representam as páginas do sistema e seus elementos.
  - Ex.: `LoginPage` e `ComprasPage`.

- **Step Definitions:** 
  - Implementam os passos dos testes definidos nos arquivos `.feature`.
  - Ex.: `LoginSteps` e `ComprasSteps`.

- **Runners:**
  - Configuram e executam os testes.
  - Ex.: `TesteRunner`.

- **Features:**
  - Contém os cenários de teste escritos em **Gherkin**.
  - Ex.: `Login.feature` e `Compras.feature`.

- **Utils:**
  - Métodos utilitários para facilitar a automação.
  - Ex.: `MetodosUteis`.

---

## **Cenários de Teste Implementados**

### **Login**
- **Login com Sucesso:**
  - Usuário insere credenciais válidas e acessa o sistema com sucesso.
- **Login Inválido:**
  - Testa diferentes situações de erro, como:
    - Usuário bloqueado.
    - Credenciais incorretas.
    - Campos obrigatórios não preenchidos.

### **Compras**
- **Adicionar itens ao carrinho:**
  - Usuário adiciona um item ao carrinho e verifica se ele foi corretamente adicionado.

---

## **Ferramentas Utilizadas**
- **Linguagem:** Java  
- **Framework de Testes:** Cucumber  
- **Automação Web:** Selenium WebDriver  
- **Gerenciador de Dependências:** Maven  
- **IDE:** IntelliJ IDEA  

---

## **Como Executar o Projeto**

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git](https://github.com/fabiansmelo/projeto_automacao_web.git
  

2. Instale as dependências:
   ```bash
   mvn clean install

3. Execute os testes:
   ```bash
   mvn test

4. Para executar um cenário específico, use as tags no arquivo TesteRunner:
   ```bash
   @CucumberOptions(
    features = "src/test/resources/Features",
    glue = "stepdefinitions",
    tags = "@End2End" // Altere para @SmokeTest ou @TesteCompras conforme necessário
    )

### Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias.
