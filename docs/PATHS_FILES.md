# PATHS_FILES.md

Este arquivo documenta a estrutura de diretórios e arquivos do projeto, servindo como um guia para a organização do código-fonte e outros recursos.

/
├── app/                     // Módulo principal da aplicação Android.
│   ├── build.gradle.kts     // Script de build do Gradle para o módulo :app.
│   └── src/                 // Diretório contendo o código-fonte e recursos.
│       └── main/
│           ├── AndroidManifest.xml  // Manifesto da aplicação, define componentes e permissões.
│           ├── assets/              // Diretório para arquivos brutos (raw assets).
│           │   └── vosk-model-small-pt-0.3/ // Modelo de reconhecimento de voz (ASR).
│           ├── java/com/example/fonovirtual_v2/ // Raiz do código-fonte Kotlin/Java.
│           │   ├── MainActivity.kt    // Activity principal, ponto de entrada da UI.
│           │   ├── ui/                // Pacote para componentes de UI (Jetpack Compose).
│           │   │   ├── splash/            // Tela de abertura (SplashScreen).
│           │   │   │   └── SplashScreen.kt    // Tela Splash inicial.
│           │   │   ├── home/              // Funcionalidades da tela inicial.
│           │   │   │   └── HomeScreen.kt      // Tela inicial da aplicação.
│           │   │   ├── debug/             // Telas e componentes para depuração.
│           │   │   │   └── DebugScreen.kt     // Tela para testar módulos individualmente.
│           │   │   ├── exercises/         // Funcionalidades da tela de exercícios.
│           │   │   │   └── ExercisesScreen.kt // Tela para listagem de exercícios.
│           │   │   ├── professional/      // Telas relacionadas ao fluxo do Profissional.
│           │   │   │   ├── ProfessionalRegistrationScreen.kt // Tela de cadastro de profissionais.
│           │   │   │   └── ProfessionalDashboardScreen.kt  // Painel de controle do profissional.
│           │   │   ├── patient/           // Telas relacionadas ao fluxo do Paciente.
│           │   │   │   ├── PatientRegistrationScreen.kt    // Tela de cadastro de pacientes.
│           │   │   │   └── PatientDashboardScreen.kt     // Painel de controle do paciente.
│           │   │   └── phrasetraining/    // Telas relacionadas ao Treino de Frases.
│           │   │       └── PhraseTrainingScreen.kt   // Tela para o exercício de treino de frases.
│           │   └── speech/            // Pacote para funcionalidades de voz (ASR/TTS).
│           │       ├── SpeechRecognizer.kt // Classe responsável pelo reconhecimento de voz.
│           │       ├── TextToSpeechModule.kt // Classe responsável pela síntese de voz.
│           │       └── SpeechUtils.kt      // Utilitários para processamento de áudio/voz.
│           └── res/                 // Diretório para recursos da aplicação.
│               ├── drawable/          // Recursos gráficos (ícones, imagens).
│               │   └── univesp.jpg      // Imagem de abertura (SplashScreen).
│               ├── layout/            // Arquivos de layout XML (menos comum com Compose).
│               └── values/            // Arquivos de valores (strings, cores, temas).
│                   ├── strings.xml      // Definição de textos da aplicação.
│                   └── colors.xml       // Definição de cores.
└── docs/                    // Diretório para a documentação do projeto.
    ├── RULES_FILE.md        // Centraliza todas as regras para assistentes de IA e desenvolvedores.
    ├── CONTEXT.md           // Descreve o estado geral e a arquitetura do projeto.
    ├── PATHS_FILES.md       // Este arquivo, documenta a estrutura de arquivos.
    ├── PATHS_SCREENS.md     // Documenta as telas e fluxos de navegação.
    ├── VALIDATION_STATUS.md // Status de validação e testes dos módulos.
    └── CHANGELOG.md         // Histórico de alterações do projeto.
