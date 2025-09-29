# RULES_FILE.MD
# Propósito: Guia Operacional OBRIGATÓRIO para o Code Assistant (IA).
#            Detalha o processo passo a passo que a IA DEVE seguir em CADA interação
#            para garantir consistência, aplicação das diretrizes e correta
#            manutenção do código e da documentação.
#
# Este arquivo é a DIRETRIZ DE EXECUÇÃO DA IA. Ele não define as regras em si,
# mas COMO A IA DEVE CONSULTAR E APLICAR as regras definidas em CONTEXT.MD e
# SPECIFICATION_FOR_APP.MD.
#
# Interconexões da Documentação (Estrutura Proposta):
#
#   SPECIFICATION_FOR_APP.MD (Especificações Detalhadas de UM App X)
#             ^
#             | (Consultado para Detalhes do Projeto)
#             |
#   CONTEXT.MD (Regras Gerais de Dev e Docs)
#       ^     |
#       |     | (Consultado para Regras Gerais e Formatação)
#       |     |
#   RULES_FILE.MD (Este Arquivo - PROCESSO DE ATUAÇÃO DA IA)
#       ^
#       | (Guia TODAS as ações da IA)
#       |
#   (A IA então aplica as regras para modificar Código e Documentos /docs/*)
#
# Legenda: Define o fluxo de trabalho compulsório para o Code Assistant.
# ---

## 1. Introdução: Propósito e Obrigatoriedade

Este arquivo, `RULES_FILE.MD`, é o guia operacional fundamental para o Code Assistant
(referido como IA). A IA **DEVE** consultar e seguir os passos aqui descritos em
**100% (cem por cento)** de suas interações e ações relacionadas ao desenvolvimento
de código e à manutenção da documentação no diretório `/docs`.

O objetivo é garantir que a IA atue de forma padronizada, consistente e em total
conformidade com as diretrizes do projeto, independentemente de quem ou qual
modelo de IA esteja realizando a tarefa.

Este arquivo foca no **PROCESSO** e na **ORDEM DE CONSULTA** dos demais arquivos de
diretrizes. As regras e especificações em si estão detalhadas em:

-   `CONTEXT.MD`: Para regras gerais de desenvolvimento, padrões de codificação,
    metodologias de documentação (incluindo formatação) e diretrizes gerais para IAs.
-   `SPECIFICATION_FOR_APP.MD`: Para todas as especificações, funcionalidades,
    arquitetura, e status de desenvolvimento (Final Target, Developed, Under Development)
    EXCLUSIVOS do projeto específico em questão (ex: "Fonoaudióloga Virtual").

## 2. Processo de Atuação da IA: Passo a Passo Mandatório

A IA deve seguir rigorosamente o seguinte fluxo de trabalho para cada prompt ou
solicitação do usuário:

### Passo 2.1: Análise Inicial e Consulta de Diretrizes Fundamentais

Ao receber um novo prompt do usuário:

1.  **Analisar a Solicitação:** Interpretar o pedido do usuário para entender o
    objetivo principal (ex: criar funcionalidade, corrigir bug, atualizar documentação,
    responder a uma pergunta sobre o projeto).

2.  **Consulta Obrigatória - `CONTEXT.MD`:** Antes de qualquer outra ação, a IA deve
    (re)ler e carregar em seu contexto de trabalho as diretrizes de `CONTEXT.MD`.
    Isto inclui, mas não se limita a:
    *   Regras Gerais de Desenvolvimento de Software (Seção 2 de `CONTEXT.MD`).
    *   Regras para IAs (Code Assistants) (Seção 3 de `CONTEXT.MD`).
    *   Estrutura e Manutenção da Documentação do Projeto (Seção 4 de `CONTEXT.MD`,
        especialmente a subseção 4.2 sobre Formatação).
    *   Demais seções relevantes de `CONTEXT.MD` para a tarefa em questão.

3.  **Consulta Obrigatória - `SPECIFICATION_FOR_APP.MD`:** Em seguida, a IA deve
    (re)ler e carregar em seu contexto de trabalho as informações do arquivo
    `SPECIFICATION_FOR_APP.MD` do projeto relevante. Isto é crucial para entender:
    *   A Visão Geral e Objetivos do Projeto Específico.
    *   As Funcionalidades Planejadas (FINAL_TARGET).
    *   As Funcionalidades Desenvolvidas e Validadas (DEVELOPED).
    *   As Funcionalidades em Desenvolvimento (UNDER_DEVELOPMENT).
    *   A Arquitetura e Módulos específicos daquele projeto.
    *   Quaisquer outras regras ou especificações particulares do projeto.

### Passo 2.2: Planejamento Detalhado e Execução da Tarefa

Com base na análise do prompt e nas diretrizes consultadas:

1.  **Identificar Artefatos Impactados:** Determinar quais arquivos de código-fonte
    e quais arquivos de documentação no diretório `/docs` serão criados, modificados
    ou consultados para satisfazer a solicitação.

2.  **Planejar Alterações (Código e Documentação):** Antes de escrever qualquer código
    ou texto, a IA deve formular um plano conciso de como as alterações no código
    serão refletidas na documentação para manter a sincronia e vice-versa.
    Este plano deve considerar as interdependências descritas em `CONTEXT.MD`
    (Seção 4.3) e os propósitos de cada arquivo de documentação.

3.  **Implementação de Código (Se Aplicável):** Se a tarefa envolve escrever ou
    modificar código, a IA deve:
    *   Seguir as "Regras Gerais de Desenvolvimento de Software" de `CONTEXT.MD`.
    *   Aplicar as especificações de arquitetura e funcionalidade de
        `SPECIFICATION_FOR_APP.MD`.
    *   Incluir KDocs e comentários em PT-BR conforme definido em `CONTEXT.MD`.

4.  **Atualização da Documentação (Se Aplicável):** Se a tarefa envolve criar ou
    modificar documentação, ou se as alterações no código exigem atualizações
    documentais, a IA deve seguir o detalhado no item `## 7. Determinação de Documentos a Atualizar`
    deste arquivo.

### Passo 2.3: Garantia de Consistência e Sincronia

É responsabilidade primária da IA manter a consistência entre o código, o
`SPECIFICATION_FOR_APP.MD` e os demais arquivos de documentação.

1.  **Sincronia com `SPECIFICATION_FOR_APP.MD`:** As seções `DEVELOPED` e
    `UNDER_DEVELOPMENT` do `SPECIFICATION_FOR_APP.MD` devem ser o espelho fiel
    do estado do código.

2.  **Sincronia com Documentos Auxiliares:** `PATHS_FILES.MD`, `PATHS_SCREENS.MD`,
    e `VALIDATION_STATUS.MD` devem detalhar e exemplificar o que está definido
    em `SPECIFICATION_FOR_APP.MD` e implementado no código.

### Passo 2.4: Comunicação, Verificação e Iniciativa

1.  **Insuficiência de Informações:** Se o prompt do usuário ou o conteúdo dos
    arquivos de diretrizes (`CONTEXT.MD`, `SPECIFICATION_FOR_APP.MD`) não fornecerem
    informações suficientes para completar a tarefa de forma segura e precisa, a IA DEVE:
    *   Informar explicitamente ao usuário qual informação está faltando.
    *   Propor um plano de ação, um rascunho da solução, ou perguntas adicionais para
        esclarecimento ANTES de prosseguir com implementações complexas ou ambíguas.

2.  **Detecção de Divergências:** Se a IA detectar divergências entre o código
    existente e a documentação, ou entre diferentes partes da documentação, ela DEVE
    alertar o usuário sobre a inconsistência e, se possível, sugerir um plano para
    corrigi-la.

3.  **Proatividade Controlada:** A IA pode sugerir melhorias ou ajustes que estejam
    alinhados com as diretrizes, mas implementações significativas não solicitadas
    diretamente devem sempre passar por aprovação prévia.

## 3. REGRAS DE OURO (Princípios Fundamentais de Desenvolvimento)

Ao implementar qualquer funcionalidade ou realizar modificações no código, a IA deve
se esforçar para seguir estes princípios fundamentais, que também são detalhados
nas "Regras Gerais de Desenvolvimento de Software" em `CONTEXT.MD`:

*   **DRY (Don't Repeat Yourself):** Evite a duplicação de código. Busque criar
    abstrações e reutilizar lógica comum.
*   **KISS (Keep It Simple, Stupid):** Priorize a simplicidade. Soluções complexas
    desnecessariamente são mais difíceis de manter e entender.
*   **YAGNI (You Aren't Gonna Need It):** Não implemente funcionalidades ou
    complexidades especulativas que não foram explicitamente solicitadas ou que não
    resolvem um requisito atual.
*   **Separation of Concerns (SoC):** Separe as responsabilidades. Cada componente,
    classe ou módulo deve ter uma única responsabilidade bem definida.
*   **Dependency Injection (DI):** Favoreça a injeção de dependências (ex: utilizando
    Hilt em projetos Android) para promover o desacoplamento e a testabilidade.
*   **Test First (ou Test-Driven Development - TDD):** Idealmente, escreva testes
    (unitários, de integração) antes ou em conjunto com o código da funcionalidade para
    garantir a corretude e facilitar refatorações.
*   **Document While Coding:** Mantenha a documentação (`KDocs`, comentários, e os
    arquivos em `/docs`) atualizada *imediatamente* à medida que o código é
    desenvolvido ou modificado, não como uma tarefa posterior.

## 5. ANTI-LOOPING MECHANISM

*   **Condição Principal:** Se a IA detectar que está relendo as mesmas instruções mais de duas vezes na mesma interação.
    *   **Ação Imediata:** PARE IMEDIATAMENTE.
    *   **Consulta ao Usuário:** Pergunte ao usuário:
        *   "Detectei um possível ciclo de repetição. Como deseja prosseguir?
        *   A) Continuar com a tarefa atual, apesar do alerta.
        *   B) Gostaria que eu explicasse onde identifiquei o possível bloqueio.
        *   C) Abortar esta linha de ação e aguardar novas instruções."
*   **Sinais Indicativos de Looping (Observáveis pela IA):**
    *   Reler o `RULES_FILE.MD` mais de duas vezes durante uma única interação de tarefa.
    *   Regenerar o mesmo bloco de código múltiplas vezes sem alterações significativas ou progresso.
    *   Repetir a mesma pergunta de esclarecimento ao usuário várias vezes.
    *   Identificar um ciclo de: Ler documentação → Gerar/Modificar código → Reconsultar a mesma documentação → Gerar/Modificar o mesmo código.
*   **Mecanismo de Solução Interna (Tentativa da IA antes de alertar):**
    *   1. A IA deve marcar internamente: "Consulta ao `RULES_FILE.MD` nesta iteração: [Contador]".
    *   2. Antes de uma nova consulta a um documento já lido na mesma iteração, a IA deve se perguntar: "Qual nova informação específica espero obter ou qual ambiguidade pretendo resolver com esta releitura?".
    *   3. Se a IA não puder justificar a releitura com base em uma necessidade clara de nova informação ou resolução de ambiguidade, ela deve acionar a **Consulta ao Usuário** descrita acima.

## 6. ANTI-REGRESSÃO MECHANISM

*   **Ação Mandatória (ANTES de modificar QUALQUER código existente):**
    *   A IA DEVE completar o seguinte ✅ **CHECKLIST ANTI-REGRESSÃO OBRIGATÓRIO**:
        *   Li o código atual COMPLETO do(s) arquivo(s) a ser(em) modificado(s)?
        *   Identifiquei TODAS as funcionalidades existentes no escopo do código a ser alterado?
        *   Minha modificação se destina a ADICIONAR nova funcionalidade/comportamento ou a SUBSTITUIR/ALTERAR um existente?
        *   Se for SUBSTITUIR/ALTERAR: Validei rigorosamente que a modificação não remove ou degrada funcionalidades existentes que deveriam ser preservadas (conforme `SPECIFICATION_FOR_APP.MD` e `VALIDATION_STATUS.MD`)?
        *   Verifiquei as dependências? (Ou seja, quem chama este código e quem este código chama? Qual o impacto esperado?)
        *   Consultei o `VALIDATION_STATUS.MD` para verificar o status atual das funcionalidades impactadas?
        *   Considerei o impacto potencial em outros módulos ou partes do sistema?
*   **Condição de Parada:**
    *   Se a resposta para QUALQUER item do checklist for "NÃO" ou "INCERTO", a IA DEVE:
        *   **PARAR** a modificação.
        *   Analisar mais a fundo até que todos os itens possam ser respondidos afirmativamente.
        *   Se necessário, consultar o usuário para esclarecimentos ou aprovação do risco.
*   **REGRA DE OURO para Substituição de Código:**
    *   A IA NUNCA DEVE SUBSTITUIR código existente sem garantir o seguinte:
        *   Inserir comentários claros no código explicando O QUE está sendo mudado e POR QUÊ.
        *   Assegurar que as funcionalidades validadas (com status ✅ em `VALIDATION_STATUS.MD` ou implícitas como estáveis) sejam mantidas ou explicitamente declaradas como substituídas com equivalência ou melhoria.
        *   Se aplicável ao escopo da IA, adicionar ou sugerir a adição de testes para a nova funcionalidade ou para cobrir as alterações.
        *   Atualizar o `CHANGELOG.MD` e o `SPECIFICATION_FOR_APP.MD`, marcando como "BREAKING CHANGE" se a alteração quebrar a compatibilidade anterior ou remover uma funcionalidade significativa.

## 7. Determinação de Documentos a Atualizar

Após a implementação de código ou alterações significativas, a IA DEVE determinar e atualizar os seguintes documentos, conforme aplicável:

*   **Se criou/modificou ARQUIVO(S) de código fonte:**
    *   → Atualizar `PATHS_FILES.MD` para refletir a nova estrutura de arquivos ou modificações.
*   **Se criou/modificou TELA(S) (Interface do Usuário):**
    *   → Atualizar `PATHS_SCREENS.MD` (incluindo drafts ASCII, fluxo de navegação e referências aos arquivos de tela).
*   **Se adicionou ou completou FUNCIONALIDADE(S) significativas:**
    *   → Atualizar `SPECIFICATION_FOR_APP.MD` (mover da seção `UNDER_DEVELOPMENT` para `DEVELOPED` ou adicionar diretamente em `DEVELOPED` com o status apropriado).
*   **Se mudou ARQUITETURA/MÓDULOS do projeto:**
    *   → Atualizar `SPECIFICATION_FOR_APP.MD` (principalmente a seção "Arquitetura e Módulos").
    *   → Considerar impacto em `PATHS_FILES.MD` se a estrutura de diretórios dos módulos foi alterada.
*   **Se adicionou/atualizou DEPENDÊNCIA(S) externa(s):**
    *   → Atualizar o arquivo de build do projeto (ex: `build.gradle.kts`) com a nova dependência.
    *   → Registrar a adição/atualização da dependência no `CHANGELOG.MD`.
    *   → Se a dependência introduzir novos arquivos significativos ao projeto (ex: bibliotecas locais), refletir em `PATHS_FILES.MD`.
*   **Se mudou o status de validação de uma funcionalidade ou módulo:**
    *   → Atualizar `VALIDATION_STATUS.MD` com o novo status e justificativa.
    *   → Refletir o novo status nos KDocs relevantes e, se aplicável, no `SPECIFICATION_FOR_APP.MD`.
*   **SEMPRE (para mudanças significativas no código ou documentação):**
    *   → Atualizar `CHANGELOG.MD`, descrevendo a mudança e, se aplicável, incrementando o versionamento conforme as diretrizes do projeto (se existentes).

*   **Princípios para Atualização de Documentos:**
    *   **Adicionar, não substituir:** Priorizar a adição de novas informações. A substituição só deve ocorrer se for para corrigir erros, refatorar para clareza ou quando explicitamente necessário e justificado.
    *   **Manter formatação existente:** Seguir o estilo e a estrutura de formatação Markdown já presentes no documento que está sendo editado.
    *   **Usar mesmos padrões de símbolos:** Manter a consistência nos símbolos utilizados (ex: `*` ou `-` para listas, `→` para fluxos, etc.) dentro de cada documento.

## 8. Conclusão do Ciclo de Ação

Ao final de cada tarefa, a IA deve confirmar as ações realizadas, listando os
arquivos modificados (código e documentação) e assegurando que o processo descrito
neste `RULES_FILE.MD` foi seguido.
