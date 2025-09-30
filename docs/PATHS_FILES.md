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

## Versão: 1.0.12 (30/09/2025) - Atualizada

/
├── app/                                  // Módulo principal da aplicação Android.
│   ├── build.gradle.kts                  // Script de build do Gradle para o módulo :app (define versionName "1.0.12", versionCode 12, buildConfig true).
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml           // Manifesto da aplicação, define componentes e permissões (Validado v1.0.2).
│           ├── assets/                       // Diretório para arquivos brutos (raw assets).
│           │   └── vosk-model-small-pt-0.3/  // Modelo de reconhecimento de voz (ASR) - UUID validado.
│           │       └── uuid                  // Arquivo UUID do modelo Vosk (5689a7c0-2128-48d4-8f76-bf8171174a9e).
│           ├── java/com/example/fonovirtual_v2/
│           │   ├── BuildConfig.java            // Gerado automaticamente, contém VERSION_NAME "1.0.12".
│           │   ├── MainActivity.kt             // Activity principal (Validado v1.0.3: navegação completa para exercícios com parâmetros).
│           │   ├── ui/
│           │   │   ├── theme/                    // Arquivos de tema do Jetpack Compose.
│           │   │   │   └── Theme.kt            // (Validado v1.0.4: modo claro forçado, esquema de cores branco/preto).
│           │   │   ├── splash/
│           │   │   │   └── SplashScreen.kt     // Tela Splash inicial (Validado v0.2.1) - compatível com modo claro.
│           │   │   ├── home/
│           │   │   │   └── HomeScreen.kt       // (Validado v1.0.4: modo claro, versão dinâmica "1.0.12" via BuildConfig).
│           │   │   ├── debug/
│           │   │   │   └── DebugScreen.kt      // Tela para testar módulos (Validado v1.0.2: compatível com modo claro).
│           │   │   ├── tts_test/                 // (Pacote v0.4.0) UI para Teste de TTS.
│           │   │   │   ├── TtsTestScreen.kt    // (Validado v0.4.0) Tela Composable para teste de TTS.
│           │   │   │   └── TtsTestViewModel.kt // (Validado v0.4.0) ViewModel para TtsTestScreen.
│           │   │   ├── asr_test/                 // (Pacote v1.0.1) UI para Teste de ASR.
│           │   │   │   ├── AsrTestScreen.kt    // (Validado v1.0.2) Tela Composable para teste de ASR.
│           │   │   │   └── AsrTestViewModel.kt // (Validado v1.0.2) ViewModel para AsrTestScreen.
│           │   │   ├── exercises/                // (Pacote v1.0.3) Exercícios de fonoaudiologia.
│           │   │   │   ├── recognition/          // (v1.0.3) Exercícios de reconhecimento.
│           │   │   │   │   ├── SimpleRecognitionExerciseScreen.kt    // (Validado v1.0.12) Tela com títulos dinâmicos contextuais.
│           │   │   │   │   ├── SimpleRecognitionExerciseViewModel.kt // (Validado v1.0.10) ViewModel com 4 tipos de exercícios completos.
│           │   │   │   │   └── model/                                 // (v1.0.3) Modelos de dados para exercícios.
│           │   │   │   │       └── WordExercise.kt                   // (Validado v1.0.3) Modelo de dados para palavras do exercício.
│           │   │   │   └── result/                // (v1.0.3) Telas de resultados de exercícios.
│           │   │   │       └── ExerciseResultScreen.kt              // (Validado v1.0.3) Tela de resultados com percentual de acerto.
│           │   │   └── (Futuras telas planejadas)
│           │   ├── speech/                         // Módulos de reconhecimento e síntese de fala.
│           │   │   ├── VoskAsrModule.kt           // (Validado v1.0.2) Módulo ASR com Vosk PT-BR.
│           │   │   └── TextToSpeechModule.kt      // (Validado v0.4.0) Módulo TTS Android nativo.
│           │   └── data/                           // Camada de dados da aplicação.
│           │       └── exercises/                  // (v1.0.3) Dados para exercícios.
│           │           └── recognition/            // (v1.0.3) Repositórios de exercícios de reconhecimento.
│           │               └── WordsRepository.kt  // (Validado v1.0.10) Repositório com 100 palavras em 24 grupos de exercícios.
│           └── res/
│               ├── values/
│               │   └── strings.xml                // (Atualizado v1.0.11) Recursos de string, título "Escolha o exercício".
│               ├── drawable/                       // Recursos gráficos.
│               ├── mipmap/                         // Ícones da aplicação.
│               └── layout/                         // Layouts XML (se aplicável).
├── images/                                   // (Novo diretório v1.0.1) Imagens do projeto.
│   └── univesp.jpg                          // Logo da UNIVESP para SplashScreen.
├── docs/                                     // Documentação estrutural do projeto.
│   ├── CHANGELOG.md                          // (Atualizado v1.0.12) Histórico detalhado de mudanças.
│   ├── CONTEXT.md                            // Regras gerais de desenvolvimento e documentação.
│   ├── PATHS_FILES.md                        // (Este arquivo - Atualizado v1.0.12) Estrutura de arquivos.
│   ├── PATHS_SCREENS.md                      // Estrutura de telas e navegação.
│   ├── RULES_FILE.md                         // Guia operacional mandatório para IA.
│   ├── SPECIFICATION_FOR_APP.md              // (Atualizado v1.0.12) Especificações completas do app.
│   └── VALIDATION_STATUS.md                  // (Atualizado v1.0.12) Status de validação de módulos e telas.
├── gradle/                                   // Configurações do Gradle Wrapper.
│   ├── libs.versions.toml                    // Catálogo de versões de dependências.
│   └── wrapper/
│       ├── gradle-wrapper.jar                // JAR do Gradle Wrapper.
│       └── gradle-wrapper.properties         // Propriedades do Gradle Wrapper.
├── .github/                                  // Configurações do GitHub.
│   └── copilot-instructions.md              // Instruções para GitHub Copilot.
├── build.gradle.kts                          // Script de build raiz do projeto.
├── gradle.properties                         // (Validado v1.0.4) Configurações globais do Gradle (Java 17 LTS).
├── gradlew                                   // Script do Gradle Wrapper (Unix/Linux/macOS).
├── gradlew.bat                               // Script do Gradle Wrapper (Windows).
├── local.properties                          // Configurações locais do SDK Android.
├── settings.gradle.kts                       // Configurações dos módulos do projeto.
└── RELATORIO_TECNICO_FONOVIRTUAL_V2.md      // Relatório técnico do projeto.

## Estatísticas do Projeto (Versão 1.0.12):

### **Módulos e Funcionalidades:**
- **Total de telas principais**: 8 telas implementadas e validadas
- **Módulos de speech**: 2 (ASR com Vosk, TTS nativo Android)
- **Exercícios implementados**: 24 grupos diferentes organizados em 4 categorias
- **Total de palavras**: 100 palavras para exercícios de fonoaudiologia

### **Distribuição de Exercícios por Categoria:**
- **Número de Sílabas**: 4 grupos (2, 3, 4, 5 sílabas) - 20 palavras
- **Sons Consonantais**: 8 grupos (BR, CR, FR, GR, CL, FL, PL, BL) - 40 palavras  
- **Sons Dígrafos**: 4 grupos (LH, NH, RR, SS) - 20 palavras
- **Sílaba Tônica**: 8 grupos (Á, É, Ê, Í, Ó, Ú, ÃO, ÕE) - 40 palavras

### **Tecnologias e Dependências:**
- **Linguagem**: Kotlin 100%
- **Framework UI**: Jetpack Compose
- **Reconhecimento de Voz**: Vosk Android 0.3.70 (offline, PT-BR)
- **Síntese de Voz**: TextToSpeech nativo Android
- **Navegação**: Navigation Compose 2.8.0-beta05
- **Permissões**: Accompanist Permissions 0.32.0
- **Build**: Gradle 8.x, Java 17 LTS

### **Status de Qualidade:**
- **Compilação**: ✅ BUILD SUCCESSFUL (última: 16s)
- **Testes funcionais**: ✅ Validados em Samsung Galaxy S10e
- **Documentação**: ✅ 100% sincronizada (5 arquivos principais)
- **Controle de versão**: ✅ Sincronizado no GitHub
