# PATHS_SCREENS.md

Este arquivo documenta as telas da aplicação e o fluxo de navegação entre elas.

## 1. Fluxo de Entrada

1.  **Splash Screen** (Tela de Abertura)
    -   **Descrição:** Primeira tela exibida ao iniciar o app. Mostra a imagem `univesp.jpg` centralizada em fundo branco por 3 segundos ou até o usuário tocar na tela. Após isso, navega automaticamente para a HomeScreen.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/splash/SplashScreen.kt`
    -   **Navega para:** `HomeScreen`.

## 2. Tela Principal (Home)

-   **Tela:** `HomeScreen`
    -   **Descrição:** Tela central da aplicação. Exibe apenas a versão atual do app (ex: v0.2.1) no centro da tela.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/home/HomeScreen.kt`
    -   **Fluxos de Navegação:**
        -   (No momento, sem botões de navegação. Futuras opções: Profissional, Paciente, Teste Rápido, Debug.)

## 3. Fluxo do Profissional

1.  **Tela de Cadastro de Profissional** (`ProfessionalRegistrationScreen`)
2.  **Painel do Profissional** (`ProfessionalDashboardScreen`)

## 4. Fluxo do Paciente

1.  **Tela de Cadastro de Paciente** (`PatientRegistrationScreen`)
2.  **Painel do Paciente** (`PatientDashboardScreen`)

## 5. Fluxo de Exercícios

-   **Tela:** `ExercisesScreen`
    -   **Descrição:** Exibe uma lista de exercícios disponíveis.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/exercises/ExercisesScreen.kt`
    -   **Navega para:** Telas de exercícios específicos como `PhraseTrainingScreen`.

-   **Tela:** `PhraseTrainingScreen`
    -   **Descrição:** Tela para o exercício de treino de frases.
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/phrasetraining/PhraseTrainingScreen.kt`

## 6. Fluxo de Depuração

-   **Tela:** `DebugScreen`
    -   **Descrição:** Painel para desenvolvedores que permite testar módulos isoladamente (ASR, TTS, etc.).
    -   **Arquivo:** `app/src/main/java/com/example/fonovirtual_v2/ui/debug/DebugScreen.kt`
    -   **Navega para:** Nenhuma navegação a partir desta tela.
