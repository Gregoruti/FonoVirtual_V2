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

## Versão: 1.0.12 (30/09/2025) - Atualizada

## Telas da Aplicação (Módulo UI)

### 1. Fluxo de Entrada

-   **Tela:** `SplashScreen` (`SplashScreen.kt`)
    -   **Descrição:** Primeira tela exibida ao iniciar o app com logo UNIVESP.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/splash/SplashScreen.kt`
    -   **Status:** `✅ VALIDADO` (v0.2.1)
    -   **Funcionalidades:** Exibe imagem univesp.jpg por 3 segundos ou até toque
    -   **Navega para:** `HomeScreen`
    -   **Draft ASCII:**
        ```
        +--------------------------------------+
        |                                      |
        |          [LOGO UNIVESP]              |
        |                                      |
        |      (Fundo Branco - Modo Claro)     |
        |                                      |
        |         (3s ou toque)                |
        +--------------------------------------+
        ```

### 2. Tela Principal

-   **Tela:** `HomeScreen` (`HomeScreen.kt`)
    -   **Descrição:** Tela principal com modo claro, exibe versão dinâmica do app (agora "1.0.12") 
        e botões de navegação organizados.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/home/HomeScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.4 - Modo claro implementado, v1.0.12 - versão dinâmica).
    -   **Funcionalidades:** Versão obtida dinamicamente via BuildConfig.VERSION_NAME
    -   **Navega para:** `DebugScreen`, `SimpleRecognitionExerciseScreen` (via "Teste Rápido")
    -   **Draft ASCII:** (Atualizado v1.0.4 - Modo Claro)
        ```
        +--------------------------------------+
        | FonoVirtual (Título Preto)           |
        |                                      |
        | [█████ Cadastro ████████████████████] |
        | [█████ Teste Rápido ████████████████] |
        | [█████ Atividades ██████████████████] |
        | [█████ Resultados ██████████████████] |
        | [█████ Debug ███████████████████████] |
        |                                      |
        |                                      |
        | Versão: 1.0.12 (Texto Preto)        |
        | Projeto Integrador VI - 2025        |
        |                                      |
        | (Fundo Branco - Modo Claro)          |
        +--------------------------------------+
        ```

### 3. Tela de Debug

-   **Tela:** `DebugScreen` (`DebugScreen.kt`)
    -   **Descrição:** Tela para testar funcionalidades ASR e TTS do aplicativo.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/debug/DebugScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.2)
    -   **Navega para:** `TtsTestScreen`, `AsrTestScreen`
    -   **Draft ASCII:**
        ```
        +--------------------------------------+
        | << Tela de Depuração                 |
        |                                      |
        | [████ Testar TTS ███████████████████] |
        | [████ Testar ASR ███████████████████] |
        |                                      |
        |                                      |
        | (Fundo Branco - Modo Claro)          |
        +--------------------------------------+
        ```

### 4. Exercícios de Fonoaudiologia - Tela Principal

-   **Tela:** `SimpleRecognitionExerciseScreen` (`SimpleRecognitionExerciseScreen.kt`)
    -   **Descrição:** Tela de exercícios com 4 grupos: Sílabas, Sons Consonantais, Dígrafos e Sílaba Tônica.
        Implementa títulos dinâmicos que mudam conforme a seleção do usuário.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/recognition/SimpleRecognitionExerciseScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.12 - Títulos dinâmicos, v1.0.11 - Interface reorganizada, v1.0.10 - Sílaba Tônica)
    -   **Navega para:** `ExerciseResultScreen` (ao completar exercício)
    -   **Funcionalidades:**
        - Sistema de títulos dinâmicos contextuais
        - 4 grupos de exercícios com 24 opções totais
        - Escuta contínua ASR sem botão
        - Integração TTS para exemplos sonoros
    -   **Draft ASCII - Tela de Seleção:** (Atualizado v1.0.12)
        ```
        +--------------------------------------+
        | << Escolha o exercício               |
        |                                      |
        | Número de Sílabas                    |
        | [2] [3] [4] [5]                      |
        |                                      |
        | Sons Consonantais                    |
        | [BR] [CR] [FR] [GR]                  |
        | [CL] [FL] [PL] [BL]                  |
        |                                      |
        | Sons Dígrafos                        |
        | [LH] [NH] [RR] [SS]                  |
        |                                      |
        | Sílaba Tônica                        |
        | [Á] [É] [Ê] [Í]                      |
        | [ÃO] [ÕE] [Ó] [Ú]                    |
        |                                      |
        | (Fundo Branco - Modo Claro)          |
        +--------------------------------------+
        ```
    -   **Draft ASCII - Durante Exercício:** (Exemplo: "Número de Sílabas: 3")
        ```
        +--------------------------------------+
        | << Número de Sílabas: 3              |
        |                                      |
        | +----------------------------------+ |
        | |            PROJETO               | |
        | +----------------------------------+ |
        |                                      |
        | [████ Ouvir Exemplo ████████████████] |
        |                                      |
        | Status: Escutando sua pronúncia...   |
        | (Verde quando escutando)             |
        |                                      |
        | +----------------------------------+ |
        | | Palavra Reconhecida: "projeto"   | |
        | +----------------------------------+ |
        |                                      |
        | [████ Próxima Palavra ██████████████] |
        +--------------------------------------+
        ```

### 5. Tela de Resultados

-   **Tela:** `ExerciseResultScreen` (`ExerciseResultScreen.kt`)
    -   **Descrição:** Exibe resultados do exercício com percentual de acerto e feedback motivacional.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/result/ExerciseResultScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.3)
    -   **Navega para:** `HomeScreen` ou novo exercício
    -   **Funcionalidades:**
        - Cálculo automático de percentual (0-100%)
        - Feedback motivacional baseado na performance
        - Estatísticas detalhadas (acertos/total)
    -   **Draft ASCII:**
        ```
        +--------------------------------------+
        | << Resultado do Exercício            |
        |                                      |
        |         Exercício Concluído!         |
        |                                      |
        |    Sua Pontuação: 80% (4/5)         |
        |                                      |
        |        Muito bem! Continue           |
        |        praticando!                   |
        |                                      |
        | [████ Tentar Novamente ██████████████] |
        | [████ Voltar ao Início ██████████████] |
        |                                      |
        | (Fundo Branco - Modo Claro)          |
        +--------------------------------------+
        ```

### 6. Telas de Teste de Módulos

#### 6.1 Teste TTS
-   **Tela:** `TtsTestScreen` (`TtsTestScreen.kt`)
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/tts_test/TtsTestScreen.kt`
    -   **Status:** `✅ VALIDADO` (v0.4.0)
    -   **Funcionalidades:** Campo de texto e botão para testar síntese de fala

#### 6.2 Teste ASR  
-   **Tela:** `AsrTestScreen` (`AsrTestScreen.kt`)
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/asr_test/AsrTestScreen.kt`
    -   **Status:** `✅ VALIDADO` (v1.0.2)
    -   **Funcionalidades:** Teste de reconhecimento de voz com permissões

## Fluxo de Navegação Completo

```
SplashScreen (3s)
    ↓
HomeScreen
    ├─→ DebugScreen
    │   ├─→ TtsTestScreen
    │   └─→ AsrTestScreen
    │
    └─→ SimpleRecognitionExerciseScreen ("Teste Rápido")
        ├─→ Seleção de Exercício (Títulos Dinâmicos):
        │   ├─→ "Número de Sílabas: X"
        │   ├─→ "Sons Consonantais: XX" 
        │   ├─→ "Sons Dígrafos: XX"
        │   └─→ "Sílaba Tônica: X"
        │
        └─→ ExerciseResultScreen
            ├─→ HomeScreen (Voltar ao Início)
            └─→ SimpleRecognitionExerciseScreen (Tentar Novamente)
```

## Banco de Dados de Exercícios (WordsRepository.kt)

### Distribuição Completa por Categoria:

#### **Número de Sílabas (20 palavras)**
- **2 sílabas (5)**: casa, bola, pato, mesa, vida  
- **3 sílabas (5)**: projeto, caminhar, trabalho, médico, música
- **4 sílabas (5)**: computação, integrado, chocolate, telefone, abacaxi
- **5 sílabas (5)**: geografia, matemática, aplicativo, comunicação, universidade

#### **Sons Consonantais (40 palavras)**
- **BR (5)**: brasil, branco, braço, bravo, biblioteca
- **CR (5)**: criança, criar, cravo, cristal, crescer  
- **FR (5)**: fruta, frio, frase, frango, frequente
- **GR (5)**: grande, grupo, grau, grama, gratidão
- **CL (5)**: classe, claro, clima, cliente, clínica
- **FL (5)**: flor, floresta, fluir, flecha, flauta
- **PL (5)**: planta, planeta, plano, plástico, playground
- **BL (5)**: bloco, blusa, bloqueio, blindado, biblioteca

#### **Sons Dígrafos (20 palavras)**
- **LH (5)**: milho, olho, folha, velho, trabalho
- **NH (5)**: banho, sonho, lenha, manhã, vinho
- **RR (5)**: carro, barro, ferro, guerra, correio
- **SS (5)**: massa, passa, pessoa, cassa, pressa

#### **Sílaba Tônica (40 palavras)**
- **Á (5)**: matemática, prática, fantástico, rápido, árvore
- **É (5)**: café, pé, mané, chulé, filé
- **Ê (5)**: você, bebê, português, inglês, três
- **Í (5)**: país, saída, família, memória, polícia
- **Ó (5)**: avó, robô, história, território, próximo
- **Ú (5)**: último, público, úmido, número, fúria
- **ÃO (5)**: computação, comunicação, educação, informação, aplicação
- **ÕE (5)**: decisões, emoções, reflexões, tradições, dimensões

### **Total Geral: 100 palavras organizadas em 24 grupos de exercícios**

## Status de Implementação das Telas

| Tela | Status | Versão | Funcionalidades Principais |
|------|--------|--------|----------------------------|
| SplashScreen | ✅ Validado | v0.2.1 | Logo UNIVESP, transição automática |
| HomeScreen | ✅ Validado | v1.0.4 | Modo claro, versão dinâmica |
| DebugScreen | ✅ Validado | v1.0.2 | Acesso a testes TTS/ASR |
| SimpleRecognitionExerciseScreen | ✅ Validado | v1.0.12 | Títulos dinâmicos, 4 grupos de exercícios |
| ExerciseResultScreen | ✅ Validado | v1.0.3 | Percentual, feedback motivacional |
| TtsTestScreen | ✅ Validado | v0.4.0 | Teste de síntese de fala |
| AsrTestScreen | ✅ Validado | v1.0.2 | Teste de reconhecimento de voz |

**Todas as telas implementadas estão 100% funcionais e validadas.**
