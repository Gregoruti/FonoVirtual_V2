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
    -   **Descrição:** Tela principal com modo escuro, exibe versão do app (agora "1.0.3") e botões
        de navegação reorganizados.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/home/HomeScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.3 - Modo escuro implementado, novos botões adicionados).
    -   **Navega para:** `DebugScreen`, `SimpleRecognitionExerciseScreen` (via "Teste Rápido"), 
        (Futuro: Atividades, Resultados, Cadastro).
    -   **Draft ASCII:** (Atualizado v1.0.3 - Modo Escuro)
        ```
        +--------------------------------------+
        | FonoVirtual (Título Branco)          |
        |                                      |
        | [█████ Cadastro ████████████████████] |
        | [█████ Teste Rápido ████████████████] |
        | [█████ Atividades ██████████████████] |
        | [█████ Resultados ██████████████████] |
        | [█████ Debug ███████████████████████] |
        |                                      |
        |                                      |
        | Versão: 1.0.3 (Texto Branco)        |
        | Projeto Integrador VI - 2025         |
        |          (Texto Branco)              |
        +--------------------------------------+
        | ████████ FUNDO PRETO ████████████████ |
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
    -   **Status:** `✅ VALIDADO` (v1.0.2 - UI e lógica de ASR completamente funcionais e testadas).
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

### 4. Fluxo de Exercícios (Acesso via "Teste Rápido" na HomeScreen)

-   **Tela:** `SimpleRecognitionExerciseScreen` (`SimpleRecognitionExerciseScreen.kt`)
    -   **Descrição:** Exercício de reconhecimento de palavras fixas, organizadas por número
        de sílabas (2 a 5). Utiliza ASR para validar pronúncia e TTS para exemplos.
        O app fica ouvindo continuamente (sem botão) e calcula estatísticas automaticamente.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/recognition/SimpleRecognitionExerciseScreen.kt`
    -   **Status:** `Validado` (v1.0.3)
    -   **Navega para:** `ExerciseResultScreen` (via rota com parâmetros `exercise_result/{accuracy}/{correct}/{total}`)
    -   **Lista de Palavras por Sílabas:**
        ```
        Dissílabas (2): casa, bola, pato, mesa, vida
        Trissílabas (3): projeto, caminhar, trabalho, médico, música
        Quadrissílabas (4): computação, integrado, chocolate, telefone, abacaxi
        Pentassílabas (5): geografia, matemática, aplicativo, comunicação, universidade
        ```
    -   **Draft ASCII Final (v1.0.3 - Validado):**
        ```
        +--------------------------------------+
        | Exercício de Pronúncia (TopAppBar)   |
        +--------------------------------------+
        | Selecione o número de sílabas:       |
        | [2] [3] [4] [5]                      |
        |                                      |
        | Palavra Atual:                       |
        | +----------------------------------+ |
        | |           "borboleta"            | |
        | +----------------------------------+ |
        |                                      |
        | [ Botão: Ouvir Exemplo ]            |
        |                                      |
        | Status: Ouvindo... (fale agora)     | ← Verde quando ativo
        |                                      |
        | Sua pronúncia:                      |
        | +----------------------------------+ |
        | | (Resultado do ASR em tempo real) | |
        | +----------------------------------+ |
        |                                      |
        | [ Botão: Próxima Palavra ]          | ← Sempre visível
        +--------------------------------------+
        ```

-   **Tela:** `ExerciseResultScreen` (`ExerciseResultScreen.kt`)
    -   **Descrição:** Exibe resultados detalhados do exercício com percentual de acerto,
        estatísticas (acertos/erros/total) e feedback motivacional. Interface limpa
        com cores padrão do app.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/result/ExerciseResultScreen.kt`
    -   **Status:** `Validado` (v1.0.3)
    -   **Parâmetros Recebidos:** `accuracy` (%), `correct` (int), `total` (int)
    -   **Navega para:** `SimpleRecognitionExerciseScreen` (novo exercício) ou `HomeScreen`
    -   **Draft ASCII Final (v1.0.3 - Validado):**
        ```
        +--------------------------------------+
        | Resultado do Exercício (TopAppBar)   |
        +--------------------------------------+
        |         Exercício Concluído!         |
        |                                      |
        | +----------------------------------+ |
        | |             85%                  | | ← Percentual destacado
        | |         Muito Bom!               | | ← Feedback motivacional
        | |                                  | |
        | |   Acertos    Erros    Total      | |
        | |      4         1        5        | | ← Estatísticas
        | +----------------------------------+ |
        |                                      |
        |                                      |
        |                                      |
        | [ Tentar Novamente ] [ Voltar Home ] |
        +--------------------------------------+
        ```

### 5. Fluxo de Navegação Geral (v1.0.3)

```
SplashScreen (3s ou toque)
    ↓
HomeScreen 
    ├── Debug → DebugScreen → TtsTestScreen/AsrTestScreen
    └── Teste Rápido → SimpleRecognitionExerciseScreen 
                           ↓ (após completar palavras)
                       ExerciseResultScreen
                           ├── Tentar Novamente → SimpleRecognitionExerciseScreen
                           └── Voltar Home → HomeScreen
```
