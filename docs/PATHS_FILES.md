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
│           │   │   │   └── HomeScreen.kt       // Tela inicial da aplicação (Modificado v1.0.3: versão dinâmica "1.0.3", botão "Teste Rápido" integrado).
│           │   │   ├── debug/
│           │   │   │   └── DebugScreen.kt      // Tela para testar módulos. (Validado v1.0.2: botões ASR/TTS funcionais).
│           │   │   ├── tts_test/                 // (Pacote v0.4.0) UI para Teste de TTS.
│           │   │   │   ├── TtsTestScreen.kt    // (Validado v0.4.0) Tela Composable para teste de TTS.
│           │   │   │   └── TtsTestViewModel.kt // (Validado v0.4.0) ViewModel para TtsTestScreen.
│           │   │   ├── asr_test/                 // (Pacote v1.0.1) UI para Teste de ASR.
│           │   │   │   ├── AsrTestScreen.kt    // (Validado v1.0.2) Tela Composable para teste de ASR.
│           │   │   │   └── AsrTestViewModel.kt // (Validado v1.0.2) ViewModel para AsrTestScreen.
│           │   │   ├── exercises/                // (Novo Pacote v1.0.3) Exercícios de fonoaudiologia.
│           │   │   │   ├── recognition/          // (Novo v1.0.3) Exercícios de reconhecimento.
│           │   │   │   │   ├── SimpleRecognitionExerciseScreen.kt    // (Novo v1.0.3) Tela de exercício de reconhecimento simples.
│           │   │   │   │   ├── SimpleRecognitionExerciseViewModel.kt // (Novo v1.0.3) ViewModel com lógica de exercícios e estatísticas.
│           │   │   │   │   └── model/                                 // (Novo v1.0.3) Modelos de dados para exercícios.
│           │   │   │   │       └── WordExercise.kt                   // (Novo v1.0.3) Modelo de dados para palavras do exercício.
│           │   │   │   └── result/               // (Novo v1.0.3) Telas de resultado de exercícios.
│           │   │   │       └── ExerciseResultScreen.kt              // (Novo v1.0.3) Tela de resultados com estatísticas.
│           │   │   └── [futuros pacotes...]      // Estruturas futuras mantidas.
│           │   ├── data/                         // (Novo Pacote v1.0.3) Camada de dados.
│           │   │   └── exercises/                // (Novo v1.0.3) Dados relacionados a exercícios.
│           │   │       └── recognition/          // (Novo v1.0.3) Dados de exercícios de reconhecimento.
│           │   │           └── WordsRepository.kt // (Novo v1.0.3) Repositório de palavras organizadas por sílabas.
│           │   └── speech/                       // Pacote para funcionalidades de voz (ASR/TTS).
│           │       ├── VoskAsrModule.kt        // (Validado v1.0.2) Classe para reconhecimento de voz com Vosk.
│           │       ├── TextToSpeechModule.kt   // (Validado v0.4.0) Classe para síntese de voz.
│           │       └── SpeechUtils.kt          // Utilitários para processamento de áudio/voz (Pendente - Remover se não utilizado).
│           └── res/
│               ├── drawable/                     // Recursos gráficos.
│               ├── layout/                       // Arquivos de layout XML.
│               ├── values/
│               │   ├── strings.xml             // Definição de textos. (Validado v1.0.3: strings para exercícios).
│               │   └── colors.xml              // Definição de cores.
│               └── images/                       // (Validado v1.0.3) Diretório para imagens do projeto.
│                   └── univesp.jpg             // Imagem de abertura (movida do drawable).
└── docs/                                     // Diretório para a documentação do projeto.
    ├── RULES_FILE.md                       // (Validado v1.0.3) Guia operacional mandatório para IA com regras de controle de versão.
    ├── CONTEXT.MD                          // (Validado v1.0.3) Guia metodológico central.
    ├── SPECIFICATION_FOR_APP.MD            // (Validado v1.0.3) Especificações específicas do projeto, todas as funcionalidades documentadas.
    ├── PATHS_FILES.MD                      // (Validado v1.0.3) Este arquivo, documenta a estrutura de arquivos.
    ├── PATHS_SCREENS.MD                    // (Validado v1.0.3) Documenta as telas e fluxos de navegação, incluindo exercícios.
    ├── VALIDATION_STATUS.MD                // (Validado v1.0.3) Status de validação, todas as funcionalidades marcadas como validadas.
    └── CHANGELOG.MD                        // (Validado v1.0.3) Histórico de alterações, v1.0.3 documentada como totalmente estável.
