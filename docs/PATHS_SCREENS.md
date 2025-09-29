# PATHS_SCREENS.MD
# Propósito: Documenta as telas da aplicação FonoVirtual_V2
#            (App X), seus "Drafts" ASCII e o fluxo de navegação.
#
# Este arquivo é parte da documentação do FonoVirtual_V2.
# Ele detalha a UI, a experiência do usuário e como as
# diferentes partes da aplicação se conectam visualmente.
#
# Interconexões da Documentação (Fluxo Sugerido):
#   [Prompt Geral] -> CONTEXT.MD ------> PATHS_FILES.MD
#                     |                     &
#                     |                  PATHS_SCREENS.MD (Este Arquivo)
#                     |                        |
#                     V                        V
#              CHANGELOG.MD <---- VALIDATION_STATUS.MD
#
# Legenda: Descreve telas, seus status, e o fluxo de navegação.
# ---

## Telas da Aplicação (Módulo UI)

### 1. Fluxo de Entrada

-   **Tela:** `SplashScreen` (`SplashScreen.kt`)
    -   **Descrição:** Primeira tela exibida ao iniciar o app.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/splash/SplashScreen.kt`
    -   **Status:** `Validado` (v0.2.1)
    -   **Navega para:** `HomeScreen`.

### 2. Tela Principal

-   **Tela:** `HomeScreen` (`HomeScreen.kt`)
    -   **Descrição:** Tela principal, exibe versão do app (agora "1.0.1") e botões
        de navegação.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/home/HomeScreen.kt`
    -   **Status:** `Validado` (v1.0.1 - Exibição de versão dinâmica e funcionalidade
        base OK).
    -   **Navega para:** `DebugScreen`, (Futuro: Fluxo de Usuário, `ExercisesScreen`).
    -   **Draft ASCII:** (Exibindo versão dinâmica, ex: "v1.0.1")
        ```
        +--------------------------------------+
        | FonoVirtual (TopAppBar)              |
        +--------------------------------------+
        | Versão: 1.0.1                        |
        | Projeto Integrador VI - 2025         |
        |                                      |
        | [Btn: Cad/Sel Profissional/Paciente] |
        | [Btn: Teste Rápido]                  |
        | [Btn: Debug]                         |
        +--------------------------------------+
        ```

### 3. Fluxo de Depuração (Acesso via HomeScreen)

-   **Tela:** `DebugScreen` (`DebugScreen.kt`)
    -   **Descrição:** Painel para desenvolvedores testarem módulos.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/debug/DebugScreen.kt`
    -   **Status:** `Validado` (v1.0.1 - Botão "Testar TTS" funcional validado v0.4.0;
        Botão "Testar ASR" funcional validado v1.0.1, navega para `AsrTestScreen.kt`).
    -   **Navega para:** `TtsTestScreen`, `asr_test_screen` (rota para `AsrTestScreen.kt`).
    -   **Draft ASCII:** (Atualização para v1.0.1)
        ```
        +--------------------------------------+
        | Tela de Depuração (TopAppBar)        |
        +--------------------------------------+
        | Selecione um módulo para testar:     |
        |                                      |
        | [ Button: Testar TTS ] Validado v0.4.0 |
        | [ Button: Testar ASR ] Validado v1.0.1 |
        |                                      |
        | (Outros botões de teste futuros...)  |
        +--------------------------------------+
        ```

-   **Tela:** `TtsTestScreen` (`TtsTestScreen.kt`)
    -   **Descrição:** Tela dedicada ao teste da funcionalidade de Text-to-Speech (TTS).
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/tts_test/TtsTestScreen.kt`
    -   **Status:** `Validado` (v0.4.0).
    -   **Navega para:** Nenhuma.

-   **Tela:** `AsrTestScreen` (`AsrTestScreen.kt`)
    -   **Descrição:** Tela dedicada ao teste da funcionalidade de Reconhecimento Automático
        de Fala (ASR) utilizando o módulo Vosk PT-BR. Permite ao usuário iniciar a
        captura de áudio e visualiza o status e os resultados do reconhecimento.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/asr_test/AsrTestScreen.kt`
        (ViewModel: `AsrTestViewModel.kt`)
    -   **Status:** `Em Teste` (v1.0.1 - UI inicial (Draft) renderiza corretamente e é
        acessível. Lógica de ASR e interação com ViewModel a serem implementadas).
    -   **Navega para:** Nenhuma navegação a partir desta tela (por enquanto).
    -   **Draft ASCII (v1.0.1 - UI Inicial Validada):**
        ```
        +--------------------------------------+
        | Teste de ASR (TopAppBar)             |
        +--------------------------------------+
        | [ Button: Escutar ]                  |
        |                                      |
        | Status: Ocioso                     |
        |                                      |
        | Última Palavra Reconhecida:          |
        | +----------------------------------+ |
        | | (Palavra aqui)                   | |
        | +----------------------------------+ |
        |                                      |
        | Frase Completa Reconhecida:          |
        | +----------------------------------+ |
        | | (Frase completa aqui)            | |
        | +----------------------------------+ |
        +--------------------------------------+
        ```

### 4. Fluxos Futuros (Estrutura Planejada)

(Conforme definido anteriormente)

## Fluxo de Navegação Detalhado (Hierárquico)

Este fluxo descreve como o usuário navega entre as diferentes telas da aplicação.

1.  **`SplashScreen`** (`SplashScreen.kt`) [Validado v0.2.1]
    └──→ **`HomeScreen`** (`HomeScreen.kt`) [Validado v1.0.1]
        ├──→ **(Ação Pendente)** Fluxo de Cadastro/Seleção de Profissional e Paciente
        │     └──→ `ProfessionalRegistrationScreen.kt` [Pendente]
        │     └──→ ...
        ├──→ **(Ação Pendente)** `ExercisesScreen.kt` [Pendente]
        │     └──→ `PhraseTrainingScreen.kt` [Pendente]
        │     └──→ ...
        └──→ **`DebugScreen`** (`DebugScreen.kt`) [Validado v1.0.1]
            ├──→ **`TtsTestScreen`** (`TtsTestScreen.kt`) [Validado v0.4.0]
            └──→ **`AsrTestScreen`** (`AsrTestScreen.kt`, rota `asr_test_screen`)
                 [Em Teste v1.0.1 (Lógica ASR Pendente); UI Inicial Validada]
            └──→ ...

**(Outros fluxos de nível superior serão adicionados aqui conforme forem criados.)**
