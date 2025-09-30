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
│   ├── build.gradle.kts                  // Script de build do Gradle para o módulo :app (define versionName "1.0.4", versionCode 6, buildConfig true).
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml           // Manifesto da aplicação, define componentes e permissões.
│           ├── assets/                       // Diretório para arquivos brutos (raw assets).
│           │   └── vosk-model-small-pt-0.3/  // Modelo de reconhecimento de voz (ASR).
│           ├── java/com/example/fonovirtual_v2/
│           │   ├── BuildConfig.java            // Gerado automaticamente, contém VERSION_NAME "1.0.4".
│           │   ├── MainActivity.kt             // Activity principal. (Modificado v1.0.3: navegação completa para exercícios com parâmetros).
│           │   ├── ui/
│           │   │   ├── theme/                    // Arquivos de tema do Jetpack Compose.
│           │   │   │   └── Theme.kt            // (Atualizado v1.0.4: modo claro forçado, esquema de cores branco/preto).
│           │   │   ├── splash/
│           │   │   │   └── SplashScreen.kt     // Tela Splash inicial (v0.2.1) - compatível com modo claro.
│           │   │   ├── home/
│           │   │   │   └── HomeScreen.kt       // (Atualizado v1.0.4: modo claro com fundo branco e textos pretos, versão "1.0.4").
│           │   │   ├── debug/
│           │   │   │   └── DebugScreen.kt      // Tela para testar módulos. (Validado v1.0.2: compatível com modo claro via MaterialTheme).
│           │   │   ├── tts_test/                 // (Pacote v0.4.0) UI para Teste de TTS.
│           │   │   │   ├── TtsTestScreen.kt    // (Validado v0.4.0) Tela Composable para teste de TTS - compatível com modo claro.
│           │   │   │   └── TtsTestViewModel.kt // (Validado v0.4.0) ViewModel para TtsTestScreen.
│           │   │   ├── asr_test/                 // (Pacote v1.0.1) UI para Teste de ASR.
│           │   │   │   ├── AsrTestScreen.kt    // (Validado v1.0.2) Tela Composable para teste de ASR - compatível com modo claro.
│           │   │   │   └── AsrTestViewModel.kt // (Validado v1.0.2) ViewModel para AsrTestScreen.
│           │   │   ├── exercises/                // (Pacote v1.0.3) Exercícios de fonoaudiologia.
│           │   │   │   ├── recognition/          // (v1.0.3) Exercícios de reconhecimento.
│           │   │   │   │   ├── SimpleRecognitionExerciseScreen.kt    // (Validado v1.0.3) Tela de exercício - compatível com modo claro.
│           │   │   │   │   ├── SimpleRecognitionExerciseViewModel.kt // (Validado v1.0.3) ViewModel com lógica de exercícios e estatísticas.
│           │   │   │   │   └── model/                                 // (v1.0.3) Modelos de dados para exercícios.
│           │   │   │   │       └── WordExercise.kt                   // (Validado v1.0.3) Modelo de dados para palavras do exercício.
│           │   │   │   └── result/                                    // (Novo v1.0.3) Telas de resultado de exercícios.
│           │   │   │       └── ExerciseResultScreen.kt               // (Validado v1.0.3) Tela de resultados com estatísticas - compatível com modo claro.
│           │   │   └── speech/                   // Módulos de reconhecimento e síntese de fala.
│           │   │       ├── VoskAsrModule.kt      // (Validado v1.0.2) Módulo ASR com Vosk, inicialização corrigida.
│           │   │       └── TextToSpeechModule.kt // (Validado v0.4.0) Módulo TTS funcional.
│           │   └── data/                         // (Novo Pacote v1.0.3) Camada de dados.
│           │       └── exercises/                // (Novo v1.0.3) Dados para exercícios.
│           │           └── recognition/          // (Novo v1.0.3) Dados de exercícios de reconhecimento.
│           │               └── WordsRepository.kt // (Validado v1.0.3) Repositório de palavras organizadas por sílabas (2-5).
│           └── res/
│               ├── values/
│               │   └── strings.xml           // Strings do aplicativo (Atualizado v1.0.3: strings para exercícios).
│               └── drawable/
│                   └── univesp.jpg           // Logo UNIVESP para SplashScreen.
├── gradle.properties                     // (Atualizado v1.0.4: configuração Java 17 LTS com escape correto para Windows).
├── build.gradle.kts                      // Script de build principal do projeto.
├── settings.gradle.kts                   // Configurações do projeto Gradle.
├── gradlew                               // Script wrapper do Gradle (Unix).
├── gradlew.bat                           // Script wrapper do Gradle (Windows).
├── local.properties                      // Configurações locais do SDK (não versionado).
├── images/                               // (Novo v1.0.4) Diretório para imagens do projeto.
│   └── univesp.jpg                       // Logo UNIVESP (localização atualizada).
└── docs/                                 // (Atualizado v1.0.4) Documentação completa do projeto.
    ├── CHANGELOG.md                      // (Atualizado v1.0.4) Histórico detalhado de versões com deploy no dispositivo.
    ├── CONTEXT.md                        // Guia metodológico central de desenvolvimento.
    ├── PATHS_FILES.md                    // (Este arquivo - Atualizado v1.0.4) Estrutura de arquivos e diretórios.
    ├── PATHS_SCREENS.md                  // (Atualizado v1.0.3) Mapeamento de telas e navegação.
    ├── RULES_FILE.md                     // Guia operacional mandatório para IA.
    ├── SPECIFICATION_FOR_APP.md          // (Atualizado v1.0.4) Especificações completas com deploy validado.
    └── VALIDATION_STATUS.md              // (Atualizado v1.0.4) Status de validação de módulos e telas.

## Configurações de Ambiente (v1.0.4)

### Java 17 LTS Configuration:
- **gradle.properties**: Configuração forçada do Java 17 LTS
- **Path**: C:\\Program Files\\Eclipse Adoptium\\jdk-17.0.16.8-hotspot
- **Escape**: Caracteres Windows corretamente escapados (C\\:\\Program Files\\...)
- **Status**: Compilação bem-sucedida (BUILD SUCCESSFUL em 1m 17s)

### Deploy Configuration:
- **Target Device**: Samsung Galaxy S10e (SM-G970F - Android 12)
- **ADB Path**: C:\\Users\\[USERNAME]\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe
- **Install Status**: Pacote com.example.fonovirtual_v2 instalado e funcionando
- **Validation**: Interface modo claro testada no dispositivo físico
