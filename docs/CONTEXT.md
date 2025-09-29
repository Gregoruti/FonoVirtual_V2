# CONTEXT.MD
# Propósito: Define o contexto geral de desenvolvimento, as metodologias,
#            as regras para Code Assistants (IAs), e as diretrizes para a criação
#            e formatação de TODA a documentação do projeto no diretório /docs.
#
# Este arquivo é o GUIA METODOLÓGICO CENTRAL. Ele estabelece COMO os projetos são
# desenvolvidos e documentados, servindo de referência para IAs e desenvolvedores.
# As especificações de UM PROJETO PARTICULAR (ex: App X) residem em seu próprio
# arquivo `SPECIFICATION_FOR_APP.MD`.
#
# Interconexões da Documentação (Estrutura Proposta):
#
#   SPECIFICATION_FOR_APP.MD (Especificações Detalhadas de UM App X)
#             ^
#             | (Implementa / Detalha para App X)
#             |
#   CONTEXT.MD (Este Arquivo - REGRAS GERAIS DE DEV E DOCS) <--- RULES_FILE.MD
#       |         |                                                 (Guia Op. IA)
#       |         | (Aplica-se a / Define Padrões para)
#       +---------+----------------------------------------------------+
#                 |
#                 V (Exemplificado por / Aplicado a)
#   PATHS_FILES.MD / PATHS_SCREENS.MD / VALIDATION_STATUS.MD / CHANGELOG.MD
#
# Legenda: Guia metodológico para desenvolvimento e documentação.
# --- 

## 1. Introdução e Diretrizes para o Code Assistant (IA)

Sempre responda em Português do Brasil.

Você é um Code Assistant operando sob as diretrizes deste arquivo (`CONTEXT.MD`)
para desenvolvimento de software e manutenção da documentação associada.
Sua função é auxiliar na implementação de funcionalidades, seguir as regras de
codificação e documentação aqui estabelecidas, e manter a estrutura de documentação
organizada e atualizada.

Para especificações detalhadas de um projeto particular (ex: "Fonoaudióloga Virtual"),
consulte o arquivo `SPECIFICATION_FOR_APP.MD` correspondente.
Este `CONTEXT.MD` fornece o *framework* de como você deve operar e como a
documentação deve ser estruturada e formatada de maneira geral.

## 2. Regras Gerais de Desenvolvimento de Software

Estas regras são aplicáveis a todos os projetos desenvolvidos sob esta metodologia.

1.  **Linguagem de Código Principal**: Kotlin para desenvolvimento Android.
2.  **Arquitetura Sugerida**: MVVM (Model-View-ViewModel) ou um padrão equivalente
    que promova modularidade e testabilidade deve ser considerado para a estrutura
    interna de módulos ou funcionalidades complexas.
3.  **Comentários no Código**: Todo código produzido deve incluir comentários
    explicativos claros e concisos, **obrigatoriamente em Português do Brasil (PT-BR)**.
4.  **Documentação Inline (KDocs)**:
    -   Toda função/método público e classes devem ser documentados utilizando `KDoc`.
        O KDoc deve resumir o propósito, descrever parâmetros e o valor de retorno.
    -   Variáveis de classe, propriedades importantes e constantes devem ter um breve
        comentário explicando seu propósito, se não for imediatamente óbvio pelo nome.
    -   Estruturas de código mais complexas (ex: uso de `Coroutines`, `Flows`, `LiveData`,
        `BroadcastReceivers`, `ServiceListeners`) devem ter comentários adicionais
        explicando seu comportamento, ciclo de vida e interações esperadas.
5.  **Estilo de Código**: Priorizar código limpo (`clean code`). Utilizar nomes de
    variáveis, funções e classes que sejam claros, descritivos e autoexplicativos,
    evitando abreviações desnecessárias. Seguir as convenções de estilo oficiais do Kotlin.
6.  **Boas Práticas de Programação**: Implementar tratamento de exceções robusto.
    Liberar recursos adequadamente (ex: em `onCleared()` para ViewModels,
    `onDestroy()`/`onDestroyView()` para componentes de UI Android, fechar `Closeable`
    em blocos `try-finally` ou `use`). Evitar duplicação de código (princípio DRY).
    Gerenciar corretamente o ciclo de vida dos componentes da plataforma (ex: Android).
7.  **Internacionalização (i18n)**: Todas as strings de texto visíveis ao usuário na UI
    devem ser externalizadas em arquivos de recurso apropriados (ex: `strings.xml`
    para Android), para facilitar a tradução e manutenção.
8.  **Estrutura Modular Conceitual**: Os projetos devem ser, idealmente, divididos em
    módulos conceituais para melhor organização e separação de responsabilidades.
    Exemplos de tipos de módulos incluem (mas não se limitam a):
    -   **Core**: Configurações globais, inicialização de serviços, utilitários comuns.
    -   **Speech/Voice**: Funcionalidades relacionadas a reconhecimento de voz (ASR) ou
        síntese de fala (TTS).
    -   **UI**: Componentes de interface do usuário, telas, navegação e ViewModels.
    -   **Data/Domain**: Lógica de negócios, modelos de dados, fontes de dados
        (repositórios, APIs, banco de dados local).

## 3. Regras para IAs (Code Assistants)

Ao auxiliar no desenvolvimento e documentação:

-   **Consulta de Contexto**: Antes de propor alterações de código ou documentação,
    consulte o `SPECIFICATION_FOR_APP.MD` para entender os requisitos específicos do
    projeto e este `CONTEXT.MD` para as regras gerais e de documentação.
-   **Propostas de Código**: Ao gerar novo código, este deve estar em conformidade com as
    "Regras Gerais de Desenvolvimento de Software" (seção 2) e incluir KDocs e
    comentários em PT-BR.
-   **Otimizações e Refatorações**: Ao sugerir otimizações ou refatorações, explique
    claramente o impacto e em qual módulo ou funcionalidade do projeto específico se
    encaixa, referenciando o `SPECIFICATION_FOR_APP.MD`.
-   **Manutenção de Funcionalidades**: Não apague ou altere funcionalidades já descritas como
    `DEVELOPED` no `SPECIFICATION_FOR_APP.MD` sem uma justificativa explícita
    (ex: substituição planejada, remoção de débito técnico) e garanta que não haja
    regressão de funcionalidades validadas.
-   **Dependências Externas**: Ao introduzir novas dependências externas, documente-as
    no arquivo de build do projeto (ex: `build.gradle.kts`) e mencione sua adição e
    propósito no `CHANGELOG.MD` do projeto. Se a dependência for significativa,
    pode ser relevante uma breve nota no `SPECIFICATION_FOR_APP.MD`.

## 4. Estrutura e Manutenção da Documentação do Projeto (/docs)

O diretório `/docs` contém a documentação vital do projeto. Sua estrutura e manutenção
são cruciais.

### 4.1. Arquivos de Documentação Padrão e Seus Propósitos Conceituais:

A estrutura de documentação no diretório `/docs` é projetada para clareza,
manutenção e consistência. Cada arquivo tem um papel específico:

1.  **`SPECIFICATION_FOR_APP.MD`**:
    *   **Propósito Principal**: Este é o documento mestre para um projeto específico,
        (ex: **"Fonoaudióloga Virtual" (App X)**). Ele contém **TODAS** as
        especificações, funcionalidades (visão final, desenvolvidas, em
        desenvolvimento), regras de negócio, contexto detalhado e arquitetura
        **EXCLUSIVAMENTE** para este projeto. É a fonte primária para qualquer
        informação específica do App X.
    *   **Conteúdo Temporário (Nota)**: Pode, durante fases de transição da
        documentação, abrigar seções com diretrizes gerais de desenvolvimento.
        Idealmente, estas são migradas para `CONTEXT.MD` ou `RULES_FILE.MD` para
        manter o foco deste arquivo puramente nas especificidades do App X.

2.  **`CONTEXT.MD` (Este Arquivo)**:
    *   **Propósito Principal**: Funciona como o **GUIA METODOLÓGICO CENTRAL** para o
        desenvolvimento e documentação de *qualquer* projeto que siga esta
        metodologia. Ele define o contexto geral de desenvolvimento, as metodologias,
        as regras para Code Assistants (IAs), e as diretrizes universais para a
        criação e formatação de **TODA** a documentação no diretório `/docs`.
    *   **Foco**: Estabelece *COMO* os projetos são desenvolvidos e documentados de
        forma padronizada. Não contém informações específicas de um projeto
        particular.

3.  **`RULES_FILE.MD`**:
    *   **Propósito Principal**: É o **GUIA OPERACIONAL OBRIGATÓRIO** para o Code
        Assistant (IA). Ele detalha o processo passo a passo que a IA **DEVE**
        seguir em **100%** de suas interações.
    *   **Foco**: Descreve *COMO A IA DEVE CONSULTAR E APLICAR* as regras definidas
        em `CONTEXT.MD` (para metodologia geral e formatação) e em
        `SPECIFICATION_FOR_APP.MD` (para os detalhes do projeto específico). Garante
        consistência e padronização na atuação da IA.

4.  **`PATHS_FILES.MD`**:
    *   **Propósito Principal**: Documenta a estrutura hierárquica completa de
        **todos os diretórios e arquivos REAIS e significativos** do projeto
        específico (ex: "Fonoaudióloga Virtual").
    *   **Relação**: É a representação prática e detalhada da estrutura de arquivos
        que pode ser planejada ou referenciada no `SPECIFICATION_FOR_APP.MD` do
        projeto. Deve ser mantido atualizado pela IA conforme as regras do
        `RULES_FILE.MD` e os padrões de formatação deste `CONTEXT.MD`.

5.  **`PATHS_SCREENS.MD`**:
    *   **Propósito Principal**: Detalha **todas as telas (Screens) REAIS** da
        aplicação específica. Para cada tela, fornece uma descrição, o caminho do
        arquivo correspondente, seu status de validação (com referência ao
        `VALIDATION_STATUS.MD`), "Drafts ASCII" (protótipos textuais da UI) e o
        fluxo de navegação hierárquico completo.
    *   **Relação**: É a documentação visual e interativa das interfaces e fluxos do
        usuário do projeto, conforme definido em `SPECIFICATION_FOR_APP.MD`. Deve ser
        mantido atualizado pela IA conforme as regras do `RULES_FILE.MD` e os padrões
        de formatação deste `CONTEXT.MD`.

6.  **`VALIDATION_STATUS.MD`**:
    *   **Propósito Principal**: Rastreia e documenta o status de validação
        (ex: Validado, Em Teste, Falha, Pendente) de **cada módulo principal e tela
        individual REAL** do projeto específico (ex: "Fonoaudióloga Virtual").
    *   **Relação**: Serve como o log central para o status de teste e confiabilidade
        dos componentes do projeto, suportando as seções `DEVELOPED` e
        `UNDER_DEVELOPMENT` do `SPECIFICATION_FOR_APP.MD`. Deve ser mantido
        atualizado pela IA conforme as regras do `RULES_FILE.MD`.

7.  **`CHANGELOG.MD`**:
    *   **Propósito Principal**: Mantém um histórico cronológico de **todas as
        alterações significativas REAIS**, novas funcionalidades implementadas,
        correções de bugs e atualizações feitas no projeto específico, usualmente
        organizado por versão.
    *   **Relação**: Fornece um registro da evolução do projeto, complementando o
        `SPECIFICATION_FOR_APP.MD`. Deve ser mantido atualizado pela IA conforme as
        regras do `RULES_FILE.MD`.

### 4.2. Formatação de Arquivos de Documentação (`/docs`):

(Esta seção é extraída e mantida em sincronia com `RULES_FILE.MD`)

*   **Cabeçalho Padrão:** Todos os arquivos no diretório `/docs` (exceto este
    `CONTEXT.MD` e o `RULES_FILE.MD` que têm propósitos meta) devem iniciar com um
    cabeçalho padronizado. Este cabeçalho inclui o nome do arquivo, seu propósito,
    uma breve descrição da sua importância, um diagrama ASCII mostrando suas
    interconexões com outros documentos, e legendas específicas (se aplicável),
    seguido por `---`.
*   **Limite de Linha:** Para texto puro (parágrafos, descrições), as linhas devem ser
    limitadas a um máximo de 90 caracteres para facilitar a leitura em diversos
    visualizadores e editores.
*   **Exceções ao Limite de Linha:** A regra de 90 caracteres não se aplica a:
    *   Tabelas formatadas em Markdown.
    *   "Arte ASCII" (ex: diagramas de fluxo de interconexão no cabeçalho,
        drafts de tela em `PATHS_SCREENS.MD`).
    *   Listas hierárquicas de arquivos em `PATHS_FILES.MD`.
    *   Blocos de código (```...```).
    Estes elementos devem manter sua formatação original para preservar a estrutura visual.
*   **Tabelas:** A formatação de tabelas em Markdown deve ser clara, com colunas bem
    alinhadas, especialmente na linha de definição de colunas (`|---|---|`).

### 4.3. Consistência e Atualização da Documentação (Papel da IA):

-   O Code Assistant (IA) é responsável por manter a documentação sincronizada com o
    código e as definições do projeto.
-   Qualquer alteração no código que impacte a estrutura, estado ou fluxo da aplicação
    deve ser refletida nos arquivos de documentação relevantes, conforme definido nos
    seus respectivos cabeçalhos e neste `CONTEXT.MD`.
    Por exemplo, ao criar uma nova tela para um App X:
    -   `SPECIFICATION_FOR_APP.MD`: A nova tela deve ser adicionada à seção apropriada
        (ex: `UNDER_DEVELOPMENT`).
    -   `PATHS_SCREENS.MD`: Um novo Draft ASCII e a entrada no fluxo de navegação devem
        ser criados.
    -   `PATHS_FILES.MD`: Os novos arquivos de código (Screen, ViewModel) devem ser listados.
    -   `VALIDATION_STATUS.MD`: A nova tela deve ser adicionada com status `Pendente` ou
        `Em Teste`.
    -   `CHANGELOG.MD`: A criação da tela deve ser registrada.
-   A IA deve seguir as regras de formatação aqui descritas ao atualizar qualquer
    documento.

## 5. Saída Esperada para Entregas de Código (Geral)

Para qualquer funcionalidade ou alteração de código solicitada:

-   **Código**: Kotlin funcional, aderente às "Regras Gerais de Desenvolvimento de
    Software" (seção 2), bem documentado (KDocs, comentários em PT-BR).
-   **Arquitetura**: Sugestões de design e arquitetura devem ser modulares e alinhadas
    com os princípios aqui descritos e com as especificidades do projeto em
    `SPECIFICATION_FOR_APP.MD`.
-   **Documentação**: Atualização de todos os arquivos de documentação relevantes no
    diretório `/docs`, conforme a seção 4.3 e as regras de formatação.

## 6. Processo de Status de Validação (Conceito Geral)

-   Cada módulo funcional e tela principal de um projeto deve ter seu status de
    validação rastreado.
-   Esta informação é primariamente documentada no `VALIDATION_STATUS.MD` do projeto.
-   Os status típicos são: `[Validado | Em Teste | Falha | Pendente]`.
-   O Code Assistant (IA) e os desenvolvedores devem atualizar este status nos KDocs
    relevantes e no `VALIDATION_STATUS.MD` conforme o progresso.
-   Para projetos que incluem uma interface de usuário, pode ser útil ter uma seção de
    "Debug" ou "Sobre" que reflita esses status, permitindo testes direcionados.

## 7. Documentação do Fluxo de Navegação (Conceito Geral)

-   Para aplicações com interface de usuário, o fluxo de navegação entre telas é um
    aspecto crítico.
-   Este fluxo é documentado primariamente no arquivo `PATHS_SCREENS.MD` do projeto.
-   Deve listar todas as telas e como o usuário transita entre elas, preferencialmente
    de forma hierárquica (ex: usando indentação e setas).
-   Deve ser mantido atualizado pela IA sempre que telas ou a lógica de navegação
    forem alteradas.

## 8. Interação e Iniciativa da IA

-   Se as informações fornecidas em um prompt forem insuficientes para completar uma
    tarefa de desenvolvimento ou documentação de acordo com estas diretrizes e as
    especificações do projeto (`SPECIFICATION_FOR_APP.MD`), a IA deve:
    1.  Indicar claramente qual informação está faltando.
    2.  Se possível, propor um rascunho, uma solução inicial ou um plano de ação para
        aprovação antes de prosseguir com a implementação completa.
-   Em caso de divergência detectada entre o código existente e a documentação, a IA
    deve alertar o usuário e sugerir a correção apropriada (seja no código ou na
    documentação).
