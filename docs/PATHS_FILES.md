# PATHS_FILES.MD
# Propósito: Documenta a estrutura de diretórios e arquivos do projeto
#            FonoVirtual_V2 (App X).
#
# Este arquivo é parte da documentação do FonoVirtual_V2.
# Ele serve como um guia para a organização do código-fonte e outros
# recursos importantes do projeto.
#
# Interconexões da Documentação (Fluxo Sugerido):
#   [Prompt Geral] -> CONTEXT.MD ------> PATHS_FILES.MD (Este Arquivo)
#                     |                     &
#                     |                  PATHS_SCREENS.MD
#                     |                        |\
#                     V                        V
#              CHANGELOG.MD <---- VALIDATION_STATUS.MD
#
# Legenda: Descreve a estrutura hierárquica de arquivos e diretórios.
# ---

/
├── app/                                  // Módulo principal da aplicação Android.
│   ├── build.gradle.kts                  // Script de build do Gradle para o módulo :app (define versionName "1.0.1", buildConfig true).
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml           // Manifesto da aplicação, define componentes e permissões.
│           ├── assets/                       // Diretório para arquivos brutos (raw assets).
│           │   └── vosk-model-small-pt-0.3/  // Modelo de reconhecimento de voz (ASR).
│           ├── java/com/example/fonovirtual_v2/
│           │   ├── BuildConfig.java            // Gerado automaticamente, contém VERSION_NAME.
│           │   ├── MainActivity.kt             // Activity principal. (Modificado v1.0.1: rota asr_test_screen aponta para AsrTestScreen.kt, placeholder removido).
│           │   ├── ui/
│           │   │   ├── theme/                    // Arquivos de tema do Jetpack Compose.
│           │   │   │   └── Theme.kt            // (Novo v0.4.0)
│           │   │   ├── splash/
│           │   │   │   └── SplashScreen.kt     // Tela Splash inicial (v0.2.1).
│           │   │   ├── home/
│           │   │   │   └── HomeScreen.kt       // Tela inicial da aplicação (Modificado v1.0.0: versão dinâmica).
│           │   │   ├── debug/
│           │   │   │   └── DebugScreen.kt      // Tela para testar módulos. (Modificado v1.0.0: botão "Testar ASR" funcional).
│           │   │   ├── tts_test/                 // (Novo Pacote v0.4.0) UI para Teste de TTS.
│           │   │   │   ├── TtsTestScreen.kt    // (Novo v0.4.0) Tela Composable para teste de TTS.
│           │   │   │   └── TtsTestViewModel.kt // (Novo v0.4.0) ViewModel para TtsTestScreen.
│           │   │   ├── asr_test/                 // (Pacote e arquivos criados v1.0.1) UI para Teste de ASR.
│           │   │   │   ├── AsrTestScreen.kt    // (Novo v1.0.1) Tela Composable para teste de ASR.
│           │   │   │   └── AsrTestViewModel.kt // (Novo v1.0.1) ViewModel para AsrTestScreen.
│           │   │   ├── exercises/                // (Estrutura futura)
│           │   │   │   └── ExercisesScreen.kt  // (Estrutura futura)
│           │   │   ├── professional/             // (Estrutura futura)
│           │   │   │   ├── ProfessionalRegistrationScreen.kt // (Estrutura futura)
│           │   │   │   └── ProfessionalDashboardScreen.kt  // (Estrutura futura)
│           │   │   ├── patient/                  // (Estrutura futura)
│           │   │   │   ├── PatientRegistrationScreen.kt    // (Estrutura futura)
│           │   │   │   └── PatientDashboardScreen.kt     // (Estrutura futura)
│           │   │   └── phrasetraining/           // (Estrutura futura)
│           │   │       └── PhraseTrainingScreen.kt   // (Estrutura futura)
│           │   └── speech/                       // Pacote para funcionalidades de voz (ASR/TTS).
│           │       ├── VoskAsrModule.kt        // (Modificado v1.0.0 - Inicialização Corrigida) Classe para reconhecimento de voz com Vosk.
│           │       ├── TextToSpeechModule.kt   // (Novo v0.4.0) Classe para síntese de voz.
│           │       └── SpeechUtils.kt          // Utilitários para processamento de áudio/voz (Pendente - Remover se não utilizado).
│           └── res/
│               ├── drawable/                     // Recursos gráficos.
│               │   └── univesp.jpg             // Imagem de abertura.
│               ├── layout/                       // Arquivos de layout XML.
│               └── values/
│                   ├── strings.xml             // Definição de textos. (Modificado v1.0.1: strings para AsrTestScreen, removida string de placeholder).
│                   └── colors.xml              // Definição de cores.
└── docs/                                     // Diretório para a documentação do projeto.
    ├── README.md                           // (Sugestão) Arquivo principal de informações do projeto.
    ├── Prompt_Geral_Desenvolvimento_App_X.md // Cópia do prompt para referência versionada (Adicionado v1.0.0).
    ├── CONTEXT.MD                          // Descreve o estado geral e a arquitetura do projeto (Atualizado v1.0.1).
    ├── PATHS_FILES.MD                      // Este arquivo, documenta a estrutura de arquivos (Atualizado v1.0.1).
    ├── PATHS_SCREENS.MD                    // Documenta as telas e fluxos de navegação (Atualizado v1.0.1).
    ├── VALIDATION_STATUS.MD                // Status de validação e testes dos módulos e telas (Atualizado v1.0.1).
    └── CHANGELOG.MD                        // Histórico de alterações do projeto (Atualizado v1.0.1).
