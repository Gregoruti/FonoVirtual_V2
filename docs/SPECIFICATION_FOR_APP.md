# SPECIFICATION_FOR_APP.MD
# Propósito: Contém TODAS as especificações, funcionalidades, regras e o contexto
#            detalhado EXCLUSIVAMENTE para o projeto "Fonoaudióloga Virtual" (App X).
#
# Este arquivo é a fonte PRIMÁRIA para entender o escopo e os detalhes de
# implementação do App X.
#
# Interconexões da Documentação (Estrutura Proposta):
#
#   SPECIFICATION_FOR_APP.MD (Este Arquivo - Detalhes do App X)
#             ^
#             | (Informa)
#             |
#   CONTEXT.MD (Regras Gerais de Dev e Docs) <-----> RULES_FILE.MD (Guia Operacional IA)
#       |         |                                      ^
#       |         | (Aplica-se a)                        | (Consulta)
#       +---------+--------------------------------------+
#                 |
#                 V (Exemplificado por / Aplicado a)
#   PATHS_FILES.MD / PATHS_SCREENS.MD / VALIDATION_STATUS.MD / CHANGELOG.MD
#
# Legenda: Define o escopo, funcionalidades e o progresso do App X.
# ---
Sempre responda em Português do Brasil

Você é um Code Assistant que deve manter atualizado este arquivo de especificações
do App "Fonoaudióloga Virtual" (App X). Sua tarefa é **adicionar, remover ou atualizar**
seções sempre que novos módulos, funcionalidades, regras ou decisões arquiteturais
específicas deste projeto forem criadas. Respeite a estrutura em tópicos e escreva
de forma clara e organizada.

# Especificações do Aplicativo: Fonoaudióloga Virtual (App X)

## Visão Geral e Objetivos do Projeto "Fonoaudióloga Virtual"

Este projeto é um aplicativo Android, "Fonoaudióloga Virtual" (App X),
cujo objetivo é auxiliar pacientes com exercícios de fonoaudiologia através de:

-   Reconhecimento de voz offline (usando Vosk PT-BR).
-   Text-to-Speech (TTS) para fornecer instruções em áudio.
-   Interface amigável, acessível e intuitiva para pacientes e profissionais.
-   Registro de progresso do usuário (futuro módulo).
-   Futuras integrações com IA para feedback inteligente.

Sempre solicite o Contexto do Projeto (este arquivo) para poder iniciar o
desenvolvimento da aplicação.
E também considere a "Documentação Estrutural" (outros arquivos em /docs) a ser
fornecida e mantida para o desenvolvimento detalhado de acordo com as regras gerais
(que futuramente estarão em CONTEXT.MD).

## Funcionalidades Planejadas (FINAL_TARGET)

Esta seção descreve a visão de longo prazo para o App "Fonoaudióloga Virtual".

-   **Módulo de Cadastro e Perfis de Usuário:** Pacientes e Profissionais.
-   **Módulo de Exercícios Abrangente:** Diversos tipos, configurações, instruções claras.
-   **Módulo ASR Avançado:** Análise de pronúncia.
-   **Módulo TTS Configurável:** Opções de voz/velocidade.
-   **Módulo de Análise e Relatórios de Progresso:** Gráficos, relatórios detalhados.
-   **Módulo de Gamificação:** Elementos para engajamento.
-   **Outros Módulos Futuros:** Conforme detalhado na seção "Contexto do Projeto" original.

## Funcionalidades Desenvolvidas e Validadas (DEVELOPED)

Baseado no estado anterior do projeto (FonoVirtual_V2 v1.0.1):

-   **Versão 0.2.1:**
    -   `SplashScreen.kt`: Tela de abertura inicial. (Validado)
-   **Versão 0.4.0:**
    -   `TextToSpeechModule.kt`: Módulo de Síntese de Fala funcional. (Validado)
    -   UI para Teste de TTS (`TtsTestScreen.kt`, `TtsTestViewModel.kt`). (Validado)
    -   Navegação para Tela de Teste TTS via `DebugScreen.kt`. (Validado)
-   **Versão 1.0.0 (Parcial):**
    -   `HomeScreen.kt`: Exibição de versão dinâmica. (Validado)
    -   `DebugScreen.kt`: Navegação para placeholder ASR (substituído em v1.0.1). (Validado)
-   **Versão 1.0.1:**
    -   Navegação Principal (`MainActivity.kt`): Rota para `AsrTestScreen.kt`. (Validado)
    -   Recursos de String (`strings.xml`): Strings para `AsrTestScreen`. (Validado)
    -   Build do Projeto (`app/build.gradle.kts`): `versionName` "1.0.1". (Validado)

## Funcionalidades em Desenvolvimento (UNDER_DEVELOPMENT)

Baseado no estado anterior do projeto (FonoVirtual_V2 v1.0.1):

-   **Módulo Speech (ASR - `VoskAsrModule.kt`):** (Base v1.0.0 - Em Teste)
    -   Status: Init OK. Pronto para integração completa em `AsrTestScreen`.
-   **UI de Teste ASR (`AsrTestScreen.kt`, `AsrTestViewModel.kt`):** (Base v1.0.1 - Em Teste)
    -   Status `AsrTestScreen.kt`: UI inicial/Draft validada. Lógica ASR e interação com
        ViewModel pendentes. Solicitação de permissão `RECORD_AUDIO` pendente.
    -   Status `AsrTestViewModel.kt`: Pendente (Estrutura básica criada).

## Arquitetura e Módulos do Projeto "Fonoaudióloga Virtual"

-   **Módulo Core (`CoreInitializationModule.kt`):** Configurações globais (Planejado).
-   **Módulo Speech (ASR - `VoskAsrModule.kt`):** Reconhecimento de voz (Em Teste v1.0.0).
-   **Módulo TTS (`TextToSpeechModule.kt`):** Síntese de fala (Validado v0.4.0).
-   **Módulo UI (Telas e Navegação):** `MainActivity.kt`, `*Screen.kt`, `*ViewModel.kt`.
    (Status variado, vide seções DEVELOPED e UNDER_DEVELOPMENT).
-   **Módulo Data (`DataStorageModule.kt`):** Persistência (Planejado).


# --- Diretrizes Gerais e Metodologia (Temporariamente Aqui) ---
# As seções abaixo contêm diretrizes de desenvolvimento e documentação que são
# aplicáveis de forma geral. Na reestruturação final da documentação, estas seções
# serão movidas para CONTEXT.MD e/ou RULES_FILE.MD, deixando este arquivo focado
# apenas nas especificidades do "Fonoaudióloga Virtual".

Sempre responda em Português do Brasil

Você é um Code Assistant que deve manter atualizado o Prompt Geral de Desenvolvimento
do App "X". Sua tarefa é **adicionar, remover ou atualizar** seções sempre que novos
módulos, regras ou decisões arquiteturais forem criadas. Respeite a estrutura em
tópicos e escreva de forma clara e organizada.  

#  Prompt Geral de Desenvolvimento - App


## Contexto do Projeto 

Este projeto é um aplicativo Android chamado **X**, por exemplo, Fonoaudiologa Virtual,
cujo objetivo é auxiliar pacientes com exercícios de fonoaudiologia através de: 

- Reconhecimento de voz offline (usando Vosk PT-BR). 

- Text-to-Speech (TTS) para fornecer instruções em áudio. 

- Interface amigável, acessível e intuitiva para pacientes e profissionais. 

- Registro de progresso do usuário (futuro módulo). 

- Futuras integrações com IA para feedback inteligente. 
 

Sempre solicite o Contexto do Projeto para poder iniciar o desenvolvimento da
aplicação 

E também considere "Documentação Estrutural" a ser fornecida para o desenvolvimento
detalhado de acordo com as regras aqui informadas 

## Regras Gerais 

1. **Linguagem de código**: Kotlin para o app Android.   

2. **Arquitetura sugerida**: MVVM (Model-View-ViewModel) ou equivalente simples
   para modularidade.   

3. **Comentários**: Todos os trechos de código devem conter comentários explicativos
   **em PT-BR**.   

4. **Documentação inline**:   

   - Cada função deve ter um `KDoc` resumindo sua função.   

   - Variáveis e constantes importantes devem ser comentadas.   

   - Estruturas mais complexas (ex: `coroutines`, `flows`, `listeners`) devem ter
     explicação adicional.   

5. **Estilo**: Código limpo, nomes de variáveis claros, sem abreviações
   desnecessárias.   

6. **Boas práticas**: Tratar exceções, liberar recursos em `onDestroy()`, evitar
   código duplicado.   

7. **Internacionalização**: Mensagens fixas devem estar em `strings.xml`.   

8. **Módulos**: 

   - **Core**: Configurações globais, inicialização.   

   - **Speech**: Reconhecimento de voz (Vosk).   

   - **TTS**: Síntese de fala (TextToSpeech).   

   - **UI**: Telas e navegação.   

   - **Data**: Persistência de progresso do usuário.   

  

## Regras para IAs Code Assistants 

- Sempre considerar o contexto do projeto antes de sugerir alterações.   

- Se propor novo código, incluir comentários claros em PT-BR.   

- Se propor otimizações, explicar em qual módulo se encaixa.   

- Não apagar funcionalidades já descritas sem explicar a substituição.   

- Documentar dependências externas (ex: `vosk-android`, `androidx.lifecycle`).   

 

## Estrutura do Projeto (Paths e Drafts) 

  

### Paths 

- O assistente deve sempre manter uma listagem da estrutura de diretórios e arquivos
  do projeto no formato hierárquico, por exemplo: 

  

/app 

├── src 

│ └── main 

│ ├── AndroidManifest.xml 

│ ├── java/com/example/fonovirtual 

│ │ ├── MainActivity.kt 

│ │ ├── ui/ 

│ │ │ ├── HomeScreen.kt 

│ │ │ └── ExercisesScreen.kt 

│ │ └── speech/ 

│ │ ├── SpeechRecognizer.kt 

│ │ └── SpeechUtils.kt 

│ └── res/ 

│ ├── layout/ 

│ ├── values/ 

│ │ ├── strings.xml 

│ │ └── colors.xml 

│ └── drawable/ 

└── build.gradle.kts 

  

  

### Drafts (Protótipos de Telas em ASCII) 

- Sempre que houver novas telas, o assistente deve gerar rascunhos textuais no
  estilo wireframe, por exemplo: 

  

+--------------------------------------+ 

| Fonoaudióloga Virtual                | 

+--------------------------------------+ 

| [] Iniciar Exercício de Voz          | 

| [] Ver Progresso                     | 

| [⚙️] Configurações                  | 

+--------------------------------------+ 

 

  

- Esses drafts devem acompanhar: 

  - Nome da tela (Screen).   

  - Botões, inputs e elementos principais.   

  - Fluxo de navegação entre telas.   

  

### Regras 

1. Sempre atualizar o **Paths** quando houver mudança na estrutura do projeto.   

2. Sempre atualizar os **Drafts** quando houver criação ou alteração de telas.   

3. Manter tudo **sincronizado com os módulos** descritos na seção "Regras Gerais".   

 

Crie a funcionalidade [X].   

Além do código em Kotlin, atualize o Prompt Geral nas seções "Paths" e "Drafts",
incluindo os novos arquivos criados e a representação da(s) nova(s) tela(s).   

 

## Saída Esperada 

- Código Kotlin **funcional e documentado em PT-BR**.   

- Sugestões de arquitetura modular quando necessário.   

- Respeito à organização em módulos descrita acima.   

- Toda nova função ou classe deve ser acompanhada de: 

  - Breve descrição do propósito.   

  - Explicação de parâmetros e retorno.   

  - Exemplos de uso (quando relevante).   

 

## Status de Validação 

- Todo módulo (UI, ASR, TTS, Configurações, etc.) deve conter um
  campo/documentação sobre seu Status de Validação. 

- Este status deve ser visível no menu "Configurações > Debugar/Testar". 

- O desenvolvedor/assistente de IA deve inserir nos KDocs ou comentários uma tag
  indicando o status: 

   `@validationStatus [Validado | Em Teste | Falha | Pendente]` 

- Quando possível, criar uma tela de Debug que liste todos os módulos e permita
  testá-los individualmente. 

- O assistente de IA deve atualizar o Status de Validação conforme os testes de
  feedback do usuário. 

 

Exemplo em KDoc: 

/** 

* Módulo de Reconhecimento de Fala (ASR) baseado no Vosk. 

* 

* Responsável por inicializar o modelo, capturar áudio e 

* converter em texto. 

* 

* `@validationStatus Em Teste` 

* Último feedback: Reconhece bem frases curtas, mas perde 

* precisão em ambientes ruidosos. 

*/ 

class AsrModule { 

    // ... 

} 

Exemplo da tela de Debug (mock de paths/telas) 

 

Configurações/ 

└── Debugar/ 

      ├── ASR - Reconhecimento de Fala  [Em Teste] 

      ├── TTS - Síntese de Fala         [Validado] 

      ├── Tela Principal                [Validado] 

      ├── Tela Configurações            [Pendente] 

      └── Integração com API Externa    [Falha] 

 ## Fluxo de Navegação 

- Além da estrutura de diretórios (Paths) e dos protótipos ASCII (Drafts), o
  projeto deve manter 

  um "Fluxo de Navegação". 

- O Fluxo de Navegação deve listar todas as telas do app e como o usuário pode
  navegar entre elas. 

- Cada caminho deve ser representado hierarquicamente com indentação ou setas (→). 

- Sempre que uma nova tela for criada ou alterada, o assistente deve atualizar o
  Fluxo de Navegação. 

- O Fluxo de Navegação pode conter o status de validação das telas/módulos, quando
  aplicável. 

 

Exemplo de Fluxo de Navegação (inicial do seu app) 

Tela Principal [Validado] 

├── → Exercícios de Voz 

│     ├── → Exercício de Repetição 

│     └── → Exercício de Leitura 

├── → Progresso do Usuário 

├── → Configurações [Pendente] 

│     ├── → Preferências de Áudio 

│     ├── → Idioma 

│     └── → Debugar 

│          ├── Testar ASR (Reconhecimento de Fala) [Em Teste] 

│          ├── Testar TTS (Síntese de Fala) [Validado] 

│          └── Testar Integração com API Externa [Falha] 

└── → Ajuda / Sobre

 

## Regras, Contexto e Estrutura de documentação 

Você é um agente de desenvolvimento que deve seguir regras, contexto e estrutura de
documentação definidas no projeto. 
Sempre consulte e atualize os arquivos auxiliares no diretório /docs para manter
consistência. 

 

Regras Gerais para a IA 

Documentação 

Sempre comentar o código em PT-BR. 

Usar KDocs em classes, funções e parâmetros Kotlin. 

Gerar documentação clara para humanos e assistentes futuros. 

Consistência 

Qualquer alteração no código deve refletir em: 

CONTEXT.MD (estado geral atualizado). 

PATHS_FILES.MD (se novos diretórios/arquivos forem criados). 

PATHS_SCREENS.MD (se novas telas ou fluxos forem criados). 

VALIDATION_STATUS.MD (se o módulo alterado tiver status atualizado). 

CHANGELOG.MD (se habilitado). 

Validação 

Todos os módulos devem permitir testes individuais (menu Configurações > Debugar). 

Cada teste deve ter status em VALIDATION_STATUS.MD. 

Navegação e Estrutura 

Sempre preservar o fluxo descrito em PATHS_SCREENS.MD. 

Se houver divergência entre código e documentação, alertar e sugerir correção. 

Tarefas da IA 

Implementar código seguindo estas regras. 

Atualizar automaticamente a documentação sempre que fizer alterações. 

Se não houver informação suficiente, propor um rascunho inicial para aprovação. 

 

 

 

Gere o código em Kotlin para a seguinte funcionalidade: [descrição].   
O código deve ser escrito de forma clara e conter comentários explicativos em PT-BR.   
Cada função deve ter documentação KDoc resumindo sua finalidade.   
Se usar coroutines, listeners ou recursos externos, explique nos comentários como
funcionam.
